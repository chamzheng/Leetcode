package cn.qianlaofei.no001;

import java.util.HashMap;

/**
 * Created by chamz on 2016-09-20.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>(nums.length);
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int gap = target - nums[i];
            if(map.get(gap)!= null && map.get(gap)!= i){
                res[0] = i;
                res[1] = map.get(gap);
                break;
            }
        }
        return res;
    }//AC
    //击败50%的java代码
}
