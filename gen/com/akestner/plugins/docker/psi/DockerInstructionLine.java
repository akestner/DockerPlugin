// This is a generated file. Not intended for manual editing.
package com.akestner.plugins.docker.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface DockerInstructionLine extends PsiElement {

  @NotNull
  DockerDirective getDirective();

  @NotNull
  DockerLineTermination getLineTermination();

}
