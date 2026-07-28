package model;

import java.util.ArrayList;


public abstract class familyTree<T extends abstractMember> {

    protected ArrayList<T> members;


    /// Returns members list
    public ArrayList<T> getMembers() {
        return this.members;
    }


}