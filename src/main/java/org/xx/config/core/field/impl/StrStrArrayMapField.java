package org.xx.config.core.field.impl;

import org.xx.config.core.ConfigContainer;
import org.xx.config.core.ConfigFieldMeta;
import org.xx.config.core.IConfig;
import org.xx.config.core.field.MapField;
import org.xx.config.core.verify.IVerify;
import org.xx.config.core.verify.VerifyContext;
import org.xx.config.core.util.SplitUtil;

import java.util.List;
import java.util.Map;

/**
 * Created by jiangmin.wu on 2018/3/7.
 */
public class StrStrArrayMapField extends MapField<Map<String, List<String>>> {

    public StrStrArrayMapField() {
        super("map<string,array<string>>", "ImmutableMap<String,ImmutableList<String>>", "ImmutableMap.copyOf(new LinkedHashMap<>())");
    }

    @Override
    public Map<String, List<String>> parseValue(String rawVal) {
        if (rawVal == null) {
            return null;
        }
        return SplitUtil.convertContentToMapList(rawVal.trim(), String.class, String.class);
    }

    @Override
    protected StringBuilder verifyPart2(VerifyContext context, IConfig<?> configItem, ConfigFieldMeta fieldMeta, Map<String, List<String>> value, ConfigContainer selfContainer, boolean exception, StringBuilder log, IVerify verify) throws Exception {
        for (List<String> val : value.values()) {
            for (String v : val) {
                String result = verify.verify(context, configItem, fieldMeta, v, selfContainer, exception);
                log = appendLog(log, result);
            }
        }
        return log;
    }
}
