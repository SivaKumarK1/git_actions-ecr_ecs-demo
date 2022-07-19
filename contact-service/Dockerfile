FROM maven:3.8.6-openjdk-18
EXPOSE 8082
WORKDIR /contact-service
COPY . ./
RUN mvn clean package
ENTRYPOINT ["java","-jar","./target/contact-service-0.0.1-SNAPSHOT.jar"]
