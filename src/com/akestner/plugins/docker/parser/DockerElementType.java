package com.akestner.plugins.docker.parser;

import com.akestner.plugins.docker.DockerBundle;
import com.akestner.plugins.docker.DockerLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;


class DockerElementType extends IElementType
{
    //private final String _parseExpectedMessageKey;

    ///**
    // * @param parseExpectedMessageKey Key to the {@link DockerBundle} message to show the user when the parser
    // *                                expected this token, but found something else.
    // */
    //public DockerElementType(@NotNull @NonNls String debugName, @NotNull @NonNls String parseExpectedMessageKey)
    public DockerElementType(@NotNull @NonNls String debugName)
    {
        super(debugName, DockerLanguage.INSTANCE);
        //_parseExpectedMessageKey = parseExpectedMessageKey;
    }

    @Override
    public String toString()
    {
        return "[Docker] " + super.toString();
    }

    //public String parseExpectedMessage()
    //{
    //    return DockerBundle.message(_parseExpectedMessageKey);
    //}
}
