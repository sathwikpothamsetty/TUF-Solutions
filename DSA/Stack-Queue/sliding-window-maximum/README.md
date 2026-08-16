# [Sliding Window Maximum](https://takeuforward.org/plus/dsa/problems/sliding-window-maximum?subject=dsa&approach=optimal&sidebar=open&tab=submissions)

![Difficulty: Hard](https://img.shields.io/badge/Difficulty-Hard-ef4444?style=for-the-badge)

---

## 📝 Problem Statement

Given an array of integers arr, there is a sliding window of size **k** which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. Return the **max** sliding window.

### Example 1

Input: arr = [4, 0, -1, 3, 5, 3, 6, 8], k = 3

Output: [4, 3, 5, 5, 6, 8]

Explanation:&nbsp;

<img src="https://static.takeuforward.org/content/aptitude_1766388539738_Sliding Window Maximum.png">

For each window of size k=3, we find the maximum element in the window and add it to our output array.

### Example 2

Input: arr = [20, 25], k = 2

Output: [25]

Explanation: There’s just one window of size 2 that is possible and the maximum of the two elements is our answer.

### Constraints

- 1 <= arr.length <= 10^5
- -10^4 <= arr[i] <= 10^4
- 1 <= k <= arr.length

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/plus?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>
