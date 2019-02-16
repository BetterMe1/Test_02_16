package xust;

/*
709. 转换成小写字母
 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。

示例 1：
输入: "Hello"
输出: "hello"

示例 2：
输入: "here"
输出: "here"

示例 3：
输入: "LOVELY"
输出: "lovely"
 */
public class Test_0216 {
	public static void main(String[] args) {
		Solution So = new Solution();
		String str = "Hello";
		System.out.println(So.toLowerCase(str));
	}
}
class Solution {
    public String toLowerCase(String str) {
    	String ret ="";
        for(int i=0; i<str.length(); i++){
        	if('A' <= str.charAt(i) && str.charAt(i) <='Z')
        		ret = ret + String.valueOf((char)(str.charAt(i)+32));
        	else
        		ret = ret + String.valueOf(str.charAt(i));
        }
        return ret;
    }
}