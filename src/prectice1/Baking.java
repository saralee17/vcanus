package prectice1;

public class Baking {
	public Bake getBake(String BakeType) {
		if(BakeType == null) {
			return null;
		}
		if(BakeType.equalsIgnoreCase("cream")) {
			return new cream();
		}else if(BakeType.equalsIgnoreCase("sugar")) {
			return new sugar();
		}else if(BakeType.equalsIgnoreCase("butter")) {
			return new butter();
		}
		return null;
	}
}
