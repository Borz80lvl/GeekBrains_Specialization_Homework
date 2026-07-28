package model;

import java.io.Serializable;

public abstract class fileOperations implements Serializable {
    protected void saveObjectToFile(Object object, String path) throws Exception {
    }

    protected abstract Object getObjectFromFile(String path) throws Exception;

    protected void deleteFile(String path) {
    }

}
