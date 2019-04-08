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
		Boolean test1 = (StringUtils.levenshteinDistance("hotel", "timothy") != 2);
		Assert.assertTrue(test1);
	}

	@Test
	public void testWithbothValuetrue() {
		StringUtils smallString = new StringUtils();
		Boolean test1 = (smallString.levenshteinDistance("chat", "cats") != 1);
		Assert.assertEquals(true, test1);
	}

}
