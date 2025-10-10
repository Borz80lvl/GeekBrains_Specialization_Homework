package model;


import java.io.Serializable;
import java.util.ArrayList;

public class consoleFamilyTree<T extends abstractMember> extends familyTree<T> implements Serializable {

    /// Adds member to members list
    public void addMember(T member) {
        this.members.add(member);
    }

    /// Returns member if member exists in members list, null if it doesn't
    public T getMember(T member) {
        if (super.members.contains(member)) return super.members.get(super.members.indexOf(member));
        System.out.println("Такого члена семейного древа нет");
        return null;
    }

    public consoleFamilyTree() {
        super.members = new ArrayList<>();
    }

    @Override
    public String toString() {
        if (super.members == null) {
            return "Family Tree Members = { }";
        }
        StringBuilder stringBuilder = new StringBuilder("Family Tree Members = { ");
        for (T member : super.members) {
            stringBuilder.append(member.toString()).append(", ");
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 2).append(" }").toString();
    }
}
