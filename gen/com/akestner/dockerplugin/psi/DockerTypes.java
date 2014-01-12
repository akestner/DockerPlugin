// This is a generated file. Not intended for manual editing.
package com.akestner.dockerplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.akestner.dockerplugin.psi.impl.*;

public interface DockerTypes {

  IElementType PROPERTY = new DockerElementType("PROPERTY");

  IElementType COMMENT = new DockerTokenType("COMMENT");
  IElementType CRLF = new DockerTokenType("CRLF");
  IElementType KEY = new DockerTokenType("KEY");
  IElementType SEPARATOR = new DockerTokenType("SEPARATOR");
  IElementType VALUE = new DockerTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new DockerPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
