package me.minei.leetcode.problem;

/**
 * https://leetcode.com/problems/string-compression/description/
 * 注意只能操作原数组，并且测试用例会检测压缩后的前n个数据
 */
public class Q443 {
    public static void main(String[] args) {
        System.out.println(new Q443().compress(new char[]{'a', 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
//        System.out.println(new Q443().compress(new char[]{'a'}));
    }

    public int compress(char[] chars) {
        int index = 0;
        char cur = chars[0];
        int time = 0, result = 0;
        for (int i = 0; i < chars.length;) {
            if (chars[i] == cur) {
                time++; i++;
            } else {
                if (time == 1) {
                    chars[index++] = cur; result++;
                } else if (time > 1) {
                    chars[index++] = cur; result++;
                    String s = String.valueOf(time);
                    for (int j = 0; j < s.length(); j++) {
                        chars[index++] = s.charAt(j); result++;
                    }
                }
                cur = chars[i]; time = 0;
            }
        }
        chars[index++] = cur; result++;
        String s = String.valueOf(time);
        for (int j = 0; j < s.length() && index < chars.length && time > 1; j++) {
            chars[index++] = s.charAt(j); result++;
        }
        return result;
    }
}
