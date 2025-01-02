# Introduction to Spring Boot

Java Applications

- Console Based Applications
- GUI Based Application
- Web Based Application
  - Servlet
  - JSP - Using servlet
  - JSF
  - Spring Framework
    - Configuration and setup was difficult
  - Spring Boot - using Spring Framework
    - Everything is auto configured
    - Dependencies are set up and ready to run

## Spring Boot Features

- Production ready features
- Embedded server


**GAV**

- Group
- Artifact
- Version

**POM (pom.xml)**

Project object model

Maven will take dependencies from sona type

**Essential Maven Commands**

- Run Spring boot application
  - `mvnw spring-boot:run`
- Downloads all required dependencies
  - `mvnw dependency:resolve`
- Cleans the target directory
  - `mvnw clean`
- Build the project
  - `mvnw clean package`
- Running spring boot
- `java -jar `

Spring Boot related Depenencies should avoid the version as it will take from the parent spring dependency

## Essential Spring Boot Properties

```properties
server.port=3000

server.servlet.context-path=/api
```

## Essential Spring Boot Annotations

- Core Annotations
- @SpringBootApplication
  - Combines @Configuration, @EnableAutoConfiguration and @ComponentScan
- Marks main class of Spring boot app
- @EnableAutoConfiguration
  - Enable Spring Boot's auto configuration support
- @ComponentScan
  - Enables component scanning of current package recursively
- @Configuration
  - Able to register

**@RestController**
Simplfies the use instead of using

- @Controller
- @ResponseBody

- Controller
    - Responsible for handling HTTP request and returning appropriate responses.
    - Annotated with @RestController
- Service
  - A service contains business logic and annotated with @Service


- @Service
- @Controller
- @Repository

## Spring Beans & Dependency Injection

- Spring Beans are objects manage by Spring IoC (Inversion of Control) container
- Defined by application context and can be injected into other beans
- Dependency Injection (DI) design pattern that allows class to recieve it from dependecy

## Spring Modules

- Spring is modular, pick and choose for app
- Some modules are
  - Spring Core Fundamental for IoC container
  - Spring Web
  - Spring Security
  - Spring Boot

## Spring Core

- Heart of Spring Framework
- Foundation of framework

## Introduction to IoC

- Inversion of Control (IoC) where the control of object creation and lifecycle is inverted from application to framework
- Approach of outsourcing  the construction and managing of objects

## Types of DI

- Constructor Injection
  - Dependecies provided through class consructor
- Setter Injection
  - @Autowired


## Lazy Initialization

- Bean will only be initialized when needed for dependency injection
- @Lazy
- Lasy initialization - Global configuaration
  - `spring.main-initialization=true`
- The object will be created later once it's called

- Injection can be done by using @Autowired when a method will use that object
- @Qualifier not supported in Setter Injection

## Bean Lifecycle Methods

- Can add custom code during bean initalization
  - `@PostConstruct`
- Cann add custom code during bean destruction
  - `@PreDestroy`





## Things to learn

- Implementation and Interface, how spring finds the first implementation
- @Scope("prototype") for @Component
- Bean LifeCycle
- @AutoWired Setter injection
- Lazy Initialization for @Component in Spring Boot