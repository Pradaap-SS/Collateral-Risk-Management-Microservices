FROM openjdk:11
EXPOSE 8081
COPY ./target/authorization-service.jar authorization-service.jar 
ENTRYPOINT ["java","-jar","/authorization-service.jar"]