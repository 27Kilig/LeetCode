import org.junit.Test;

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
