package com.abhishek.JUnitComplexExample;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class AppTest {

	@Test
	public void findDuplicatesUsingSetTest() {
		List<String> names = Arrays.asList("Alice", "Bob", "John", "Alice", "Mark", "John");
		Set<String> duplicates = App.findDuplicatesUsingSet(names);

		Assert.assertEquals(Set.of("Alice", "John"), duplicates);
	}

	@Test
	@Ignore
	public void findDuplicatesUsingGroupingTest() {
		List<String> names = Arrays.asList("Alice", "Bob", "John", "Alice", "Mark", "John");
		Set<String> duplicates = App.findDuplicatesUsingGrouping(names);

		Assert.assertEquals(Set.of("Alice", "John"), duplicates);
	}

	@Test
	public void noDuplicatesTest() {
		List<String> names = Arrays.asList("Alice", "Bob", "Mark");
		
		Assert.assertTrue(App.findDuplicatesUsingSet(names).isEmpty());
		Assert.assertTrue(App.findDuplicatesUsingGrouping(names).isEmpty());
	}
	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
	    int result = 10 / 0;
	}

}
