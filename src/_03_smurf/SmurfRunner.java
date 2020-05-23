package _03_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smurf smurf = new Smurf("Handy");
		Smurf smurff = new Smurf("Papa");
		Smurf smurfff = new Smurf("Smurfette");
		
		smurf.eat();
		System.out.println(smurf.getName());
		System.out.println();
		
		System.out.println(smurff.getName());
		smurff.eat();
		System.out.println("My hat color is " + smurff.getHatColor());
		System.out.println("I am a a " + smurff.isGirlOrBoy());
		System.out.println();
		
		System.out.println(smurfff.getName());
		smurfff.eat();
		System.out.println("My hat color is " + smurfff.getHatColor());
		System.out.println("I am a " + smurfff.isGirlOrBoy());
	}

}
