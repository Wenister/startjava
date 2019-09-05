public class Calculator {
	public static void main (String [] args) {
		int a = 3;
		int b = 3;

		char sign = '/'; // +, -, *, /, ^, %

if (sign == '+') {
	int sum = a + b;
		System.out.println(sum);
}
		
else if (sign == '-') {
		int subtraction = a - b; 
		System.out.println(subtraction);
}

else if (sign == '*') {
		int  multiplication = a*b;
		System.out.println(multiplication);
}

else if (sign == '/') {
		double remainderOfDivision = (double)a/b;
		System.out.println(remainderOfDivision);
}

else if (sign == '%') {
	    double percent = (double)a/100*b;
	    System.out.println(percent);
}
		
else if  (sign == '^') {

int degree = 1 ;

	for (int i = 1; i <= b; i ++ )
		degree = degree*a;
		System.out.println(degree);

}

	}
}
