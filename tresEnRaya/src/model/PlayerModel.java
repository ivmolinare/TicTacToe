package model;

import java.util.UUID;

public class PlayerModel {

	private UUID id;
	private int score;
	private String name;
	
	public PlayerModel(String name) {
		
		this.id = UUID.randomUUID();
		this.score = 0;
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UUID getId() {
		return id;
	}
	
}