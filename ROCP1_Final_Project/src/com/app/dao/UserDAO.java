package com.app.dao;

import java.util.List;
import com.app.exception.BusinessException;
import com.app.models.Role;
import com.app.models.User;

public interface UserDAO {
	public int addUser(User user) throws BusinessException;
		
	//(Below): work on and change interfaces as needed
	//public int updateUser(int userId) throws BusinessException;
	//public int deleteUser(User user) throws BusinessException;
		//appropriate customers and admin can only use this
	
	//admin only
	public List<User> getAllUsers() throws BusinessException;
	
	//employee and Admin functions
	//public List<User> getAllCustomers() throws BusinessException;
	public User getUserById(int userId) throws BusinessException;
	public List<User> getCustomersByName(String firstName, String lastName) throws BusinessException;
	
	//not sure if needed, probably
	public List<User> getUsersByRole(Role role); 
	//public List<User> getUsersByRole(int role); 
	
	
}
