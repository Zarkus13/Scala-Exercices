package com.always.geek.arraysorter

import util.Random

/**
 * Created with IntelliJ IDEA.
 * User: Alexis
 * Date: 05/02/13
 * Time: 00:23
 * To change this template use File | Settings | File Templates.
 */
object ArraySorter {

    val arrayLength: Int = 10

    def main(args: Array[String]) {
        val rand: Random = new Random;
        val array: Array[Int] = new Array[Int](arrayLength)

        for (i <- 0 to arrayLength - 1) {
            array(i) = rand.nextInt(100)
        }
    }

    def bubbleSort(array: Array[Int]): Array[Int] = {
        array.foreach()
        array.map
    }

    def selectionSort(array: Array[Int]): Array[Int] = {
        array
    }

    def insertionSort(array: Array[Int]): Array[Int] = {
        array
    }

    def displayArray(array: Array[Int]): Unit = {
        array.foreach(i => print(i + " "))
        println()
    }
}
