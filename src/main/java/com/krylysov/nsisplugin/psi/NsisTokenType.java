package com.krylysov.nsisplugin.psi;

import com.krylysov.nsisplugin.NsisLanguage;
import consulo.language.ast.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class NsisTokenType extends IElementType {
    public NsisTokenType(@NotNull @NonNls String debugName) {
        super(debugName, NsisLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "com.krylysov.nsisplugin.psi.NsisTokenType." + super.toString();
    }
}