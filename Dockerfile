FROM amazoncorretto:17.0.7-alpine
ADD target/java-holamundo.jar java-holamundo.jar
ENTRYPOINT ["java", "-jar","java-holamundo.jar"]
#EXPOSE 8080
