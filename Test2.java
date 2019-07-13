/*
写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）


输入描述:
输入一个十六进制的数值字符串。



输出描述:
输出该数值的十进制字符串。

示例1
输入
0xA
输出
10
*/
package written_test0713;

import java.util.*;
//进制转换
public class Test2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.nextLine();
            int len = s.length();
            int a = 0;
            for(int i = 2;i<len;i++){
                char c = s.charAt(i);
                if(c >= 65){
                    a += ((c-55)*Math.pow(16,len-i-1));
                }else{
                    a += ((c-48)*Math.pow(16,len-i-1));
                }
            }
            System.out.println(a);
        }
    }
}
