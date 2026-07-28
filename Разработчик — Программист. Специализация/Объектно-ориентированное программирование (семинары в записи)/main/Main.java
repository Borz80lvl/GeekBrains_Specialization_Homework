package main;

import model.*;
import presenter.*;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        //Task 1
        System.out.println("\n====== Task 1 ======");
        consoleFamilyTree<Person> familyTree = new consoleFamilyTree<>();
        Person john = new Person("John", 1996);
        Person emma = new Person("Emma", 2000);
        Person isabella = new Person("Isabella", 2010);
        isabella.setMother(emma.getFirstName());
        isabella.setFather(john.getFirstName());
        john.addChild(isabella);
        emma.addChild(isabella);
        familyTree.addMember(john);
        familyTree.addMember(emma);
        familyTree.addMember(isabella);
        System.out.printf("Emma's and John's children: %s\n", isabella.getFirstName());

        //Task 2
        System.out.println("\n====== Task 2 ======\n");
        consoleFileOperations fileOperations = new consoleFileOperations();
        fileOperations.saveObjectToFile(isabella, isabella.getFirstName());
        System.out.println(fileOperations.getObjectFromFile(isabella.getFirstName()));
        fileOperations.deleteFile(isabella.getFirstName());
        String familyTreeFileName = "familyTree";
        fileOperations.saveObjectToFile(familyTree, familyTreeFileName);
        System.out.println(fileOperations.getObjectFromFile(familyTreeFileName));
        fileOperations.deleteFile(familyTreeFileName);

        //Task 3
        System.out.println("\n====== Task 3 ======");
        Iterator<Person> familyTreeIterator = new familyTreeIterator<>(familyTree.getMembers()).iterator();
        consoleFamilyTreeSorter<Person> familyTreeSorter = new consoleFamilyTreeSorter<>();
        while (familyTreeIterator.hasNext()) System.out.println(familyTreeIterator.next());
        System.out.println("\nСортировка по имени:");
        System.out.printf("До: %s\n", familyTree);
        System.out.printf("После: %s\n\n", familyTreeSorter.sortByName(familyTree.getMembers()));
        System.out.println("Сортировка по году рождения:");
        System.out.printf("До: %s\n", familyTree);
        System.out.printf("После: %s\n", familyTreeSorter.sortByBirthYear(familyTree.getMembers()));

        //Task 4
        System.out.println("\n====== Task 4 ======");
        consoleFamilyTreePresenter<Person> presenter = new consoleFamilyTreePresenter<>();
        presenter.start();

    }
}
