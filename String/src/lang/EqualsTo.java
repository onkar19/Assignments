package lang;

import java.util.Arrays;

public class EqualsTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status=true;
		String temp;
String s1="hello";
String s2="world";
char s1Array[]=s1.toCharArray();
char s2Array[]=s2.toCharArray();
//status=	Arrays.equals(s1Array,s2Array);
status=	s1Array.equals(s2Array);
System.out.println(status);
/*//System.out.println(s1.compareTo(s2));
//System.out.println(s1.concat(""+s2));
System.out.println(s1);
System.out.println(s2);
temp=s1;
s1=s2;
s2=temp;
System.out.println(s1);
System.out.println(s2);
System.out.println(s1.concat(" onkar"));
*/
	}
	

}
