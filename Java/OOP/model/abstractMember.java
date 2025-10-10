package model;

public abstract class abstractMember {
    protected String firstName;
    protected int birthYear;
    protected String otherInformation;

    public abstract String getFirstName();

    public abstract int getBirthYear();

    public abstract String getOtherInformation();
}
