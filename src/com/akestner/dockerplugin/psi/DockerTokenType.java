package com.akestner.dockerplugin.psi;

import com.akestner.dockerplugin.DockerLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
 
public class DockerTokenType extends IElementType
{
    public DockerTokenType(@NotNull @NonNls String debugName)
    {
        super(debugName, DockerLanguage.INSTANCE);
    }
 
    @Override
    public String toString()
    {
        return "DockerTokenType." + super.toString();
    }
}