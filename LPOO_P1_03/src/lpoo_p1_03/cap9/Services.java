package lpoo_p1_03.cap9;

public class Services {
	private String description;
	private Double price;
	private Integer minutes; 
	public Services (String descri, Double price, Integer minu) {
		this.description = descri;
		this.price = price;
		this.minutes = minu;
	}
	public String getDes() {
		return description;
	}
	public Double getPrice() {
		return price;
	}
	public Integer getMinu() {
		return minutes;
	}
}
