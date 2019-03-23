package me.minei.leetcode.problem;

public class Q977 {

    public static void main(String[] args) {
        int[] array = new int[]{-4,-1,0,3,10};
        System.out.println(new Q977().sortedSquares(array));
    }
    // two pointer
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int right = 0;
        int index = A.length - 1;
        int left = A.length - 1;
        while(right <= left && index >= 0) {
            if(Math.abs(A[left]) >= Math.abs(A[right])) {
                result[index--] = (int) Math.pow(A[left], 2);
                left--;
            } else {
                result[index--] = (int) Math.pow(A[right], 2);
                right++;
            }
        }
        return result;
    }
}
