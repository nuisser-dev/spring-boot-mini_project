package com.amine.demo.users.service;
import com.amine.demo.entities.*;
public interface UserService {
	
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);


}
