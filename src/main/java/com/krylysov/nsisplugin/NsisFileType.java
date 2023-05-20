package com.krylysov.nsisplugin;

import consulo.language.file.LanguageFileType;
import consulo.localize.LocalizeValue;
import consulo.platform.base.icon.PlatformIconGroup;
import consulo.ui.image.Image;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NsisFileType extends LanguageFileType {
    public static final NsisFileType INSTANCE = new NsisFileType();

    private NsisFileType() {
        super(NsisLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getId() {
        return "NSIS_SCRIPT";
    }

    @NotNull
    @Override
    public LocalizeValue getDescription() {
        return LocalizeValue.localizeTODO("NSIS installer script");
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "nsi";
    }

    @Nullable
    @Override
    public Image getIcon() {
        return PlatformIconGroup.filetypesText();
    }
}