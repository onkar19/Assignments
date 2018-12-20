package com.details1;
public class Gender
{
	
	void sayHi()
	{
		
	}
}
class Male extends Gender
{
String f_name="HELLO SIR WELCOME";
public void sayHi()
{
Iplayer ip=new  VlcPlayer();
ip.play(f_name);
}
}
class Female extends Gender
{
String f_name="HELLO MAM WELCOME";
public void sayHi()
{
Iplayer ip=new  WindowPlayer();
ip.play(f_name);
}
}

