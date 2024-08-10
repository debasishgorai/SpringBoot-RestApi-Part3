package SpringBootApplication.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBootApplication.bindings.Flights;
import SpringBootApplication.service.FlightService;

@RestController
public class FlightRestController {
	@Autowired
        public FlightService flightService;
//	@GetMapping("/flight")
//	public String getflights() {
//		return flightService.invokeFlightService();
//	}
	@GetMapping("/flightss")
	public String getflights() {
	Flights flights= flightService.invokeFlightAPI();
	return "success";
	}
}
