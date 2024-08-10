package SpringBootApplication.response;

public class TicketResponse {
	private String dob;
	private String doj;
	private String from ;
	private String gender ;
	private String name;
	private String to;
	private String train;
	private String status;
	private Double price;
	@Override
	public String toString() {
		return "TicketResponse [dob=" + dob + ", doj=" + doj + ", from=" + from + ", gender=" + gender + ", name="
				+ name + ", to=" + to + ", train=" + train + ", status=" + status + ", price=" + price + "]";
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTrain() {
		return train;
	}
	public void setTrain(String train) {
		this.train = train;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
