package SpringBootApplication.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import SpringBootApplication.service.QueoteClient;

public class QuetoRestController {
@Autowired
	private QueoteClient queoteClient;

@GetMapping("/queote")
public String getClient() {
	//String queote=queoteClient.invokerandomQuete();
	String queote=queoteClient.invokerQuete();
	return queote;
}
	
	
}
