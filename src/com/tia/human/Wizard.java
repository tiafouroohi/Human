package com.tia.human;

public class Wizard extends Human{
	private int health = 50;
	private int intelligence = 8;
	
	public int getHealth() {
		System.out.println("Wizards current health is " + this.health);
		return this.health;
	}
	
	public int getIntelligence() {
		System.out.println("Wizards intelligence is " + this.intelligence);
		return this.intelligence;
	}
	
	
	public int Heal (Human player) {
		player.health += this.intelligence;
		System.out.println("Your Health is " + player.health);
		return player.health;
	}
	
	public int Fireball(Human player) {
		player.health -= this.health * 3 ;
		System.out.println("Current Health is" + player.health);
		return player.health;
	}
	

}
