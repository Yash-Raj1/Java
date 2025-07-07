package String;
import java.util.*;
public class BasicString{
    public static void main(String[] args) {
        String str = "Hello, World!";//Now,this is a useless objects
        str="Yash hello";//the str variable refers to the this objects
        System.out.println(str);
        String str1="Yash hello";
        System.out.println(str==str1);//to check ref variable refesr to same objects or not
        String str2=new String("Yash hello");
        System.out.println(str1.equals(str2));//Only check for the values

        
    }
}