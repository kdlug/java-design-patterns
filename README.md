# Design patterns

Solutions of well-known programistic problems.

## Type of patterns

### Creational 

These design patterns are about organizing different classes and objects to form larger structures and provide new functionality.

- Builder, 
- Factory, 
- Singleton

### Structural 

- Adapter, 
- Dekorator, 
- Flyweight

### Behavioral

- Chain of responsibility, 
- Command, 
- Memento, 
- Template method, 
- Strategy, 
- Observer 

Behavioral patterns are about identifying common communication patterns between objects and realize these patterns. They are used for dynamic behavior or  a complete change of behavior our application.

## Builder

Builder pattern is used to build objects. Sometimes object can be complex, contains a lot of fields and we don't want to create too many constructors and the sane time we don't want to give an access to setters of our class. After creating an object using builder pattern there is no possibility to change anything in the object.

Builder pattern encapsulates or hides the process of building a complex object and separate the representation of the object from it's construction.
The separation allows us to construct different representations using the same construction process.

Builder pattern has many variations f.ex. nested builder, classic builder.

Classic builder consist of the following elements:

- Builder Abstract Interface
- Conrete Builder
- Director
- Product

It's similar to the abstract factory but builder pattern creates an object step by step whereas the abstract factory patterns returns the object in one step.

> Lombok library has builder annotations.

## Strategy

1. Create an interface + ER at the end f.ex. for describing write behaviour - WriterInterface
2. Create concrete implementations
3. In context class add interface field (polymorphysm)



