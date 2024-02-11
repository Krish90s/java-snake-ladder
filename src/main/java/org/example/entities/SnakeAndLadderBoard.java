package org.example.entities;

import java.util.List;
import java.util.Map;

public class SnakeAndLadderBoard {
	private int size;
	private List<Snake> snakes;
	private List<Ladder> ladders;
	private Map<String, Integer> playerPieces;
	
	
	public SnakeAndLadderBoard(int size, List<Snake> snakes, List<Ladder> ladders, Map<String, Integer> playerPieces) {
		this.size = size;
		this.snakes = snakes;
		this.ladders = ladders;
		this.playerPieces = playerPieces;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public List<Snake> getSnakes() {
		return snakes;
	}
	
	public void setSnakes(List<Snake> snakes) {
		this.snakes = snakes;
	}
	
	public List<Ladder> getLadders() {
		return ladders;
	}
	
	public void setLadders(List<Ladder> ladders) {
		this.ladders = ladders;
	}
	
	public Map<String, Integer> getPlayerPieces() {
		return playerPieces;
	}
	
	public void setPlayerPieces(Map<String, Integer> playerPieces) {
		this.playerPieces = playerPieces;
	}
}
