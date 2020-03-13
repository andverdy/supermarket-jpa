package it.objectmethod.supermarket.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import it.objectmethod.supermarket.jpa.entity.User;

@Component
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

	String findByUsername(@Param("username") String username);
}
