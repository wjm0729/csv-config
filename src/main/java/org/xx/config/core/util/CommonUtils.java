package org.xx.config.core.util;

/**
 * Created by jiangmin.wu on 2018/6/6.
 */
public class CommonUtils {

    public static String camelName(String name) {
        StringBuilder result = new StringBuilder();
        name = name.replaceAll("-", "_");

        // 快速检查
        if (name == null || name.isEmpty()) {
            // 没必要转换
            return "";
        } else if (!name.contains("_")) {
            // 不含下划线，仅将首字母小写
            return name.substring(0, 1).toUpperCase() + name.substring(1);
        }

        // 用下划线将原始字符串分割
        String camels[] = name.split("_");
        for (String camel : camels) {
            // 跳过原始字符串中开头、结尾的下换线或双重下划线
            if (camel.isEmpty()) {
                continue;
            }
            // 其他的驼峰片段，首字母大写
            result.append(camel.substring(0, 1).toUpperCase());
            result.append(camel.substring(1).toLowerCase());
        }
        return result.toString();
    }
}
