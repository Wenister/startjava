import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 27;
		boolean men = true;
		boolean women = true;
		double growth = 1.86;
		char name = 'I';

		if (age > 20) {
			System.out.println(" Я взрослый ");
		}

		if (men==true) {
			System.out.println(" Я мужчина ");
		}

		if (women==true) {
			System.out.println(" Я женщина ");
		}

		if (growth < 1.80) {
			System.out.println(" Не такой уж я и выскокий ");

		} else {
			System.out.println(" Можно подумать и о волейболе ");
		}

		if ( name =='M') {
			System.out.println(" I'm Mihail ");
		} else if ( name =='I') {
			System.out.println(" I'm Ingrid ");
		} else {
			System.out.println(" Your name is strange ");
		}		
	}
	
	
}