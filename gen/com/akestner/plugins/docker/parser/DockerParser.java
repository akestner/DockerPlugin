// This is a generated file. Not intended for manual editing.
package com.akestner.plugins.docker.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static com.akestner.plugins.docker.parser.DockerTypes.*;
import static org.intellij.grammar.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DockerParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("com.akestner.plugins.docker.parser.DockerParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ADD_DIRECTIVE) {
      result_ = AddDirective(builder_, 0);
    }
    else if (root_ == CMD_DIRECTIVE) {
      result_ = CmdDirective(builder_, 0);
    }
    else if (root_ == COMMENT) {
      result_ = Comment(builder_, 0);
    }
    else if (root_ == ENTRYPOINT_DIRECTIVE) {
      result_ = EntrypointDirective(builder_, 0);
    }
    else if (root_ == ENV_DIRECTIVE) {
      result_ = EnvDirective(builder_, 0);
    }
    else if (root_ == EXPOSE_DIRECTIVE) {
      result_ = ExposeDirective(builder_, 0);
    }
    else if (root_ == FROM_DIRECTIVE) {
      result_ = FromDirective(builder_, 0);
    }
    else if (root_ == INSTRUCTION) {
      result_ = Instruction(builder_, 0);
    }
    else if (root_ == MAINTAINER_DIRECTIVE) {
      result_ = MaintainerDirective(builder_, 0);
    }
    else if (root_ == RUN_DIRECTIVE) {
      result_ = RunDirective(builder_, 0);
    }
    else if (root_ == USER_DIRECTIVE) {
      result_ = UserDirective(builder_, 0);
    }
    else if (root_ == VOLUME_DIRECTIVE) {
      result_ = VolumeDirective(builder_, 0);
    }
    else if (root_ == WORKDIR_DIRECTIVE) {
      result_ = WorkdirDirective(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return dockerFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // {Add}
  public static boolean AddDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AddDirective")) return false;
    if (!nextTokenIs(builder_, ADD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ADD);
    exit_section_(builder_, marker_, ADD_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // {Cmd}
  public static boolean CmdDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CmdDirective")) return false;
    if (!nextTokenIs(builder_, CMD)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CMD);
    exit_section_(builder_, marker_, CMD_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // {CommentLine}
  public static boolean Comment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Comment")) return false;
    if (!nextTokenIs(builder_, COMMENTLINE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMENTLINE);
    exit_section_(builder_, marker_, COMMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // {Entrypoint}
  public static boolean EntrypointDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EntrypointDirective")) return false;
    if (!nextTokenIs(builder_, ENTRYPOINT)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ENTRYPOINT);
    exit_section_(builder_, marker_, ENTRYPOINT_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // {Env}
  public static boolean EnvDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnvDirective")) return false;
    if (!nextTokenIs(builder_, ENV)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ENV);
    exit_section_(builder_, marker_, ENV_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // {Expose}
  public static boolean ExposeDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExposeDirective")) return false;
    if (!nextTokenIs(builder_, EXPOSE)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXPOSE);
    exit_section_(builder_, marker_, EXPOSE_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // {From}
  public static boolean FromDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FromDirective")) return false;
    if (!nextTokenIs(builder_, FROM)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FROM);
    exit_section_(builder_, marker_, FROM_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // [{FromDirective}|{MaintainerDirective}|{RunDirective}|{CmdDirective}|{ExposeDirective}|{EnvDirective}|{AddDirective}|{EntrypointDirective}|{UserDirective}|{VolumeDirective}|{WorkdirDirective}] ({InputCharacters}|{Number}|{Whitespace})* [{LineTermination}]
  public static boolean Instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<instruction>");
    result_ = Instruction_0(builder_, level_ + 1);
    result_ = result_ && Instruction_1(builder_, level_ + 1);
    result_ = result_ && Instruction_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, INSTRUCTION, result_, false, null);
    return result_;
  }

  // [{FromDirective}|{MaintainerDirective}|{RunDirective}|{CmdDirective}|{ExposeDirective}|{EnvDirective}|{AddDirective}|{EntrypointDirective}|{UserDirective}|{VolumeDirective}|{WorkdirDirective}]
  private static boolean Instruction_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_0")) return false;
    Instruction_0_0(builder_, level_ + 1);
    return true;
  }

  // {FromDirective}|{MaintainerDirective}|{RunDirective}|{CmdDirective}|{ExposeDirective}|{EnvDirective}|{AddDirective}|{EntrypointDirective}|{UserDirective}|{VolumeDirective}|{WorkdirDirective}
  private static boolean Instruction_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Instruction_0_0_0(builder_, level_ + 1);
    if (!result_) result_ = Instruction_0_0_1(builder_, level_ + 1);
    if (!result_) result_ = Instruction_0_0_2(builder_, level_ + 1);
    if (!result_) result_ = Instruction_0_0_3(builder_, level_ + 1);
    if (!result_) result_ = Instruction_0_0_4(builder_, level_ + 1);
    if (!result_) result_ = Instruction_0_0_5(builder_, level_ + 1);
    if (!result_) result_ = Instruction_0_0_6(builder_, level_ + 1);
    if (!result_) result_ = Instruction_0_0_7(builder_, level_ + 1);
    if (!result_) result_ = Instruction_0_0_8(builder_, level_ + 1);
    if (!result_) result_ = Instruction_0_0_9(builder_, level_ + 1);
    if (!result_) result_ = Instruction_0_0_10(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {FromDirective}
  private static boolean Instruction_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_0_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = FromDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {MaintainerDirective}
  private static boolean Instruction_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_0_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = MaintainerDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {RunDirective}
  private static boolean Instruction_0_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_0_0_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = RunDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {CmdDirective}
  private static boolean Instruction_0_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_0_0_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = CmdDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {ExposeDirective}
  private static boolean Instruction_0_0_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_0_0_4")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ExposeDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {EnvDirective}
  private static boolean Instruction_0_0_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_0_0_5")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = EnvDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {AddDirective}
  private static boolean Instruction_0_0_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_0_0_6")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = AddDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {EntrypointDirective}
  private static boolean Instruction_0_0_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_0_0_7")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = EntrypointDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {UserDirective}
  private static boolean Instruction_0_0_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_0_0_8")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = UserDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {VolumeDirective}
  private static boolean Instruction_0_0_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_0_0_9")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = VolumeDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {WorkdirDirective}
  private static boolean Instruction_0_0_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_0_0_10")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = WorkdirDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ({InputCharacters}|{Number}|{Whitespace})*
  private static boolean Instruction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!Instruction_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Instruction_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // {InputCharacters}|{Number}|{Whitespace}
  private static boolean Instruction_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INPUTCHARACTERS);
    if (!result_) result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, WHITESPACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [{LineTermination}]
  private static boolean Instruction_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_2")) return false;
    consumeToken(builder_, LINETERMINATION);
    return true;
  }

  /* ********************************************************** */
  // {Maintainer}
  public static boolean MaintainerDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MaintainerDirective")) return false;
    if (!nextTokenIs(builder_, MAINTAINER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MAINTAINER);
    exit_section_(builder_, marker_, MAINTAINER_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // {Run}
  public static boolean RunDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RunDirective")) return false;
    if (!nextTokenIs(builder_, RUN)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RUN);
    exit_section_(builder_, marker_, RUN_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // {User}
  public static boolean UserDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UserDirective")) return false;
    if (!nextTokenIs(builder_, USER)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, USER);
    exit_section_(builder_, marker_, USER_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // {Volume}
  public static boolean VolumeDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VolumeDirective")) return false;
    if (!nextTokenIs(builder_, VOLUME)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VOLUME);
    exit_section_(builder_, marker_, VOLUME_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // {Workdir}
  public static boolean WorkdirDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "WorkdirDirective")) return false;
    if (!nextTokenIs(builder_, WORKDIR)) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, WORKDIR);
    exit_section_(builder_, marker_, WORKDIR_DIRECTIVE, result_);
    return result_;
  }

  /* ********************************************************** */
  // item_*
  static boolean dockerFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dockerFile")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!item_(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "dockerFile", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // {EOF} | {LineTermination} | {Comment} | {Instruction}
  static boolean item_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item_")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EOF);
    if (!result_) result_ = consumeToken(builder_, LINETERMINATION);
    if (!result_) result_ = item__2(builder_, level_ + 1);
    if (!result_) result_ = item__3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Comment}
  private static boolean item__2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item__2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Comment(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Instruction}
  private static boolean item__3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item__3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Instruction(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

}
