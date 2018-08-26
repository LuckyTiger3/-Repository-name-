
public class MyClass2 {
	
	public static void main(String[] args) {
		String x = "123";
		String y = "456";
		String z = "789";
		String a = (String) x + z;
		String b = (String) z + y + x;
		String c = (String) x + y + z;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}