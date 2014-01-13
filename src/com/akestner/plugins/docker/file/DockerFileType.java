package com.akestner.plugins.docker.file;

import com.akestner.plugins.docker.DockerIcons;
import com.akestner.plugins.docker.DockerLanguage;
import com.intellij.lang.Language;
import com.intellij.openapi.editor.colors.EditorColorsScheme;
import com.intellij.openapi.editor.highlighter.EditorHighlighter;
import com.intellij.openapi.fileTypes.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.templateLanguages.TemplateDataLanguageMappings;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.nio.charset.Charset;

@SuppressWarnings("StaticVariableOfConcreteClass")
public class DockerFileType extends LanguageFileType
{
    public static final DockerFileType INSTANCE = new DockerFileType();
    public static final Language LANGUAGE = INSTANCE.getLanguage();
    @NonNls
    public static final String DEFAULT_EXTENSION = "docker";

    private DockerFileType()
    {
        super(DockerLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName()
    {
        return "Docker";
    }

    @NotNull
    @Override
    public String getDescription()
    {
        return "Docker/Dockerfile";
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

    public Charset extractCharsetFromFileContent(@Nullable final Project project,
                                                 @Nullable final VirtualFile file,
                                                 @NotNull final String content)
    {
        LanguageFileType associatedFileType = getAssociatedFileType(file, project);

        if (associatedFileType == null) {
            return null;
        }

        return associatedFileType.extractCharsetFromFileContent(project, file, content);
    }

    private LanguageFileType getAssociatedFileType(VirtualFile file, Project project)
    {
        if (project == null) {
            return null;
        }

        Language language = TemplateDataLanguageMappings.getInstance(project).getMapping(file);

        LanguageFileType associatedFileType = null;
        if (language != null) {
            associatedFileType = language.getAssociatedFileType();
        }

        if (language == null || associatedFileType == null) {
            associatedFileType = DockerLanguage.getDefaultAssociatedFileType();
        }

        return associatedFileType;
    }
}