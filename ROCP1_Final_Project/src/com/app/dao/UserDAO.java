package com.app.dao;

import java.util.List;
import com.app.exception.BusinessException;
import com.app.models.Role;
import com.app.models.User;

public interface UserDAO {
	
	//admin only
	//public List<User> getAllUsers() throws BusinessException;
	
	//employee and Admin functions
	//public List<User> getAllCustomers() throws BusinessException;
	/*public User getUserById(int userId) throws BusinessException;
	public List<User> getCustomersByName(String firstName, String lastName) throws BusinessException;
	public List<User> getUsersByRole(Role role); */
	
	public boolean isValidUser(User user) throws BusinessException;
	
}
