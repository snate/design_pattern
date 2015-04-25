/**
  * Sebastiano Valle - 25/04/2015
  * This is the class which represents GoF's elements stored in the Aggregate.
*/
package blog;

public class Post {

  private String title;
  private String author;
  private String text;

  //a better way to construct a Post might be realized using Builder pattern
  public Post(String title, String author,String text) {
    this.title = title;
    this.author = author;
    this.text = text;
  }

  public void print() {
    StringBuilder res = new StringBuilder();
    res.append("Author: " + author + "\n");
    res.append("*" + title + "*\n");
    res.append(">> " + text + "\n");
    System.out.println(res.toString());
  }
}
