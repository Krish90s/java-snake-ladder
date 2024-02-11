package org.example;

import org.example.entities.Ladder;
import org.example.entities.Player;
import org.example.entities.Snake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter no of snakes");
		int noOfSnakes = scanner.nextInt();
		
		List<Snake> snakes = new ArrayList<Snake>();
		for (int i = 0;i < noOfSnakes; i++){
			snakes.add(new Snake(scanner.nextInt(), scanner.nextInt()));
		}
		
		
		System.out.println("enter no of ladders");
		int noOfLadders = scanner.nextInt();

		List<Ladder> ladders = new ArrayList<Ladder>();
		for (int i = 0; i < noOfLadders; i++) {
			ladders.add(new Ladder(scanner.nextInt(), scanner.nextInt()));
		}

		System.out.println("enter no of players");
		int noOfPlayers = scanner.nextInt();

		List<Player> players = new ArrayList<Player>();
		for (int i = 0; i < noOfPlayers; i++) {
			players.add(new Player(scanner.next()));
		}

	
	}
}