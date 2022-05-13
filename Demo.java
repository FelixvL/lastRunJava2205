// GJ

public class Demo {
	public static void main(String[] args) {
		Testje t = (1, 2, 3) -> "anders";
		String ab = t.gaan();
		System.out.println(ab);
	}
}
@FunctionalInterface 
interface Testje{
	String gaan(int a, int b, int c);
}