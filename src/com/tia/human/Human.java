package com.tia.human;

public class Human {
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	public int health = 100; 
	
	public void Attack (Human enemy) {
		enemy.health -= this.strength;
	}
	
	public int getStrength() {
		System.out.println("Current Strength is " + this.strength);
		return this.strength;
		
	}
	
	public int getStealth() {
		System.out.println("Current Stealth level is " + this.stealth);
		return this.stealth;
		
	}
	
	public int getIntelligence() {
		System.out.println("Current Intelligence is" + this.intelligence);
		return this.intelligence;
	}
	
	public int getHealth() {
		System.out.println("Current Health is " + this.health);
		return this.health;
	}
}
