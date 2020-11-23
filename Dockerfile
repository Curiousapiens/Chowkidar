FROM openjdk:8-jdk-alpine
EXPOSE 9000
ADD ../Chowkidaar/target/gateway-0.0.1-SNAPSHOT.jar gateway.jar
ENTRYPOINT ["java", "-jar", "/gateway.jar"]