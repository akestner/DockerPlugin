package com.akestner.plugins.docker;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.fileTypes.StdFileTypes;

public class DockerLanguage extends Language
{
    public static final DockerLanguage INSTANCE = new DockerLanguage();

    public DockerLanguage()
    {
        super(DockerLanguage.INSTANCE, "text/x-dockerfile");
    }

    public static LanguageFileType getDefaultAssociatedFileType()
    {
        return StdFileTypes.HTML;
    }
}
