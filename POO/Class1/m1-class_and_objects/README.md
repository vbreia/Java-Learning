# [Leia em português](../../README-PTBR.md)
# Class 1 - Module 1 - Introduction of object-oriented programming

---

## Themes

- [Leia em português](#leia-em-português)
- [Class 1 - Module 1 - Introduction of object-oriented programming](#class-1---module-1---introduction-of-object-oriented-programming)
  - [Themes](#themes)
  - [Classes and objects in java](#classes-and-objects-in-java)
    - [notation example: @](#notation-example-)
    - [public, protect and private](#public-protect-and-private)
    - [abstract and final](#abstract-and-final)
    - [static](#static)
    - [strictfp](#strictfp)
  - [Objects: the products of classes](#objects-the-products-of-classes)
    - [Class contents](#class-contents)
    - [Motivations](#motivations)
    - [Class instantiation example](#class-instantiation-example)
      - [Examples](#examples)
      - [Example of code that uses constructor](#example-of-code-that-uses-constructor)
        - [Constructor Comments](#constructor-comments)
    - [States of an object](#states-of-an-object)
      - [Example](#example)
        - [remembering](#remembering)
  - [Class and the object encapsulation](#class-and-the-object-encapsulation)
    - [Encapsulation in OOP](#encapsulation-in-oop)
      - [Encapsulation Comments](#encapsulation-comments)
    - [Encapsulation example](#encapsulation-example)
  - [Relationship between objects](#relationship-between-objects)
    - [Motivation](#motivation)
  - [Using object references in Java](#using-object-references-in-java)
    - [Analysis of Example](#analysis-of-example)

---

## Classes and objects in java

### notation example: @

### public, protect and private

modifiers of access

### abstract and final

class and method modifiers

example:

```java
abstract class A { } final void m() { }
```

### static

affects the life cycle of the class and its member
example:

```java
class A {
    static int x;
    void m() {
        x = 5;
    }
}
```

### strictfp

makes the implementation of calculation of float points predictable across different platforms

---

## Objects: the products of classes

### Class contents

- Class instantiation
- Example of a code which uses constructors
- States of a object

### Motivations

- The OOP is very effective for scaling solutions
- The Java provides all essentials elements for implementing OOP concepts
- We need to start from the definitions for the pratical implementation

### Class instantiation example

```java
Student objectStudent = new Student();
```

- **"Student objectStudent":** variable declaration
- **"=":** variable initialization
- **"new Student()":** constructor of the Student class call

#### Examples

- Mode 1
  
  ```java
  Student objectStudent = new Student();
  ```

- Mode 2

  ```java
  Student objectStudent;
  objectStudent = new Student();
  ```

#### Example of code that uses constructor

```java
import java.util.Random;
public class Student{
//Atributes
private String name;
private int age;
private double id_code;
private Random random;

    //Constructor
    public Student(String name, int age){
        random = new Random();
        this.name = name;
        this.age = age;
        this.id_code = random.nextDouble();
    }

    //Methods
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getIdCode() {
        return id_code;
    }

}
```

##### Constructor Comments

- The constructor is a special method responsible for establishing the initial behavior of an object
- The constructor method and class have the same name
- If the developer does not explicitly define the usage of the constructor, Java will make the default constructor

### States of an object

- The state of an object is defined by its attributes and their values at a specific point in time.
- Objects can change their state by modifying their attributes through methods.
- The state of an object is encapsulated within the object itself, promoting data hiding and abstraction.

#### Example

```java
Student objectStudent = new Student("John", 20);
```

##### remembering

- **"Student objectStudent"**: variable declaration
- **"=":** variable initialization
- **"new Student("John", 20):** constructor of the Student class call

---

## Class and the object encapsulation

From the view point of OOP, the encapsulation aims to hide of exterior world the attributes and the functionality of a class.

However, we still have other ways of making methods visible that restrict access to them.

All of this is what we call a contract, established between the class and the code that uses it.

The idea behind encapsulation is to provide other system modules with only what they need to perform their tasks.

Therefore, the concept of encapsulation is closely linked to that of visibility.

The visibility of a method or attribute determines how it can be accessed from other classes or packages. In Java, we have several access modifiers that control the visibility of class members:

- **public:** The member is accessible from any other class.
- **protected:** The member is accessible within its own package and by subclasses.
- **private:** The member is accessible only within its own class.
- **default (no modifier):** The member is accessible only within its own package.

### Encapsulation in OOP

- Make available to others modules of system only what is necessary for realising their tasks.
- Java provides three types of visibility modifiers: **public**, **protected**, and **private**.

#### Encapsulation Comments

- Need to install some softwares
- Local development
- Optional: extension of web browser and choice of IDE

Is a mechanism that allows the grouping of data and methods into a single class call, that serves two principal proposites: data hiding and abstraction.

- To get access to these members, we need to use the **getter** and **setter** methods.
- The object is expose for the developers only the essential for their tasks.

### Encapsulation example

```java
import java.util.Random;
    //Class
    public class People {
        //Attributes
        private String name;
        private double id_code;
        private Random random;  

        //Methods 
        public People (String name){
            random = new Random();
            this.setName(name);
            this.setIdCode(random.nextDouble());
        }

        //Setters
        private void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }

        //Getters
        private void setIdCode(double id_code){
            this.id_code = id_code;
        }
        public double getIdCode(){
            return this.id_code;
        }

        public static void main(String args[]){
            People person = new People("Alice");
            System.out.println("Name: " + person.getName());
            System.out.println("ID Code: " + person.getIdCode());
        }   
    }
```

- We need view the modifiers private and public.
- The "person" object can be instantiated in the main method.

---

## Relationship between objects

### Motivation

- The classes have specific objectives
- The interaction between objects is a necessity
- Java provides resources for managing these relationships

**Relationships types between objects**
In OOP, we have the following types of relationships between objects:

![https://cdn-conteudo.ensineme.com.br/02_807b33a29c.png](https://cdn-conteudo.ensineme.com.br/02_807b33a29c.png)

1. **Association**: A relationship where one object uses or interacts with another object. For example, a `Teacher` object may be associated with a `Student` object.

2. **Aggregation**: A special form of association that represents a "whole-part" relationship. In aggregation, the lifetime of the part is not strictly tied to the whole. For example, a `Library` object may contain `Book` objects, but the books can exist independently of the library.

3. **Composition**: A stronger form of aggregation where the part's lifecycle is tied to the whole. If the whole is destroyed, the parts are also destroyed. For example, a `House` object may contain `Room` objects, and if the house is destroyed, the rooms are also destroyed.

**How to implement this in Java**
In Java, we can implement these relationships using class attributes and methods. Here are some examples:

```java
class School{
    // Attributes
    private String name, CNPJ;
    private Address address;
    private Department departments[];
    private Student students[];
    private int numStudents, numDepartments;

    // Methods
    public School(String name, String CNPJ, Address address, Department[] departments, Student[] students) {
        this.name = name;
        this.CNPJ = CNPJ;
        this.address = address;
        this.departments = new Department[10];
        this.students = new Student[100];
        this.numDepartments = 0;
        this.numStudents = 0;
    }

    public void addDepartment(Department department) {
        if (numDepartments < departments.length) {
            departments[numDepartments++] = department;
        }
    } else {
        System.out.println("Max departments reached");
    }
    public void addStudent(Student student) {
        if (numStudents < students.length) {
            students[numStudents++] = student;
        }
    } else {
        System.out.println("Max students reached");
    }
}
```

---

## Using object references in Java

In java, it is not possible to create pointer variables. Instead, Java uses objects references.

### Analysis of Example

```java
public class Reference{
    private Student student1, student2;
        public Reference(){
        student1 = new Student("Alice", 20);
        student2 = new Student("Bob", 23);
        System.out.println("Student 1: " + student1.getName() + ", Age: " + student1.getAge());
        System.out.println("Student 2: " + student2.getName() + ", Age: " + student2.getAge());

        student2 = student1;
        student2.setName("Charlie");
        student2.setAge(25);
        System.out.println("Student 1: " + student1.getName() + ", Age: " + student1.getAge());
        ref.manipulateStudents(student1);
        System.out.println("Student 1: " + student1.getName() + ", Age: " + student1.getAge());
    }
    public void manipulateStudents(Student student){
        student.setName("David");
        student.setAge(30);
    }
    public static void main(String args[]){
        Reference ref = new Reference();
        System.out.println("End of execution");
    }
}
```

The output will be:

```output
Student 1: Alice, Age: 20
Student 2: Bob, Age: 23
Student 1: Charlie, Age: 23
Student 1: David, Age: 30
End of execution
```
