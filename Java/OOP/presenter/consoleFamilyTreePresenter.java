package presenter;

import model.Member;
import model.abstractMember;
import model.consoleFamilyTree;
import model.consoleFileOperations;
import view.consoleFamilyTreeView;

import java.util.Scanner;


public class consoleFamilyTreePresenter<T extends abstractMember> implements familyTreePresenter<T> {

    consoleFamilyTree<T> familyTree = new consoleFamilyTree<>();
    consoleFileOperations fileOperations = new consoleFileOperations();

    public void showTree() {
        System.out.println(this.familyTree.toString());
    }

    @Override
    public void showMember(T member) {
        System.out.println(this.familyTree.getMember(member));
    }

    public void showMemberFromFile(String treeFilePath, T member) {
        showMember(((consoleFamilyTree<T>) fileOperations.getObjectFromFile(treeFilePath)).getMember(member));
    }

    public void showTreeFromFile(String treeFilePath) {
        System.out.println(fileOperations.getObjectFromFile(treeFilePath).toString());
    }


    public void addMember(T member) {
        this.familyTree.addMember(member);
    }

    public int start() {
        Scanner userInput;
        consoleFamilyTreeView view = new consoleFamilyTreeView();
        String filePath = "";
        int userNumber;
        int fileCount = 0;
        while (true) {
            view.showMainMenu();
            userInput = new Scanner(System.in);
            if (userInput.hasNextInt()) {
                userNumber = userInput.nextInt();
                switch (userNumber) {
                    case 0:
                        return 0;
                    case 1:
                        showTree();
                        break;
                    case 2:
                        System.out.println("Введите путь к файлу семейного дерева: ");
                        if (userInput.hasNext()) {
                            filePath = userInput.next();
                            showTreeFromFile(filePath);
                        }
                        fileCount += 1;
                        break;
                    case 3:
                        if (fileCount == 1) {
                            fileOperations.saveObjectToFile(familyTree, filePath);
                        } else {
                            System.out.println("Введите путь к файлу семейного дерева: ");
                            if (userInput.hasNext()) {
                                fileOperations.saveObjectToFile(familyTree, userInput.next());
                            }
                        }
                        System.out.println("Семейное древо сохранено.");
                        break;
                    case 4:
                        String firstName;
                        int birthYear;
                        String otherInformation;
                        Member member = new Member();
                        System.out.println("Введите имя члена семейного древа: ");
                        if (userInput.hasNext()) {
                            firstName = userInput.next();
                            member.setFirstName(firstName);
                        }
                        userInput.reset();
                        System.out.println("Введите год рождения: ");
                        if (userInput.hasNextInt()) {
                            birthYear = userInput.nextInt();
                            member.setBirthYear(birthYear);
                        }
                        userInput.reset();
                        System.out.println("Введите доп. информацию о члене семейного древа: ");
                        if (userInput.hasNext()) {
                            otherInformation = userInput.next();
                            member.setOtherInformation(otherInformation);
                        }
                        addMember((T) member);
                        System.out.println("Член семейного древа добавлен.");
                        break;
                }
            }
        }
    }
}
