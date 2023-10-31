FROM amazoncorretto:17.0.7-alpine
ADD target/java-HolaMundo.jar java-HolaMundo.jar
ENTRYPOINT ["java", "-jar","java-HolaMundo.jar"]
#EXPOSE 8080
