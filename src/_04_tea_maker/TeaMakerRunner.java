package _04_tea_maker;

public class TeaMakerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kettle water = new Kettle();
		TeaBag flavor = new TeaBag("GREEN");
		Cup cup = new Cup();
		
		System.out.println(flavor.getFlavor());
		System.out.println(water.getWater());
		water.boil();
		cup.makeTea(flavor, water.getWater());
		
	}

}
