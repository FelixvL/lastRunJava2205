// GM

public class Demo {
	public static void main(String[] args) {
		Testje t = (a, c) -> a.length() > 5 && c;
		boolean ab = t.gaan("true",true);
		System.out.println(ab);
	}
}
@FunctionalInterface 
interface Testje{
	boolean gaan(String a, boolean b);
}