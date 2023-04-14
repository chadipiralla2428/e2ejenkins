FROM openjdk:8
EXPOSE 8006
ADD target/e2ejenkins-0.0.1-SNAPSHOT.jar appjenkins.jar
ENTRYPOINT ["java","-jar","/appjenkins.jar"]