package SpringBootApplication.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import SpringBootApplication.response.QuoteApiResponse;

@Service
public class QueoteClient {
//
//	
//	public String  invokerandomQuete() {
//		String apiUrl="https://quoters.apps.pcfone.io/api/random";
//		RestTemplate r=new RestTemplate();
//		ResponseEntity<String>responseEntity=r.getForEntity(apiUrl, String.class);
//		int statuscode=responseEntity.getStatusCodeValue();
//		if(statuscode==200) {
//			String body=responseEntity.getBody();
//			System.out.println(body);
//			return body;
//		}
//		return null;
//	}

	
	public String  invokerQuete() {
		String apiUrl="https://quoters.apps.pcfone.io/api/random";
		RestTemplate r=new RestTemplate();
		ResponseEntity<QuoteApiResponse>responseEntity=r.getForEntity(apiUrl, QuoteApiResponse.class);
		int statuscode=responseEntity.getStatusCodeValue();
		if(statuscode==200) {
			QuoteApiResponse body=responseEntity.getBody();
			System.out.println(body);
			return body.getValue().getQuote().toUpperCase();
		}
		return null;
	}
}
