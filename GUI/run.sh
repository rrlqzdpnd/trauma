#!/bin/bash

cd lexer
export CLASSPATH=".:./antlr-4.1-complete.jar:$CLASSPATH"
java org.antlr.v4.runtime.misc.TestRig Trauma program -gui
