package serialization;/**
 * @Project:Test0719
 * @Author :maxiaodong
 * @Time :2018/08/08
 * @Desc :
 */

import java.io.*;

import static java.lang.System.out;

/**
 * @Project:Test0719
 * @Author :maxiaodong
 * @Time :2018/08/08
 * @Desc :
 */
public class main {
    public static void main(String[] argd) {
        outToSystem();
        loadIn();
    }

    public static void loadIn() {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("logout.txt"));
            Instance instance = (Instance) in.readObject();
            out.println(instance.address + "," + instance.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void outToSystem() {
        Instance instance = new Instance("mimi", "韩国");
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("logout.txt"));
            out.writeObject(instance);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
