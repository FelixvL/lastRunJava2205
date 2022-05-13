// GK

public class Demo {
	public static void main(String[] args) {
		Testje t = (a, b, c) -> ""+ a + c;
		String ab = t.gaan(1, true, 3);
		System.out.println(ab);
	}
}
@FunctionalInterface 
interface Testje{
	String gaan(int a, boolean b, int c);
}