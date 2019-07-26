public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20 ; i++ ) {
			System.out.println(" Значение " + i);
		}

		int y = 6;
		while (y >= -6) {
			System.out.println(" Значение " + y);
			y -= 2;			
		}

		int result = 0;
		int z = 10;
		do {
			
			if(z % 2 !=0) {
				result = result + z;			
			}
			z++;
		} while (z<=20);
		System.out.println(" " + result);		
	}
}