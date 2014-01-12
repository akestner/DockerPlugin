package com.akestner.plugins.docker.psi;

import com.akestner.plugins.docker.DockerLanguage;
import com.akestner.plugins.docker.file.DockerFileType;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.impl.PsiFileEx;
import org.jetbrains.annotations.NotNull;

public class DockerPsiFile extends PsiFileBase implements PsiFileEx
{

    public DockerPsiFile(@NotNull FileViewProvider viewProvider)
    {
        super(viewProvider, DockerLanguage.INSTANCE);
    }

    @NotNull
    public FileType getFileType()
    {
        return DockerFileType.INSTANCE;
    }

    @Override
    public String toString()
    {
        return "DockerFile:" + getName();
    }
}
