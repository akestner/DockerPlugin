package com.akestner.plugins.docker.file;

import com.akestner.plugins.docker.lang.DockerLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class DockerFile extends PsiFileBase
{
    public DockerFile(@NotNull FileViewProvider viewProvider)
    {
        super(viewProvider, DockerLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType()
    {
        return DockerFileType.INSTANCE;
    }

    @Override
    public String toString()
    {
        return "Dockerfile File";
    }

    @Override
    public Icon getIcon(int flags)
    {
        return super.getIcon(flags);
    }
}