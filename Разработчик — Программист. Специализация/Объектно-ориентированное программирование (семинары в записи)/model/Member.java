package model;

public class Member extends abstractMember {
    @Override
    public String toString() {
        return "\n" + firstName +
                "= {\nbirthYear: " + birthYear +
                "\notherInformation: " + otherInformation + "\n}";
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
