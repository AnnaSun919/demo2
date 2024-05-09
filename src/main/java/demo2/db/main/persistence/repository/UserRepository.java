package demo2.db.main.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import demo2.db.main.persistence.domain.UserDAO;

public interface UserRepository extends JpaRepository<UserDAO, Integer> {
	
	
}