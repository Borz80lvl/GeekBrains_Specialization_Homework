package model.members;


import java.io.*;
import java.util.ArrayList;


public class Person extends abstractMember implements Serializable {
    private String mother;
    private String father;
    private final ArrayList<Person> children = new ArrayList<>();

    @Override
    public String toString() {
        return super.firstName;
    }

    public Person(String firstName, int birthYear) {
        this.firstName = firstName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    @Override
    public String getOtherInformation() {
        return super.otherInformation;
    }

    public void setOtherInformation(String otherInformation) {
        super.otherInformation = otherInformation;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }


    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }


    public void addChild(Person child) {
        this.children.add(child);
    }


//    public Object getFromFile() {
//        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(this.firstName))) {
//            return inputStream.readObject();
//        } catch (Exception exception) {
//            return exception.getMessage();
//        }
//    }
//
//
//    public void saveToFile() {
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(this.firstName))) {
//            outputStream.writeObject(this);
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
}
