import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamImpl {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(30);
	List<Integer> list=al.stream().filter(i->i>10).collect(Collectors.toList());
	List<Integer> list1=al.stream().map(i->i*2).collect(Collectors.toList());
	System.out.println(list);
	System.out.println(list1);
	
}
}
