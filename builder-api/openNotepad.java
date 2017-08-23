import  java.util.*;
import  java.io.*;
Class  Notepad  {
	public  static  void  main(string[]args){
		Runtime  rs=Runtime. getRuntime();
		try{
			rs.exec("Notepad");
		}  
		catch (IOEXCEPTION  e) {  
			System.out.printIn(e);  
	}  
}  
}  