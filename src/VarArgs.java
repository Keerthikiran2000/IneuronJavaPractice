
public class VarArgs {
public static  void add(int... x)
{
	for(int a:x)
	{
		System.out.println(a);
	}
	
}
public static void main(String[] args) {
	add();
	add(10);
	add(20,10);
}
}
