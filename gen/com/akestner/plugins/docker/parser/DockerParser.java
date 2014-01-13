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
    else if (root_ == CONTENT) {
      result_ = Content(builder_, 0);
    }
    else if (root_ == DIRECTIVE) {
      result_ = Directive(builder_, 0);
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
  // "ADD"
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
  // "CMD"
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
  // {Letter}+|{Number}+|{Symbol}+|{Space}+|{QuotedString}+
  public static boolean Content(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Content")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<content>");
    result_ = Content_0(builder_, level_ + 1);
    if (!result_) result_ = Content_1(builder_, level_ + 1);
    if (!result_) result_ = Content_2(builder_, level_ + 1);
    if (!result_) result_ = Content_3(builder_, level_ + 1);
    if (!result_) result_ = Content_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CONTENT, result_, false, null);
    return result_;
  }

  // {Letter}+
  private static boolean Content_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Content_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LETTER);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!consumeToken(builder_, LETTER)) break;
      if (!empty_element_parsed_guard_(builder_, "Content_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Number}+
  private static boolean Content_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Content_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NUMBER);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!consumeToken(builder_, NUMBER)) break;
      if (!empty_element_parsed_guard_(builder_, "Content_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Symbol}+
  private static boolean Content_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Content_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SYMBOL);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!consumeToken(builder_, SYMBOL)) break;
      if (!empty_element_parsed_guard_(builder_, "Content_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Space}+
  private static boolean Content_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Content_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SPACE);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!consumeToken(builder_, SPACE)) break;
      if (!empty_element_parsed_guard_(builder_, "Content_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {QuotedString}+
  private static boolean Content_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Content_4")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, QUOTEDSTRING);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!consumeToken(builder_, QUOTEDSTRING)) break;
      if (!empty_element_parsed_guard_(builder_, "Content_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // {FromDirective}|{MaintainerDirective}|{RunDirective}|{CmdDirective}|{ExposeDirective}|{EnvDirective}|{AddDirective}|{EntrypointDirective}|{UserDirective}|{VolumeDirective}|{WorkdirDirective}
  public static boolean Directive(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<directive>");
    result_ = Directive_0(builder_, level_ + 1);
    if (!result_) result_ = Directive_1(builder_, level_ + 1);
    if (!result_) result_ = Directive_2(builder_, level_ + 1);
    if (!result_) result_ = Directive_3(builder_, level_ + 1);
    if (!result_) result_ = Directive_4(builder_, level_ + 1);
    if (!result_) result_ = Directive_5(builder_, level_ + 1);
    if (!result_) result_ = Directive_6(builder_, level_ + 1);
    if (!result_) result_ = Directive_7(builder_, level_ + 1);
    if (!result_) result_ = Directive_8(builder_, level_ + 1);
    if (!result_) result_ = Directive_9(builder_, level_ + 1);
    if (!result_) result_ = Directive_10(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, DIRECTIVE, result_, false, null);
    return result_;
  }

  // {FromDirective}
  private static boolean Directive_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = FromDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {MaintainerDirective}
  private static boolean Directive_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = MaintainerDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {RunDirective}
  private static boolean Directive_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = RunDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {CmdDirective}
  private static boolean Directive_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = CmdDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {ExposeDirective}
  private static boolean Directive_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_4")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = ExposeDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {EnvDirective}
  private static boolean Directive_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_5")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = EnvDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {AddDirective}
  private static boolean Directive_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_6")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = AddDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {EntrypointDirective}
  private static boolean Directive_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_7")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = EntrypointDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {UserDirective}
  private static boolean Directive_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_8")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = UserDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {VolumeDirective}
  private static boolean Directive_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_9")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = VolumeDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {WorkdirDirective}
  private static boolean Directive_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_10")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = WorkdirDirective(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // "ENTRYPOINT"
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
  // "ENV"
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
  // "EXPOSE"
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
  // "FROM"
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
  // ({Directive}) {Space} ({Content})* [{LineSep}]
  public static boolean Instruction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<instruction>");
    result_ = Instruction_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SPACE);
    result_ = result_ && Instruction_2(builder_, level_ + 1);
    result_ = result_ && Instruction_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, INSTRUCTION, result_, false, null);
    return result_;
  }

  // {Directive}
  private static boolean Instruction_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Directive(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ({Content})*
  private static boolean Instruction_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!Instruction_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Instruction_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // {Content}
  private static boolean Instruction_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Content(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [{LineSep}]
  private static boolean Instruction_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Instruction_3")) return false;
    consumeToken(builder_, LINESEP);
    return true;
  }

  /* ********************************************************** */
  // "MAINTAINER"
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
  // "RUN"
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
  // "USER"
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
  // "VOLUME"
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
  // "WORKDIR"
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
  // {Space}|{LineSep}|{Comment}|{Instruction}
  static boolean item_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item_")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SPACE);
    if (!result_) result_ = consumeToken(builder_, LINESEP);
    if (!result_) result_ = consumeToken(builder_, COMMENT);
    if (!result_) result_ = item__3(builder_, level_ + 1);
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
