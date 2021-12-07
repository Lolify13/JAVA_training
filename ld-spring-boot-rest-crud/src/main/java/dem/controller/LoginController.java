package dem.controller;



import java.util.List;


import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dem.entity.Login;

import dem.repository.LoginRepository;
@RestController
@RequestMapping("/login")
public class LoginController {
	@Autowired
	LoginRepository loginRepository;
	
	@GetMapping("/users")
	public List<Login> getAllUserss() {
		List<Login> usersList = loginRepository.findAll();
		return usersList;
	}
	@PostMapping("/create")
	public Login createUsers(@RequestBody Login productFromBrowser) {
		System.out.println("Inserting : " + productFromBrowser);
		Login savedUsers = loginRepository.save(productFromBrowser);
		return savedUsers;
	}
	

	@GetMapping("/validation")
	public ResponseEntity<Login> loginValidation(@RequestBody Login loginListBrowser ) {

		try {

			String userNameString = loginListBrowser.getUsername();
			String passString = loginListBrowser.getPassword();

			List<Login> loginLists = loginRepository.findAll();

			for (Login u : loginLists) {

				String userNameFoundString = u.getUsername().toString();

				if (userNameFoundString.equals(userNameString)) {


					Login userIdFoundLong = loginRepository.findById(u.getUserid()).get();
					String passwordFoundString = userIdFoundLong.getPassword().toString();

					if (passwordFoundString.equals(passString)) {

						System.out.println("Login success!");
						return null;

					} else {
						System.out.println("Incorrect password. ");
						return null;
					}

				}

			}

			return null;

		} catch (Exception e) {

			if (e instanceof EntityNotFoundException) {
				System.out.println("Record not found." );

			}
			return null;
		}

	}
		
		

	

	

	}
