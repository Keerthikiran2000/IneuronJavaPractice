import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
	String country() default "India";
	int getRuns() default 2000;
}
@CricketPlayer
public class CustomAnnotation {
	public static void main(String[] args) {
	CustomAnnotation c=new CustomAnnotation();
	Class c1=c.getClass();
	  Annotation a=c1.getAnnotation(CricketPlayer.class);
	  CricketPlayer ck=(CricketPlayer)a;
	  System.out.println(ck.getRuns()+" "+ck.country());

	}
}
