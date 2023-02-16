package lesson_12_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Press 1 to check if there such a month.");
		System.out.println("Press 2 to display all months with the same season.");
		System.out.println("Press 3 to display all months that have the same number of days.");
		System.out.println("Press 4 to display all months with fewer days.");
		System.out.println("Press 5 to display all months with more days.");
		System.out.println("Press 6 to display the next season .");
		System.out.println("Press 7 to display previous season.");
		System.out.println("Press 8 to display all months with an even number of days.");
		System.out.println("Press 9 to display all months with an odd number of days.");
		System.out.println("Press 10 to display whether the month has an even number of days.");
	}

	public static void main(String[] args) {

		enum Seasons {
			WINTER, SPRING, SUMMER, FALL;
		}

		class Month {
			Seasons season;
			int days;
			String month;

			public Seasons getSeason() {
				return season;
			}

			public void setSeason(Seasons season) {
				this.season = season;
			}

			public int getDays() {
				return days;
			}

			public void setDays(int days) {
				this.days = days;
			}

			public String getMonth() {
				return month;
			}

			public void setMonth(String month) {
				this.month = month;
			}

			public Month(Seasons season, int days, String month) {
				super();
				this.season = season;
				this.days = days;
				this.month = month;
			}

			@Override
			public String toString() {
				return "Months [season = " + season + ", days = " + days + ", month = " + month + "]";
			}

		}

		ArrayList<Seasons> season = new ArrayList<Seasons>();
		ArrayList<Month> month = new ArrayList<Month>();

		season.add(Seasons.WINTER);
		season.add(Seasons.SPRING);
		season.add(Seasons.SUMMER);
		season.add(Seasons.FALL);

		month.add(new Month(Seasons.WINTER, 31, "JANUARY"));
		month.add(new Month(Seasons.WINTER, 28, "FEBRUARY"));

		month.add(new Month(Seasons.SPRING, 31, "MARCH"));
		month.add(new Month(Seasons.SPRING, 30, "APRIL"));
		month.add(new Month(Seasons.SPRING, 31, "MAY"));

		month.add(new Month(Seasons.SUMMER, 30, "JUNE"));
		month.add(new Month(Seasons.SUMMER, 31, "JULY"));
		month.add(new Month(Seasons.SUMMER, 31, "AUGUST"));

		month.add(new Month(Seasons.FALL, 30, "SEPTEMBER"));
		month.add(new Month(Seasons.FALL, 31, "OCTOBER"));
		month.add(new Month(Seasons.FALL, 30, "NOVEMBER"));

		month.add(new Month(Seasons.WINTER, 31, "DECEMBER"));

		Scanner scan = new Scanner(System.in);

		while (true) {
			menu();

			switch (scan.next()) {
			case "1": {
				System.out.println("Enter month.");
				String scanMonth = scan.next();
				boolean isExists = false;

				for (Month key : month) {
					if (key.getMonth().equalsIgnoreCase(scanMonth)) {
						isExists = true;
					}
				}
				if (isExists == true) {
					System.out.println("Months exists.");
				} else {
					System.out.println("Months doesn't exists.");
				}

				break;
			}
			case "2":{
				System.out.println("Enter season.");
				String scanSeason = scan.next().toUpperCase();

				for (Month key : month) {
					if (key.getSeason().toString().equals(scanSeason)) {
						System.out.println(key.getMonth());
					}
				}
				break;
			}
			case "3":{
				System.out.println("Enter the number of days.");
				int scanDays = scan.nextInt();
				
				for (Month key : month) {
					if(key.getDays() == scanDays) {
						System.out.println(key.getMonth());
					}
				}
				break;
			}
			case "4":{
				System.out.println("Enter the number of days.");
				int scanDays = scan.nextInt();
				
				for (Month key : month) {
					if(key.getDays() < scanDays) {
						System.out.println(key.getMonth());
					}
				}
				break;
			}
			case "5":{
				System.out.println("Enter the number of days.");
				int scanDays = scan.nextInt();
				
				for (Month key : month) {
					if(key.getDays() > scanDays) {
						System.out.println(key.getMonth());
					}
				}
				break;
			}
			case "6":{
				System.out.println("Enter season.");
				String scanSeason = scan.next().toUpperCase();
				
				switch(scanSeason) {
				case "WINTER" : {
					System.out.println("SPRING");
				}
				break;
				case "SPRING" : {
					System.out.println("SUMMER");
				}
				break;
				case "SUMMER" : {
					System.out.println("FALL");
				}
				break;
				case "FALL" : {
					System.out.println("WINTER");
				}
				break;
				}
			}
			break;
			case "7":{
				System.out.println("Enter season.");
				String scanSeason = scan.next().toUpperCase();
				
				switch(scanSeason) {
				case "WINTER" : {
					System.out.println("FALL");
				}
				break;
				case "FALL" : {
					System.out.println("SUMMER");
				}
				break;
				case "SUMMER" : {
					System.out.println("SPRING");
				}
				break;
				case "SPRING" : {
					System.out.println("WINTER");
				}
				break;
				}
			}
			break;
			case "8":{
				for (Month key : month) {
					if(key.getDays() % 2 == 0) {
						System.out.println(key.getMonth());
					}
				}
			}
			break;
			case "9":{
				for (Month key : month) {
					if(key.getDays() % 2 != 0) {
						System.out.println(key.getMonth());
					}
				}
			}
			break;
			case "10":{
				System.out.println("Enter month.");
				String scanMonth = scan.next().toUpperCase();
				
				for (Month key : month) {
					if(scanMonth.equals(key.getMonth())) {
						int days = key.getDays();
						if(days % 2 == 0) {
							System.out.println("Month has an even number of days.");
						}else {
							System.out.println("Month has an odd number of days.");
						}
					}
				}
				
			}
			}
		}

	}
}
