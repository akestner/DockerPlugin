package com.akestner.plugins.docker.parser;

import com.akestner.plugins.docker.DockerLanguage;
import com.akestner.plugins.docker.lexer.DockerLexer;
import com.akestner.plugins.docker.file.DockerFile;
import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class DockerParserDefinition implements ParserDefinition
{
    public static final IFileElementType FILE = new IFileElementType(Language.<DockerLanguage>findInstance(DockerLanguage.class));

    public static final TokenSet INSTRUCTION = TokenSet.create(DockerTypes.INSTRUCTION);
    public static final TokenSet COMMENT = TokenSet.create(DockerTypes.COMMENT);
    public static final TokenSet LINESEP = TokenSet.create(DockerTypes.LINESEP);

    public static final TokenSet FROM = TokenSet.create(DockerTypes.FROM);
    public static final TokenSet MAINTAINER = TokenSet.create(DockerTypes.MAINTAINER);
    public static final TokenSet RUN = TokenSet.create(DockerTypes.RUN);
    public static final TokenSet CMD = TokenSet.create(DockerTypes.CMD);
    public static final TokenSet EXPOSE = TokenSet.create(DockerTypes.EXPOSE);
    public static final TokenSet ENV = TokenSet.create(DockerTypes.ENV);
    public static final TokenSet ADD = TokenSet.create(DockerTypes.ADD);
    public static final TokenSet ENTRYPOINT = TokenSet.create(DockerTypes.ENTRYPOINT);
    public static final TokenSet VOLUME = TokenSet.create(DockerTypes.VOLUME);
    public static final TokenSet USER = TokenSet.create(DockerTypes.USER);
    public static final TokenSet WORKDIR = TokenSet.create(DockerTypes.WORKDIR);

    public static final TokenSet WHITE_SPACE = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet BAD_CHARACTER = TokenSet.create(TokenType.BAD_CHARACTER);


    @NotNull
    @Override
    public Lexer createLexer(Project project)
    {
        return new FlexAdapter((FlexLexer) new DockerLexer(null));
    }

    @NotNull
    public PsiParser createParser(final Project project)
    {
        return new DockerParser();
    }

    public PsiFile createFile(FileViewProvider viewProvider)
    {
        return new DockerFile(viewProvider);
    }

    @Override
    public IFileElementType getFileNodeType()
    {
        return FILE;
    }

    @NotNull
    public PsiElement createElement(ASTNode node)
    {
        return DockerTypes.Factory.createElement(node);
    }

    @NotNull
    public TokenSet getInstructionLineTokens()
    {
        return INSTRUCTION;
    }

    @NotNull
    public TokenSet getFromTokens()
    {
        return FROM;
    }

    @NotNull
    public TokenSet getMaintainerTokens()
    {
        return MAINTAINER;
    }

    @NotNull
    public TokenSet getRunTokens()
    {
        return RUN;
    }

    @NotNull
    public TokenSet getCmdTokens()
    {
        return CMD;
    }

    @NotNull
    public TokenSet getExposeTokens()
    {
        return EXPOSE;
    }

    @NotNull
    public TokenSet getEnvTokens()
    {
        return ENV;
    }

    @NotNull
    public TokenSet getAddTokens()
    {
        return ADD;
    }

    @NotNull
    public TokenSet getEntrypointTokens()
    {
        return ENTRYPOINT;
    }

    @NotNull
    public TokenSet getUserTokens()
    {
        return USER;
    }

    @NotNull
    public TokenSet getVolumeTokens()
    {
        return VOLUME;
    }

    @NotNull
    public TokenSet getWorkdirTokens()
    {
        return WORKDIR;
    }

    @NotNull
    public TokenSet getWhitespaceTokens()
    {
        return WHITE_SPACE;
    }

    @NotNull
    public TokenSet getBadCharacterTokens()
    {
        return BAD_CHARACTER;
    }

    @NotNull
    public TokenSet getCommentTokens()
    {
        return COMMENT;
    }

    @NotNull
    public TokenSet getStringLiteralElements()
    {
        return TokenSet.EMPTY;
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right)
    {
        return SpaceRequirements.MAY;
    }
}
