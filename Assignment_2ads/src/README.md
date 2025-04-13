# Custom Data Structures

This project contains custom implementations of basic data structures in Java, including:

- **MyArrayList**: A custom implementation of an array-based list.
- **MyLinkedList**: A custom doubly linked list.
- **MyStack**: A stack implementation using MyArrayList.
- **MyQueue**: A queue implementation using MyLinkedList.
- **MyMinHeap**: A min-heap implementation using MyArrayList.

## Usage

1. Clone the repository and navigate to the project folder.

2. Compile the Java files.

3. Create and run a `Main.java` file to test the data structures.

Example for MyArrayList:

```java
MyArrayList<Integer> list = new MyArrayList<>();
list.add(10);
list.add(20);
System.out.println(list.get(1)); // Should print 20
