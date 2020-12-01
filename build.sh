#!/bin/sh

# Goal: compile, generate a .jar, and test the package.
# Args can be passed.

mvn clean install

java -jar target/artefactid-1.0-SNAPSHOT-classes.jar $@
