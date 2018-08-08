package md5;

/**
 * Project:Test0719
 * Author :maxiaodong
 * Time   :2018/07/25
 * Desc   :MD5
 */
public class EncodeStr {
//    public static String encodeStr(String originStr) {
//        try {
//            int i;
//
//            MessageDigest md5 = MessageDigest.getInstance("MD5");
//            md5.update(originStr.getBytes());
//            byte b[] = md5.digest();
//
//            StringBuffer buf = new StringBuffer("");
//            for (int offset = 0; offset < b.length; offset++) {
//                i = b[offset];
//                if (i < 0) {
//                    i += 256;
//                }
//                if (i < 16) {
//                    buf.append("0");
//                }
//                //将十进制转换为16进制
//                buf.append(Integer.toHexString(i));
//            }
//            out.println(buf.toString());
//            return buf.toString();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//        String result = encodeStr(DefineDeal.originStr);
//        out.println(result);
//    }
}
