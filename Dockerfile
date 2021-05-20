FROM openjdk:11.0.7-jre-slim

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java","-Xmx512m","-jar","/app.jar"]