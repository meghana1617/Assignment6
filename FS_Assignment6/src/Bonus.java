import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Current year: ");
		int curr_year = sc.nextInt();
		System.out.println("joined year: ");
		int joined_year = sc.nextInt();
		int experience = curr_year - joined_year;
		if (experience > 5)
		{
			System.out.println("Bonus Rs.5000 is awarded");
		}
		else if(experience >= 3 && experience <= 5)
		{
			System.out.println("Bonus Rs.3000 is awarded");
		}
		else
		{
			System.out.println("no bonus is awarded.");
		}
		sc.close();
	}

}
