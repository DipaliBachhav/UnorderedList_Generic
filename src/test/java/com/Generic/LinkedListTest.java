package com.Generic;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {
    LinkedListMain LL = new LinkedListMain();

    @Test
    public void testNewLinkedListBeEmpty() {
        assertTrue(LL.isEmpty());       // linked list should be empty
        Assert.assertEquals(0, LL.length());
    }
    @Test
    public void testLinkedList_ShouldNotBeEmpty() {
        LL.add("A");
        LL.add("B");
        LL.add("C");
        assertFalse(LL.isEmpty());
        Assert.assertEquals(3, LL.length());
    }


}
