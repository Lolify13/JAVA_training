package dem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dem.entity.Users;
import dem.repository.UserRepo;

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
	
	@GetMapping("/UserHTML")
	protected String getAllUsersAsHTML()  {
		List<Users> userList = userRepo.findAll();
		String usersHTML = "<html><head><title>Display USERS !!!</title>"
				+ "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n" + 
				"    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n" + 
				"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n" + 
				"    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script></head><body><h1>User List</h1>";
		usersHTML +=	"<table class=\"table table-dark table-striped\" style = \"width:500px\"><tr><th>User ID</th><th>Username</th><th>Password</th></tr>";
		for(Users users : userList) {
			usersHTML +=	 "<tr><td>"+users.getUserid()+ "</td><td>" + users.getUsername() + "</td><td>" + users.getPassword() + "</td></tr>";
		}
		usersHTML +=	 "</table></body></html>";
		return usersHTML;
	}
	@GetMapping("/users")
	public List<Users> getAllUsers(){
		List<Users> userList = userRepo.findAll();
		return userList;
		
	}

}
