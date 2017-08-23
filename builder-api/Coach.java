import  java.io.File;
import  java.io . IOEXCEPTION;
public  class  main  {  
	public  static  void  main(string[]args){
		try{
			File  file=newFile("c:/myfile.txt");
			if(File.createNewFile()) 
			System.out.printIn("success!");
			else
			System.out.printIn("Error,file already exists.");
			}  
			catch(IOEXCEPTION  ioe){
				ioe.printstack Trace();
			}       
		}
	}    