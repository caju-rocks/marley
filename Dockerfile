FROM openjdk:17

WORKDIR /app
COPY build/libs/*-SNAPSHOT.jar /app/marley.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "marley.jar"]
