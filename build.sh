#!/bin/sh

# The goal of this script is to build and test the project, without the REST API.
# Args can be passed as arguments, e.g by running: sh build.sh foo bar


# Build:

mvn clean install


# Runtime, method 1 - java only:

java -jar target/artefactid-1.0-SNAPSHOT-classes.jar $@


# Runtime, method 2 - with maven:

# JAVA_PROGRAM_ARGS=`echo "$@"`
# mvn exec:java -Dexec.args="$JAVA_PROGRAM_ARGS"
