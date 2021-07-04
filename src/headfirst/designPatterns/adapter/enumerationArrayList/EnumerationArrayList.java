package headfirst.designpatterns.adapter.enumerationArrayList;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationArrayList<T> implements Enumeration<T> {
    private final Iterator<T> iterator;

    EnumerationArrayList(ArrayList<T> arr) {
        this.iterator = arr.iterator();
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public T nextElement() {
        return iterator.next();
    }
}

