import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable
{
	String userName="Keerthi";
	transient String  password="Password";
	private void writeObject(ObjectOutputStream oos) throws IOException
	{
		oos.defaultWriteObject();
		String Pswrd="123"+password;
		oos.writeObject(Pswrd);
	}
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException
	{
		ois.defaultReadObject();
		Object pswrd=ois.readObject();
		password=(String)pswrd;
	}
	
}
public class CustomSerialization {
	public static void main(String[] args) throws IOException,FileNotFoundException, ClassNotFoundException {
		
	FileOutputStream fos=new FileOutputStream("abcd.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	Account c1=new Account();
	oos.writeObject(c1);
	oos.close();
	System.in.read();
	FileInputStream fos1=new FileInputStream("abcd.ser");
	ObjectInputStream oos1=new ObjectInputStream(fos1);
	Object obj=oos1.readObject();
	Account acc=(Account)obj;
	System.out.println(acc.userName+"->"+acc.password);
	}

}
