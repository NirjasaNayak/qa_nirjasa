package JavaBasics;

public class Finally {

	public static void main(String[] args) {
		
		try {
			int x=10/2;
		}
				catch(ArithmeticException e){
					System.out.println("caught exception" +e.getMessage());
				}
		finally {
			System.out.println("mandatory exceuting block");
		}
			}
		}

	


