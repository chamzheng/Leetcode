package cn.qianlaofei.no003;

/**
 * Created by chamz on 2016-09-20.
 */
public class MySolution {
    /**
     * 七月算法讲过，用两个指针，滑动窗口
     */
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        boolean[] have = new boolean[65535];
        int i = 0;
        int j = 0;
        while(true) {
            while(j < s.length() && !have[s.charAt(j)]) {
                have[s.charAt(j++)] = true;
            }
            answer = Math.max(answer,j - i);
            if(j >= s.length()) {
                break;
            }
            while (s.charAt(i) != s.charAt(j)) {
                have[s.charAt(i++)] = false;
            }
            have[s.charAt(i)] = false;
            i++;
        }
        return answer;
    }//AC
    //击败了19%的Java代码
    /**
     * Total Accepted: 187836
     * Total Submissions: 811761
     * Difficulty: Medium
     */
}
