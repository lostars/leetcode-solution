package me.minei.leetcode.problem;

public class Q392 {
    public static void main(String[] args) {
        System.out.println(new Q392().isSubsequence("leeeeetcode", "yyyyylyeeytycode"));
    }

    public boolean isSubsequence(String s, String t) {
        int index = 0;
        char[] chars = t.toCharArray();
        for(char c : s.toCharArray()) {
            boolean meet = false;
            for (int i = index; i < t.length(); i++) {
                if (chars[i] == c) {
                    index = i + 1;
                    meet = true;
                    break;
                }
            }
            if(!meet) {
                return false;
            }
        }
        return true;
    }

    // two pointers
    public boolean isSubsequence1(String s, String t) {
        int sLeft = 0, sRight = s.length() - 1;
        int tLeft = 0, tRight = t.length() - 1;
        while (sLeft <= sRight) {
            boolean lMeet = false, rMeet = false;
            while (tLeft <= tRight) {
                if (s.charAt(sLeft) == t.charAt(tLeft)) {
                    lMeet = true;
                } else {
                    tLeft++;
                }
                if (s.charAt(sRight) == t.charAt(tRight)) {
                    rMeet = true;
                } else {
                    tRight--;
                }
                if (lMeet && rMeet) {
                    tLeft++; tRight--;
                    break;
                }
            }
            if (!(lMeet && rMeet)) {
                return false;
            } else {
                sLeft++; sRight--;
            }
        }
        return true;
    }
}
