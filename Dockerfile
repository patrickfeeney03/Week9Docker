FROM openjdk:17

WORKDIR /app

COPY target/week9-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "week9-0.0.1-SNAPSHOT.jar"]