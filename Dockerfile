# Use an official Maven image to build the Spring Boot app
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory inside the container
WORKDIR /build

# Copy the Maven project file
COPY pom.xml .

# Download the project dependencies
RUN mvn dependency:go-offline

# Copy the source code
COPY src/ ./src/

# Build the Spring Boot application
RUN mvn package

# Use a separate stage for the final Docker image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built Spring Boot executable JAR from the previous stage
COPY --from=build /build/target/kutto-0.0.1-SNAPSHOT.jar /app/app.jar
# Command to create the directory during the build process
RUN mkdir -p /var/lib/image/kutto
# Create a volume for /var/lib/image
VOLUME /var/lib/image/kutto

# Expose the port that the Spring Boot app will run on
EXPOSE 8080

# Command to run the Spring Boot application
CMD ["java","-Dspring.profiles.active=prod", "-jar", "app.jar"]