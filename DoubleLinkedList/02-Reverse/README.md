# DLL: Reverse (Interview Question)

## 📝 Statement
Implement a method called reverse() that reverses the order of the nodes in the list.

This method should reverse the order of the nodes in the list by manipulating the pointers of each node, not by swapping the values within the nodes.


## 🔍 Example:

    Consider the following doubly linked list:

    Head: 1
    Tail: 5
    Length: 5
    
    Doubly Linked List:
    1 <-> 2 <-> 3 <-> 4 <-> 5


    After calling reverse(), the list should be:

    Head: 5
    Tail: 1
    Length: 5
    
    Doubly Linked List:
    5 <-> 4 <-> 3 <-> 2 <-> 1


## 🚀 Method signature:

```java
public void reverse()