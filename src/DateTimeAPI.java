import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {
	
	public static void LocalDateTimeApi() {
		LocalTime time = LocalTime.now();
		//System.out.println(time);
		LocalDate date = LocalDate.now();
		//System.out.println(date);
		LocalDateTime dt = LocalDateTime.now();
		//System.out.println(dt);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yy  HH:mm:ss");
		String formatted  = dt.format(dtf);
		System.out.println(formatted);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTimeApi();
	}

}
