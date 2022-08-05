package firstVersion;

import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {

		//to read the order
		Scanner sc = new Scanner(System.in);
		System.out.print("the number of laptop: ");
		int numLaptop = sc.nextInt();
		System.out.print("the number of mouse: ");
		int numMouse = sc.nextInt();
		System.out.print("the number of desktop: ");
		int numDesktop = sc.nextInt();
		System.out.print("the number of LCDscreen: ");
		int numLCD = sc.nextInt();
		sc.close();
		
		//to save the order in arrays
		int[] list = {numLaptop, numMouse, numDesktop, numLCD};
		//to compute the total volume and weight of the shipment and the total volume of both containers
		double totalVol = list[0] * 0.6 * 0.5 * 0.5 + list[1] * 0.3 * 0.3 * 0.2 + 
				list[2] * 1 * 1.5 * 0.5 + list[3] * 1.2 * 1.4 * 0.8;
		double totalWt = numLaptop * 6.5 + numMouse * 0.2 + numDesktop * 20 + numLCD * 2.6;
		double den = totalWt / totalVol;
		double volSmallContainer = 2.59 * 2.43 * 6.06;
		double volBigContainer = 2.59 * 2.43 * 12.01;
		System.out.println("\nThe total volume of the shipment: " + totalVol + " m^3");
		System.out.println("The total weight of the shipment: " + totalWt + " kg\n");
		System.out.println("The volume of the small container: " + volSmallContainer + " m^3");
		System.out.println("The volume of the big container: " + volBigContainer + " m^3\n");
		
		//to select the type of container and compare price methods
		int numBig = (int) (Math.ceil(totalVol / volBigContainer));
		int numSmall = 0, numSmallTemp = 0;
		int price = numBig * 1800;
		int newPrice = price;
		while(newPrice <= price) {
			numSmallTemp = numSmall;
			price = newPrice;
			int priceSmall;
			numBig--;
			if(numBig < 0) {
				break;
			}
			double remainVol = totalVol - volBigContainer * numBig;
			numSmall = (int) (Math.ceil(remainVol / volSmallContainer));
			//judge the price of small container
			if (den * remainVol / numSmall > 500)
				priceSmall = 1200;
			else
				priceSmall = 1000;
			newPrice = numBig * 1800 + numSmall * priceSmall;
		}
		numBig++;
		
		//print the results
		System.out.println("------------------Result-------------------");
		System.out.println("The optimal solution is " + price + " Euro");
		System.out.println("The number of big container: " + numBig);
		System.out.println("The number of small container: " + numSmallTemp);
		

	}

}
