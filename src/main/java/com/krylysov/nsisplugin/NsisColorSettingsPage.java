package com.krylysov.nsisplugin;

import consulo.annotation.component.ExtensionImpl;
import consulo.colorScheme.TextAttributesKey;
import consulo.colorScheme.setting.AttributesDescriptor;
import consulo.colorScheme.setting.ColorDescriptor;
import consulo.language.editor.colorScheme.setting.ColorSettingsPage;
import consulo.language.editor.highlight.SyntaxHighlighter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

@ExtensionImpl
public class NsisColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Compiler command", NsisSyntaxHighlighter.COMPILER_COMMAND),
            new AttributesDescriptor("Instruction", NsisSyntaxHighlighter.INSTRUCTION),
            new AttributesDescriptor("String", NsisSyntaxHighlighter.STRING),
            new AttributesDescriptor("Number", NsisSyntaxHighlighter.NUMBER),
    };

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new NsisSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "!include 1 '2' \"3\" CONST ${test} `123` _ABC\n" +
                "; comment\n" +
                "CRCCheck On\n" +
                "nsProcess::_FindProcess /NOUNLOAD\n" +
                "File /r mpg\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "NSIS";
    }
}