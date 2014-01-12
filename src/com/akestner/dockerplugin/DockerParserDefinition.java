package com.akestner.dockerplugin;

import com.akestner.dockerplugin.psi.DockerFile;
import com.akestner.dockerplugin.psi.DockerTypes;
import com.akestner.dockerplugin.parser.DockerParser;
import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;

public class DockerParserDefinition implements ParserDefinition
{
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(DockerTypes.COMMENT);

    public static final IFileElementType FILE = new IFileElementType(Language.<DockerLanguage>findInstance(DockerLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project)
    {
        return new FlexAdapter(new DockerLexer((Reader) null));
    }

    @NotNull
    public TokenSet getWhitespaceTokens()
    {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens()
    {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements()
    {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project)
    {
        return new DockerParser();
    }

    @Override
    public IFileElementType getFileNodeType()
    {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider)
    {
        return new DockerFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right)
    {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node)
    {
        return DockerTypes.Factory.createElement(node);
    }
}
