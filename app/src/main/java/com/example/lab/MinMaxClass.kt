package com.example.lab

class MinMaxClass {
    companion object {
        fun getMin(x: Int, y: Int): Int {
            return if(x < y) x else y;
        }
        fun getMax(x: Int, y: Int): Int {
            return if(x > y) x else y;
        }
    }
}