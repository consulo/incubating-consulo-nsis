package com.krylysov.nsisplugin.psi;

import com.krylysov.nsisplugin.NsisLanguage;
import consulo.language.ast.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class NsisElementType extends IElementType {
    public NsisElementType(@NotNull @NonNls String debugName) {
        super(debugName, NsisLanguage.INSTANCE);
    }
}