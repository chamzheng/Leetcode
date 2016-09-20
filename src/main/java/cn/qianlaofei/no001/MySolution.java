package cn.qianlaofei.no001;

/**
 * Created by chamz on 2016-09-20.
 */
public class MySolution {

    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        out:for(int i = 0;i < nums.length-1;i++) {
            in:for(int j = i + 1;j < nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                }
            }
        }
        return ret;
    }//AC
    //击败了13.7%的java代码
}