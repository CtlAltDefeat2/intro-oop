# Java Intro Object Oriented Paradigm (OOP)
OOP is the tasteful interaction between objects to achieve a common goal.  A properly object-oriented solution
ensures that all the objects share the same level of responsibility (weight), and all the objects follow the 
Single Responsibility Principal (SRP).  The SRP states that an object should focus on one thing,
and it should do that one thing well.

Assignments are located [here](assignments.md).

# Pillars of Object-Oriented Programming
Crusty Apple PIE?
- **C**omposition
- **A**bstraction
- **P**olymoripshm
- **I**nheritance
- **E**ncapsulation

#### Composition
_"Has a"_

Composition (Aggregation) is when an object contains another object.  Objects that contain many other objects
can be hard to test.  Composition leads to objects that are tightly dependent on each other.  Dependency
injection is a programming technique that reduces the tight dependency between objects.

#### Abstraction
To abstract something means to hide away the implementation details.  
When you call/use the function/class you don't have to understand exactly what it is doing.
- Keywords/concepts:
  - `class`
  - `interface` _"Is a"_ or _"Can be"_
  - `abstract`
  - Methods/functions
  - Classes
  - Web APIs
  - Software Development Kit (SDK)

#### Polymoripshm
Literal translation is "many forms" or "the condition of occurring in several different forms." 
- Keywords
  - `@Override`
  - `abstract`
  
#### Encapsulation
Refers to the bundling of data, along with the methods that operate on that data, into a single unit.
- Keywords
  - `public`
  - `protected`
  - `private`
  
#### Inheritance
_"Is a"_

Inheritance lets one object acquire the properties and methods of another object.
- Keywords
  - `extends`
  - `implements`?
- Java only supports single inheritance, other languages such as Python support multiple inheritance
- The `public` and `protected` properties are fully accessible

# The Golden Rule
A method is a subroutine or a function, but not both.  A subroutine is code that possibly changes the 
state (data) of an object but does NOT return anything.  A function is code that returns something but 
does NOT change the state of the object.

# Best Practice
- Avoid heavily nested objects, prefer only one or two levels of inheritance
- Use the `final` keyword in your classes to indicate to other developers that the class should NOT be subclassed/extended
- Remember the Golden Rule

# Notes
- Objects can be `null` whereas primitive types cannot.
- Unified Modeling Language (UML) is a standardized modeling language consisting of an integrated set of diagrams, developed to help system and software developers for specifying, visualizing, constructing, and documenting the artifacts of software systems, as well as for business modeling and other non-software systems.
- A group of objects that work together can be organized into a package.

# Videos
- [Java OOPs Concepts (33m)](https://youtu.be/t6bpeBRmozU)

# Links
- [Encapsulation](https://www.sumologic.com/glossary/encapsulation/)
- [Abstraction](https://stackify.com/oop-concept-abstraction/)
- [Polymorphism](https://www.mygreatlearning.com/blog/polymorphism-in-java/#what-is-polymorphism)
- [Inheritance](https://www.tutorialspoint.com/java/java_inheritance.htm)
- [Composition](https://www.geeksforgeeks.org/composition-in-java/)
- [UML](https://www.visual-paradigm.com/guide/uml-unified-modeling-language/what-is-uml/)
- [Null Billion-Dollar Mistake](https://en.wikipedia.org/wiki/Tony_Hoare)

