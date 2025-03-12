# LL: Binary To Decimal (Interview Question)

## 📝 Statement
You have a linked list where each node represents a binary digit (0 or 1). The goal of the binaryToDecimal function is to convert this binary number, represented by the linked list, into its decimal equivalent.

## 🔍 Example:

## Example Execution with Binary 101:

    1. Start with num = 0.

    2. Process 1 (from the head of the linked list): num = 0 * 2 + 1 = 1

    3. Process 0: num = 1 * 2 + 0 = 2

    4. Process 1: num = 2 * 2 + 1 = 5

    5. Return num, which is 5.


## 🚀 Method signature:

```java
public int binaryToDecimal()