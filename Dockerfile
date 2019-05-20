FROM openjdk:8-jdk-windowsservercore-1803
ADD target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]