package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "Rose";
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b); // left associative for +
		System.out.println(a==b);
		System.out.println(x+y+(a+b)); //parentheses will be separately calculated 
        System.out.println(a+(x+y)+b);
	}

}
