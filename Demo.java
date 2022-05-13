// GI

public class Demo {
	public static void main(String[] args) {
		Testje t = () -> "iets";
		String ab = t.gaan();
		System.out.println(ab);
	}
}
@FunctionalInterface 
interface Testje{
	String gaan();
}