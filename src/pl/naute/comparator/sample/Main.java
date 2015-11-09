package pl.naute.comparator.sample;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		String [] names = {"Ala", "Katarzyna", "Basia", "Aleksandra"};
		
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, (String first, String second) -> second.length() - first.length());
		
		System.out.println(Arrays.toString(names));
		
	}

}
