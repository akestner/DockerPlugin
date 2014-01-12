// We base our lexer directly on the idea-handlebars lexer definition,
// making some modifications where necessary

package com.akestner.plugins.docker.parsing;

import java_cup.runtime.*;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.containers.Stack;
import com.akestner.plugins.docker.parsing.DockerTokenTypes;
import com.akestner.plugins.docker.config.DockerConfig;

// suppress various warnings/inspections for the generated class
@SuppressWarnings ({"FieldCanBeLocal", "UnusedDeclaration", "UnusedAssignment", "AccessStaticViaInstance", "MismatchedReadAndWriteOfArray", "WeakerAccess", "SameParameterValue", "CanBeFinal", "SameReturnValue", "RedundantThrows", "ConstantConditions"})
%%

%class _DockerLexer
%implements FlexLexer
%final
%unicode
%function advance
%type IElementType
%eof{ return;
%eof}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*
Identifier = [:jletter:] [:jletterdigit:]*
DecIntegerLiteral = 0 | [1-9][0-9]*

From="FROM"
Maintainer="MAINTAINER"
Run="RUN"
Cmd="CMD"
Expose="EXPOSE"
Env="ENV"
Add="ADD"
Entrypoint="ENTRYPOINT"
Volume="VOLUME"
DockerUser="USER"
Workdir="WORKDIR"

Directive={From}|{Maintainer}|{Run}|{Cmd}|{Expose}|{Env}|{Add}|{Entrypoint}|{Volume}|{DockerUser}|{Workdir}
Instruction={Directive} ([:jletter:]|[:jletterdigit:]|{WhiteSpace})* {LineTerminator}


%state WAITING_VALUE

%%

<YYINITIAL> {From}                  { yybegin(YYINITIAL); return DockerTypes.FROM; }
<YYINITIAL> {Maintainer}            { yybegin(YYINITIAL); return DockerTypes.MAINTAINER; }
<YYINITIAL> {Run}                   { yybegin(YYINITIAL); return DockerTypes.RUN; }
<YYINITIAL> {Cmd}                   { yybegin(YYINITIAL); return DockerTypes.CMD; }
<YYINITIAL> {Expose}                { yybegin(YYINITIAL); return DockerTypes.EXPOSE; }
<YYINITIAL> {Env}                   { yybegin(YYINITIAL); return DockerTypes.ENV; }
<YYINITIAL> {Add}                   { yybegin(YYINITIAL); return DockerTypes.ADD; }
<YYINITIAL> {Entrypoint}            { yybegin(YYINITIAL); return DockerTypes.ENTRYPOINT; }
<YYINITIAL> {Volume}                { yybegin(YYINITIAL); return DockerTypes.VOLUME; }
<YYINITIAL> {DockerUser}            { yybegin(YYINITIAL); return DockerTypes.USER; }
<YYINITIAL> {Workdir}               { yybegin(YYINITIAL); return DockerTypes.WORKDIR; }
<YYINITIAL> {Directive}             { yybegin(YYINITIAL); return DockerTypes.INSTRUCTION_LINE; }
<YYINITIAL> {Comment}               { yybegin(YYINITIAL); return DockerTypes.COMMENT_LINE; }
<YYINITIAL> {LineTerminator}        { yybegin(YYINITIAL); return DockerTypes.LINE_TERMINATION; }
<WAITING_VALUE> {LineTerminator}    { yybegin(YYINITIAL); return DockerTypes.LINE_TERMINATION; }
<WAITING_VALUE> {WhiteSpace}+       { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
.|\n                                { throw new Error("Illegal character <"+yytext()+">"); }