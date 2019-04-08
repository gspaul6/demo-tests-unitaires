package dev.Utils;

public class TesingStringUtils {

	public static void main(String[] args) throws Exception {

		for (int i = 1; i < 10; i++) {
			if (StringUtils.levenshteinDistance("coca", "lola") != i) {
				throw new Exception("the number " + i + " " + "is problematic");
			} else {
				System.out.println("the number " + i + " " + "is ok");
			}
		}
	}
}
