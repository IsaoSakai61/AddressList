package com.example.address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{
	public User findById(int id);
	public void deleteById(int id);
}
