import java.util.function.Predicate;

public class FuncInt {
	static void TestingArray(Predicate<Integer> p,int[] arr)
	{
		for(int ele:arr)
		{
			if(p.test(ele))
				System.out.println(ele);
		}
	}
public static void main(String[] args) {
	Predicate<Integer> p=i->i>=10;
	System.out.println(p.test(200));
	int[] arr= {10,0,20,1,2,3,50};
	TestingArray(p,arr);
}
}
