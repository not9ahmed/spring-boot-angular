# Building Web Applications with Spring MVC


## Introduction to Spring MVC

- Spring MVC (Model-View-Controller) core component of Spring Framework to simplfy web app.
- Follows MVC architectural pattern to seperate concerns, promoting maintainability and tesability.
- MVC Architecture
  - **Model:** App Data and Business Logic
    - POJOs, entities, and service class
  - **View:** Presenting data to user
    - Thymeleaf or template engines
  - **Controller:** Handle user input and requests, processes them, and returns a response.


### Internally The Below Mechanisims are used

- **DispatcherServlet**
  - Acts as cenetral controller in Spring MVC App
  - Intercepts all incoming requests, maps them to appropriate controllers, and processes the responses

- **RequestMapping**
  - Maps HTTP requests to specific handler methods in controllers using the `@RequestMapping` annotation or like `@GetMapping`

- **Handler Mapping**
  - Determines which controller should process a given request

- **View Resolver**
  - Determines how to render view (Thymeleaf)
  - For example in express it will look for ejs


### Features of Spring MVC

- Annotation-Based Configuration
  - Like `@Controller` , `@RequestMapping` 
- RESTful Support
  - Easily build RESTful APIs usering `@RestController`
- Flexible View Resolution
  - Support for multiple view tech like ThymeLeaf, Freemaker
- Validation
  - Built-in support for data validation using `@Valid` and BindingResult
- Exception Handling
  - Use `@ExceptionHandler` or global exception handling with `@ControllerAdvice`

### How Spring MVC Works

- A user sends request to app
- DispatcherServlet intercepts the request
- Handler Mapping identifies the right controller
- 
- ...


### Spring MVC Annotations

- `@Controller`: Marks class as controller
- `@RestController`: Combination of `@Controller` and `@ResponseBody` for RESTful endpoints.
- `@RequstMapping`: Maps HTTP request to handler methods
- `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping` specfic HTTP methods mappings.
- `@ModelAtrribute`: Binds request parameter to

### Spring MVC Advantages

- **Seperation of Concerns:** Clear division between MVC
- **Easy of Integration:** Works seamlessly with Spring ecosystem
- **Testability:** Decoupled component make unit testing simple
- **Scalability:**
- **Rich Feature Set:**


## Configuring Spring MVC

- Configuring Spring MVC
- Spring MVC works
- ...
- Configure Thymeleaf
- Run the application


## Spring MVC Keypoints

The following should be added to html file
```html
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
</html>
```

For dynamics values, the model can be used to pass the data to view
```java
    @RequestMapping("/about")
    public String showAbout(Model model) {
        model.addAttribute("first_name", "Ahmed");
        return "about";
    }
```

**Normal Text**
```html
<h2 th:text="${first_name}"></h2>
```

**Contionals**
```html
<h3 th:if="${age > 99}">100 Years Old</h3>
```

**Negation**
```html
<h3 th:unless="${age > 99}">100 Years Old</h3>
```

**Loop**
```java
String[] names = {"Ahmed", "Joe", "Steve", "Ann"};
model.addAttribute("names", names);
```

```html
<h3>Friends List</h3>
<ol>
    <li th:each="friend: ${friends}" th:text="${friend}"></li>
</ol>
```


`@ModelAttribute is to pass objects between views`

```html
<form method="post" th:action="@{/employees/save}" th:object="${employee}">

</form>
```


```java
public String saveEmployee(@Valid @ModelAttribute Employee employee, BindingResult bindingResult, Model model) {

}

```

### Keypoints of Thymeleaf

- Values coming from controller will be referenced with the sympol like `${employee}`
- Values extracted from template itself will be like `*{name}`, and it can be due to taking from `${employee}` parent element class.



## Validation

The following is example of Jakarta validation annotations

```java
@NotEmpty(message = "Mobile is required")
@Pattern(regexp = "^[0-9]{10}", message = "Mobile number must be 10 digits")
private String mobile;
```



```java
public class EmailDomainConstraintValidator implements ConstraintValidator<EmailDomain, String> {

    @Override
    public void initialize(EmailDomain emailDomain) {
        domainName = emailDomain.value();
    }

    // Validation will occur here
    @Override
    public boolean isValid(String emailAddress, ConstraintValidatorContext constraintValidatorContext) {
        if (emailAddress.endsWith(domainName)) {
            return true;
        } else {
            return false;
        }
    }
}
```

**To redirect to other links**

```java
// redirect to other link
return "redirect:/products";
```

**To extract parameter from URL**
```html
<div th:if="${param.error}" class="alert alert-success">
    Invalid username and password
</div>
```


## Things to learn

- DispatcherServlet and RequestMapping in Java
- Thymeleaf template syntax
- Spring MVC `@ModelAttribute` and how objects are passed between views
- `BindingResult result` in Controllers and how it's used
- How Spring handles the form validation with `${#fields.hasErrors('name')}`
- Java annotations