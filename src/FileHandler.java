import java.io.*;

public class FileHandler implements Writable {
    public FileHandler() {
    }

    public void save(Object obj, String path) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
    }


}