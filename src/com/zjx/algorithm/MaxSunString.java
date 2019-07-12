package com.zjx.algorithm;

/**
 * <p>找出字符串中的最长字串</p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: zhangjianxin
 * @Create: 2019-07-12 13:58
 * @Version V1.0
 **/
public class MaxSunString {
    public static void main(String[] args) {
        String str = oneFindMaxSunString("adguy");
        System.out.println(str.length());
    }

    /**
     * 方式一
     * @param str
     * @return
     */
    private static String oneFindMaxSunString(String str) {
        String replaceStr = str;
        String maxStr = "";
        String[] sunStr = str.split("");
        for (int i = 0; i < sunStr.length; i ++){
            for (int j = i + 1; j < sunStr.length; j++) {
                if (sunStr[j].equals(sunStr[i])) {
                    if (j - i >= maxStr.length()) {
                        maxStr = replaceStr.substring(i, j);
                        break;
                    }
                }
            }
        }
        return maxStr;
    }
}
