package _02_sea_creature;

import java.awt.print.Printable;

public class SeaCreatureRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeaCreature creature = new SeaCreature("Spongebob");
		SeaCreature creaturee = new SeaCreature("Patrick");
		SeaCreature creatureee = new SeaCreature("Squidward");
		
		creature.eat();
		creature.laugh();
		
		System.out.println(creaturee.getName());
		creaturee.eat();
		creaturee.laugh();
		
		System.out.println(creatureee.getName());
		creatureee.eat();
		creatureee.laugh();
	}

}
