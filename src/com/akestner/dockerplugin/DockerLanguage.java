package com.akestner.dockerplugin;

import com.intellij.lang.Language;

public class DockerLanguage extends Language
{
    public static final DockerLanguage INSTANCE = new DockerLanguage();

    private DockerLanguage()
    {
        super("Docker");
    }
}
