package dem.controller;

import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.COUNT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		usersHTML +=	"<table class=\"table table-dark table-striped\" style = \"width:800px\"><tr><th>User ID</th><th>Username</th><th>Password</th>"
				+ "<th>Number of Accounts</th><th>List of Accounts</th><th>Total Balance</th><th>Contact</th><th>Created At</th><th>Updated At</th></tr>";
		for(Users users : userList) {
			usersHTML +=	 "<tr><td>"+users.getUserid()+ "</td><td>" + users.getUsername() + "</td><td>"  + users.getPassword() + "</td><td>"
					+ users.getNumofaccounts() + "</td><td>"  + users.getListofaccounts() + "</td><td>"  + 
					users.getTotalbal() + "</td><td>" + users.getContact() + "</td><td>"  + users.getCreatedAt() + "</td><td>"  + 
					users.getUpdatedAt() + "</td></tr>" ;
		}
		usersHTML +=	 "</table></body></html>";
		return usersHTML;
	}
	
	// GET ALL THE USERS
		@GetMapping("/users")
		public List<Users> getAllUserss() {
			List<Users> usersList = userRepo.findAll();
			return usersList;
		}
	//  CREATE A NEW USER
		@PostMapping("/users")
		public Users createUsers(@RequestBody Users productFromBrowser) {
			System.out.println("Inserting : " + productFromBrowser);
			Users savedUsers = userRepo.save(productFromBrowser);
			return savedUsers;
		}
	//  UPDATE EXISTING USER
		@PutMapping("/userupdate/{id}")
		public Users updateUsers(@PathVariable(value = "id") Long userid, @RequestBody Users productFromBrowser) {
			System.out.println("Updating : " + productFromBrowser);
//			fetch the product from the database with the id
			Users existingUsers = userRepo.findById(userid).get();
//			update the existing product with the details from the browser

			existingUsers.setUsername(productFromBrowser.getUsername());
		    existingUsers.setPassword(productFromBrowser.getPassword());
			existingUsers.setTotalbal(productFromBrowser.getTotalbal());
			existingUsers.setListofaccounts(productFromBrowser.getListofaccounts());
			existingUsers.setTotalbal(productFromBrowser.getTotalbal());
			existingUsers.setContact(productFromBrowser.getContact());
			existingUsers.setUpdatedAt(productFromBrowser.getUpdatedAt());
			existingUsers.setAccnumber(productFromBrowser.getAccnumber());
			existingUsers.setAcctype(productFromBrowser.getAcctype());
			existingUsers.setAccbal(productFromBrowser.getAccbal());
			
//			save the updated details
			Users updatedUsers = userRepo.save(existingUsers);
			return updatedUsers;
		}
		
//		DELETE AN EXISTING PRODUCT
		@DeleteMapping("/deleteuser/{productIdfromBrowser}")
		public void deleteUsers(@PathVariable(value="productIdfromBrowser")Long userid) {
			System.out.println("Deleting : " + userid);
			userRepo.deleteById(userid);
		}
		
		
		
		
		
	}



