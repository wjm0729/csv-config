package org.xx.config.core.verify.impl;

import java.util.Set;

import com.alibaba.fastjson.JSONArray;
import org.xx.config.core.ConfigContainer;
import org.xx.config.core.verify.AbstractVerify;
import org.xx.config.core.verify.VerifyContext;
import org.xx.config.core.ConfigException;
import org.xx.config.core.ConfigFieldMeta;
import org.xx.config.core.IConfig;
import com.google.common.collect.Sets;

/**
 * @author wjm
 */
public class UniqueVerify extends AbstractVerify {
    private Set dataSet = Sets.newHashSet();

    public UniqueVerify() {
        super("unique");
    }

    @Override
    public void init(JSONArray param) {

    }

    @Override
    public String desc() {
        return "唯一验证: {t:'unique'}";
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public String verify(VerifyContext context, IConfig<?> configItem, ConfigFieldMeta cfgField, Object val, ConfigContainer selfContainer, boolean exception) throws Exception {
        if (val == null) {
            return null;
        }

        if (dataSet.contains(val)) {
            String error = String.format("字段非唯一 %s %s %s %s",
                    selfContainer.getMetaData().getFileName(), cfgField.getName(), configItem.getId(), val);
            if (exception) {
                throw new ConfigException(error);
            } else {
                return error;
            }
        } else {
            dataSet.add(val);
        }

        return null;
    }
}
