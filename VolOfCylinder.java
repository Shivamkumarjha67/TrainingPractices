import java.util.Scanner;

public class VolOfCylinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float radius = sc.nextFloat();
		float height = sc.nextFloat();

		float vol = 3.14f * radius * radius * height;
		
		System.out.println(vol);
	}
}