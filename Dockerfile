
# Use a lightweight base image for the application
FROM openjdk:20-jdk-slim

RUN mkdir app
# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the builder stage to the current directory in the container
COPY ./target/Cricket11-0.0.1-SNAPSHOT.jar ./cricket11.jar

# Expose the port the application runs on
EXPOSE 8080

# Define the command to run the application
CMD ["java", "-jar", "cricket11.jar"]

