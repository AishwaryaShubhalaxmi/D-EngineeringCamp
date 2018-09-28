package com.player.entity;

public class Player {
	private int player_id;
	public Player(int player_id, int country_id, String player_name,
			int runs_made, int wickets_taken) {
		super();
		this.player_id = player_id;
		this.country_id = country_id;
		this.player_name = player_name;
		this.runs_made = runs_made;
		this.wickets_taken = wickets_taken;
	}
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public int getRuns_made() {
		return runs_made;
	}
	public void setRuns_made(int runs_made) {
		this.runs_made = runs_made;
	}
	public int getWickets_taken() {
		return wickets_taken;
	}
	public void setWickets_taken(int wickets_taken) {
		this.wickets_taken = wickets_taken;
	}
	private int country_id;
	private String player_name;
	private int runs_made;
	private int wickets_taken;

}
