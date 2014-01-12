// This is a generated file. Not intended for manual editing.
package com.akestner.plugins.docker.parsing;

import com.akestner.plugins.docker.psi.impl.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

public interface DockerTypes {

  IElementType ADD = new DockerElementType("ADD");
  IElementType BLANK_LINE = new DockerElementType("BLANK_LINE");
  IElementType CMD = new DockerElementType("CMD");
  IElementType COMMENT_LINE = new DockerElementType("COMMENT_LINE");
  IElementType DIRECTIVE = new DockerElementType("DIRECTIVE");
  IElementType ENTRYPOINT = new DockerElementType("ENTRYPOINT");
  IElementType ENV = new DockerElementType("ENV");
  IElementType EXPOSE = new DockerElementType("EXPOSE");
  IElementType FROM = new DockerElementType("FROM");
  IElementType INSTRUCTION_LINE = new DockerElementType("INSTRUCTION_LINE");
  IElementType LINE_TERMINATION = new DockerElementType("LINE_TERMINATION");
  IElementType MAINTAINER = new DockerElementType("MAINTAINER");
  IElementType NOTHING = new DockerElementType("NOTHING");
  IElementType OPTIONAL_WHITESPACE = new DockerElementType("OPTIONAL_WHITESPACE");
  IElementType RUN = new DockerElementType("RUN");
  IElementType USER = new DockerElementType("USER");
  IElementType VOLUME = new DockerElementType("VOLUME");
  IElementType WHITESPACE = new DockerElementType("WHITESPACE");
  IElementType WORKDIR = new DockerElementType("WORKDIR");


  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ADD) {
        return new DockerAddImpl(node);
      }
      else if (type == BLANK_LINE) {
        return new DockerBlankLineImpl(node);
      }
      else if (type == CMD) {
        return new DockerCmdImpl(node);
      }
      else if (type == COMMENT_LINE) {
        return new DockerCommentLineImpl(node);
      }
      else if (type == DIRECTIVE) {
        return new DockerDirectiveImpl(node);
      }
      else if (type == ENTRYPOINT) {
        return new DockerEntrypointImpl(node);
      }
      else if (type == ENV) {
        return new DockerEnvImpl(node);
      }
      else if (type == EXPOSE) {
        return new DockerExposeImpl(node);
      }
      else if (type == FROM) {
        return new DockerFromImpl(node);
      }
      else if (type == INSTRUCTION_LINE) {
        return new DockerInstructionLineImpl(node);
      }
      else if (type == LINE_TERMINATION) {
        return new DockerLineTerminationImpl(node);
      }
      else if (type == MAINTAINER) {
        return new DockerMaintainerImpl(node);
      }
      else if (type == NOTHING) {
        return new DockerNothingImpl(node);
      }
      else if (type == OPTIONAL_WHITESPACE) {
        return new DockerOptionalWhitespaceImpl(node);
      }
      else if (type == RUN) {
        return new DockerRunImpl(node);
      }
      else if (type == USER) {
        return new DockerUserImpl(node);
      }
      else if (type == VOLUME) {
        return new DockerVolumeImpl(node);
      }
      else if (type == WHITESPACE) {
        return new DockerWhitespaceImpl(node);
      }
      else if (type == WORKDIR) {
        return new DockerWorkdirImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
