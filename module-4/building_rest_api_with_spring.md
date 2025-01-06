# Building RESTful Web Services with Spring Boot

- REST (Representational State Transfer)
- Client - Server Architecture
  - Client handle UI and user interactions
  - Server handles business logic, database integration, and data storage
- RESTful use HTTP protocol
- Everything in REST is a resource
- Each HTTP request is indepenedent, and server doesn't store session state between requests

## HTTP Methods:

 - GET: Retrieve records
 - POST: Create record
 - PUT: Update record
 - PATCH: Partially update on the server
 - DELETE: Delete record

## HTTP Status Code

- 200 OK: Successful request
- 201 Created: Resource created successfuly
- 400 Bad Request: Invalid request from client
- 401 Unauthorized: Authentication failed
- 403 Forbidden: Access Denied
- 404 Not found: Resource not found
- 500 Internal Server Error: Server-side error

## What is JSON?

- JavaScript Object Notation
- Lightweight data format and exchanging data (plain text)
- Language independent
- Can be used with any programming language (Python, Java, Go)

## JSON Data Binding with Jackson

- Spring uses Jackson project under the hood
- Jackson handles data binding between JSON and Java POJO (Plain Old Java Object)
- By default, Jackson will call appropriate getter/setter method
- Soring automatiaclly handle Jackson integration


## Exception Handling

- Method to handle exception handling to a class
- Alternative of using try-catch blocks in each controller
- But not the good approach to have it at each controller
- `@RestControllerAdvice` is composed of 
  - `@ControllerAdvice`
  - `@ResponseBody`

```java
@ExceptionHandler(ResourceNotFound.class)
public ResponseEntity<String> handleResourcetNotFoundException(ResourceNotFound exception) {
    return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .body(exception.getMessage());
    }
```

## Troubleshooting Spring Boot Application

**Error Log Levels**

- Error - High - Non Recoverable
- Warning - Medium - Recoverable and not stop flow
- Info - Normal 
- Debug - Normal
- Trace - Normal

Inside the application.properties, I can set which logging level to show
`logging.level.root=warn`

```properties
# will ge more details of the app
management.endpoints.web.exposure.include=*
```

- `http://localhost:8080/actuator/mappings`
- `http://localhost:8080/actuator/health`
- `http://localhost:8080/actuator/metrics`


`actuator\info` Endpoint can be used to add extra information about the application part of the actuator

```properties
# Enable the info endpoint
management.info.env.enabled=true
# Expose the api endpoints
management.endpoints.web.exposure.include=health,info


# Adding details to /actuator/info endpoint
info.app.name=Spring Boot Basic Security
info.app.version=v0.0.1
info.app.description=App to demonstrate basic security to products an actuator apis
info.author=Ahmed
```


## Spring Security

Spring security can be used for securing the application

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```

## Spring Boot Test

- Mockito was used for unit testing
- Added additional plugin line in pom.xml
- 


## Advanced Topics in RESTful Web Services

- HATEOAS (Hypermedia as the Engine of Application State)
- API Versioning
  - `api/v0/products` and `api/v1/products`

**Example of HATEOS Response**

```java
return EntityModel.of(product,
    linkTo(methodOn(ProductController.class).getProductById(id)).withSelfRel(),
    linkTo(methodOn(ProductController.class).updateProduct(id, product)).withRel("put"),
    linkTo(methodOn(ProductController.class).deleteProduct(id)).withRel("delete")
);
```



## Things to learn

- Unit testing
- Mockito unit testing
- Mockmvc for mocking http requests
