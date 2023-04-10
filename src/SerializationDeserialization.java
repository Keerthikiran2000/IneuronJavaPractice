import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable
{
	int i=10;
	int j=20;
}
class Cat implements Serializable
{
	int i=100;
	static int j=200;
}
public class SerializationDeserialization  {
	public static void main(String[] args) throws IOException,FileNotFoundException, ClassNotFoundException {
		FileOutputStream fos=new FileOutputStream("abcd.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Dog d1=new Dog();
		Cat c1=new Cat();
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.close();
		System.in.read();
		FileInputStream fos1=new FileInputStream("abcd.ser");
		ObjectInputStream oos1=new ObjectInputStream(fos1);
		Object obj=oos1.readObject();
		Dog d=(Dog)obj;
		Object obj1=oos1.readObject();
		Cat c=(Cat)obj1;
		System.out.println(d.i+" "+d.j);
		System.out.println(c.i+" "+c.j);
		oos1.close();
	}



}
