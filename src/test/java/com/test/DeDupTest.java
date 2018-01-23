package com.test;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DeDupTest {
    int[] arr = {1, 2, 1, 4, 3, 5, 2, 5, -2, -3};
    private DeDup deDup;

    @Before
    public void setUp(){
        deDup=new DeDup();
    }

    @Test
    public void removeDuplicateInOriginalOrder() {
        int result[]=deDup.removeDuplicateInOriginalOrder(arr);
        int expected[]={1, 2, 4, 3, 5 ,-2 ,-3};
        assertArrayEquals(result, expected);
    }

    @Test
    public void removeDuplicateAvoidNegative() {

        int result[]=deDup.removeDuplicateAvoidNegative(arr);
        int expected1[]={1,2,4,3,5};
        assertArrayEquals(result, expected1);
    }

    @Test
    public void removeDuplicateInSortedOrder() {

        int result[]=deDup.removeDuplicateInSortedOrder(arr);
        int expected[]={-3,-2,1,2,3,4,5};
        assertArrayEquals(result, expected);
    }
}