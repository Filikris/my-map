package ua.pp.kris.mymap;

public class Main {

	public static void main(String[] args) {

		String example = "Я иду по парку, иду один и вижу как по воде пробегает луч солнца";
		String[] array = example.split(" ");

		MyMap<String, Integer> myMap = new MyMap<String, Integer>();

		for (String string : array) {

			if (myMap.containsKey(string)) {
				myMap.put(string, myMap.get(string) + 1);

			} else {
				myMap.put(string, 1);
			}
		}

		System.out.println(myMap);
	}
}
