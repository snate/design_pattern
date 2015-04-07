/**
  * Sebastiano Valle - 07/04/2015
  * This is the class which is not directly accessed from the client.
  *
  * ConcreteImage provide the real implementation of an image.
  * ConcreteImage is represented by proxy classes.
*/
package images;

class RealImage implements Image {
  private String text;

  public RealImage(String text) {
    this.text = text;
  }

  public void show() {
    System.out.println(text);
  }

}
