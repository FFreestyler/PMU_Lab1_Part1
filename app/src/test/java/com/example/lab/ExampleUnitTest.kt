package com.example.lab

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun minTestFirst() {
        assertEquals(4, MinMaxClass.getMin(4,5));
    }
    @Test
    fun minTestSecond() {
        assertEquals(19, MinMaxClass.getMin(20,19));
    }
    @Test
    fun minTestThird() {
        assertEquals(23, MinMaxClass.getMin(23,50));
    }
    @Test
    fun minTestFourth() {
        assertEquals(8888, MinMaxClass.getMin(8888,8889));
    }
    @Test
    fun maxTestFirst() {
        assertEquals(5, MinMaxClass.getMax(4,5));
    }
    @Test
    fun maxTestSecond() {
        assertEquals(20, MinMaxClass.getMax(20,19));
    }
    @Test
    fun maxTestThird() {
        assertEquals(50, MinMaxClass.getMax(23,50));
    }
    @Test
    fun maxTestFourth() {
        assertEquals(8889, MinMaxClass.getMax(8888,8889));
    }
}