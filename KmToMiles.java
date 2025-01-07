public class KmToMiles {
	public static void main(String[] args) {
		float km = Float.parseFloat(args[0]);
		
		double miles = km * 0.621371;
		System.out.println(miles);
	}
}