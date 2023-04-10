import java.util.StringTokenizer;

public class Tokenizer {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Keerthi*Kiran*Jamalpur","*");
		System.out.println(st);
	    //int count=st.countTokens();
	    while(st.hasMoreTokens())
	    {
	    	String token=st.nextToken();
	    	System.out.println(token);
	    }
		
	}
	
	
	

}
