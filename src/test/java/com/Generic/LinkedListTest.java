package com.Generic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LinkedListTest {
    LinkedListMain LL = new LinkedListMain();

    @Test
    public void testNewLinkedListBeEmpty() {
        assertTrue(LL.isEmpty());       // linked list should be empty
        Assert.assertEquals(0, LL.length());
    }

}
