package dem.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import dem.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}
