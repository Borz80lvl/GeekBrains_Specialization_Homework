package model;

import java.util.ArrayList;

public abstract class familyTreeSorter<T> {
    /// Returns sorted by names list
    protected abstract ArrayList<T> sortByName(ArrayList<T> members);

    /// Returns sorted by birth year list
    protected abstract ArrayList<T> sortByBirthYear(ArrayList<T> members);
}
