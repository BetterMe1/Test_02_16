package xust;

/*
709. ת����Сд��ĸ
 ʵ�ֺ��� ToLowerCase()���ú�������һ���ַ������� str���������ַ����еĴ�д��ĸת����Сд��ĸ��֮�󷵻��µ��ַ�����

ʾ�� 1��
����: "Hello"
���: "hello"

ʾ�� 2��
����: "here"
���: "here"

ʾ�� 3��
����: "LOVELY"
���: "lovely"
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