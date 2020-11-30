package com.tia.human;

public class HumanTest {

	public static void main(String[] args) {
		
		Human Tia = new Human();
		Human Enemy = new Human();
		Wizard Geoffrey = new Wizard();
		Ninja Travis = new Ninja();
		Samurai Bunnie = new Samurai();
		
		
		
		Tia.getHealth();
		Geoffrey.getHealth();
		Travis.getHealth();
		Bunnie.getHealth();
		
		Enemy.Attack(Tia);
		Tia.getHealth();
		
		Geoffrey.Heal(Tia);
		Tia.getHealth();
		
		Geoffrey.Fireball(Enemy);
		Enemy.getHealth();
		
		Travis.Steal(Tia);
		Tia.getHealth();
		
		Travis.Run(Travis);
		Travis.getHealth();
		
		Bunnie.getHealth();
		
		Bunnie.deathBlow(Geoffrey);
		Bunnie.getHealth();
		
		Bunnie.meditate(Tia);
		Bunnie.getHealth();	
		Tia.getHealth();

	}

}
