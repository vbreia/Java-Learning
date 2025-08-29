# Class 2 - Inheritance and Polymorphism

[Leia em português](./README-PTBR.md)

---

## Inheritance: elemental aspects

The inheritance term in OO defines an type of relationship between class based on a hierarchy. Within this hierarchical relationship, classes can inherit characteristics from other classes above them or their characteristics to subsequent classes below them.

### Basic elements of inheritance

- Generalization of behaviors
- Superclasses and subclasses inheritance
- Simple maintenance of code

![https://cdn-conteudo.ensineme.com.br/03_fb717d2b7f.png](https://cdn-conteudo.ensineme.com.br/03_fb717d2b7f.png)

In the image, we see that "**Empregado**" is the parent (superclass) of the classes "**Professor**", "**Diretor**", "**Coordenador**" and "**Secretário**". The latter are children (subclasses) of the **"Empregado"** class.

```markdown
> ⚠️ An object instantiated from the subclass 
>     is also an object of the superclass type
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

