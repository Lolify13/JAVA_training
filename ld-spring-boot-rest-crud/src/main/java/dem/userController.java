package dem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class userController {
	@GetMapping("/welcome")
	protected String welcome() {
		System.out.println("Welcome");
		return "Welcome";
	}

}
