package JavaBasics;

import java.util.Arrays;

public class StaticArrays {

	public static void main(String[] args) {
		
		System.out.println("copying array elements using arraycopy");
		int[] source = {1, 2, 3, 4, 5};
		int[] dest = new int[5];
		System.arraycopy(source, 0, dest, 0, 5);
		
		for(int i=0;i<dest.length;i++) {
			System.out.println(dest[i]);
		}
		
		System.out.println("copying array elements using copyOf");
		int[] original = {1, 2, 3};
		int[] copy = Arrays.copyOf(original, 8);
		for(int a=0;a<copy.length;a++) {
			System.out.println(copy[a]);
		}
		
		String[] s = {"tesg","nbdjgug","hwgdlhi","qwerty"};
		for(int t=0;t<s.length;t++) {
			System.out.println(s[t]);
		}
		
			

	}

}
