package model;

import java.util.ArrayList;
import java.util.Iterator;

public class familyTreeIterator<T>
        extends abstractFamilyTreeIterator<T>
        implements Iterator<T>, Iterable<T> {

    public familyTreeIterator(ArrayList<T> objects) {
        super.count = 0;
        super.members = new ArrayList<>(objects);
    }

    @Override
    public boolean hasNext() {
        return count < super.members.size();
    }

    @Override
    public T next() {
        if (!hasNext()) return null;
        return super.members.get(count++);
    }

    @Override
    public Iterator<T> iterator() {
        return new familyTreeIterator<T>(super.members);
    }
}