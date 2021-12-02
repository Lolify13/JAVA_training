package dem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dem.entity.Users;

public interface UserRepo extends JpaRepository<Users, Long>{
	
}
