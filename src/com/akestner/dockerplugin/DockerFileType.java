package com.akestner.dockerplugin;
 
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
 
import javax.swing.*;
 
public class DockerFileType extends LanguageFileType
{
    public static final DockerFileType INSTANCE = new DockerFileType();
 
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
        return "docker";
    }
 
    @Nullable
    @Override
    public Icon getIcon()
    {
        return DockerIcons.FILE;
    }
}