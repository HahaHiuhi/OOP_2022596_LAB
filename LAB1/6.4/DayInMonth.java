import java.util.HashMap;
import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
         HashMap<String, Integer> monthMap = new HashMap<>();

        monthMap.put("January", 1);
        monthMap.put("February", 2);
        monthMap.put("March", 3);
        monthMap.put("April", 4);
        monthMap.put("May", 5);
        monthMap.put("June", 6);
        monthMap.put("July", 7 );
        monthMap.put("August", 8);
        monthMap.put("September", 9);
        monthMap.put("October", 10);
        monthMap.put("November", 11);
        monthMap.put("December", 12);
        monthMap.put("Jan", 1);
        monthMap.put("Feb", 2);
        monthMap.put("Mar", 3);
        monthMap.put("Apr", 4);
        monthMap.put("May", 5);
        monthMap.put("Jun", 6);
        monthMap.put("Jul", 7);
        monthMap.put("Aug", 8);
        monthMap.put("Sep", 9);
        monthMap.put("Oct", 10);
        monthMap.put("Nov", 11);
        monthMap.put("Dec", 12);
		monthMap.put("Jan.", 1);
        monthMap.put("Feb.", 2);
        monthMap.put("Mar.", 3);
        monthMap.put("Apr.", 4);
        monthMap.put("May.", 5);
        monthMap.put("Jun.", 6);
        monthMap.put("Jul.", 7);
        monthMap.put("Aug.", 8);
        monthMap.put("Sep.", 9);
        monthMap.put("Oct.", 10);
        monthMap.put("Nov.", 11);
        monthMap.put("Dec.", 12);
		monthMap.put("1", 1);
        monthMap.put("2", 2);
        monthMap.put("3", 3);
        monthMap.put("4", 4);
        monthMap.put("5", 5);
        monthMap.put("6", 6);
        monthMap.put("7", 7);
        monthMap.put("8", 8);
        monthMap.put("9", 9);
        monthMap.put("10", 10);
        monthMap.put("11", 11);
        monthMap.put("12", 12);
		
		int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
		
        Scanner input = new Scanner(System.in);
		String month  = "";
		int month_num = -1;
		while (month_num < 1){
		  System.out.println("Nhap thang: ");	
		  month = input.nextLine();
		  if(monthMap.containsKey(month)){
			 month_num = monthMap.get(month);
		  }	  
        }
		
        int year = -1;
        while (year < 0){
          System.out.println("Nhap nam: ");	
		  year = input.nextInt();
        }
		
		int leap_year = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 1 : 0;
        daysInMonth[1] += leap_year; 		
		
		System.out.println("Thang " + month_num + " nam " + year + " co " + daysInMonth[month_num - 1] + " ngay." );
    }
}
