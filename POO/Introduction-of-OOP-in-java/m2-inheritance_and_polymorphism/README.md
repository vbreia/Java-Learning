# Class 2 - Inheritance and Polymorphism

[Leia em português](./README-PTBR.md)

---

## Themes

- [Class 2 - Inheritance and Polymorphism](#class-2---inheritance-and-polymorphism)
  - [Themes](#themes)
  - [Inheritance: elemental aspects](#inheritance-elemental-aspects)
    - [Basic elements of inheritance](#basic-elements-of-inheritance)
    - [How to handle more than one superclass](#how-to-handle-more-than-one-superclass)
    - [Example of Inheritance of interfaces](#example-of-inheritance-of-interfaces)
    - [Comments of interfaces](#comments-of-interfaces)
  - [Inheritance and visibility](#inheritance-and-visibility)
    - [Has four access levels in Java](#has-four-access-levels-in-java)
    - [Comments of visibility](#comments-of-visibility)
    - [Comments of packages](#comments-of-packages)
    - [Example of package declaration](#example-of-package-declaration)
  - [Polymorphism](#polymorphism)
    - [Motivation](#motivation)
    - [Keywords](#keywords)
  - [Abstract Classes](#abstract-classes)
    - [Example of Abstract Class](#example-of-abstract-class)
    - [Comments on Abstract Classes](#comments-on-abstract-classes)

## Inheritance: elemental aspects

The inheritance term in OO defines an type of relationship between class based on a hierarchy. Within this hierarchical relationship, classes can inherit characteristics from other classes above them or their characteristics to subsequent classes below them.

### Basic elements of inheritance

- Generalization of behaviors
- Superclasses and subclasses inheritance
- Simple maintenance of code

![https://cdn-conteudo.ensineme.com.br/03_fb717d2b7f.png](https://cdn-conteudo.ensineme.com.br/03_fb717d2b7f.png)

In the image, we see that "**Empregado**" is the parent (superclass) of the classes "**Professor**", "**Diretor**", "**Coordenador**" and "**Secretário**". The latter are children (subclasses) of the **"Empregado"** class.

```markdown
> ⚠️ An object instantiated from the subclass is also an object of the superclass type
```

### How to handle more than one superclass

- Java does not support multiple inheritance of classes
- However, a class can implement multiple interfaces

![https://cdn-conteudo.ensineme.com.br/04_513b030266.png](https://cdn-conteudo.ensineme.com.br/04_513b030266.png)

When analyzing the genealogy of classes, we observe that as we descend hierarchy, we encounter increasingly specific classes. Conversely, as we ascend the hierarchy, we encounter increasingly general classes. The characteristics reflect the fundamental concepts of generalization of specialization in OO.

### Example of Inheritance of interfaces

```java
public interface CommissionedTeacher extends Teacher, Director{
    // ...
}
```

### Comments of interfaces

- Interfaces are an important resource for the software architect
- The classes of Java can "implement" one or more interfaces

---

## Inheritance and visibility

When we say that a class "People" is an generalization of the class "Employee", this means that it brings together attributes and behaviors for other subclasses.
This behaviors can be specialized in subclasses, that is, subclasses can override the behavior modeled in the superclass.

### Has four access levels in Java

1. **default**: defines the visibility as restricted to the Java package
2. **Private**: the visibility of attributes and methods is restricted to the class itself
3. **Protected**: the visibility is restricted to the package and all subclasses
4. **Public**: not have restrictions on visibility

### Comments of visibility

- The visibility can be related to the concepts of inheritance and encapsulation in OOP
- Codes more organized and secure

### Comments of packages

- Packages organize logic units
- Facilitate code maintenance and readability
- Offer more security

```markdown
> ⚠️ The positive impact of a good choice of modifiers use:
> helps to establish a predictable behavior for an object
```

### Example of package declaration

```java
package com.example.myapp;
```

---

## Polymorphism

Polymorphism is the properties of a same method to behave in different ways. He can be expressed in diverse ways.
Function overloading can be the inheritance is a way to give the object a polymorphic capability.

### Motivation

- Polymorphism is the more sophisticated property of OOP
- There are cases where it is very useful
- Can be combined with other properties (inheritance and encapsulation)

### Keywords

- **extends**: allows a class to inherit the properties and methods of another class

Example of use:

```java
public class Director extends Employee {
    // ...
}
```

- **super**: refers to the superclass (parent class) of the current object

Example of use:

```java
//Methods
public Director(String name, Calendar birthDate, long CPF, Address address) {
    super(name, birthDate, CPF, address);
}
```

- **this**: refers to the current object

Example of use:

```java
private void setName (String name) {
         this.name = name;
    }  
```

- **instanceof**: tests whether an object is an instance of a specific class or implements a specific interface

Example of use:

```java
if (employee instanceof Manager) {
    // ...
}
```

---

## Abstract Classes

A **abstract class** is a class that cannot be instantiated on its own and is meant to be subclassed. It can contain abstract methods (without implementation) that must be implemented by its subclasses, as well as concrete methods (with implementation) that can be inherited by subclasses.

### Example of Abstract Class

```java
// Abstract Class
public abstract class Animal {
    public abstract void makeSound();

    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Concrete Subclass
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Concrete Subclass
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}
```

### Comments on Abstract Classes

- To obtain  the scalability is essential utilizing generalization
- OOP offers several features for the generalization, among them the Abstract Classes
- Abstract classes are useful for defining a common interface for a group of related classes
- They allow you to provide default behavior while forcing subclasses to implement specific functionality
