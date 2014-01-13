// This is a generated file. Not intended for manual editing.
package com.akestner.plugins.docker.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.akestner.plugins.docker.parser.DockerTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.akestner.plugins.docker.psi.*;

public class DockerDirectiveImpl extends ASTWrapperPsiElement implements DockerDirective {

  public DockerDirectiveImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DockerVisitor) ((DockerVisitor)visitor).visitDirective(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DockerAddDirective getAddDirective() {
    return findChildByClass(DockerAddDirective.class);
  }

  @Override
  @Nullable
  public DockerCmdDirective getCmdDirective() {
    return findChildByClass(DockerCmdDirective.class);
  }

  @Override
  @Nullable
  public DockerEntrypointDirective getEntrypointDirective() {
    return findChildByClass(DockerEntrypointDirective.class);
  }

  @Override
  @Nullable
  public DockerEnvDirective getEnvDirective() {
    return findChildByClass(DockerEnvDirective.class);
  }

  @Override
  @Nullable
  public DockerExposeDirective getExposeDirective() {
    return findChildByClass(DockerExposeDirective.class);
  }

  @Override
  @Nullable
  public DockerFromDirective getFromDirective() {
    return findChildByClass(DockerFromDirective.class);
  }

  @Override
  @Nullable
  public DockerMaintainerDirective getMaintainerDirective() {
    return findChildByClass(DockerMaintainerDirective.class);
  }

  @Override
  @Nullable
  public DockerRunDirective getRunDirective() {
    return findChildByClass(DockerRunDirective.class);
  }

  @Override
  @Nullable
  public DockerUserDirective getUserDirective() {
    return findChildByClass(DockerUserDirective.class);
  }

  @Override
  @Nullable
  public DockerVolumeDirective getVolumeDirective() {
    return findChildByClass(DockerVolumeDirective.class);
  }

  @Override
  @Nullable
  public DockerWorkdirDirective getWorkdirDirective() {
    return findChildByClass(DockerWorkdirDirective.class);
  }

}
