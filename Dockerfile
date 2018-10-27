FROM openjdk:8
ADD springboottest1.jar springboottest1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "springboottest1.jar"]