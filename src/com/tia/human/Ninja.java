package com.tia.human;

public class Ninja extends Human {
	private int stealth = 10;
	
	public int Steal(Human player) {
		player.health -= this.stealth; 
		System.out.println("Players Health is" + this.health);
		return this.health;
	}
	
	public int Run(Human player) {
		this.health -= 10;
		System.out.println("Current Health is" + this.health);
		return this.health;
	}

}
