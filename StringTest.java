package ch14;

public class StringTest {

	public static void main(String[] args) {
		System.out.println("concat() test : " + "abc".concat("def"));
		System.out.println("substring() test : " + "substring".substring(3, 9));
		String color = "red, blue, white";
		String arr[] = color.split(",");
		System.out.println("split() test : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		System.out.println("    trim() test :   ".trim());
		System.out.println("toLowerCase() test : ".toLowerCase());
		System.out.println("toUpperCase() test : ".toUpperCase());
		System.out.println("indexOf() test : " + "abcdefghijk".indexOf("def"));
		System.out.println("lastIndexOf() test : "
				+ "abcdefaghijk".lastIndexOf("a"));
		System.out.println("contains() test : " + "on Air".contains("on"));
		System.out.println("replace() test : hello java".replace("java",
				"world"));
		System.out.println("endsWith() test : " + "abcdefg".endsWith("fg"));
		System.out
				.println("startsWith() test : " + "abcdefg".startsWith("abc"));
		System.out.println("compareTo() test : "
				+ "abcdefg".compareTo("abcdefg"));
		System.out.println("equals() test : " + "abc".equals("abc"));
	}

}
