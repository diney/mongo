package com.diney.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diney.workshopmongo.domain.User;
import com.diney.workshopmongo.repository.UserRepository;




@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	

	public User insert(User obj) {
		return repo.insert(obj);
	}

	

}
