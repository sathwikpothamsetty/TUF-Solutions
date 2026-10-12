
class Solution {
    int floorSqrt(int n) {
        int i = 0;

        while ((long) i * i <= n) {
            i++;
        }

        return i - 1;
    }
}
