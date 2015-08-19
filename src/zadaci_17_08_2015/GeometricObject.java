package zadaci_17_08_2015;

import java.util.Date;

public class GeometricObject {

	private String color = "white";
	boolean isFilled = false;
	private java.util.Date dateCreated;

	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	 public Date getDate() {
	 return dateCreated;
	 }
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}


}
