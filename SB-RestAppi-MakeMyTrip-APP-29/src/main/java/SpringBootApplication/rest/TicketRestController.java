package SpringBootApplication.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringBootApplication.request.PassengerRequest;
import SpringBootApplication.response.TicketResponse;
import SpringBootApplication.service.TicketService;

@RestController
public class TicketRestController {
	@Autowired
 private TicketService ticketService;
	@PostMapping("/book")
	public TicketResponse bookTicket(@RequestBody PassengerRequest request) {
		return ticketService.initiateBookProcess(request);
		
	}
}
