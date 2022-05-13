// GN

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Demo {
	public static void main(String[] args) {
		//LocalTime lt = new LocalTime();
		LocalDateTime ldt = LocalDateTime.now() ;
		LocalDateTime tweede = ldt.minusDays(7);
		System.out.println(ldt);
		System.out.println(tweede);
		
		LocalDateTime derde = LocalDateTime.of(2021,11,3,4,5,6,12);
		System.out.println(derde);
		LocalDateTime vierde = tweede.minus(Period.of(2, 5, 3));
		System.out.println(vierde);
		System.out.println(vierde.getDayOfMonth());
		System.out.println(vierde.getDayOfWeek());
		System.out.println("Het was "+vierde.getDayOfWeek() +" "+vierde.getDayOfMonth()+ " "+vierde.getMonth() +" "+ vierde.getYear());
	}
}
// String StringBuilder
// Wrappers ArrayList
//LocalDate
//LocalDateTime
//Period
//LocalTime
//Duration


