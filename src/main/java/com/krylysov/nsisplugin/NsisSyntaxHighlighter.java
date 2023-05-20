package com.krylysov.nsisplugin;

import com.krylysov.nsisplugin.psi.NsisTypes;
import consulo.codeEditor.DefaultLanguageHighlighterColors;
import consulo.codeEditor.HighlighterColors;
import consulo.colorScheme.TextAttributesKey;
import consulo.language.ast.IElementType;
import consulo.language.ast.TokenType;
import consulo.language.editor.highlight.SyntaxHighlighterBase;
import consulo.language.lexer.FlexAdapter;
import consulo.language.lexer.Lexer;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;

import static consulo.colorScheme.TextAttributesKey.createTextAttributesKey;

public class NsisSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey COMMENT = createTextAttributesKey("NSIS_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey STRING = createTextAttributesKey("NSIS_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("NSIS_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey IDENTIFIER = createTextAttributesKey("NSIS_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey BLOCK_DECLARATION = createTextAttributesKey("NSIS_BLOCK", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
    public static final TextAttributesKey COMPILER_COMMAND = createTextAttributesKey("NSIS_COMPILER_COMMAND", DefaultLanguageHighlighterColors.FUNCTION_CALL);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("NSIS_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey INSTRUCTION = createTextAttributesKey("NSIS_INSTRUCTION", DefaultLanguageHighlighterColors.FUNCTION_CALL);
    public static final TextAttributesKey CONSTANT = createTextAttributesKey("NSIS_CONSTANT", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey SPECIAL_SYMBOL = createTextAttributesKey("NSIS_SPECIAL_SYMBOL", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("NSIS_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new NsisLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(NsisTypes.STRING)) {
            return pack(STRING);
        } else if (tokenType.equals(NsisTypes.NUMBER)) {
            return pack(NUMBER);
        } else if (tokenType.equals(NsisTypes.IDENTIFIER)) {
            return pack(IDENTIFIER);
        } else if (tokenType.equals(NsisTypes.INSTRUCTION)) {
            return pack(INSTRUCTION);
        } else if (tokenType.equals(NsisTypes.COMPILER_COMMAND)) {
            return pack(COMPILER_COMMAND);
        } else if (tokenType.equals(NsisTypes.BLOCK_DECLARATION)) {
            return pack(BLOCK_DECLARATION);
        } else if (tokenType.equals(NsisTypes.COMMENT)) {
            return pack(COMMENT);
        } else if (tokenType.equals(NsisTypes.CONSTANT) || tokenType.equals(NsisTypes.VALUE) || tokenType.equals(NsisTypes.VARIABLE)) {
            return pack(CONSTANT);
        } else if (tokenType.equals(NsisTypes.KEYWORD)) {
            return pack(KEYWORD);
        } else if (tokenType.equals(NsisTypes.SPECIAL_SYMBOL)) {
            return pack(SPECIAL_SYMBOL);
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return pack(BAD_CHARACTER);
        } else {
            return EMPTY;
        }
    }
}