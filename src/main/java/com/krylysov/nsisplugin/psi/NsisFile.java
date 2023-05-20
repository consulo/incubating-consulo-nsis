package com.krylysov.nsisplugin.psi;

import com.krylysov.nsisplugin.NsisLanguage;
import consulo.language.file.FileViewProvider;
import consulo.language.impl.psi.PsiFileBase;
import org.jetbrains.annotations.NotNull;

public class NsisFile extends PsiFileBase {
    public NsisFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, NsisLanguage.INSTANCE);
    }
}