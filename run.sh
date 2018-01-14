#!/bin/bash
cwd=`pwd`

main="com.fhm.helloworld.Main"
args=""

mvn exec:java \
	-Dexec.mainClass=$main \
	-Dexec.args=$args

cd $cwd
