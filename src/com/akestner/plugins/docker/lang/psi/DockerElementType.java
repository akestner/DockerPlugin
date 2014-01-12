package com.akestner.plugins.docker.lang.psi;

import com.akestner.plugins.docker.lang.DockerLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class DockerElementType extends IElementType
{
    public DockerElementType(@NotNull @NonNls String debugName)
    {
        super(debugName, DockerLanguage.INSTANCE);
    }
}