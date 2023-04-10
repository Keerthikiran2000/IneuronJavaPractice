package Java8Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	//map&collect
	List<Integer> al1=al.stream().map(obj->obj*2).collect(Collectors.toList());
	al1.forEach(System.out::println);
	//filter
	List<Integer> al2=al.stream().filter(i->i%2!=0).collect(Collectors.toList());
	al2.forEach(System.out::println);
	//count
	int a=(int)(al.stream().filter(i->i%2!=0).count());
	System.out.println(a);
	//sorted
	List<Integer> al4=al.stream().sorted().collect(Collectors.toList());
	System.out.println(al4);
	//sorted with Comparator
	List<Integer> al5=al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
	System.out.println(al5);
	int min=al.stream().min((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(min);
	int max=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(max);
	
}
}
