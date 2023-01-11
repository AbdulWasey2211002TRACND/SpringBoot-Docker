FROM openjdk:17-jdk-alpine

COPY target/test.jar test.jar

ENTRYPOINT ["java","-jar","/test.jar"]