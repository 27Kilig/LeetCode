import org.junit.Test;

public class LeetCode27 {

    /**
     * 移除元素
     *
     *
     * 给你一个数组 nums和一个值 val，你需要原地移除所有数值等于val的元素，并返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     *
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     *
     *
     */

    @Test
    public void test(){
        System.out.println(removeElement(new int[]{3,2,2,2,3},3));

    }


    public int removeElement(int[] nums, int val) {

        int len = nums.length;
        for(int i = 0 ; i < len ; i++){
            if(nums[i] == val){
                for(int j = i + 1 ; j < len; j++){
                    nums[j-1] = nums[j];
                }
                i--;
                len--;
            }
        }
        return len;
    }
}


