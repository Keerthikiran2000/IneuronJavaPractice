package FileHandling;
import java.io.File;
public class FIlePractice  {
public static void main(String[] args)throws Exception {
	String file="cricket.txt";
	//create file
	File f=new File(file);
	f.createNewFile();
	System.out.println(f.exists());
	String dir="IPL";
	File f1=new File(dir);
	f1.mkdir();
	System.out.println(f1.exists());
	System.out.println(f1.isDirectory());
	String s3="MumbaiIndians.txt";
	File f2=new File(f1,s3);
	f2.createNewFile();
	System.out.println(f2.isFile());
	
	String[] List=f1.list();
	for(String file11:List)
	{
		System.out.println(file11);
	}
	
}
}
