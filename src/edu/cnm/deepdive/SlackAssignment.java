package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Random;

public class SlackAssignment{

  private static final int ARRAY_SIZE = 50;

  private static int[] array1;
  private static int[] array2;

  public static void main(String[] args) {
    initialize();
    print();
    process();
    print();
  }

  private static void initialize() {
    Random rng = new Random();
    array1 = new int[ARRAY_SIZE];
    array2 = new int[ARRAY_SIZE];
    for (int i = 0; i < ARRAY_SIZE; i++) {
      array1[i] = rng.nextInt();
      array2[i] = rng.nextInt();
    }
  }

  private static void process() {
    for (int i = 0; i < ARRAY_SIZE; i++) {
      array1[i] = array1[i] ^ array2[i];
      array2[i] = array1[i] ^ array2[i];
      array1[i] = array1[i] ^ array2[i];
    }
  }

  private static void print() {
    System.out.printf("array1 = %s%n", Arrays.toString(array1));
    System.out.printf("array2 = %s%n", Arrays.toString(array2));
  }

}