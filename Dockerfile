FROM amazoncorretto:17.0.7-alpine
ADD target/java-hola-mundo.jar java-hola-mundo.jar
ENTRYPOINT ["java", "-jar","java-hola-mundo.jar"]
#EXPOSE 8080
