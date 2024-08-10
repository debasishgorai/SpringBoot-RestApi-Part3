package SpringBootApplication.contr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import SpringBootApplication.service.QuoteService;

public class QouteController {
@Autowired
	private QuoteService quoteService;
@GetMapping("/random")
public String random() {
	return quoteService.invokequeotw();
}

}
