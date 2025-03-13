# LL: Reverse Between (Interview Question)

## 📝 Statement
You have a linked list where each node represents a binary digit (0 or 1). The goal of the binaryToDecimal function is to convert this binary number, represented by the linked list, into its decimal equivalent.

## 🔍 Example:

## Example Execution with Binary 101:

    Given the following linked list:

    1 -> 2 -> 3 -> 4 -> 5


    Calling reverseBetween(1, 3) should result in the following modified linked list:


    1 -> 4 -> 3 -> 2 -> 5


## 🚀 Method signature:

```java
public void reverseBetween(int m, int n)