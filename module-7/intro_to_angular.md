# Introduction to Angular

## What is JavaScript?

- ECMA-262 is the official name of the standard
- Is high-level, intepreted programming language
- One of the core technologies of WWW alongside HTML and CSS
- Was primarily used for client-side scripting in web development
- Used in server-side programming with Node.js

## Where is JavaScript used today?

- Front-end website development
- Back-end API development
- Mobile App development
- Data visualization
- Machine Learning and AI

## What is TypeScript?

- Open-source language developed by Microsoft
- It is JavaScript with added syntax for types
- It is syntactic superset of Javascript with added static typing
- Adds syntax of JavaScript, allows devs to add types
- Typescript uses compile time type checking


## Types in Typescript

- Any
- Primitive types
  - boolean
  - number
  - string
  - enum
  - void
- Object types

`readonly` a value cannot be modified even if it's const array

## OOPs in TypeScript

- get() keyword used to create getter


## Angular

- Spec: test related files
- Angular CLI (NG)
- 

To create a new Angular project

```zsh
ng new <app-name>
```


## Components

- HTML Template that declares what renders on page
- Typescript class that defines

To create a component use the below commmands

```bash
ng generate component <component-name>

# or

ng g c <component-name>
```


## Data Binding in Angular

Examples of interporaltions
- Text interporation
- Property binding
- 

## Data Binding - Interpolation - {{}}

```
Showing/binding values from Typescript to template
```

## Data Binding - Property Binding - []

In TS
```typescript
export class PropertyBindingComponent {
  webUrl: string = "https://google.com";
  picUrl: string = "images/icons8-typescript-480.png";
  picHeight: number = 150;
  isDisabled: boolean = false;
}
```

In HTML
```html
<img [src]="picUrl" [height]="picHeight" alt="Image not found">
```


## Data Binding - Event Binding - ()

- To handle events


## Data Binding - Two-way data Binding - [(ngModel)]

- Two-way binding gives components in your application a way to share data
- Use two-way binding to listen for events and update values simultaneosuly between component and template
- Combination of square brackets and paranetheses [()]
- [()] Syntax combines brackets of property binding [] and event binding ()



## Angular Directives

- Angular directives are the elements which are used to change behavior or apperance of DOM elements

2 Types:

    - Structural
    - Behavioral

### Structural Directive

- Structural directives that change the DOM layout


#### Structural Directive - *ngFor

- Same as for loop
- Used to iterate over collection of data
```html
*ngFor="let friend of friends"
```

### New Syntax

```
@for (product of productsList; track product.id) {

}
```


### Introduction to Pipes in Angular

- Angular takes raw data and transform it to desired format
- Transform data to specific format before displaying them to users
- Using the (|) pipe operator, we can apply pipe features

### Using Built-In Pipes

- Angular provides several built-in pipes


### Custom Pipes in Angular

```zsh
ng generate pipe <custom-pipe-name>
ng g p <custom-pipe-name>
```


## Angular Routing Basics: Configuring Routes

- **RouterLink**
  - Directive used to navigate between routes
  - Similar to href attribute in HTML but leverages Angular's routing

- **RouterOutlet**
  - Acts as placeholder where mounted components will be displayed

- **RouterLinkActive**


## Angular Dynamic Routes

Use this in app.routes.ts
```typescript
{path: 'profiles/:name', component: ProfileDetailComponent},
```

Then access it in the component like this
```typescript

```

## Query Param in Angular



## Template Driven Form

Declare a form in a group using
```
<form #MyForm = "ngModel">
</form>
```


## Reactive Form


## Validators



## Services

```zsh
ng g s <folder-name>/<file-name>
ng generate service <folder-name>/<file-name>
```

- Service is like a shared medium


## Passing values from parent to child components


- EventEmitter


## Create Interface

```typescript
ng g i <folder-name>/<type-name>
ng generate interface <folder-name>/<type-name>

```


## Things to learn

- Getter & Setter in TypeScript
- protected keyword
- Angular project structure
- Pipes
- Routers in Angular
- NgForm Directive
- FormControl, FormGroup, FormGroupName
- Reactive and Template Forms
- Forms validation in forms types
- Custom validators
- Dynamic input fields when the input of type array
- EventEmitter to pass from child to parent component
- Read about FormGroup.patchValue