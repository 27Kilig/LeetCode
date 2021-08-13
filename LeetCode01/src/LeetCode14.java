import org.junit.Test;


/**
 * 最长公共前缀
 *
 *编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串""。
 *
 * 示例 1：
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode14 {

    @Test
    public void test() {
        String[] strs = new String[]{"wjy123", "wjy1456", "wjy1789"};
        System.out.println(longestCommonPrefix(strs));
    }


    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String s = strs[0];
        for (String string : strs) {
            while (!string.startsWith(s)) {
                if (s.length() == 0) return "";
                s = s.substring(0, s.length() - 1);
            }
        }
        return s;
    }
}
