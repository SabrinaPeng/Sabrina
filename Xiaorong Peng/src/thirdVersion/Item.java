package thirdVersion;

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
			if (mShape.equals("Cubic") || mShape.equals("Rectangle")) {
				for (int i = 0; i < mDimensions.length; i++) {
					volume *= mDimensions[i];
				}
				return volume * mQuantity;
			}else if (mShape.equals("Cylinder")) {
				double radius = mDimensions[0];
				double height = mDimensions[1];
				return Math.PI * (radius / 2) * (radius / 2) * height * mQuantity;
			}else if (mShape.equals("Pentagon")) {
				double length = mDimensions[0];
				double radius = mDimensions[1];
				double height = mDimensions[2];
				return (5 * length * radius / 2) * height * mQuantity;
			}else {
				throw new IllegalArgumentException("Incorrect shape of item.");
			}
		}
	}
	
}
