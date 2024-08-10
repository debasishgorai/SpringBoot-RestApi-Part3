package SpringBootApplication.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserRestController {

	@GetMapping(value="/user/{userid}")
	public String getName( @PathVariable Integer userid) {
		if(userid==10) {
			return  "Dhoni";
		}
		else if(userid==45) {
			return "rohit";
	}
		else {
			return "user not found";
		}
		
	}
}
