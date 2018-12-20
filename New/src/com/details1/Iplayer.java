package com.details1;

public interface Iplayer {
	void play(String f_name);

}
  class VlcPlayer implements Iplayer
 {
  public void play(String f_name) 
 {
	 System.out.println(f_name);
 }
} class WindowPlayer implements Iplayer
 {
	 public void play(String f_name)
	 {
		 System.out.println(f_name
				 );
	 }
 }