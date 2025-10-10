package model.members;

import java.io.Serializable;

public class Member extends abstractMember {
    @Override
    public String toString() {
        return "Member = {\n" +
                "firstName: " + firstName + "\n," +
                "birthYear: " + birthYear + "\n," +
                "otherInformation: " + otherInformation + "\n" +
                '}';
    }

    public String getFirstName() {
        return super.firstName;
    }

    public void setFirstName(String firstName) {
        super.firstName = firstName;
    }

    public int getBirthYear() {
        return super.birthYear;
    }

    public void setBirthYear(int birthYear) {
        super.birthYear = birthYear;
    }

    public String getOtherInformation() {
        return super.otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        super.otherInformation = otherInformation;
    }
}
