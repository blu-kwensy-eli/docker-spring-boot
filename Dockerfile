FROM java:8-jre-alpine
ADD docker-spring-boot-simple-1.0-SNAPSHOT.jar  /tmp/
ENV SPRING_APPLICATION_NAME node
CMD  java -jar  /tmp/docker-spring-boot-simple-1.0-SNAPSHOT.jar --spring.application.name=${SPRING_APPLICATION_NAME}
EXPOSE 8080
