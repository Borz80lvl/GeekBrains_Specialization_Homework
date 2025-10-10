package model.family_tree;

import java.util.ArrayList;


public abstract class familyTree<T> {

    protected ArrayList<T> members;


    /// Returns members list
    public ArrayList<T> getMembers() {
        return this.members;
    }


}