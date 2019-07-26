public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20 ; i++ ) {
			System.out.println(" Значение " + i);
		}

		int counter = 6;
		while (counter >= -6) {
			System.out.println(" Значение " + counter);
			counter -= 2;			
		}

		int sumOdd = 0;
		int counter1 = 10;
		do {			
			if(counter1 % 2 != 0) {
				sumOdd += counter1;			
			}
			counter1++;
		} while (counter1 <= 20);
		System.out.println(" Сумма нечётных чисел в диапазоне от 10 до 20 ровна " + sumOdd);		
	}
}
