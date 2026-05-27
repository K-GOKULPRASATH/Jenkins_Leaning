#Base Image
FROM eclipse-temurin:21-jdk

# Seting the working directory
WORKDIR /app

# Coping the jar file to the Docker workdirectorty to work with jenkins we
# use the jar file in container inseted of copying the source code and building it in the Container
COPY target/*.jar app.jar

# Expose the port that the Docker container uses to communicate with the outside world
EXPOSE 8081

# Command to run the application when the Container starts
ENTRYPOINT ["java", "-jar", "app.jar"]

# This Dockerfile is used to create a
#Docker image for a Spring Boot application
#It use the Eclipse Temurin JDK 21 as the base image, sets the working directory to /app,
#cpoies the jar file for the application to the Container,
#expose port 8082 and defines the Command to run the Application when the container starts.