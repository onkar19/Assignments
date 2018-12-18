 package lang;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		boolean status ;
String s1="keep";
String s2="peek";
char s1Array[]=s1.toLowerCase().toCharArray();
char s2Array[]=s2.toLowerCase().toCharArray();
if(s1.length()!=s2.length())
{
	System.out.println("String size not matched");
	status=false;
}
else {
    Arrays.sort(s1Array);
	Arrays.sort(s2Array);	
	  status=Arrays.equals(s1Array,s2Array);
    //status=s1Array.equals(s2Array);
}
if(status) {
	System.out.println("ANAGRAM");
}
	else {
	System.out.println("NOT ANAGRAM");
	}}

}
