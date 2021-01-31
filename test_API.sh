#!/bin/sh

# Some GET and POST request examples:

curl -w '\n' http://localhost:1234/api

curl -w '\n' http://localhost:1234/api/get/hello

curl -w '\n' -X POST --data 'This is my request.' http://localhost:1234/api/post

curl -w '\n' http://localhost:1234/api/file
