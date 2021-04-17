LAB -2  Creating Eureka Client

1) Create a Spring Boot Starter Project

2) Add Lombok,Eureka Client, Spring Web ,Spring Data JPA, MySql Connector as Dependency

3) In the Class with @SpringBoot Application add the annotation @EnableDiscoveryClient

4) Rename the application.properties to application.yml

Done => 5) Add the Required Entries to the yml 
server:
  port: 6060
  
spring:
  application:
    name: hotel-service
    
eureka:
  client:
    register-with-eureka: true
    fetch-registry: true
    service-url:
      defaultZone: http://localhost:8761/eureka



6) Run the Application  

7) Open the Browser and navigate to http://localhost:8761 - eureka dash board will be   shown

8) In the Registered Instance Column , can see the hotel-service registered

