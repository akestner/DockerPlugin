// This is a generated file. Not intended for manual editing.
package com.akestner.plugins.docker.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface DockerBlankLine extends PsiElement {

  @NotNull
  DockerLineTermination getLineTermination();

  @NotNull
  List<DockerNothing> getNothingList();

  @NotNull
  List<DockerOptionalWhitespace> getOptionalWhitespaceList();

}
