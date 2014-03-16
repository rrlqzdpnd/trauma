#!/bin/bash

cd lexer/
java -jar /usr/local/lib/antlr-4.1-complete.jar Trauma.g4
javac Trauma*.java
