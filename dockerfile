From openjdk:8
ADD /target/ccc.jar ccc.jar
ENTRYPOINT ["java","-jar","ccc.jar"]