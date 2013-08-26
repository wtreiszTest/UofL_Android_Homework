package com.wesleyreisz.louisville.android.class1.homework1;

import org.junit.*;

public class MyLinkedListTest {

	@Test
	public void test() {
		MyLinkedList list = new MyLinkedList();
		list.add("wes");
		list.add("justin");
		list.add("kim");
		list.add("tyler");
		list.add("leanne");

		Assert.assertEquals("wes justin kim tyler leanne ", list.print());
	}
}
