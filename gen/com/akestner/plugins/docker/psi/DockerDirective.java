// This is a generated file. Not intended for manual editing.
package com.akestner.plugins.docker.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface DockerDirective extends PsiElement {

  @Nullable
  DockerAdd getAdd();

  @Nullable
  DockerCmd getCmd();

  @Nullable
  DockerEntrypoint getEntrypoint();

  @Nullable
  DockerEnv getEnv();

  @Nullable
  DockerExpose getExpose();

  @Nullable
  DockerFrom getFrom();

  @Nullable
  DockerMaintainer getMaintainer();

  @Nullable
  DockerRun getRun();

  @Nullable
  DockerUser getUser();

  @Nullable
  DockerVolume getVolume();

  @Nullable
  DockerWorkdir getWorkdir();

}
