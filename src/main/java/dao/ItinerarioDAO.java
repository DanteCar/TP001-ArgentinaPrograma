package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jdbc.ConnectionProvider;
import model.Usuario;

public class ItinerarioDAO {
	//insert
	public int insert (Usuario usuario) throws SQLException{
		String sql = "INSERT INTO itinerarios (idUsuario, promocionesCompradas, atraccionesCompradas, costoTotal, tiempoTotal)"
				   + "VALUES (?, ?, ?, ?, ?)";
		Connection conn = ConnectionProvider.getConnection();
		
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, usuario.getId());
		//statement.setInt(2, usuario.getPromosCompradas());
		//statement.setInt(3, usuario.getAtraccionesCompradas());
		statement.setInt(4, usuario.getCostoFinal());
		statement.setInt(5, usuario.getTiempoFinal());
		
		int rows = statement.executeUpdate();
		
		return rows;
	}
	//update
	/*
	public int update(User user) throws SQLException{
		String sql = "UPDATE USERS SET PASSWORD = ? WHERE USER = ?";
		Connection conn = ConnectionProvider.getConnection();
		
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, user.getPassword());
		statement.setInt(2, user.getUser());
		int rows = statement.executeUpdate();
		
		return rows;
	}
	*/
}