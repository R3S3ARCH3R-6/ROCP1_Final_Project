package com.app.daos;

import java.util.List;
import com.app.exception.BusinessException;
import com.app.models.User;

public interface UserDAO {
	public int addUser(User user) throws BusinessException;
	
}
