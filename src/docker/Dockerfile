FROM openjdk:8-jdk-alpine
# Required for starting application up.
RUN apk update && apk add bash

RUN mkdir -p /opt/app

ENV PROJECT_HOME /opt/app

COPY ./target/may-the-fourth-be-with-you-two.jar $PROJECT_HOME/may-the-fourth-be-with-you-two.jar

CMD ["java", "-Dspring.data.mongodb.uri=mongodb://may-the-fourth-be-with-you-two-mongo:27018/may-the-fourth-be-with-you-two", "-Djava.security.egd=file:/dev/./urandom","-jar","./may-the-fourth-be-with-you-two.jar"]

WORKDIR $PROJECT_HOME