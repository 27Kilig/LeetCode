import org.junit.Test;

/**
 *罗马数字转整数
 *
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 *
 *
 *
 * 示例1:
 *
 * 输入:"III"
 * 输出: 3
 *
 * 示例2:
 *
 * 输入:"IV"
 * 输出: 4
 *
 * 示例3:
 *
 * 输入:"IX"
 * 输出: 9
 *
 * 示例4:
 *
 * 输入:"LVIII"
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 *
 * 示例5:
 *
 * 输入: "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/roman-to-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class LeetCode13 {

    @Test
    public void test() {
        String s = "VIII";
        System.out.println(romanToInt(s));
    }

    public int romanToInt(String s) {
        int n = s.length();
        int i = 0;
        for(int j=0;j<n;j++)
        {
            switch(s.charAt(j))
            {
                case 'I' : i = i + 1 ;break;
                case 'V' : i = i + 5;break;
                case 'X' : i = i + 10;break;
                case 'L' : i = i + 50;break;
                case 'C' : i = i + 100;break;
                case 'D' : i = i + 500;break;
                case 'M' : i = i + 1000;break;
                default: System.out.println("default");break;
            }

            if(j!=0)
            {
                if(((s.charAt(j)=='V')||(s.charAt(j)=='X'))&&(s.charAt(j-1)=='I'))
                    i = i-1*2;
                if(((s.charAt(j)=='L')||(s.charAt(j)=='C'))&&(s.charAt(j-1)=='X'))
                    i = i-10*2;
                if(((s.charAt(j)=='D')||(s.charAt(j)=='M'))&&(s.charAt(j-1)=='C'))
                    i = i-100*2;
            }
        }
        return i;

    }
}



