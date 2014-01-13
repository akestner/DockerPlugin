// This is a generated file. Not intended for manual editing.
package com.akestner.plugins.docker.parser;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.akestner.plugins.docker.psi.impl.*;

public interface DockerTypes {

  IElementType ADD_DIRECTIVE = new DockerElementType("ADD_DIRECTIVE");
  IElementType CMD_DIRECTIVE = new DockerElementType("CMD_DIRECTIVE");
  IElementType COMMENT = new DockerElementType("COMMENT");
  IElementType ENTRYPOINT_DIRECTIVE = new DockerElementType("ENTRYPOINT_DIRECTIVE");
  IElementType ENV_DIRECTIVE = new DockerElementType("ENV_DIRECTIVE");
  IElementType EXPOSE_DIRECTIVE = new DockerElementType("EXPOSE_DIRECTIVE");
  IElementType FROM_DIRECTIVE = new DockerElementType("FROM_DIRECTIVE");
  IElementType INSTRUCTION = new DockerElementType("INSTRUCTION");
  IElementType MAINTAINER_DIRECTIVE = new DockerElementType("MAINTAINER_DIRECTIVE");
  IElementType RUN_DIRECTIVE = new DockerElementType("RUN_DIRECTIVE");
  IElementType USER_DIRECTIVE = new DockerElementType("USER_DIRECTIVE");
  IElementType VOLUME_DIRECTIVE = new DockerElementType("VOLUME_DIRECTIVE");
  IElementType WORKDIR_DIRECTIVE = new DockerElementType("WORKDIR_DIRECTIVE");

  IElementType ADD = new DockerTokenTypes("Add");
  IElementType CMD = new DockerTokenTypes("Cmd");
  IElementType COMMENTLINE = new DockerTokenTypes("CommentLine");
  IElementType ENTRYPOINT = new DockerTokenTypes("Entrypoint");
  IElementType ENV = new DockerTokenTypes("Env");
  IElementType EOF = new DockerTokenTypes("EOF");
  IElementType EXPOSE = new DockerTokenTypes("Expose");
  IElementType FROM = new DockerTokenTypes("From");
  IElementType INPUTCHARACTERS = new DockerTokenTypes("InputCharacters");
  IElementType LINETERMINATION = new DockerTokenTypes("LineTermination");
  IElementType MAINTAINER = new DockerTokenTypes("Maintainer");
  IElementType NUMBER = new DockerTokenTypes("Number");
  IElementType OPTIONALWHITESPACE = new DockerTokenTypes("OptionalWhitespace");
  IElementType QUOTEDSTRING = new DockerTokenTypes("QuotedString");
  IElementType RUN = new DockerTokenTypes("Run");
  IElementType USER = new DockerTokenTypes("User");
  IElementType VOLUME = new DockerTokenTypes("Volume");
  IElementType WHITESPACE = new DockerTokenTypes("Whitespace");
  IElementType WORKDIR = new DockerTokenTypes("Workdir");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ADD_DIRECTIVE) {
        return new DockerAddDirectiveImpl(node);
      }
      else if (type == CMD_DIRECTIVE) {
        return new DockerCmdDirectiveImpl(node);
      }
      else if (type == COMMENT) {
        return new DockerCommentImpl(node);
      }
      else if (type == ENTRYPOINT_DIRECTIVE) {
        return new DockerEntrypointDirectiveImpl(node);
      }
      else if (type == ENV_DIRECTIVE) {
        return new DockerEnvDirectiveImpl(node);
      }
      else if (type == EXPOSE_DIRECTIVE) {
        return new DockerExposeDirectiveImpl(node);
      }
      else if (type == FROM_DIRECTIVE) {
        return new DockerFromDirectiveImpl(node);
      }
      else if (type == INSTRUCTION) {
        return new DockerInstructionImpl(node);
      }
      else if (type == MAINTAINER_DIRECTIVE) {
        return new DockerMaintainerDirectiveImpl(node);
      }
      else if (type == RUN_DIRECTIVE) {
        return new DockerRunDirectiveImpl(node);
      }
      else if (type == USER_DIRECTIVE) {
        return new DockerUserDirectiveImpl(node);
      }
      else if (type == VOLUME_DIRECTIVE) {
        return new DockerVolumeDirectiveImpl(node);
      }
      else if (type == WORKDIR_DIRECTIVE) {
        return new DockerWorkdirDirectiveImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
