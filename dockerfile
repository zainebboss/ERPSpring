From openjdk:8
ADD /target/Micro-s-0.0.1-SNAPSHOT.jar Micro-s-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","Micro-s-0.0.1-SNAPSHOT.jar"]