package com.dalcombee.sh.web;

import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.Sets;

public class JavaBasicTest {

	@Test
	public void testConvertStringLineToSet() {
		Assert.assertThat(convertStringLineToSet("1,  2, 3"), is(Sets.newHashSet(1L, 2L, 3L)));
		Assert.assertThat(convertStringLineToSet("1  2 3"), is(Sets.newHashSet(1L, 2L, 3L)));
		Assert.assertThat(convertStringLineToSet("1\r\n2\r\n3  "), is(Sets.newHashSet(1L, 2L, 3L)));
	}

	private Set<Long> convertStringLineToSet(String nosLine) {
		return Arrays.stream(nosLine.split("[\r\n\t, ]+"))
			.map(String::trim)
			.map(Long::valueOf)
			.collect(Collectors.toSet());
	}
}