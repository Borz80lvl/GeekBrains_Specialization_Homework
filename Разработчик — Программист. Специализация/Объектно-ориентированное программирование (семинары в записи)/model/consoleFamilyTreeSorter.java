package model;

import java.util.ArrayList;
import java.util.Collections;

public class consoleFamilyTreeSorter<T extends abstractMember> extends familyTreeSorter<T> {


    @Override
    public ArrayList<T> sortByName(ArrayList<T> members) {
        ArrayList<String> memberNames = new ArrayList<>(members.size());
        ArrayList<T> result = new ArrayList<>(members.size());
        for (T member : members) {
            memberNames.add(member.getFirstName());
        }
        Collections.sort(memberNames);
        for (int i = 0; i < memberNames.size(); i++) {
            for (int j = 0; j < memberNames.size(); j++) {
                if (memberNames.get(i).equals(members.get(j).getFirstName())) {
                    result.add(members.get(j));
                }
            }
        }
        return result;
    }

    @Override
    public ArrayList<T> sortByBirthYear(ArrayList<T> members) {
        ArrayList<Integer> dates = new ArrayList<>(members.size());
        ArrayList<T> result = new ArrayList<>(members.size());
        for (T member : members) {
            dates.add(member.getBirthYear());
        }
        dates.sort(Collections.reverseOrder());
        for (Integer date : dates) {
            for (T member : members) {
                if (date == member.getBirthYear()) result.add(member);
            }
        }
        return result;
    }
}
