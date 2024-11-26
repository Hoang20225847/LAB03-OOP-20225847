package src;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int quantity;
private static int nbDigitalVideoDiscs=0; // class attribute
	private int id; // instance attribute
	public DigitalVideoDisc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DigitalVideoDisc() {
		
	}
	public DigitalVideoDisc(String title) {
		this.title = title;
		this.id = ++nbDigitalVideoDiscs; // update class attribute and assign id
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = ++nbDigitalVideoDiscs; // update class attribute and assign id
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length=length;
		this.cost = cost;
		this.id = ++nbDigitalVideoDiscs; // update class attribute and assign id
	}

	public String getTitle() {
		return title;
	}
	
	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	public boolean isMatch(int Id) {
		if(this.id==Id) {
			return true;
		}
		else return false;
	}
	public boolean isMatch(String Title) {
		if(this.title.equals(Title)) {
			return true;
		}
		else return false;
	}
	@Override
	public String toString() {
		return this.id + ". DVD - [" + this.title + "] - [" + this.category + "] - [" 
				+ this.director + "] - [" + this.length + "]: [" + this.cost+ "] $";
	}
}

}
