package com.player.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.player.util.Utility;

public class DaoImpl {
	
	Connection con;
	Utility util= new Utility();
	
	public void insert(int country_id,String country_name){
		con=util.openConnection();
		String query="insert into country values(?,?)";
		try {
			PreparedStatement ps= con.prepareStatement(query);
			ps.setInt(1, country_id);
			ps.setString(2, country_name);
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void insert1(int player_id,int country_id,String player_name,int runs_made,int wickets_taken){
		con=util.openConnection();
		String query="insert into player values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps= con.prepareStatement(query);
			ps.setInt(1, player_id);
			ps.setInt(2,country_id );
			ps.setString(3,player_name);
			ps.setInt(4,runs_made );
			ps.setInt(5,wickets_taken );
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void select(){
		con=util.openConnection();
		String query="select player_name,runs_made,wickets_taken from player where runs_made >=100 AND wickets_taken >=20";
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getString(1) + " " + rs.getInt(2) + " " + rs.getInt(3));
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
		
	public void delete(){
		con=util.openConnection();
		String query="delete from country where country_id=5 ";
		try {
			Statement stmt=con.createStatement();
			stmt.execute(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void update(){
		con=util.openConnection();
		String query="update player set runs_made=100 where wickets_taken>=20 ";
		try {
			Statement stmt=con.createStatement();
			stmt.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}


