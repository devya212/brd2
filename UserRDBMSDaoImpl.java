package com.nucleus.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

import com.nucleus.connection.ConnectionClass;
import com.nucleus.model.User;

public class UserRDBMSDaoImpl implements IUserDao {

	ConnectionClass con1=new ConnectionClass();
	Connection con=con1.getDbConnection();

	public boolean validLogin(User user) {
		String a=null,b=null,c=null;
		try {
			
			PreparedStatement pstmt=con.prepareStatement("select userid,pwd,role1 from userbank01 where userid=?");
			pstmt.setString(1, user.getUserId());
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				a=rs.getString(1);
				b=rs.getString(2);
				c=rs.getString(3);
			}
			
			
		} catch (SQLException e) {
		   
			e.printStackTrace();
			  return false;
		}
		if(user.getUserId().equals(a) && user.getPassword().equals(b) && user.getRole().equals(c))
			return true;
			else
				return false;
		
	}
}
