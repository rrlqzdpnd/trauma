#!/bin/bash

export CLASSPATH=".:./antlr-4.1-complete.jar:$CLASSPATH"
javac "$1"
cd "$3"
java "$2"
