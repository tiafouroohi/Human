package com.tia.human;

public class Samurai extends Human{
	public int health;
	
	static int numberOfSamurai = 0;
	
	public Samurai() {
		super.health = 200;
	}
	
	public int deathBlow(Human player) {
		super.health -= super.health * 2;
		System.out.println("THIS PLAYER IS NOW DEAD!");
		return super.health;
		
	}
	
	public int meditate(Human Player) {
		super.health += super.health *2;
		return super.health;
	}
	
	public static int getNumberOfSamurai() {
		return numberOfSamurai;
	}
	
	public static void setNumberOfSamurai(int numberOfSamurai) {
		Samurai.numberOfSamurai = numberOfSamurai;
	}

}