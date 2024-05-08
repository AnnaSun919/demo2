package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import demo2.User;

public interface UserRepository  extends JpaRepository<User, Long> {

}

