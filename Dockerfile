FROM amazoncorretto:17.0.7-alpine
ADD target/holamundo-1.0-SNAPSHOT.jar holamundo-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","holamundo-1.0-SNAPSHOT.jar"]
#EXPOSE 8080
