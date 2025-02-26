# LL: Find Middle Node (Interview Question)

## 📝 Statement
Implement a method called findMiddleNode that returns the middle node of the linked list.

If the list has an even number of nodes, the method should return the second middle node.

📌 **Note:** this LinkedList implementation does not have a length member variable.

## 🔍 Example:

LinkedList myList = new LinkedList(1);
myList.append(2);
myList.append(3);
myList.append(4);
myList.append(5);
Node middleNode = myList.findMiddleNode();
System.out.println(middleNode.value); // Output: 3

myList.append(6);
middleNode = myList.findMiddleNode();
System.out.println(middleNode.value); // Output: 4

## 🚀 Method signature:

```java
public Node findMiddleNode()