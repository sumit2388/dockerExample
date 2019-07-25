FROM openjdk:8
ADD target/docker-maven.jar docker-maven.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","docker-maven.jar"]