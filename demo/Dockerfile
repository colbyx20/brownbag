# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container
COPY target/demo-1.0-SNAPSHOT.jar app.jar

EXPOSE 5002

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
