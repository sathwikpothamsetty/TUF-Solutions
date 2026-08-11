# [Implement stack using Linkedlist](https://takeuforward.org/plus/dsa/problems/implement-stack-using-linkedlist?subject=dsa&category=stack-and-queues&subcategory=implementation&approach=solution-2&tab=submissions)

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Implement a Last-In-First-Out (LIFO) stack using a singly linked list. The implemented stack should support the following operations: push, pop, top, and isEmpty.

Implement the LinkedListStack class:

void push(int x): Pushes element x onto the stack.

int pop(): Removes and returns the top element of the stack.

int top(): Returns the top element of the stack without removing it.

boolean isEmpty(): Returns true if the stack is empty, false otherwise.

### Example 1

Input:

["LinkedListStack", "push", "push", "pop", "top", "isEmpty"]

[[], [3], [7], [], [], []]

Output: [null, null, null, 7, 3, false]

Explanation:

LinkedListStack stack = new LinkedListStack();

stack.push(3);

stack.push(7);

stack.pop(); // returns 7

stack.top(); // returns 3

stack.isEmpty(); // returns false

### Example 2

Input:

["LinkedListStack", "isEmpty"]

[[]]

Output: [null, true]

Explanation:

LinkedListStack stack = new LinkedListStack();

stack.isEmpty(); // returns true

### Constraints

- 1 <= numbers of calls made <= 100
- 1 <= x <= 100

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
