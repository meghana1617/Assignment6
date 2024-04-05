import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int late = sc.nextInt();
		if (late <= 7)
		{
			System.out.println("Fine is 50 Paisa");
		}
		else if(late >= 8 && late <= 14)
		{
			System.out.println("Fine is 1 Rupee");
		}
		else if(late > 14 && late <= 21 )
		{
			System.out.println("Fine is 5 Rupees");
		}
		else
		{
			System.out.println("membership is cancelled");
		}
		sc.close();
	}

}
