# Working with Relational Databases

## Introduction to Relational Databases

- A relational database is type of database that organizes data into tables. Each tables consists of rows(records) and columns(fields).

## Introduction to JPA

- Jakarta Presistance API
- Standard API for ORM
- Only specification, defines a set of interfaces
- Hibernate is the default implementation for JPA specifications
- Object-to-Relation Mapping (ORM)
  - Developer Defines mapping between Java class and database table

- Hibernate is a framework for presisting/saving objects in db.
- Hibernate handles low-level SQL
- Minimizes the amount of JDBC code you have to develop
- Hibernate provides the Object-to-Relation Mapping (ORM)


**For Entity**

- Default constructor is mandatory for entity class
- Getter / Setter methods are mandatory for entity class


### Data Access Object & JPA Entity Manager

- Responsible for interfacing with the database
- Data Access Object (DAO) is common design pattern
- DAO needs Entity Manager
- JPA Entity Manager is main component for saving/retrieving entities


**2 Approaches to interact with tables**

- JPA Entity Manager
- JPA Repository


- The annotation `@Repository` will make the class innjectable and managed by Spring IoC.
- The annotation `@Transactional` can be used for making the method a transaction, and is a MUST for any insert of update
- `@Bean` Function to be run once the appliaction starts, and it's injectable
- EntityManager does not accept primitive type like `int, double`


- Save or update the record based on the id if provided `entityManager.merge(employee);` 

- To ensure a new record is create the id must be 0 `employee.setId(null);`


## JPARepository

- Provides commonly used CRUD out of the box, reducing the amount of code needed
- Additonal features like pagination, sorting
- Generate queries based on method names
- Can write custom queries using `@Query`

## Spring Data Rest

- Will automatically create the repository, controller, and will follow HATEOS

## Securing RESTful Web Services

- Spring Security Password Storage
  - In Spring Security, passwords are stored using specific format
    {id} encodedpassword
  - id 
    - {noop} - Plain Text Password
    - {bcrypt} - Bcrypt


## Things to learn

- Entity Manager in JPA