FROM eclipse-temurin:21.0.5_11-jdk-alpine

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar

ENTRYPOINT ["java", "-jar", "application.jar"]

