package roman;

import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import java.util.Map;

public final class RomanNumber extends Number {

	public static final long serialVersionUID = 1L;

	// Table des symboles
	private static final LinkedHashMap<String, Integer> SYMBOLS = new LinkedHashMap<>();
	static {
		SYMBOLS.put("M", 1000);
		SYMBOLS.put("CM", 900);
		SYMBOLS.put("D", 500);
		SYMBOLS.put("CD", 400);
		SYMBOLS.put("C", 100);
		SYMBOLS.put("XC", 90);
		SYMBOLS.put("L", 50);
		SYMBOLS.put("XL", 40);
		SYMBOLS.put("X", 10);
		SYMBOLS.put("IX", 9);
		SYMBOLS.put("V", 5);
		SYMBOLS.put("IV", 4);
		SYMBOLS.put("I", 1);
	}

	// Expression reguliere de validation
	private static final Pattern VALIDATION_RE = Pattern.compile(
			"^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");

	private final int value;

	public RomanNumber(String romanValue) {
		this.value = fromRoman(romanValue);
	}

	public RomanNumber(int value) {
		this.value = value;
	}
	
	
	//Pour les fonctions suivantes (double, float, int, long, nous n'avons pas compris comment les implémenter et surtout à quoi elles servent, du coup nous n'avons pas réussi à les faire
	
	/**
	 * @{inheritDoc}
	 */
	@Override
	public double doubleValue() {
		// TODO
		return 0;
	}

	/**
	 * @{inheritDoc}
	 */
	@Override
	public float floatValue() {
		// TODO
		return 0;
	}

	/**
	 * @{inheritDoc}
	 */
	@Override
	public int intValue() {
		// TODO
		return 0;
	}

	/**
	 * @{inheritDoc}
	 */
	@Override
	public long longValue() {
		// TODO
		return 0;
	}

	@Override
	public String toString() {
		return toRoman(this.value);
	}

	public static RomanNumber valueOf(String roman) {
		return new RomanNumber(roman);
	}

	public static RomanNumber valueOf(int value) {
		return new RomanNumber(value);
	}

	private static int fromRoman(String romanValue) {
		int result = 0;
		int index = 0;
		
		for(Map.Entry<String, Integer> v : SYMBOLS.entrySet()){
			while(romanValue.substring(index, index + v.getKey().length()) == v.getKey()){
				result += v.getValue();
				index += v.getKey().length();
			}
		}
		return result;
		
	}

	private static String toRoman(int value) {
		String result = "";
		
		for(Map.Entry<String, Integer> v : SYMBOLS.entrySet()) {
			while(value >= v.getValue()) {
				result += v.getKey();
				value -= v.getValue();
			}
		}
		return result;
	}
}
