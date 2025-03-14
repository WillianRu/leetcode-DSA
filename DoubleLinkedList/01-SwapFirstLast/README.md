# DLL: Swap First and Last (Interview Question)

## 📝 Statement
Swap First and Last Node Values in a Doubly Linked List.

Given a doubly linked list, write a method called swapFirstLast() that swaps the values of the first and last nodes in the list.

If the length of the list is less than 2, the method should not perform any operation.


## 🔍 Example:

## Example Execution with Binary 101:

    Consider the following doubly linked list:

        Head: 1
        Tail: 5
        Length: 5
        
        Doubly Linked List:
        1 <-> 2 <-> 3 <-> 4 <-> 5


    After calling swapFirstLast(), the list should be:

        Head: 5
        Tail: 1
        Length: 5
        
        Doubly Linked List:
        5 <-> 2 <-> 3 <-> 4 <-> 1


## 🚀 Method signature:

```java
public void swapFirstLast()