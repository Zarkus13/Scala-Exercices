package com.always.geek.scala.arraysorter

import util.Random

/**
 * Created with IntelliJ IDEA.
 * User: Alexis
 * Date: 05/02/13
 * Time: 00:23
 * To change this template use File | Settings | File Templates.
 */
object ArraySorter {

    def main(args: Array[String]) {
        val rand: Random = new Random;

        for (i <- 1 to 100) {
            println(rand.nextInt(100))
        }
    }

    def bubbleSort(array: Array[Int]): Array[Int] = {
        array
    }

    def selectionSort(array: Array[Int]): Array[Int] = {
        array
    }

    def insertionSort(array: Array[Int]): Array[Int] = {
        array
    }

    def displayArray(array: Array[Int]): Unit = {

    }
}
