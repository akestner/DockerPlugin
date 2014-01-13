// We base our lexer directly on the idea-handlebars lexer definition,
// making some modifications where necessary

package com.akestner.plugins.docker.lexer;

import java_cup.runtime.*;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.containers.Stack;
import com.akestner.plugins.docker.parser.DockerTokenTypes;
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

/*
Macro Declarations

These declarations are regular expressions that will be used latter in the
Lexical Rules Section.
*/

/* A line terminator is a \r (carriage return), \n (line feed), or \r\n. */
LineTerminator = \r|\n|\r\n
WhiteSpace= {LineTerminator} | [ \t\f]
Comment = "#"[^\r\n]*

/* A identifier integer is a word beginning a letter between A and Z, a and z,
or an underscore followed by zero or more letters between A and Z, a and z,
zero and nine, or an underscore. */
Identifier = [A-Za-z_][A-Za-z_0-9._]*

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
<YYINITIAL> {Directive}             { yybegin(YYINITIAL); return DockerTypes.INSTRUCTION; }
<YYINITIAL> {Comment}               { yybegin(YYINITIAL); return DockerTypes.COMMENT; }
<YYINITIAL> {LineTerminator}        { yybegin(YYINITIAL); return DockerTypes.LINETERMINATION; }
<WAITING_VALUE> {LineTerminator}    { yybegin(YYINITIAL); return DockerTypes.LINETERMINATION; }
<WAITING_VALUE> {WhiteSpace}+       { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
.|\n                                { throw new Error("Illegal character <"+yytext()+">"); }