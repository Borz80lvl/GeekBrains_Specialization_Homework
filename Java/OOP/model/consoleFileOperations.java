package model;

import java.io.*;

public class consoleFileOperations extends fileOperations {


    @Override
    public void saveObjectToFile(Object object, String path) {
        try (FileOutputStream fileOutput = new FileOutputStream(path);
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput)) {
            outputStream.writeObject(object);
            outputStream.flush();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Файл не был найден");
            System.err.println(fileNotFoundException.getMessage());
        } catch (IOException ioException) {
            System.out.println("Ошибка InputOutput");
            System.err.println(ioException.getMessage());
        }
    }


    @Override
    public Object getObjectFromFile(String path) {
        try (FileInputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream inputStream = new ObjectInputStream(fileInputStream)) {
            return inputStream.readObject();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Файл не был найден");
            System.err.println(fileNotFoundException.getMessage());
            return null;
        } catch (IOException ioException) {
            System.out.println("Ошибка InputOutput");
            System.err.println(ioException.getMessage());
            return null;
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Класс не был найден");
            System.err.println(classNotFoundException.getMessage());
            return null;
        }
    }

    @Override
    public void deleteFile(String path) {
        File file = new File(path);
        if (file.delete()) System.out.println("Файл " + path + " удален");
        else System.out.println("Файл " + path + " не удалось удалить");
    }
}
