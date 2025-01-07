import java.util.Scanner;

public class PerimeterOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float len = sc.nextFloat();
		float wid = sc.nextFloat();

		System.out.println("Perimeter is : " + (2*(len + wid)));
	}
}