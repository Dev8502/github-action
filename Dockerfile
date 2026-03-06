FROM eclipse-temurin:21-jre
EXPOSE 8080
COPY target/spring-github-action.jar spring-github-action.jar
ENTRYPOINT ["java","-jar","/spring-github-action.jar"]