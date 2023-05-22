package pizza;

import java.util.Comparator;

public class PizzaComparator implements Comparator<Pizza> {


  @Override
  public int compare(Pizza o1, Pizza o2) {
    if (!o1.getTitle().equals(o2.getTitle())) {
      return o1.getTitle().compareTo(o2.getTitle());
    }
    if (o1.getSizeAsString().equals(o2.getSizeAsString())) {
      return o1.getSizeAsString().compareTo(o2.getSizeAsString());
    }
    return -(Boolean.compare(o1.isCheesyBorder(), o2.isCheesyBorder()));
  }
}
