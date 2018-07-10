package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/add-binary/description/
 */
public class Q67 {
    public static void main(String[] args) {
        System.out.println(new Q67().addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {
        int idxA = a.length() - 1, idxB = b.length() - 1;
        char[] chars = new char[Math.max(a.length(), b.length()) + 1];
        int index = chars.length - 1;
        int add = 0;
        while (idxA >= 0 || idxB >= 0) {
            int valueA = idxA >= 0 ? a.charAt(idxA) - '0' : 0;
            int valueB = idxB >= 0 ? b.charAt(idxB) - '0' : 0;
            int tmp = (add + valueA + valueB) / 2;
            chars[index--] = (char)((add + valueA + valueB) % 2 + '0');
            add = tmp;
            idxA--; idxB--;
        }
        if (add > 0) chars[index] = (char)(add + '0');
        return new String(chars, add > 0 ? 0 : 1, chars.length - (add > 0 ? 0 : 1));
    }
}
