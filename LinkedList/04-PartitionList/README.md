# LL: Partition List (Interview Question)

## 📝 Statement
You have a singly linked list that DOES NOT HAVE A TAIL POINTER  (which will make this method simpler to implement).

Given a value x you need to rearrange the linked list such that all nodes with a value less than x come before all nodes with a value greater than or equal to x.

Additionally, the relative order of nodes in both partitions should remain unchanged.

Constraints:

-The solution should traverse the linked list at most once.

-The solution should not create a new linked list.

## 🔍 Example:

### Example 1:

    Input:

    Linked List: 3 -> 8 -> 5 -> 10 -> 2 -> 1 x: 5

    Process:

    Values less than 5: 3, 2, 1

    Values greater than or equal to 5: 8, 5, 10

    Output:

    Linked List: 3 -> 2 -> 1 -> 8 -> 5 -> 10


### Example 2:
    Input:

    Linked List: 1 -> 4 -> 3 -> 2 -> 5 -> 2 x: 3

    Process:

    Values less than 3: 1, 2, 2

    Values greater than or equal to 3: 4, 3, 5

    Output:

    Linked List: 1 -> 2 -> 2 -> 4 -> 3 -> 5


## 🚀 Method signature:

```java
public void partitionList(int x);