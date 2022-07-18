FROM maven:3.8.6-openjdk-18
EXPOSE 8081
WORKDIR /user-service
COPY . ./
CMD mvn clean package
ENTRYPOINT ["java","-jar", "./target/user-service-0.0.1-SNAPSHOT.jar"]
