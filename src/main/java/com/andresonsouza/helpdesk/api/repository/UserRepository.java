package com.andresonsouza.helpdesk.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andresonsouza.helpdesk.api.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}
