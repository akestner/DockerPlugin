// This is a generated file. Not intended for manual editing.
package com.akestner.plugins.docker.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.akestner.plugins.docker.parsing.DockerTypes.*;
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
  public DockerAdd getAdd() {
    return findChildByClass(DockerAdd.class);
  }

  @Override
  @Nullable
  public DockerCmd getCmd() {
    return findChildByClass(DockerCmd.class);
  }

  @Override
  @Nullable
  public DockerEntrypoint getEntrypoint() {
    return findChildByClass(DockerEntrypoint.class);
  }

  @Override
  @Nullable
  public DockerEnv getEnv() {
    return findChildByClass(DockerEnv.class);
  }

  @Override
  @Nullable
  public DockerExpose getExpose() {
    return findChildByClass(DockerExpose.class);
  }

  @Override
  @Nullable
  public DockerFrom getFrom() {
    return findChildByClass(DockerFrom.class);
  }

  @Override
  @Nullable
  public DockerMaintainer getMaintainer() {
    return findChildByClass(DockerMaintainer.class);
  }

  @Override
  @Nullable
  public DockerRun getRun() {
    return findChildByClass(DockerRun.class);
  }

  @Override
  @Nullable
  public DockerUser getUser() {
    return findChildByClass(DockerUser.class);
  }

  @Override
  @Nullable
  public DockerVolume getVolume() {
    return findChildByClass(DockerVolume.class);
  }

  @Override
  @Nullable
  public DockerWorkdir getWorkdir() {
    return findChildByClass(DockerWorkdir.class);
  }

}
