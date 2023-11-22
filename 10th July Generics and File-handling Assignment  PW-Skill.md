
# 10th July Generics and File-handling Assignment 

===============================================================================================================================

## Generics Assignment 

1. What are Generics in Java?
Ans:
Generics in Java are a feature that allows you to write classes, interfaces, and methods that operate on types as parameters, rather than working with specific, fixed types. Generics provide type safety, code reusability, and flexibility in Java programming by allowing you to create classes, methods, or data structures that can work with different types of data while ensuring compile-time type checking.

===============================================================================================================================

2.What are the benefits of using Generics in Java?
Ans:
Type safety
Code reusability
Improved readability
Reduced code redundancy
Improved performance

==============================================================================================================================

3. What is a Generic Class in Java?
Ans:
A generic class in Java is a class that is defined with one or more type parameters (also known as type variables). These type parameters act as placeholders for the actual data types that the class will work with. By using generic classes, you can create reusable, type-safe classes and data structures that can work with different types without the need for code duplication.
public class ClassName<T1, T2, ..., Tn> {
    // Class members and methods go here
}

==============================================================================================================================================

### 4. What is a Type Parameter in Java Generics?
Ans:
In Java Generics, a type parameter, often referred to as a type variable, is a placeholder for a specific data type that is not known until the generic class, interface, or method is instantiated or invoked. Type parameters are used to create generic classes, interfaces, and methods that can work with different data types while maintaining type safety and code reusability.
```java
public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
```

===============================================================================================================================

### 5. What is a Generic Method in Java?
Ans:
A generic method in Java is a method that is parameterized with one or more type parameters (also known as type variables). These type parameters act as placeholders for the actual data types that the method will operate on. Generic methods allow you to write methods that work with different data types while ensuring type safety and code reusability.
```java
public class GenericMethods {
    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 >= 0 && index1 < array.length && index2 >= 0 && index2 < array.length) {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        System.out.println("Before swapping: " + Arrays.toString(integers));

        swap(integers, 1, 3);

        System.out.println("After swapping: " + Arrays.toString(integers));
    }
}
```

==============================================================================================================================================

6. What is the difference between ArrayList and ArrayList<T>?
Ans:
ArrayList:
ArrayList is the legacy way to create and use dynamic arrays in Java, without using generics.
You declare and use ArrayList without specifying a specific data type. This means it can hold elements of any type, including objects and primitive types.
The lack of type safety means that you might encounter runtime errors if you inadvertently add elements of the wrong data type to the ArrayList.

ArrayList list = new ArrayList();
list.add("Hello");   // Adding a String
list.add(42);        // Adding an Integer


ArrayList<T>:
ArrayList<T> is a generic type introduced in Java 5 that allows you to specify the data type of elements the ArrayList can hold.
With ArrayList<T>, you define the data type within angle brackets (e.g., ArrayList<Integer> for integers) to create a type-specific ArrayList. This provides compile-time type safety, ensuring that only elements of the specified data type are added to the list.

ArrayList<String> stringList = new ArrayList<String>();
stringList.add("Hello");   // Adding a String

ArrayList<Integer> intList = new ArrayList<Integer>();
intList.add(42);           // Adding an Integer


## IO operation Assignment
 
1. What is Input and Output Stream in Java?
Ans:
Input Stream:
An input stream is a stream used for reading data from a source, such as a file, network connection, or keyboard input.
It provides methods to read data from the source, including bytes, characters, or other data types.
Input streams are typically used for operations like reading a file, receiving data from a network socket, or reading user input from the console.

Output Stream:
An output stream is a stream used for writing data to a destination, such as a file, network connection, or console output.
It provides methods to write data to the destination, including bytes, characters, or other data types.
Output streams are typically used for operations like creating or writing to a file, sending data over a network, or displaying information to the console.

==============================================================================================================================================

### 2. What are the methods of OutputStream?
Ans:
```
write() - writes the specified byte to the output streamO
write(byte[] array) - writes the bytes from the specified array to the output streamO
flush() - forces to write all data present in the output stream to the destinationO
close() - closes the output streamP
```
==============================================================================================================================================

3. What is serialization in Java?
Ans:
Serialization in Java is a mechanism that allows you to convert an object into a stream of bytes, which can be easily saved to a file, sent over a network, or stored in a database. The primary purpose of serialization is to enable the persistence and transfer of objects in a platform-independent way. 


===============================================================================================================================

4. What is the Serializable interface in Java?
Ans:
The Serializable interface in Java is a marker interface that is used to indicate that a class can be serialized. Serialization is the process of converting an object's state into a byte stream, which can be saved to a file, sent over a network, or stored in a database. The Serializable interface doesn't contain any methods or fields; it simply serves as a marker to tell the Java runtime that the class can be serialized.

==============================================================================================================================================

5. What is deserialization in Java?
Ans:
Deserialization in Java is the process of converting a stream of bytes, typically obtained from a previously serialized object, back into an object's state. It is the reverse operation of serialization, where an object's data is reconstructed from the byte stream to create an instance of the object.

==============================================================================================================================================

6. How is serialization achieved in Java?
Ans:
Serialization in Java is achieved by following a specific process using the ObjectOutputStream class to convert objects into a stream of bytes, which can be saved, transmitted, or stored, and the ObjectInputStream class to perform the reverse operation, deserialization, to recreate objects from the byte stream. 

==============================================================================================================================================

7. How is deserialization achieved in Java?
Ans:
Deserialization in Java is the process of converting a stream of bytes, typically obtained from a previously serialized object, back into an object's state. It is achieved using the ObjectInputStream class, which reads the byte stream and reconstructs the original object.

==============================================================================================================================================

8. How can you avoid certain member variables of class from getting Serialized?
Ans:
To avoid certain member variables of a class from getting serialized in Java, you can mark those variables as transient. The transient keyword is used to indicate that a particular variable should not be included in the serialization process. Here's how you can use transient to prevent the serialization of specific member variables.

==============================================================================================================================================

9. What classes are available in the Java IO File Classes API?
Ans:
File
RandomAccessFile
FileInputStream
FileReader
FileMutputStream
FileWriter

==============================================================================================================================================

10. What is Difference between Externalizable and Serialization interface ?
Ans:

Serializable Interface:
The Serializable interface provides automatic and default serialization and deserialization behavior for an object.
By implementing Serializable, you allow the Java runtime to handle the serialization and deserialization process automatically.
You don't have to provide custom methods for reading and writing object data; the process is handled internally.

Externalizable Interface:
The Externalizable interface gives you more control and customization over the serialization and deserialization process.
When a class implements Externalizable, it must provide its own writeExternal and readExternal methods to specify how the object's data should be written to and read from the byte stream.
This allows you to customize the serialization and deserialization logic to handle complex object structures or special requirements.

Serializable Interface:
When you implement Serializable, you should be cautious about changes to the class structure over time. Changes can impact the compatibility and versioning of serialized objects.
Serialization of a class with a different version can lead to version-related issues, such as InvalidClassException.

Externalizable Interface:
Externalizable allows more fine-grained control over versioning. You can implement custom logic to handle different versions of the class and control how the object's data is read and written.

==============================================================================================================================================
