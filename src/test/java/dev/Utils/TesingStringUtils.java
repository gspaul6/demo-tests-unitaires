package dev.Utils;

public class TesingStringUtils {

	public static void main(String[] args) throws Exception {

		if (StringUtils.levenshteinDistance("coca", "lola") != 6) {
			throw new Exception("there is something wrong about me");
		} else {
			System.out.println("it is ok");
		}

	}
}
