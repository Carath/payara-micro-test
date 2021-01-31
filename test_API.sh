#!/bin/sh

# Some GET and POST request examples:

curl -w '\n' http://localhost:1234/chosenroot/api

curl -w '\n' http://localhost:1234/chosenroot/api/get/hello

curl -w '\n' -X POST --data 'This is my request.' http://localhost:1234/chosenroot/api/post

curl -w '\n' http://localhost:1234/chosenroot/api/file
