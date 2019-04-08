package dev.Utils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

	@Test(expected = NullPointerException.class)
	public void testWithNullValue() {
		StringUtils smallString = new StringUtils();
		Boolean test1 = (smallString.levenshteinDistance(null, null) != 2);

	}

	@Test
	public void testWithoneValuetrue() {
		StringUtils smallString = new StringUtils();
		Boolean test1 = (smallString.levenshteinDistance("hotel", "timothy") != 1);
		Assert.assertEquals(true, test1);
	}

	@Test
	public void testWithbothValuetrue() {
		StringUtils smallString = new StringUtils();
		Boolean test1 = (smallString.levenshteinDistance("chat", "cats") != 1);
		Assert.assertEquals(true, test1);
	}

}
