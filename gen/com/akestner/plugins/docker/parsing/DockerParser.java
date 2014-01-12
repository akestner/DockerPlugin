// This is a generated file. Not intended for manual editing.
package com.akestner.plugins.docker.parsing;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.psi.tree.IElementType;

import static com.akestner.plugins.docker.parsing.DockerTypes.*;
import static org.intellij.grammar.parser.GeneratedParserUtilBase.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DockerParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("com.akestner.plugins.docker.parsing.DockerParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ADD) {
      result_ = Add(builder_, 0);
    }
    else if (root_ == BLANK_LINE) {
      result_ = BlankLine(builder_, 0);
    }
    else if (root_ == CMD) {
      result_ = Cmd(builder_, 0);
    }
    else if (root_ == COMMENT_LINE) {
      result_ = CommentLine(builder_, 0);
    }
    else if (root_ == DIRECTIVE) {
      result_ = Directive(builder_, 0);
    }
    else if (root_ == ENTRYPOINT) {
      result_ = Entrypoint(builder_, 0);
    }
    else if (root_ == ENV) {
      result_ = Env(builder_, 0);
    }
    else if (root_ == EXPOSE) {
      result_ = Expose(builder_, 0);
    }
    else if (root_ == FROM) {
      result_ = From(builder_, 0);
    }
    else if (root_ == INSTRUCTION_LINE) {
      result_ = InstructionLine(builder_, 0);
    }
    else if (root_ == LINE_TERMINATION) {
      result_ = LineTermination(builder_, 0);
    }
    else if (root_ == MAINTAINER) {
      result_ = Maintainer(builder_, 0);
    }
    else if (root_ == NOTHING) {
      result_ = Nothing(builder_, 0);
    }
    else if (root_ == OPTIONAL_WHITESPACE) {
      result_ = OptionalWhitespace(builder_, 0);
    }
    else if (root_ == RUN) {
      result_ = Run(builder_, 0);
    }
    else if (root_ == USER) {
      result_ = User(builder_, 0);
    }
    else if (root_ == VOLUME) {
      result_ = Volume(builder_, 0);
    }
    else if (root_ == WHITESPACE) {
      result_ = Whitespace(builder_, 0);
    }
    else if (root_ == WORKDIR) {
      result_ = Workdir(builder_, 0);
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
  // 'ADD'|'add'
  public static boolean Add(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Add")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<add>");
    result_ = consumeToken(builder_, "ADD");
    if (!result_) result_ = consumeToken(builder_, "add");
    exit_section_(builder_, level_, marker_, ADD, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ({OptionalWhitespace} | {Nothing})* {LineTermination}
  public static boolean BlankLine(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlankLine")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<blank line>");
    result_ = BlankLine_0(builder_, level_ + 1);
    result_ = result_ && BlankLine_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, BLANK_LINE, result_, false, null);
    return result_;
  }

  // ({OptionalWhitespace} | {Nothing})*
  private static boolean BlankLine_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlankLine_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!BlankLine_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "BlankLine_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // {OptionalWhitespace} | {Nothing}
  private static boolean BlankLine_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlankLine_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = BlankLine_0_0_0(builder_, level_ + 1);
    if (!result_) result_ = BlankLine_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {OptionalWhitespace}
  private static boolean BlankLine_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlankLine_0_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = OptionalWhitespace(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Nothing}
  private static boolean BlankLine_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlankLine_0_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Nothing(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {LineTermination}
  private static boolean BlankLine_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlankLine_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = LineTermination(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'CMD'|'cmd'
  public static boolean Cmd(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Cmd")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<cmd>");
    result_ = consumeToken(builder_, "CMD");
    if (!result_) result_ = consumeToken(builder_, "cmd");
    exit_section_(builder_, level_, marker_, CMD, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '#' 'AZaz09' {LineTermination}
  public static boolean CommentLine(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CommentLine")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<comment line>");
    result_ = consumeToken(builder_, "#");
    result_ = result_ && consumeToken(builder_, "AZaz09");
    result_ = result_ && CommentLine_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, COMMENT_LINE, result_, false, null);
    return result_;
  }

  // {LineTermination}
  private static boolean CommentLine_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CommentLine_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = LineTermination(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // {From}|{Maintainer}|{Run}|{Cmd}|{Expose}|{Env}|{Add}|{Entrypoint}|{User}|{Volume}|{Workdir}
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

  // {From}
  private static boolean Directive_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = From(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Maintainer}
  private static boolean Directive_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Maintainer(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Run}
  private static boolean Directive_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Run(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Cmd}
  private static boolean Directive_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Cmd(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Expose}
  private static boolean Directive_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_4")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Expose(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Env}
  private static boolean Directive_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_5")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Env(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Add}
  private static boolean Directive_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_6")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Add(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Entrypoint}
  private static boolean Directive_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_7")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Entrypoint(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {User}
  private static boolean Directive_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_8")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = User(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Volume}
  private static boolean Directive_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_9")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Volume(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Workdir}
  private static boolean Directive_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Directive_10")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Workdir(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'ENTRYPOINT'|'entrypoint'
  public static boolean Entrypoint(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Entrypoint")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<entrypoint>");
    result_ = consumeToken(builder_, "ENTRYPOINT");
    if (!result_) result_ = consumeToken(builder_, "entrypoint");
    exit_section_(builder_, level_, marker_, ENTRYPOINT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // 'ENV'|'env'
  public static boolean Env(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Env")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<env>");
    result_ = consumeToken(builder_, "ENV");
    if (!result_) result_ = consumeToken(builder_, "env");
    exit_section_(builder_, level_, marker_, ENV, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // 'EXPOSE'|'expose'
  public static boolean Expose(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Expose")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expose>");
    result_ = consumeToken(builder_, "EXPOSE");
    if (!result_) result_ = consumeToken(builder_, "expose");
    exit_section_(builder_, level_, marker_, EXPOSE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // 'FROM'|'from'
  public static boolean From(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "From")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<from>");
    result_ = consumeToken(builder_, "FROM");
    if (!result_) result_ = consumeToken(builder_, "from");
    exit_section_(builder_, level_, marker_, FROM, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // {Directive} {'regexp:[A-Za-z0-9]*'} {LineTermination}
  public static boolean InstructionLine(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InstructionLine")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<instruction line>");
    result_ = InstructionLine_0(builder_, level_ + 1);
    result_ = result_ && InstructionLine_1(builder_, level_ + 1);
    result_ = result_ && InstructionLine_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, INSTRUCTION_LINE, result_, false, null);
    return result_;
  }

  // {Directive}
  private static boolean InstructionLine_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InstructionLine_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Directive(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {'regexp:[A-Za-z0-9]*'}
  private static boolean InstructionLine_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InstructionLine_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "regexp:[A-Za-z0-9]*");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {LineTermination}
  private static boolean InstructionLine_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InstructionLine_2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = LineTermination(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '\n'|'\r'|'\r\n'
  public static boolean LineTermination(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LineTermination")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<line termination>");
    result_ = consumeToken(builder_, "\\n");
    if (!result_) result_ = consumeToken(builder_, "\\r");
    if (!result_) result_ = consumeToken(builder_, "\\r\\n");
    exit_section_(builder_, level_, marker_, LINE_TERMINATION, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // 'MAINTAINER'|'maintainer'
  public static boolean Maintainer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Maintainer")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<maintainer>");
    result_ = consumeToken(builder_, "MAINTAINER");
    if (!result_) result_ = consumeToken(builder_, "maintainer");
    exit_section_(builder_, level_, marker_, MAINTAINER, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ""
  public static boolean Nothing(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Nothing")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<nothing>");
    result_ = consumeToken(builder_, "");
    exit_section_(builder_, level_, marker_, NOTHING, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // {Whitespace} {OptionalWhitespace} | {Nothing}
  public static boolean OptionalWhitespace(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OptionalWhitespace")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<optional whitespace>");
    result_ = OptionalWhitespace_0(builder_, level_ + 1);
    if (!result_) result_ = OptionalWhitespace_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, OPTIONAL_WHITESPACE, result_, false, null);
    return result_;
  }

  // {Whitespace} {OptionalWhitespace}
  private static boolean OptionalWhitespace_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OptionalWhitespace_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = OptionalWhitespace_0_0(builder_, level_ + 1);
    result_ = result_ && OptionalWhitespace_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Whitespace}
  private static boolean OptionalWhitespace_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OptionalWhitespace_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Whitespace(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {OptionalWhitespace}
  private static boolean OptionalWhitespace_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OptionalWhitespace_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = OptionalWhitespace(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {Nothing}
  private static boolean OptionalWhitespace_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OptionalWhitespace_1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = Nothing(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'RUN'|'run'
  public static boolean Run(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Run")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<run>");
    result_ = consumeToken(builder_, "RUN");
    if (!result_) result_ = consumeToken(builder_, "run");
    exit_section_(builder_, level_, marker_, RUN, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // 'USER'|'user'
  public static boolean User(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "User")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<user>");
    result_ = consumeToken(builder_, "USER");
    if (!result_) result_ = consumeToken(builder_, "user");
    exit_section_(builder_, level_, marker_, USER, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // 'VOLUME'|'volume'
  public static boolean Volume(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Volume")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<volume>");
    result_ = consumeToken(builder_, "VOLUME");
    if (!result_) result_ = consumeToken(builder_, "volume");
    exit_section_(builder_, level_, marker_, VOLUME, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // "regexp:[ \t\f]"
  public static boolean Whitespace(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Whitespace")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<whitespace>");
    result_ = consumeToken(builder_, "regexp:[ \t\f]");
    exit_section_(builder_, level_, marker_, WHITESPACE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // 'WORKDIR'|'workdir'
  public static boolean Workdir(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Workdir")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<workdir>");
    result_ = consumeToken(builder_, "WORKDIR");
    if (!result_) result_ = consumeToken(builder_, "workdir");
    exit_section_(builder_, level_, marker_, WORKDIR, result_, false, null);
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
  // {LineTermination} | {BlankLine} | {CommentLine} | {InstructionLine}
  static boolean item_(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item_")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = item__0(builder_, level_ + 1);
    if (!result_) result_ = item__1(builder_, level_ + 1);
    if (!result_) result_ = item__2(builder_, level_ + 1);
    if (!result_) result_ = item__3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {LineTermination}
  private static boolean item__0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item__0")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = LineTermination(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {BlankLine}
  private static boolean item__1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item__1")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = BlankLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {CommentLine}
  private static boolean item__2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item__2")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = CommentLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {InstructionLine}
  private static boolean item__3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "item__3")) return false;
    boolean result_ = false;
    Marker marker_ = enter_section_(builder_);
    result_ = InstructionLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

}
