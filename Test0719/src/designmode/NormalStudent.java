package designmode;/**
 * @Project:Test0719
 * @Author :maxiaodong
 * @Time :2018/08/07
 * @Desc :
 */

/**
 * @Project:Test0719
 * @Author :maxiaodong
 * @Time :2018/08/07
 * @Desc :一般模式
 */
public class NormalStudent {
    public static void main(String[] args) {
        Student student = new Student.Builder().address("aaaa").name("yuerugou").sex("男").id(1).builder();
        System.out.println(student.getAddress());

    }
}
