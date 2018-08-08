package serialization;/**
 * @Project:Test0719
 * @Author :maxiaodong
 * @Time :2018/08/08
 * @Desc :序列化实例
 */

import java.io.Serializable;

/**
 * @Project:Test0719
 * @Author :maxiaodong
 * @Time :2018/08/08
 * @Desc :序列化实例
 */
public class Instance implements Serializable {
    public String name;
    public transient String address;

    public Instance(String name, String address) {
        this.name = name;
        this.address = address;
    }


}
