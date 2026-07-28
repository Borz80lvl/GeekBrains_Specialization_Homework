package model;


import java.io.Serializable;
import java.util.ArrayList;


public class Person extends abstractMember implements Serializable {
    private String mother = "";
    private String father = "";
    private final ArrayList<Person> children = new ArrayList<>();

    @Override
    public String toString() {
        return "\n" + super.firstName +
                " = {\nГод рождения: " + super.birthYear +
                "\nДоп. информация: " + super.otherInformation +
                "\nОтец: " + this.father +
                "\nМать: " + this.mother +
                "\nДети: " + this.children + "\n";

    }

    public Person(String firstName, int birthYear) {
        super.firstName = firstName;
        super.birthYear = birthYear;
    }

    public String getFirstName() {
        return super.firstName;
    }

    public int getBirthYear() {
        return super.birthYear;
    }

    @Override
    public String getOtherInformation() {
        return super.otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        super.otherInformation = otherInformation;
    }

    public ArrayList<Person> getChildren() {
        return this.children;
    }


    public String getMother() {
        return this.mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return this.father;
    }

    public void setFather(String father) {
        this.father = father;
    }


    public void addChild(Person child) {
        this.children.add(child);
    }

}
