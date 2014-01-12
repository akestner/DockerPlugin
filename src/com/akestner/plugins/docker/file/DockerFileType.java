package com.akestner.plugins.docker.file;

import com.akestner.plugins.docker.DockerIcons;
import com.akestner.plugins.docker.DockerLanguage;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
 
@SuppressWarnings("StaticVariableOfConcreteClass")
public class DockerFileType extends LanguageFileType
{
    public static final DockerFileType INSTANCE = new DockerFileType();
    public static final Language LANGUAGE = INSTANCE.getLanguage();
    @NonNls
    public static final String DEFAULT_EXTENSION = "docker;dockerfile; ";

    private DockerFileType()
    {
        super(DockerLanguage.INSTANCE);
    }
 
    @NotNull
    @Override
    public String getName()
    {
        return "Dockerfile";
    }
 
    @NotNull
    @Override
    public String getDescription()
    {
        return "Docker Dockerfile File";
    }
 
    @NotNull
    @Override
    public String getDefaultExtension()
    {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon()
    {
        return DockerIcons.FILE_ICON;
    }
}