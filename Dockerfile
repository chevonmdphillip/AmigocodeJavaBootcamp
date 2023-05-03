FROM openjdk:17

MAINTAINER chevy

LABEL authors="chevy"

COPY target/*.jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]