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

public class DockerInstructionImpl extends ASTWrapperPsiElement implements DockerInstruction {

  public DockerInstructionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DockerVisitor) ((DockerVisitor)visitor).visitInstruction(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DockerContent> getContentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DockerContent.class);
  }

  @Override
  @NotNull
  public DockerDirective getDirective() {
    return findNotNullChildByClass(DockerDirective.class);
  }

}
