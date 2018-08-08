package designmode;/**
 * @Project:Test0719
 * @Author :maxiaodong
 * @Time :2018/08/07
 * @Desc :构造者模式
 */

/**
 * @Project:Test0719
 * @Author :maxiaodong
 * @Time :2018/08/07
 * @Desc :构造者模式
 */
public class Student {
    private int id;
    private String name;
    private String sex;
    private String address;
    public String aa;

    //构造器尽量缩小范围
    private Student() {

    }

    //构造器尽量缩小范围
    private Student(Student orign) {
        //copy one
        this.id = orign.id;
        this.name = orign.name;
        this.address = orign.address;
        this.sex = orign.sex;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {

        return address;
    }

    /*使用Student.builder,类似方法链的方式来创建*/
    public static class Builder {
        private Student target;

        public Builder() {
            target = new Student();
        }

        public Builder id(int id) {
            target.id = id;
            return this;
        }

        public Builder address(String address) {
            target.address = address;
            return this;
        }

        public Builder sex(String sex) {
            target.sex = sex;
            return this;
        }

        public Builder name(String name) {
            target.name = name;
            return this;
        }

        public Student builder() {
            return new Student(target);
        }
    }
}
