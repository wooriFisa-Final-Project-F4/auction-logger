FROM openjdk:17-jdk
WORKDIR /app
COPY build/libs/auction-logger-0.0.1-SNAPSHOT.jar /app/auction-logger.jar
CMD ["java", "-jar", "/app/auction-logger.jar"]