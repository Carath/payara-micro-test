#!/bin/sh

# Some GET and POST request examples:

curl -w '\n' http://localhost:8080/chosenroot/api

curl -w '\n' http://localhost:8080/chosenroot/api/get/123

curl -w '\n' -X POST --data 'This is my request.' http://localhost:8080/chosenroot/api/post

curl -w '\n' http://localhost:8080/chosenroot/api/file