package FileHandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.PrintStream;
public class ReadingFile {
	static void readCharacterbyCharacter(String filepath) throws IOException,FileNotFoundException
	{
		File f=new File(filepath);
		FileReader fr=new FileReader(f);
		int r=fr.read();
		while(r!=-1)
		{
			System.out.print((char)r);
			r=fr.read();
		}
		fr.close();
	}
	static void ReadFileAtOnce(String filepath) throws IOException
	{
		File f=new File(filepath);
		FileReader fr=new FileReader(f);
		char[] ch=new char[(int)f.length()];
		if(f.isFile())
		{
			fr.read(ch);
		}
		for(char letter:ch)
		{
			System.out.print(letter);
		}
		fr.close();
		
	}
	static void BufferedWriterExample(String filepath) throws IOException
	{
		FileWriter fw=new FileWriter(filepath,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		char ch[]= {'K','E','E','R','T','H','I'};
		bw.write(ch);
		bw.flush();
		bw.close();
	}
	static void BufferedReaderExample(String filepath) throws IOException
	{
		FileReader fw=new FileReader(filepath);
		BufferedReader br=new BufferedReader(fw);
		String text=br.readLine();
		while(br.readLine()!=null)
		{
			System.out.println(text);
			text=br.readLine();
		}
		br.close();
		
	}
	static void CopyContents(File f1,File f2,File f3) throws IOException
	{
		PrintWriter pw=new PrintWriter(f3);
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		String text=br.readLine();
		while(text!=null)
		{
			pw.println(text);
			text=br.readLine();
		}
		
		br=new BufferedReader(new FileReader(f2));
		text=br.readLine();
		while(text!=null)
		{
			pw.println(text);
			text=br.readLine();
		}
		pw.close();
		br.close();
		
		
	}
	static void CopyContentsAlternateLine(File f1,File f2,File f3) throws IOException
	{
		PrintWriter pw=new PrintWriter(f3);
		BufferedReader br=new BufferedReader(new FileReader(f1));
		BufferedReader br1=new BufferedReader(new FileReader(f2));
		String text=br.readLine();
		String text1=br1.readLine();
		while(text!=null && text1!=null)
		{
			pw.println(text);
			text=br.readLine();
			pw.println(text1);
			text1=br.readLine();
		}
		while(text!=null)
		{
			pw.println(text);
			text=br.readLine();
		}
		while(text1!=null)
		{
			pw.println(text1);
			text1=br.readLine();
		}
		pw.flush();
		br1.close();
		br.close();
		pw.close();
		
		
	}
public static void main(String[] args) throws IOException,FileNotFoundException {
//	ReadFileAtOnce("abc.txt");
//	BufferedWriterExample("abc.txt");
	//BufferedReaderExample("abc.txt");
	File f=new File("abc.txt");
	File f1=new File("cricket.txt");
	File f2=new File("output.txt");
	//CopyContents(f,f1,f2);
	CopyContentsAlternateLine(f,f1,f2);
}
}
