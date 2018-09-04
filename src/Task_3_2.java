import java.util.Arrays;

public class Task_3_2 {

	public static void main(String[] args) {
		
		
		int[] x = {213,3213,321,2323,3232,32211,32112,123123,321231,123123};
	    
		int x1 = x[0];
	    int x10 = x[9];
	    x[0] = x10;
	    x[9] = x1;
	    
	    String s = Arrays.toString(x);

	    System.out.println(s);
	}
}
		