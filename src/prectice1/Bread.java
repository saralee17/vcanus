package prectice1;

public class Bread {

	public static void main(String[] args) {
		Baking baking = new Baking();
		
		Bake bake1 = baking.getBake("cream");
		
		bake1.baking();
		
		Bake bake2 = baking.getBake("sugar");
		
		bake2.baking();
		
		Bake bake3 = baking.getBake("butter");

		bake3.baking();
	}

}
