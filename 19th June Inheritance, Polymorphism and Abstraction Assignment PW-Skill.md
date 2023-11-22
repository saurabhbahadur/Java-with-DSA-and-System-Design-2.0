
# 19th June Inheritance, Polymorphism and Abstraction Assignment 


## 1. What is Inheritance in Java?
```
Inheritance is one of the fundamental concepts in object-oriented programming (OOP)
and is a key feature of the Java programming language. Inheritance allows you to create
a new class that is a modified version of an existing class. The new class, called a subclass
 or derived class, inherits attributes and behaviors (fields and methods) from an existing class,
 known as the superclass or base class.
```


## 2. What is superclass and subclass?
```
In object-oriented programming, a superclass and a subclass are related classes that are part of an
inheritance hierarchy. These classes are used to implement the concept of inheritance, where the subclass
inherits attributes and behaviors from the superclass. 
```
# 3. How is Inheritance implemented/achieved in Java?
```java
// Using Extend keyword
class Demo
{

}

class Demo1 extends Demo
{

}
```
## 4. What is polymorphism?
```
Polymorphism is one of the core concepts in object-oriented programming (OOP) and is a fundamental principle
in the Java programming language. It refers to the ability of different objects to respond to the same method
or message in a way that is specific to their individual class. Polymorphism allows objects of different classes
 to be treated as objects of a common superclass.
```

## 5. Differentiate between method overloading and method overriding.
```
Method Overloading:

Method overloading, also known as compile-time polymorphism or static polymorphism, occurs when you define multiple methods in the same class with the same name but different parameters (either a different number of parameters or different types of parameters).

Key characteristics of method overloading:

It is resolved at compile time.
The methods must have the same name but different parameter lists.
The return type can be different, but it's not considered when overloading.
Overloading is used to provide multiple ways to perform the same operation based on the input parameters.

Method Overloading:

Method overloading, also known as compile-time polymorphism or static polymorphism, occurs when you define multiple methods in the same class with the same name but different parameters (either a different number of parameters or different types of parameters).

Key characteristics of method overloading:

It is resolved at compile time.
The methods must have the same name but different parameter lists.
The return type can be different, but it's not considered when overloading.
Overloading is used to provide multiple ways to perform the same operation based on the input parameters.
```

## 6. What is an abstraction explained with an Example?
```
Abstraction is one of the fundamental concepts in object-oriented programming (OOP) that allows you to create
 simplified models of real-world objects and systems. It involves focusing on the essential characteristics of an
object while ignoring the irrelevant details.
```
```java
abstract class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void start();   // Abstract method
    public abstract void stop();    // Abstract method

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
```

==========================================================================================================================================

## 7. What is the difference between an abstract method and final method in Java?Explain with an example?
Ans:
Abstract Method:

An abstract method is a method declared without an implementation in an abstract class or an interface. It is marked with the abstract keyword.
Subclasses that inherit from an abstract class or implement an interface containing abstract methods must provide concrete (non-abstract) implementations for these methods.
Abstract methods are meant to be overridden by concrete subclasses to define specific behavior.

Final Method:

A final method is a method that is marked with the final keyword. It is a method in a class that cannot be overridden by any subclass.
When you declare a method as final, it means that the method's implementation is sealed, and no subclass can change it by providing its own implementation.
```java
abstract class Shape {
    abstract double area(); // Abstract method

    final void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
    
}
```

===========================================================================================================================

## 8. What is the final class in Java?
Ans:
In Java, a final class is a class that cannot be subclassed or extended. When you declare a class as final, it means that it is the final implementation of that class, and it cannot have any subclasses. You typically use the final keyword to prevent inheritance and to ensure that the class remains unchanged and cannot be further specialized.
```java
final class MyFinalClass {
    private int value;

    public MyFinalClass(int value) {
        this.value = value;
    }

    public final int getValue() {
        return value;
    }
}
```

=============================================================================================================================

9.Differentiate between abstraction and encapsulation.
Ans:
Abstraction:

Purpose:
Abstraction focuses on representing the essential features of an object while hiding the non-essential details.
It simplifies complex systems by defining a clear interface and providing a high-level view of an object or system.

Implementation:
Abstraction is implemented through abstract classes and interfaces, which define a contract (method signatures) for subclasses to follow.
It allows you to create a common interface and specify what methods must be implemented by concrete subclasses.

Visibility:
Abstraction exposes the necessary features and hides the internal details, making the complex system more understandable and manageable.

Example:
An abstract class "Shape" with abstract methods like "calculateArea" and "calculatePerimeter" defines a blueprint for all shapes. Concrete subclasses like "Circle" and "Rectangle" provide specific implementations.

Encapsulation:

Purpose:
Encapsulation is about bundling the data (attributes or fields) and the methods (functions) that operate on the data into a single unit (a class).
It protects the internal state of an object by controlling access to its data, and it enforces data integrity.

Implementation:
Encapsulation is implemented through access modifiers (e.g., private, protected, public) that control the visibility of data and methods within a class.
Getters and setters can be used to provide controlled access to data and enforce validation or logic.

Visibility:
Encapsulation controls the visibility of data and methods within a class. Data is typically kept private, and access to it is provided through methods.

Example:
A class "Person" encapsulates data fields like "name" and "age" as private, and it provides public methods like "getName" and "setAge" to access or modify the data while enforcing rules like age validation.



==============================================================================================================================================

## 10. Difference between Runtime and compile time polymorphism explain with an example
Ans:
Compile-Time Polymorphism (Static Binding):

Compile-Time Resolution: 
Compile-time polymorphism is resolved during the compile phase, based on the method's signature (name and parameter list). It is also known as method overloading.

### Method Overloading: 
In method overloading, multiple methods with the same name but different parameter lists exist within the same class or a hierarchy of classes. The appropriate method to call is determined at compile time based on the method signature and the arguments provided.
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(3, 5);        // Calls the int version of the add method.
        double result2 = calculator.add(3.5, 2.7); // Calls the double version of the add method.
    }
}
```
Runtime Polymorphism (Dynamic Binding):

Runtime Resolution: 
Runtime polymorphism is resolved during runtime, based on the actual object's type. It is also known as method overriding.

### Method Overriding: 
In method overriding, a subclass provides a specific implementation for a method that is already defined in its superclass. The method in the subclass must have the same name, return type, and parameter list (method signature) as the method in the superclass.
```java
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(); // Upcasting
        shape.draw(); // Calls the overridden draw method in the Circle class.
    }
}
```

==================================================================================================================

