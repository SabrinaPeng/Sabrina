package secondVersion;

public class Item {
	
	private String mName;
	private String mShape;
	private double[] mDimensions;
	private double mWeight;
	private int mQuantity;

	public Item(String name, String shape, double[] dimension, double weight, int quantity) {
		mName = name;
		mShape = shape;
		mDimensions = dimension;
		mWeight = weight;
		mQuantity = quantity;
	}

	public String getmName() {
		return mName;
	}

	public String getmShape() {
		return mShape;
	}

	public double[] getmDimensions() {
		return mDimensions;
	}

	public double getmWeight() {
		return mWeight;
	}

	public int getmQuantity() {
		return mQuantity;
	}
	
	public double volume() {
		double volume = 1;
		if (mQuantity == 0) {
			return 0;
		} else if (mQuantity < 0) {
			throw new IllegalArgumentException("Quantity cannot be negative.");
		} else {
			if (mShape.equals("Cubic")) {
				volume = mDimensions[0] * mDimensions[0] * mDimensions[0];
				return volume * mQuantity;
			}else if(mShape.equals("Rectangle")) {
				for (int i = 0; i < 3; i++) {
					volume *= mDimensions[i];
				}
				return volume * mQuantity;
			}else if (mShape.equals("Cylinder")) {
				double radius = mDimensions[0];
				double height = mDimensions[1];
				return Math.PI * radius * radius * height * mQuantity;
			}else if (mShape.equals("Pentagon")) {
				double radius = mDimensions[0];
				double length = mDimensions[1];
				double height = mDimensions[2];
				return (5 * length * radius / 2) * height * mQuantity;
			}else {
				throw new IllegalArgumentException("Incorrect shape of item.");
			}
		}
	}
	
}
