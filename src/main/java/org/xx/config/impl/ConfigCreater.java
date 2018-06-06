package org.xx.config.impl;

import org.xx.config.core.gen.ConfigGenerator;
import org.xx.config.core.ConfigManager;
import org.xx.config.core.ConfigMetaData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jiangmin.wu
 */
public class ConfigCreater {
    private static final Logger logger = LoggerFactory.getLogger(ConfigGenerator.class);

    public static Map<String, String> CONFIG_NAME_ADPTER = new HashMap<String, String>() {

            // 将需要生成的配置文件添加到下面, 然后运行该 main 方法即可.
            //
        {   // 原始表名                               程序中用的名称

//             put("exp","exp");
//             put("constant", "constant");
             //put("exp", "exp");
//             put("prize", "prize");
//             put("science", "science");
//
//             put("position","position");
//             put("resource","resource");
               //put("fertilizer", "fertilizer");
            put("exp", "exp");
/*               put("fertilizer", "fertilizer");
               put("text","text");
               put("constant", "constant");*/
        }
    };

    public static void main(String[] args) {
        String rootPath = "./";

        ConfigGenerator.CONFIG_NAME_ADPTER = CONFIG_NAME_ADPTER;
        File file = new File(rootPath + ConfigManager.CONFIG_PATH);
        for (File f : file.listFiles(
                (dir, name) -> {
                    String fileName = name.substring(0, name.indexOf("."));
                    return ConfigGenerator.CONFIG_NAME_ADPTER.containsKey(fileName);
                })) {
            try {
                ConfigMetaData metaData = new ConfigGenerator().getConfigMetaData( f);
                ConfigGenerator.generateCode(metaData, "./");
            } catch (Exception e) {
                logger.error("generate config error " + f.getName(), e);
            }
        }
    }
}
