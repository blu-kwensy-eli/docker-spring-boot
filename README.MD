Docker Spring Boot Simple 

Sample project to prepare a Spring Boot application .jar running inside a docker container.

Extras

Run the project with the option --spring.application.name=<instanceName>

A Dockerfile is provided to run the application as a jar file.

Generate the .jar artifact :
`mvn clean install`

Build a Docker image :
`docker build --tag docker-spring-boot-simple .`

Run the Docker image :
`docker run -it -p 80:8080 -e SPRING_APPLICATION_NAME=node1 docker-spring-boot-simple` 

Access your deployed application :
`curl -L http://$DOCKER_MACHINE_IP:80/webapp`
where $DOCKER_MACHINE_IP is the ip address of your docker machine instance.