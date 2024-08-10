package SpringBootApplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import SpringBootApplication.bindings.Flight;
import SpringBootApplication.bindings.Flights;

//import SpringBootApplication.response.QuoteApiResponse;
@Service
public class FlightService {
//
////	public String invokeFlightService() {
////		
////		
////
////		String apiUrl="https://momzr.com/search/Debasish-debnath-sex-vedio/";
////		RestTemplate r=new RestTemplate();
////		ResponseEntity<String >responseEntity=r.getForEntity(apiUrl, String.class);
////		String body=responseEntity.getBody();
////		
////		return body;
////	}
public Flights invokeFlightAPI() {
		
		

		String apiUrl="https://momzr.com/search/Debasish-debnath-sex-vedio/";
		RestTemplate r=new RestTemplate();
		ResponseEntity<Flights>responseEntity=r.getForEntity(apiUrl, Flights.class);
Flights body=responseEntity.getBody();
		//List<Flight>flights=body.getFlights();
		
		//flights.forEach(flight -> System.out.println(flights));
		return body;
	}
}
