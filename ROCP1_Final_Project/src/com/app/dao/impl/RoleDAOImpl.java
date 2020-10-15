package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.dao.RoleDAO;
import com.app.dao.dbutils.MySqlConnection;
import com.app.exception.BusinessException;
import com.app.models.Role;

public class RoleDAOImpl implements RoleDAO {

	//checks to see if the role exists
	@Override
	public boolean isValidRole(Role role) throws BusinessException {
		boolean b = false;

		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "select role from role where role=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, role.getRole());
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				b=true;
			}else {
				throw new BusinessException("Invalid Role");
			}
			
		}catch(ClassNotFoundException | SQLException e){
			System.out.println(e); //this line you should take it off before going live(production)
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN.....");
		}
		
		return b;
	}

}
