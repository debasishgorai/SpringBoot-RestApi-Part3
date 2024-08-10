package SpringBootApplication.service;

import org.springframework.web.reactive.function.client.WebClient;

public class QuoteService {
public String invokequeotw() {
	
	String url="https://dev.to/";
	WebClient webClient=WebClient.create();
	String block=webClient.get().uri(url).retrieve().bodyToMono(String.class).block();
	
	
	
	return block;
	
}
}
