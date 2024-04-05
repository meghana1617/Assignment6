import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the purchasedCount : ");
		int purchasedCount = sc.nextInt();
		System.out.println("Enter price per item : ");
		double item_price =  sc.nextDouble();
		double totalCost = item_price * purchasedCount;
		
		if (purchasedCount > 50)
		{
			System.out.println("Total totalCost after discount : "+ (totalCost - (0.1 * totalCost)));
		}
		else if (purchasedCount >= 25 && purchasedCount <= 50)
		{
			System.out.println("Total totalCost after discount : "+ (totalCost - (0.05 * totalCost)));
		}
		else
		{
			System.out.println("no discount and Total totalCost  : "+ totalCost );
			
		}
		sc.close();
	}

}