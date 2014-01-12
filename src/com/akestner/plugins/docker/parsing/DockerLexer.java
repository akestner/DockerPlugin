package com.akestner.plugins.docker.parsing;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class DockerLexer extends FlexAdapter {
  public DockerLexer(Reader reader) {
    super(new _DockerLexer((Reader)null));
  }
}