// This is a generated file. Not intended for manual editing.
package com.akestner.plugins.docker.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DockerInstruction extends PsiElement {

  @Nullable
  DockerAddDirective getAddDirective();

  @Nullable
  DockerCmdDirective getCmdDirective();

  @Nullable
  DockerEntrypointDirective getEntrypointDirective();

  @Nullable
  DockerEnvDirective getEnvDirective();

  @Nullable
  DockerExposeDirective getExposeDirective();

  @Nullable
  DockerFromDirective getFromDirective();

  @Nullable
  DockerMaintainerDirective getMaintainerDirective();

  @Nullable
  DockerRunDirective getRunDirective();

  @Nullable
  DockerUserDirective getUserDirective();

  @Nullable
  DockerVolumeDirective getVolumeDirective();

  @Nullable
  DockerWorkdirDirective getWorkdirDirective();

}
