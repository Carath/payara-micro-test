# Payara Micro test

This provides a REST API enabling GET and POST requests to a java project. It uses the docker image Payara Micro, and Jakarta EE.

Forked from: <https://github.com/apozel/jaxrs-Exemple>


## Installation (Linux)

Install docker, java 1.8 (jdk + jre), and maven 3.6.3. Don't forget to export the JAVA_HOME and M2_HOME environment variables, and if under a proxy to properly setup the setting.xml file, which must be placed in the ```~/.m2``` directory.

Download the Payara Micro docker image, found at <https://hub.docker.com/r/payara/micro>, by running:

```
sudo docker pull payara/micro
```


## Runtime:

Start the docker process with: ```sudo systemctl start docker```

Then run as sudoer: ```sh start_api.sh ```

To test GET requests, simply go to the following links from a web browser:

```
http://localhost:8080/chosenroot/api
http://localhost:8080/chosenroot/api/get/123
```

This may alternatively be done using curl:

```
curl -w '\n' http://localhost:8080/chosenroot/api
curl -w '\n' http://localhost:8080/chosenroot/api/get/123
```

For POST requests:

```
curl -w '\n' -X POST --data 'This is my request.' http://localhost:8080/chosenroot/api/post
```

The type of content to be POSTed may also be specified, e.g by adding ```-H 'Content-Type: text/plain'``` before the url.
