package SpringBootApplication.response;

public class Value {
private Integer id;
private String quote;
@Override
public String toString() {
	return "Value [id=" + id + ", quote=" + quote + "]";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getQuote() {
	return quote;
}
public void setQuote(String quote) {
	this.quote = quote;
}
}
