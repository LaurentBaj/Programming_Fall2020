package org.pg4200.ex03;


import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptimizedBubbleSortTest {

    private OptimizedBubbleSort sorter = new OptimizedBubbleSort();
    private class StringComparator implements Comparator<String>{

        @Override
        public int compare(String s1, String s2) {
            return s1.compareTo(s2);
        }
    }

    @Test
    public void testNull() {

        String[] array = {};

        int sortDis = sorter.sort(array, new StringComparator(), false);

        assertEquals(0, sortDis);
    }

    @Test
    public void testInverted() {

        String[] array = {"a", "b", "c", "d"};

        int sortDis = sorter.sort(array, new StringComparator(), false);

        assertEquals(3, sortDis);
        assertEquals("a", array[0]);
        assertEquals("b", array[1]);
        assertEquals("c", array[2]);
        assertEquals("d", array[3]);
    }

    @Test
    public void testBase() {
        String[] array = {"d", "a", "c", "b"};

        sorter.sort(array, new StringComparator(), false);

        assertEquals("a", array[0]);
        assertEquals("b", array[1]);
        assertEquals("c", array[2]);
        assertEquals("d", array[3]);
    }

    @Test
    public void testNearly(){

        String[] array = {"c", "b", "a", "d", "e", "f"};
        int optimized = sorter.sort(array, new StringComparator(), true);

        array = new String[]{"c", "b", "a", "d", "e", "f"};
        int base = sorter.sort(array, new StringComparator(), false);

        assertTrue(optimized < base);
        assertTrue(optimized < base/2);

        assertEquals("a", array[0]);
        assertEquals("b", array[1]);
        assertEquals("c", array[2]);
        assertEquals("d", array[3]);
        assertEquals("e", array[4]);
        assertEquals("f", array[5]);
    }

    @Test
    public void testGame() {

        GameUser a = new GameUser("Laurent", 1);
        GameUser b = new GameUser("Kai", 2);
        GameUser c = new GameUser("Stian", 3);
        GameUser d = new GameUser("Magnus", 4);

        GameUser[] array = new GameUser[]{d, a, b, c};

        int sort = sorter.sort(array, new GameUserComparator(), true);

        assertEquals("Laurent", array[0].getUserId());
        assertEquals("Kai", array[1].getUserId());
        assertEquals("Stian", array[2].getUserId());
        assertEquals("Magnus", array[3].getUserId());
    }
}
