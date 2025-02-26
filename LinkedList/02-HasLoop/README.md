# LL: Has Loop(Interview Question)

## 📝 Statement
Write a method called hasLoop that is part of the linked list class.

The method should be able to detect if there is a cycle or loop present in the linked list.


## 🔍 Example:

```java
LinkedList myList = new LinkedList(1);
myList.append(2);
myList.append(3);
myList.append(4);
myList.append(5);

// Creating a loop manually
myList.tail.next = myList.head.next; // 5 -> 2 (loop)

System.out.println(myList.hasLoop()); // Output: true

// Creating a new list without a loop
LinkedList newList = new LinkedList(1);
newList.append(2);
newList.append(3);
newList.append(4);
newList.append(5);

System.out.println(newList.hasLoop()); // Output: false

```

## 🚀 Method signature:

```java
public boolean hasLoop()