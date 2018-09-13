package enumclass;

/**
 * Project:Test0719
 * Author :maxiaodong
 * Time   :2018/07/24
 * Desc   :测试枚举类
 */
public enum TestEnum {
    MONDAY(1, "周一", 1),
    TUESDATY(2, "周二", 2),
    TUESCATY(3, "周三", 1),
    FRIDAY(5, "周五", 1);

    final String desc;
    final int num;
    final int level;

    TestEnum(int num, String desc, int level) {
        this.num = num;
        this.desc = desc;
        this.level = level;
    }

    public String getDesc() {
        return desc;
    }


    public int getNum() {
        return num;
    }

//    @Override
//    public String toString() {
//        return "11";
//    }


    public static void main(String[] args) {
        TestEnum[] testEnum = TestEnum.values();
        for (TestEnum single : testEnum) {
            System.out.println(single.getDeclaringClass().getClassLoader() + "," + single.name() + ":" + single.num + ":" + single.desc);
        }
        System.out.println(MONDAY.getDesc());
        System.out.println(TestEnum.valueOf(TestEnum.TUESDATY.toString()).getNum());
        System.out.println(TUESCATY.ordinal());

    }

}
