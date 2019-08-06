import java.time.*;

public class DaysTillNextMonth {
	
	public static void main(String[] args){
		int days;
		int currentDay;
		int nextMonth;
		LocalDate date = LocalDate.now();
		
		days = date.lengthOfMonth();
		currentDay = date.getDayOfMonth();
		
		nextMonth = days - currentDay;
		
		System.out.println(nextMonth + "Days untill next month.");
		
	
	}
	
	
	
}