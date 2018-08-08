package md5;

import static java.lang.System.out;

/**
 * Project:Test0719
 * Author :maxiaodong
 * Time   :2018/07/25
 * Desc   :自定义处理算法
 */
public class DefineDeal {
//    static String originStr = "95e6b86047c404f70de4abe55357d8b5\n" +
//            "edfebb141513a33765f7dba78cd0da72\n" +
//            "2a4df4191c52cefecf1564166a9142ed\n" +
//            "3417f80477605b8ff80b43b349ea7e76\n" +
//            "3ac608a11baa90da134788e6be752878";
//
//    /**
//     * 16进制化为十进制
//     */
//    public static Integer hexToTen(String hexStr) {
//        return Integer.parseInt(hexStr, 16);
//    }
//
//    public static Integer hexToTen(char hexChar) {
//        return Integer.parseInt(String.valueOf(hexChar), 16);
//    }
//
//    public static StringBuffer dealMD5() {
//        String md5Result = EncodeStr.encodeStr(originStr);
//        int length = md5Result.length();
//        //得到最后一位d的数字，十进制
//        int A = hexToTen(md5Result.charAt(length - 1));
//        out.println(md5Result.charAt(length - 1));
//        int B = hexToTen(md5Result.charAt(length - A - 1));
//        out.println(md5Result.charAt(length - A - 1));
//        int C = A + B % 16;
//
//        int A1 = hexToTen(md5Result.charAt(length - 2 - 1));
//        int B1 = hexToTen(md5Result.charAt(length - A1 - 1));
//        int D = A1 + B1 % 16;
//
//        StringBuffer result = new StringBuffer(md5Result);
//        result.replace(C, C + 1, Integer.toHexString(D));
//
//
//        out.println(md5Result);
//
//        return result;
//    }
//
////    public static StringBuffer dealMD5_2() {
//////        String md5Result = EncodeStr.encodeStr(originStr);
//////        int length = md5Result.length();
//////        //得到最后一位d的数字，十进制
//////        int A = hexToTen(md5Result.charAt(length - 1));
//////        out.println(md5Result.charAt(length - 1));
//////        int B = hexToTen(md5Result.charAt(length - A - 1));
//////        out.println(md5Result.charAt(length - A - 1));
//////        int C = (A + B) % 16;
//////
//////        int A1 = hexToTen(md5Result.charAt(length - 2));
//////        out.println(md5Result.charAt(length - 2));
//////
//////        int indexA1 = md5Result.charAt(length - A1 - 1);
//////        if ((indexA1 - 16) > 0)
//////
//////            int B1 = hexToTen(md5Result.charAt(length - A1 - 1));
//////        out.println(md5Result.charAt(length - A1 - 1));
//////        int D = (A1 + B1) % 16;
//////
//////        StringBuffer result = new StringBuffer(md5Result);
//////        result.replace(C, C + 1, Integer.toHexString(D));
//////
//////
//////        out.println(md5Result);
//////
//////        return result;
////        return "";
////    }


    public static void main(String[] args) {
        int aa = 0;
        System.out.println(aa);
        if (aa >= 0) {
            System.out.println(aa);
        }
    }


}


