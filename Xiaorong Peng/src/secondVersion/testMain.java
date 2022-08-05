package secondVersion;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {
		
		// to read the order
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of items in order: ");
		int numItems = sc.nextInt();
		String[] itemName = new String[numItems];
		String[] itemShape = new String[numItems];
		List<double[]> dimensions = new ArrayList<double[]>(numItems);
		double[] itemWeight = new double[numItems];
		int[] itemQuantity = new int[numItems];
		for (int i = 0; i < numItems; i++) {
			System.out.print("Please enter the name of the item: ");
			itemName[i] = sc.next();
			System.out.print("Please enter the shape of the item (Cubic, Rectangle, Pentagon, or Cylinder) ");
			itemShape[i] = sc.next();
			System.out.print("Please enter the number of dimensions: ");
			int dimSize = sc.nextInt();
			double[] d = new double[dimSize];
			for (int j = 0; j < dimSize; j++) {
				System.out.print("Please enter the dimensions (in m):");
				d[j] = sc.nextDouble();
			}
			dimensions.add(d);
			System.out.print("Please enter the weight of the item (in kg): ");
			itemWeight[i] = sc.nextDouble();
			System.out.print("Please enter the quantity of the item: ");
			itemQuantity[i] = sc.nextInt();
			System.out.println();
		}
		sc.close();
				
		// Create new items based on order.
		Item[] items = new Item[numItems];
		for (int i = 0; i < items.length; i++) {
			items[i] = new Item(itemName[i], itemShape[i], dimensions.get(i), itemWeight[i], itemQuantity[i]);
		}
		
		
		// Identify shipping method
		Container small = new Container ("small");
		if (totalVolume(items) <= small.volume()) {
			System.out.println("The shipment of volume " + totalVolume(items) + " meters cubed requires one small container.");
			if (totalWeight(items) <= 500) 
				System.out.println("Since the shipment's weight is " + totalWeight(items) + " kg, the "
						+ "shipment will cost 1000 Euros.");
			else {
				System.out.println("Since the shipment's weight is " + totalWeight(items) + " kg, the "
						+ "shipment will cost 1200 Euros.");
			}
		} else calculateShipping(totalVolume(items));
				
	}
	
	
	public static double totalVolume(Item[] order) {
		double volume = 0;
		if (order == null) return 0;
		else {
			for (int i = 0; i < order.length; i++) {
				volume += order[i].volume();
			}
			return volume;
		}
	}

	public static double totalWeight(Item[] order) {
		double weight = 0;
		if (order == null) return 0;
		else {
			for (int i = 0; i < order.length; i++) {
				weight += order[i].getmWeight();
			}
			return weight;
		}
	}
	
	public static void calculateShipping(double volume) {
		if (volume <= 0) System.out.println("Volume cannot be less than or equal to 0. Enter a new volume.");
		Container big = new Container("big");
		Container small = new Container("small");
		double volumeBig = big.volume();
		double volumeSmall = small.volume();
		
		int numBig = (int) (volume / volumeBig);
		if (volume - (numBig * volumeBig) <= volumeSmall) {
			System.out.println("The shipment of volume " + volume + " meters cubed fits into " + numBig +
					" big containers and one small container.");
			System.out.println("The total shipping cost is " + (1200 + numBig * 1800) +
					" or " +  (1000 + numBig * 1800) + " Euros depending on shipping.");
		} else {
			System.out.println("The shipment of volume " + volume + " meters cubed fits into " + (numBig + 1) +
					" big containers.");
			System.out.println("The total shipping cost is " + ((numBig + 1) * 1800) + " Euros.");
		}
	}
}
