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


## Things to learn

- Getter & Setter in TypeScript
- protected keyword
- Angular project structure