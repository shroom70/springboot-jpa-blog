package com.sam.blog.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.blog.model.RoleType;
import com.sam.blog.model.User;
import com.sam.blog.repository.UserRepository;

@RestController
public class DummyTestController {
	
	@Autowired
	private UserRepository userRepository;
	
//	@PostMapping("/dummy/join")
//	public String dummyJoin(String username, String password, String email) {
//		System.out.println("username : " + username);
//		System.out.println("password : " + password);
//		System.out.println("email : " + email);
//		return "회원가입이 완료되었습니다.";
//	}
	
	@PostMapping("/dummy/join")
	public String dummyJoin(User user) {
		System.out.println("username : " + user.getUsername());
		System.out.println("password : " + user.getPassword());
		System.out.println("email : " + user.getEmail());
		
		user.setRole(RoleType.USER);
		userRepository.save(user);
		return "회원가입이 완료되었습니다.";
	}
}
