import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		/*the method must return a list with the Strings that, 
		 * in addition to containing the letter 'o', also 
		 * have more than 5 letters. Print the result.*/
		Main stringFilter = new Main();
		List<String> filterStrings = stringFilter.filterStringsHavingLetterOAndLengthGreaterThanFive();
		System.out.println(filterStrings);
	}

	private ArrayList<String> strings;

	public Main() {
	    strings = new ArrayList<String>();
		strings.add("Oklahoma");
		strings.add("Lola");
		strings.add("hometown");
		strings.add("lampda");
		strings.add("popcorn");

	}
	
	public List<String> filterStringsHavingLetterOAndLengthGreaterThanFive() {
		return strings.stream().filter(word -> word.contains("o") && word.length() > 5)
				.collect(Collectors.toList());
	}
}
