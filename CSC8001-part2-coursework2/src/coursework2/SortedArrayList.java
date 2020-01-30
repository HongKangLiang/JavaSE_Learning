package coursework2;


import java.util.ArrayList;
import java.util.Collections;


/**
 * Class Description: a class which is a subclass of ArrayList class has its own insert method.
 *
 * @author  Hongkang Liang
 * @version "1.8.0_221"
 */

public class SortedArrayList<E> extends ArrayList<E> {

    /**
     * Method Description: this is a method to add element to an object of SortedArrayList class.
     *                     The difference of it from add method in ArrayList class is that the items are sorted in ascending order automatically.
     * @param e: an object acts as an element in the list
     * @param list: an object of SortedArrayList class.
     */
    public void insertion(E e, SortedArrayList list) {
        list.add(e);
        Collections.sort(list);
    }
}
