FROM java:8u72-jdk
ADD target/pranay-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]