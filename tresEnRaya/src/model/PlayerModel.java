package model;

import java.util.UUID;

public class PlayerModel {

	private UUID id;
	private int score;
	private String name;
	
	PlayerModel(String name, int score) {
		
		this.id = UUID.randomUUID();
		this.score = score;
		this.name = name;
	}
}