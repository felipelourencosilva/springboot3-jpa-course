package com.felipelourenco.course.repositories;

import com.felipelourenco.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
