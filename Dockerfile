FROM openjdk:8-jre-alpine
COPY target/server-0.0.1-SNAPSHOT.jar /app.jar
# Inform Docker that the container is listening on the specified port at runtime.
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]