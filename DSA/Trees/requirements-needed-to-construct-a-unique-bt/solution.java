class Solution {
    public boolean uniqueBinaryTree(int a, int b) {

        return !(a==b || (a==1 && b==3) || (a==3 && b==1));
        //your code goes here
    }
}