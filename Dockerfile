FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} HelpDeskApi-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "/HelpDeskApi-0.0.1-SNAPSHOT.jar"]

