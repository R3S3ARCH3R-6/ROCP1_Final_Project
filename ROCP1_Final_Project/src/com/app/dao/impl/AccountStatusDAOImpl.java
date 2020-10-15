package com.app.dao.impl;

import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.dao.AccountStatusDAO;
import com.app.dao.dbutils.MySqlConnection;
import com.app.exception.BusinessException;
import com.app.models.Account;
import com.app.models.AccountStatus;

public class AccountStatusDAOImpl implements AccountStatusDAO {

	@Override
	public boolean isValidAccountStatus(AccountStatus status) throws BusinessException{
		boolean b = false;
		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "select status from bank where role=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, role.getRole());
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				b=true;
			}else {
				throw new BusinessException("Invalid Account Status");
			}
			
		}catch(ClassNotFoundException | SQLException e){
			System.out.println(e); //this line you should take it off before going live(production)
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN.....");
		}
		return b;
	}

}
