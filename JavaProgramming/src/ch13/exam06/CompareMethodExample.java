package ch13.exam06;

public class CompareMethodExample {

	public static void main(String[] args) {
		Pair<String, String>p1 = new Pair <String, String>("name", "È«±æµ¿");
		Pair<String, String> p2 = new Pair <String, String>("name", "±è°¡À»");
		//Util.compare(new pair<String, String>("name", "È«±æµ¿"), new pair<String, String>("name", "±è°¡À»"));
		boolean result = Util.compare(p1, p2);
		System.out.println(result);
		
	}

}
