package com.details1;
public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Gender h;
String gen="M";
if(gen.equalsIgnoreCase("m"))
{
h=new Male();
}
else
{
h=new Female();	
}
h.sayHi();
}
}

