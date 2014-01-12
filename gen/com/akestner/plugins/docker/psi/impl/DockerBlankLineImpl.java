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

public class DockerBlankLineImpl extends ASTWrapperPsiElement implements DockerBlankLine {

  public DockerBlankLineImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DockerVisitor) ((DockerVisitor)visitor).visitBlankLine(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DockerLineTermination getLineTermination() {
    return findNotNullChildByClass(DockerLineTermination.class);
  }

  @Override
  @NotNull
  public List<DockerNothing> getNothingList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DockerNothing.class);
  }

  @Override
  @NotNull
  public List<DockerOptionalWhitespace> getOptionalWhitespaceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DockerOptionalWhitespace.class);
  }

}
