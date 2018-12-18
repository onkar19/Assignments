package lang;

public class EndsWith {
public static void main(String[] args) {
	String str1=new String("onkar how are you");
	boolean var=str1.endsWith("w");
	boolean var1=str1.startsWith("o");
	boolean var2=str1.startsWith("h",6);
	
	System.out.println("str1 ends with r: "+var);
	System.out.println("str1 start with o: "+var1);
	System.out.println("str1 start with h: "+var2);
}
}
