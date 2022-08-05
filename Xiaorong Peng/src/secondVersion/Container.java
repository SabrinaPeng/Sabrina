package secondVersion;

public class Container {
	
	private String mSize;
	private final double mHeight = 2.59;
	private final double mWidth = 2.43;
	private double mLength;
	private int mPrice;
	
	public Container(String size) {
		mSize = size;
		if (mSize == "big") {
			mLength = 12.01;
			mPrice = 1800;
		}else if (mSize == "small") {
			mLength = 6.06;
			mPrice = 1200;
		}
	}

	public int getmPrice() {
		return mPrice;
	}

	public String getmSize() {
		return mSize;
	}

	public double getmLength() {
		return mLength;
	}

	public double getmHeight() {
		return mHeight;
	}

	public double getmWidth() {
		return mWidth;
	}

	public double volume() {
		if (mSize == "big") {
			return mHeight * mWidth * mLength;
		}else if (mSize == "small") {
			return mHeight * mWidth * mLength;
		}else {
			System.out.println("Error");
			return 0;
		}
	}
	
}
