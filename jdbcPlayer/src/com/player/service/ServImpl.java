package com.player.service;

import com.player.dao.DaoImpl;

public class ServImpl {
	
	DaoImpl dao= new DaoImpl();
 public void insertData(int country_id,String country_name){
	 dao.insert(country_id, country_name);
	 }
 public void insertData1(int player_id,int country_id,String player_name,int runs_made,int wickets_taken){
	 dao.insert1(player_id, country_id, player_name, runs_made, wickets_taken);
	 
 }
 
 public void selectData(){
	 dao.select();
 }
 
 public void deleteData(){
	 dao.delete();
 }
 
 public void updateData(){
	 dao.update();
 }
}
