LAB -1  Creating Eureka Registry

DONE => 1) Create a Spring Boot Starter Project

DONE => 2) Add Eureka Server, Spring Web as Dependency

Done =>3) In the Class with @SpringBoot Application add the annotation @EnableEurekaServer

Done => 4) Rename the application.properties to application.yml

Done => 5) Add the Required Entries to the yml 
server:
  port: 8761
  
spring:
  application:
    name: eureka-server-registry
    
eureka:
  client:
    register-with-eureka: false
    fetch-registry: false
    service-url:
      defaultZone: http://localhost:8761/eureka



6) Run the Application  

7) Open the Browser and navigate to http://localhost:8761 - eureka dash board will be   shown

====================================================================