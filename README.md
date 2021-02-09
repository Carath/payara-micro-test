# Payara Micro test

This provides an asynchronous REST API, enabling HTTP requests to a java project. It uses a docker image of Payara Micro, an open-source application server which is Jakarta EE compliant.

Initially forked from: <https://github.com/apozel/jaxrs-Exemple>


## Installation (Linux)

Install Java 1.8 (JDK + JRE), and maven 3.6.3. Don't forget to export the JAVA_HOME and M2_HOME environment variables, and if under a proxy to properly setup the ``` setting.xml ``` file, which must be placed in the ```~/.m2``` directory. Finally, install [Docker](https://docs.docker.com/engine/install) and [Docker Compose.](https://docs.docker.com/compose/install)

The docker image used will be downloaded automatically, however it can still be found [here.](https://hub.docker.com/r/payara/micro)


## Runtime:

Compile the project by running: ``` sh build.sh ```

To start using the API, start the docker process with: ``` sudo systemctl start docker ```

To build the docker image, run ``` sudo docker-compose build ```. Note that this step should be done after each compilation.

Then launch a container with: ``` sudo docker-compose up -d ```

For testing GET requests, simply go to the following links from a web browser:

```
http://localhost:1234/api
http://localhost:1234/api/get/hello
```

This may alternatively be done using curl:

```
curl -w '\n' http://localhost:1234/api
curl -w '\n' http://localhost:1234/api/get/hello
```

For POST requests:

```
curl -w '\n' -X POST --data 'This is my request.' http://localhost:1234/api/post
```

The type of content to be POSTed may also be specified, e.g by adding ``` -H 'Content-Type: text/plain' ``` before the url. Finally, note that the port 1234 used can be configured in the docker-compose.yml file.


## Deployment:

Once the project is done, and needs to be deployed e.g on a web server, java and maven need not to be reinstalled there again! Indeed, the docker image contains a java JRE. Therefore, the only files necessary for this to run are:

- This README
- Dockerfile
- docker-compose.yml
- The target/ directory containing only the .war file.
