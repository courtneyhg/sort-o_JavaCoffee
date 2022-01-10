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
    geg.add(9);
    geg.add(10);
    geg.add(7);
    geg.add(8);
    geg.add(6);
    System.out.println("ArrayList geg before sorting:\n" + geg);
    b.selection(geg);
    System.out.println("ArrayList geg after sorting:\n" + geg);
    System.out.println("Selection passes: " + b.counter);
    System.out.println("Selection swaps: " + b.swaps);
    b.counter = 0;
    b.swaps = 0;



    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");



    System.out.println("\nINSERTION!");
    ArrayList carrie = new ArrayList<Integer>();
    carrie.add(7);
    carrie.add(1);
    carrie.add(5);
    carrie.add(12);
    carrie.add(3);
    carrie.add(9);
    System.out.println("ArrayList zxl before sorting:\n" + carrie);
    c.insertion(carrie);
    System.out.println("ArrayList zxl after sorting:\n" + carrie);
    System.out.println("Selection passes: " + c.counter);
    System.out.println("Selection swaps: " + c.swaps);
    c.counter = 0;
    c.swaps = 0;

    System.out.println("\nBEST CASE OF INSERTION!");
    ArrayList kol = new ArrayList<Integer>();
    kol.add(1);
    kol.add(2);
    kol.add(3);
    kol.add(4);
    kol.add(5);
    kol.add(6);
    System.out.println("ArrayList kol before sorting:\n" + kol);
    b.insertion(kol);
    System.out.println("ArrayList kol after sorting:\n" + kol);
    System.out.println("Selection passes: " + b.counter);
    System.out.println("Selection swaps: " + b.swaps);
    b.counter = 0;
    b.swaps = 0;

    System.out.println("\nBEST CASE OF INSERTION!");
    ArrayList qq = new ArrayList<Integer>();
    qq.add(6);
    qq.add(6);
    qq.add(6);
    qq.add(6);
    qq.add(6);
    qq.add(6);
    System.out.println("ArrayList qq before sorting:\n" + qq);
    b.insertion(qq);
    System.out.println("ArrayList qq after sorting:\n" + qq);
    System.out.println("Selection passes: " + b.counter);
    System.out.println("Selection swaps: " + b.swaps);
    b.counter = 0;
    b.swaps = 0;

    System.out.println("\nWORST CASE OF INSERTION!");
    ArrayList wer = new ArrayList<Integer>();
    wer.add(11);
    wer.add(10);
    wer.add(9);
    wer.add(8);
    wer.add(7);
    wer.add(6);
    System.out.println("ArrayList wer before sorting:\n" + wer);
    b.insertion(wer);
    System.out.println("ArrayList wer after sorting:\n" + wer);
    System.out.println("Selection passes: " + b.counter);
    System.out.println("Selection swaps: " + b.swaps);
    b.counter = 0;
    b.swaps = 0;

    System.out.println("\nWORST CASE OF INSERTION!");
    ArrayList oop = new ArrayList<Integer>();
    oop.add(30);
    oop.add(20);
    oop.add(10);
    oop.add(0);
    oop.add(-10);
    oop.add(-20);
    oop.add(-30);
    oop.add(-40);
    oop.add(-50);
    System.out.println("ArrayList oop before sorting:\n" + oop);
    b.insertion(oop);
    System.out.println("ArrayList oop after sorting:\n" + oop);
    System.out.println("Selection passes: " + b.counter);
    System.out.println("Selection swaps: " + b.swaps);
    b.counter = 0;
    b.swaps = 0;

  } //end main

} //end class
