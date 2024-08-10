package SpringBootApplication.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import SpringBootApplication.request.PassengerRequest;
import SpringBootApplication.response.TicketResponse;

@Service
public class TicketService {
 public TicketResponse initiateBookProcess(PassengerRequest requestdata) {
String apiUrl = "http://localhost:9090/bookticket";
RestTemplate r=new RestTemplate();
ResponseEntity <TicketResponse >postForEntity=r.postForEntity(apiUrl,requestdata, TicketResponse.class);
TicketResponse body=postForEntity.getBody();

return body;

	 
 }
}
