# Java Programming Language

Java is a high-level, class-based, object-oriented programming language. It was originally developed by James Gosling at Sun Microsystems and released in 1995.

## Key Features of Java

- **Write Once, Run Anywhere (WORA)**: Java applications are typically compiled to bytecode that can run on any Java Virtual Machine (JVM) regardless of the underlying computer architecture.
- **Object-Oriented**: Java is an object-oriented language which provides a clear structure to programs and allows code to be reused, reducing development costs.
- **Platform Independent**: Unlike many other programming languages including C and C++, when Java is compiled, it is not compiled into platform-specific machine, rather into platform-independent byte code. This byte code is distributed over the web and interpreted by the JVM.
- **Secure**: Java is secure because it supports the concept of byte code and exception handling.

## Example of Java Code

Here's a simple example of Java code that prints "Hello, World!" to the console:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
# Java Primitive Data Types

Java has 8 primitive data types, which are predefined by the language and named by a reserved keyword. These data types are used to create variables.

## Integral Data Types

1. **byte**: This is an 8-bit signed two's complement integer. The range is from -128 to 127.
2. **short**: This is a 16-bit signed two's complement integer. The range is from -32768 to 32767.
3. **int**: This is a 32-bit signed two's complement integer. The range is from -2147483648 to 2147483647. This is the default data type in Java.
4. **long**: This is a 64-bit signed two's complement integer. The range is from -9223372036854775808 to 9223372036854775807. When using this data type, add an "L" at the end of the number.

## Floating Point Data Types

1. **float**: This is a single-precision 32-bit IEEE 754 floating point. Use an "f" at the end of the number.
2. **double**: This is a double-precision 64-bit IEEE 754 floating point. This is the default data type for decimal values.

## Other Primitive Data Types

1. **char**: This is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
2. **boolean**: This data type has only two possible values: true and false.

## Non-Primitive Data Type

**String**: This is a sequence of characters. In Java, strings are immutable.

Here's an example of using these data types:

```java
byte a = 127;
short b = 32767;
int c = 2147483647;
long d = 9223372036854775807L;

float e = 3.14f;
double f = 3.14;

char g = 'a';
boolean h = true;

String i = "Hello, World!";
```

# Loops in Java

Loops are used in programming to repeat a specific block of code until a certain condition is met. In Java, we have three types of loops: `for`, `while`, and `do-while`.

## For Loop

A `for` loop is a control flow statement that allows code to be executed repeatedly. A `for` loop has three parts: initialization, condition, and increment/decrement.
Here's the syntax of a `for` loop:

```java
for (initialization; condition; increment/decrement) {
    // code block to be executed
}
```
```
public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 0; // Initialize a variable

        // The while loop will run as long as 'i' is less than 5
        while (i < 5) {
            System.out.println(i); // Print the value of 'i'
            i++; // Increment 'i' by 1
        }
    }
}
```
# Example: Using a While Loop in Java

In this example, we demonstrate how to use a `while` loop in Java. The loop will continue executing the code block inside it as long as a specified condition remains true.

1. **Initialization**: We start with `i = 0`.
2. **Condition**: The loop continues as long as `i` is less than 5.
3. **Action**: The value of `i` is printed, and then `i` is incremented by 1 in each iteration.
4. **Termination**: The loop stops when `i` becomes equal to or greater than 5.

Remember to increase the variable used in the condition (in this case, `i`) within the loop, otherwise, the loop will never end! 😊

Feel free to modify the condition and the code block inside the loop to suit your specific requirements! If you have any more questions, feel free to ask! 🚀

