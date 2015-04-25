/**
  * Sebastiano Valle - 25/04/2015
  * This is the class which represents both GoF's ``ConcreteAggregate" and
  * ``ConcreteIterator" class.
  *
  * Since a ConcreteIterator is strictly coupled to a specific
  * ConcreteAggregate, a possible implementation of this pair is to nest the
  * iterator into the structure.
  *
  * This way of approaching the problem is good because the Client doesn't
  * even know that a ``BlogIterator" exists, it only needs an Iterator to
  * navigate the Blog, without taking care of which class he has to
  * instantiate.
*/
package blog;
import java.util.*;

public class Blog implements Aggregate {
  private Vector<Post> collection = new Vector<Post>();
  private Iterator myIterator = new BlogIterator();

  private class BlogIterator implements Iterator {
    private int index;

    public Object next() {
      if(collection.size() > index)
        return collection.get(index++);
      else
        return null;
    }
    public boolean hasNext() {
      return collection.size() > index;
    }

    public Object prev() {
      if(index > 0 && collection.size() > 0)
        return collection.get(--index);
      else
        return null;
    }
    public boolean hasPrev() {
      return index > 0 && collection.size() > 0;
    }
  }

  public Iterator iterator() {
    return myIterator;
  }

  public void putDummyContent() {
    Vector<String> authors = new Vector<String>();
    Vector<String> titles = new Vector<String>();
    Vector<String> text = new Vector<String>();
    authors.add("Kevin Kruse");
    titles.add("Scientific progress over greed");
    text.add("Life is about making an impact, not making an income.");
    authors.add("Napoleon Hill");
    titles.add("All is possible");
    text.add("Whatever the mind of man can conceive and believe, it can achieve.");
    authors.add("Albert Einstein");
    titles.add("Value of things");
    text.add("Strive not to be a success, but rather to be of value.");
    authors.add("Robert Frost");
    titles.add("Be brave");
    text.add(" Two roads diverged in a wood, and I—I took the one less traveled by, And that has made all the difference.");
    authors.add("Pablo Picasso");
    titles.add("Never lose your creativity");
    text.add("Every child is an artist.  The problem is how to remain an artist once he grows up.");
    for(int i = 0; i < authors.size(); i++){
      Post p = new Post(titles.get(i),authors.get(i),text.get(i));
      collection.add(p);
    }
  }
}
