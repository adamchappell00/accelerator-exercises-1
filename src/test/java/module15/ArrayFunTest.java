package module15;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayFunTest {

    ArrayFun fun;
    List<List<Integer>> allTheLists;
    List<Integer> nums1;
    List<Integer> nums2;
    List<Integer> nums3;
    List<Integer> expected;

    @Before
    public void setUp(){
        fun = new ArrayFun();
        allTheLists = new ArrayList<>();
        nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums2 = new ArrayList<>();
        nums2.add(4);
        nums2.add(2);
        nums2.add(5);
        nums2.add(7);
        nums3 = new ArrayList<>();
        nums3.add(7);
        nums3.add(7);
        nums3.add(7);
        allTheLists.add(nums1);
        allTheLists.add(nums2);
        allTheLists.add(nums3);
        expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(7);
    }

    // Happy Path
    @Test
    public void shouldAverageArraysInArray(){
        assertEquals(expected, fun.arrayFun(allTheLists));
    }
    // Edge Case - Sad Path


    // Exception Test - Should throw IllegalArgumentException if any nums are negative
    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfNumberIsNegative(){
        nums1.add(-5);
        fun.arrayFun(allTheLists);
    }

}