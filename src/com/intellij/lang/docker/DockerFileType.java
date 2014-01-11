package com.intellij.lang.docker;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.vfs.CharsetToolkit;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.encoding.EncodingManager;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.nio.charset.Charset;

/**
 * @author max
 */
public class DockerFileType extends LanguageFileType {
  public static final LanguageFileType INSTANCE = new DockerFileType();
  @NonNls public static final String DEFAULT_EXTENSION = "";
  @NonNls public static final String DOT_DEFAULT_EXTENSION = "."+DEFAULT_EXTENSION;

  private DockerFileType() {
    super(DockerLanguage.INSTANCE);
  }

  @Override
  @NotNull
  public String getName() {
    return "Properties";
  }

  @Override
  @NotNull
  public String getDescription() {
    return DockerBundle.message("properties.files.file.type.description");
  }

  @Override
  @NotNull
  public String getDefaultExtension() {
    return DEFAULT_EXTENSION;
  }

  @Override
  public Icon getIcon() {
    return AllIcons.FileTypes.Docker;
  }

  @Override
  public String getCharset(@NotNull VirtualFile file, final byte[] content) {
    Charset charset = EncodingManager.getInstance().getDefaultCharsetForPropertiesFiles(file);
    return charset == null ? CharsetToolkit.getDefaultSystemCharset().name() : charset.name();
  }
}