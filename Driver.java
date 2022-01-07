/*
TNPG: Java Coffee - Courtney Huang, Jason Yang, Yuki Feng
APCS period 7
Lab04: Never Fear, Big O is Here!
2022 01 07
*/

/*
DISCO:

QCC:
Is using passes a good comparison? Wouldn't it be better to count how many swaps it takes?
*/

import java.util.ArrayList;

public class Driver {

  // ~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  // precond: lo < hi && size > 0
  // postcond: returns an ArrayList of random integers
  // from lo to hi, inclusive
  public static ArrayList populate(int size, int lo, int hi) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while (size > 0) {
      // offset + rand int on interval [lo,hi]
      retAL.add(lo + (int) ((hi - lo + 1) * Math.random()));
      size--;
    } //end while loop
    return retAL;
  } //end populate

  // randomly rearrange elements of an ArrayList
  public static void shuffle(ArrayList al) {
    int randomIndex;
    for (int i = al.size() - 1; i > 0; i--) {
      // pick an index at random
      randomIndex = (int) ((i + 1) * Math.random());
      // swap the values at position i and randomIndex
      al.set(i, al.set(randomIndex, al.get(i)));
    } //end for loop
  } //end shuffle


  public static void main(String[] args) {
    System.out.println("\n*** Testing sort-in-place (void) version... *** ");
    Sorts a = new Sorts();

    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    glen.add(9);

    System.out.println("\nBUBBLE!");

    System.out.println("\nArrayList glen before sorting:\n" + glen);
    a.bubble(glen);
    System.out.println("\nArrayList glen after sorting:\n" + glen);

    System.out.println("\nBubble passes: " + a.counter);

    a.counter = 0;
    // System.out.println("\nSELECTION!");
    // a.counter = 0;
    // shuffle(glen);
    // a.selection(glen);
    // System.out.println("\nSelection passes: " + a.counter);
    //
    // System.out.println("\nINSERTION!");
    // a.counter = 0;
    // shuffle(glen);
    // a.insertion(glen);
    // System.out.println("\nInsertion passes: " + a.counter);

    // ArrayList coco = populate(10, 1, 1000);
    // System.out.println("\nArrayList coco before sorting:\n" + coco);
    // a.insertion(coco);
    // System.out.println("\nArrayList coco after sorting:\n" + coco"\nPasses: " + a.counter);

    ArrayList zhoumama = new ArrayList<Integer>();
    zhoumama.add(10);
    zhoumama.add(9);
    zhoumama.add(8);
    zhoumama.add(7);
    zhoumama.add(6);

    System.out.println("\nBUBBLE!");

    System.out.println("\nArrayList glen before sorting:\n" + zhoumama);

    //long bubbefore = (System.currentTimeMillis());
    a.bubble(zhoumama);
    //long bubafter = (System.currentTimeMillis());

    System.out.println("\nArrayList glen after sorting:\n" + zhoumama);

    System.out.println("\nBubble passes: " + a.counter);
    //System.out.println ("Time: " + (bubafter-bubbefore));

    // System.out.println("\nSELECTION!");
    // a.counter = 0;
    // shuffle(zhoumama);
    // a.selection(zhoumama);
    // System.out.println("\nSelection passes: " + a.counter);
    //
    // System.out.println("\nINSERTION!");
    // a.counter = 0;
    // shuffle(zhoumama);
    // a.insertion(zhoumama);
    // System.out.println("\nInsertion passes: " + a.counter);
  } //end main

} //end class
