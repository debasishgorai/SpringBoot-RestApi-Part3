package SpringBootApplication.response;

public class QuoteApiResponse {
private String type;
private Value value;
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "QuoteApiResponse [type=" + type + ", value=" + value + "]";
}
public Value getValue() {
	return value;
}
public void setValue(Value value) {
	this.value = value;
}
}
