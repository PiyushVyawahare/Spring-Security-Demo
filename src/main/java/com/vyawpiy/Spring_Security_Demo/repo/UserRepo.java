package com.vyawpiy.Spring_Security_Demo.repo;

import com.vyawpiy.Spring_Security_Demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
