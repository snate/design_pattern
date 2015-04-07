/**
  * Sebastiano Valle - 07/04/2015
  * This is the class which represents the GoF's ``Subject" interface.
  *
  * Image is an interface that exposes the operations it offers (in our
  * example, there is only "void show()").
  * Since both *Proxy classes and RealImage class inherit from Image,
  * they'll both implement and offer the same operation as the common
  * interface "Image" do.
*/
package images;

public interface Image {
  public void show();
}
