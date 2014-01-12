// This is a generated file. Not intended for manual editing.
package com.akestner.dockerplugin.psi.impl;

import com.akestner.dockerplugin.psi.DockerProperty;
import com.akestner.dockerplugin.psi.DockerVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

public class DockerPropertyImpl extends ASTWrapperPsiElement implements DockerProperty {

  public DockerPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DockerVisitor) ((DockerVisitor)visitor).visitProperty(this);
    else super.accept(visitor);
  }

}
