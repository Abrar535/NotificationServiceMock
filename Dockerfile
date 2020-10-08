FROM openjdk:14
ADD target/users-mysql.jar users-mysql.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","users-mysql.jar"]