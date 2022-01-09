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
    Sorts b = new Sorts();
    Sorts c = new Sorts();

    System.out.println("\nBUBBLE!");
    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    glen.add(9);
    System.out.println("ArrayList glen before sorting:\n" + glen);
    a.bubble(glen);
    System.out.println("ArrayList glen after sorting:\n" + glen);
    System.out.println("Bubble passes: " + a.counter);
    System.out.println("Bubble swaps: " + a.swaps);
    a.counter = 0;
    a.swaps = 0;

    System.out.println("\nBEST CASE OF BUBBLE!");
    ArrayList jolly = new ArrayList<Integer>();
    jolly.add(1);
    jolly.add(2);
    jolly.add(3);
    jolly.add(4);
    jolly.add(5);
    jolly.add(6);
    System.out.println("ArrayList jolly before sorting:\n" + jolly);
    a.bubble(jolly);
    System.out.println("ArrayList jolly after sorting:\n" + jolly);
    System.out.println("Bubble passes: " + a.counter);
    System.out.println("Bubble swaps: " + a.swaps);
    a.counter = 0;
    a.swaps = 0;

    System.out.println("\nBEST CASE OF BUBBLE!");
    ArrayList bolly = new ArrayList<Integer>();
    bolly.add(6);
    bolly.add(6);
    bolly.add(6);
    bolly.add(6);
    bolly.add(6);
    bolly.add(6);
    System.out.println("ArrayList bolly before sorting:\n" + bolly);
    a.bubble(bolly);
    System.out.println("ArrayList bolly after sorting:\n" + bolly);
    System.out.println("Bubble passes: " + a.counter);
    System.out.println("Bubble swaps: " + a.swaps);
    a.counter = 0;
    a.swaps = 0;

    System.out.println("\nWORST CASE OF BUBBLE!");
    ArrayList zhoumama = new ArrayList<Integer>();
    zhoumama.add(11);
    zhoumama.add(10);
    zhoumama.add(9);
    zhoumama.add(8);
    zhoumama.add(7);
    zhoumama.add(6);
    System.out.println("ArrayList zhoumama before sorting:\n" + zhoumama);
    a.bubble(zhoumama);
    System.out.println("ArrayList zhoumama after sorting:\n" + zhoumama);
    System.out.println("Bubble passes: " + a.counter);
    System.out.println("Bubble swaps: " + a.swaps);
    a.counter = 0;
    a.swaps = 0;



    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");



    System.out.println("\nSELECTION!");
    ArrayList zxl = new ArrayList<Integer>();
    zxl.add(7);
    zxl.add(1);
    zxl.add(5);
    zxl.add(12);
    zxl.add(3);
    zxl.add(9);
    System.out.println("ArrayList zxl before sorting:\n" + zxl);
    b.selection(zxl);
    System.out.println("ArrayList zxl after sorting:\n" + zxl);
    System.out.println("Selection passes: " + b.counter);
    System.out.println("Selection swaps: " + b.swaps);
    b.counter = 0;
    b.swaps = 0;

    System.out.println("\nBEST CASE OF SELECTION!");
    ArrayList tch = new ArrayList<Integer>();
    tch.add(1);
    tch.add(2);
    tch.add(3);
    tch.add(4);
    tch.add(5);
    tch.add(6);
    System.out.println("ArrayList tch before sorting:\n" + tch);
    b.selection(tch);
    System.out.println("ArrayList tch after sorting:\n" + tch);
    System.out.println("Selection passes: " + b.counter);
    System.out.println("Selection swaps: " + b.swaps);
    b.counter = 0;
    b.swaps = 0;

    System.out.println("\nBEST CASE OF SELECTION!");
    ArrayList tyf = new ArrayList<Integer>();
    tyf.add(6);
    tyf.add(6);
    tyf.add(6);
    tyf.add(6);
    tyf.add(6);
    tyf.add(6);
    System.out.println("ArrayList tyf before sorting:\n" + tyf);
    b.selection(tyf);
    System.out.println("ArrayList tyf after sorting:\n" + tyf);
    System.out.println("Selection passes: " + b.counter);
    System.out.println("Selection swaps: " + b.swaps);
    b.counter = 0;
    b.swaps = 0;

    System.out.println("\nWORST CASE OF SELECTION!");
    ArrayList geg = new ArrayList<Integer>();
    geg.add(11);
    geg.add(10);
    geg.add(9);
    geg.add(8);
    geg.add(7);
    geg.add(6);
    System.out.println("ArrayList geg before sorting:\n" + geg);
    b.selection(geg);
    System.out.println("ArrayList geg after sorting:\n" + geg);
    System.out.println("Selection passes: " + b.counter);
    System.out.println("Selection swaps: " + b.swaps);
    b.counter = 0;
    b.swaps = 0;





    // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    //
    //
    //
    // System.out.println("\nINSERTION!");
    // ArrayList tjy = new ArrayList<Integer>();
    // tjy.add(7);
    // tjy.add(1);
    // tjy.add(5);
    // tjy.add(12);
    // tjy.add(3);
    // tjy.add(9);
    // System.out.println("ArrayList tjy before sorting:\n" + tjy);
    // a.insertion(tjy);
    // System.out.println("ArrayList tjy after sorting:\n" + tjy);
    // System.out.println("Insertion passes: " + a.counter);
    // System.out.println("Insertion swaps: " + a.swaps);
    // a.counter = 0;
    // a.swaps = 0;
    //
    // System.out.println("\nBEST CASE OF SELECTION!");
    // ArrayList tch = new ArrayList<Integer>();
    // tch.add(1);
    // tch.add(2);
    // tch.add(3);
    // tch.add(4);
    // tch.add(5);
    // tch.add(6);
    // System.out.println("ArrayList tch before sorting:\n" + tch);
    // a.selection(tch);
    // System.out.println("ArrayList tch after sorting:\n" + tch);
    // System.out.println("Selection passes: " + a.counter);
    // System.out.println("Selection swaps: " + a.swaps);
    // a.counter = 0;
    // a.swaps = 0;
    //
    // System.out.println("\nBEST CASE OF SELECTION!");
    // ArrayList tyf = new ArrayList<Integer>();
    // tyf.add(6);
    // tyf.add(6);
    // tyf.add(6);
    // tyf.add(6);
    // tyf.add(6);
    // tyf.add(6);
    // System.out.println("ArrayList tyf before sorting:\n" + tyf);
    // a.selection(tyf);
    // System.out.println("ArrayList tyf after sorting:\n" + tyf);
    // System.out.println("Selection passes: " + a.counter);
    // System.out.println("Selection swaps: " + a.swaps);
    // a.counter = 0;
    // a.swaps = 0;
    //
    // System.out.println("\nWORST CASE OF SELECTION!");
    // ArrayList geg = new ArrayList<Integer>();
    // geg.add(11);
    // geg.add(10);
    // geg.add(9);
    // geg.add(8);
    // geg.add(7);
    // geg.add(6);
    // System.out.println("ArrayList geg before sorting:\n" + geg);
    // a.selection(geg);
    // System.out.println("ArrayList geg after sorting:\n" + geg);
    // System.out.println("Selection passes: " + a.counter);
    // System.out.println("Selection swaps: " + a.swaps);
    // a.counter = 0;
    // a.swaps = 0;

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
