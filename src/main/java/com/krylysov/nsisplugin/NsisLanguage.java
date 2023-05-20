package com.krylysov.nsisplugin;

import consulo.language.Language;

public class NsisLanguage extends Language
{
    public static final NsisLanguage INSTANCE = new NsisLanguage();

    private NsisLanguage() {
        super("nsis");
    }
}