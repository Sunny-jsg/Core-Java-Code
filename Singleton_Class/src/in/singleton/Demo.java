package in.singleton;

public class Demo {
	public  static Demo d = null;
   private Demo() {
	
}
   public static Demo sunny() {
	   if(d == null)
		    d =new Demo();
	   return d;
   }

}
