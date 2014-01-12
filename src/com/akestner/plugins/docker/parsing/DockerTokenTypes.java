package com.akestner.plugins.docker.parsing;

import com.akestner.plugins.docker.DockerLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
 
public class DockerTokenTypes extends IElementType
{
    public DockerTokenTypes(@NotNull @NonNls String debugName)
    {
        super(debugName, DockerLanguage.INSTANCE);
    }
 
    @Override
    public String toString()
    {
        return "DockerTokenTypes." + super.toString();
    }
}