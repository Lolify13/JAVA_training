package dem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/api")
public class userController {
	@Autowired
	UserRepo userRepo;
	@GetMapping("/welcome")
	protected String welcome() {
		System.out.println("Welcome");
		return "Welcome";
	}
	@GetMapping("/users")
	public List<Users> getAllUsers(){
		List<Users> userList = userRepo.findAll();
		return userList;
		
	}

}
