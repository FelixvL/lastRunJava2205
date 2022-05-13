// GH

public class Demo {
	public static void main(String[] args) {
	//	(  int getal1, int getal2  ) ->{ return int; }
		Testje eersteLambda;
		eersteLambda = (a)-> a.equals("hoi") ;
		//eersteLambda = (a, b)-> a.length() > 5 && b ;
		boolean tt = eersteLambda.DeAbstracteMethode("hoidaar");
		System.out.println(tt);		
		String ah = "goedeavond"+9+6;
		boolean b = 8 > 6;
		boolean c = true;
//		Testje tweedeLambda;
//		tweedeLambda = (q,w)-> q+q-w*3;
//		int ww = tweedeLambda.DeAbstracteMethode(12, 15);
//		System.out.println(ww);
	}
}
@FunctionalInterface       // 1 abstracte methode
interface Testje{
	// returntype               // aantal type paramters
	boolean DeAbstracteMethode(  String getal1  );
}