/**
  * Sebastiano Valle - 23/04/2015
  * This is the class which represents a ``Client" that uses two different
  * factories, say A and B.
  *
  * The Client, after the creation of the two factories, demands the same
  * operation to both the objects. This exercise shows that the two factories,
  * even returning the same type of object, return a specific object which
  * belongs to the family they are related to.
*/
package client;
import clothes.*;

public class Client {

  public static void main(String[] args) {
    ClothesFactory fact1 = new RedClothesFactory();
    ClothesFactory fact2 = new BlueClothesFactory();

    Shirt shirt1 = fact1.createShirt();
    Shirt shirt2 = fact2.createShirt();
    PairOfShoes shoes1 = fact1.createShoes();
    PairOfShoes shoes2 = fact2.createShoes();

    System.out.println("\nFactory 1: Red factory");
    shirt1.print();
    shoes1.print();
    System.out.println("\nFactory 2: Blue factory");
    shirt2.print();
    shoes2.print();
    System.out.println();
  }
}
