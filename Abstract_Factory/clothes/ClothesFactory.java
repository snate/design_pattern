/**
  * Sebastiano Valle - 23/04/2015
  * This is the class which represents GoF's ``AbstractFactory" abstract class.
  *
  * Abstract Factory is an abstract class, but it isn't required to be.
  *
  * The reason why it is an abstract class it's that Abstract Factory is a
  * perfect candidate to be a Singleton as a type (there should not be the
  * possibility to instantiate two different classes of the same Factory type).
  *
  * In this basic example, this class will provide only two Factory methods
  * (another pattern that is called so because it returns instances of
  * objects).
*/
package clothes;

public abstract class ClothesFactory {

  public abstract PairOfShoes createShoes();
  public abstract Shirt createShirt();
}
