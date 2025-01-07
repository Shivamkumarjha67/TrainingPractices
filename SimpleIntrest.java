import java.util.Scanner;

public class SimpleIntrest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float p = sc.nextFloat();
		float r = sc.nextFloat();
		float t = sc.nextFloat();

		float intrest = p * t * r;
		intrest /= 100;

		System.out.println(intrest); 
	} 
}