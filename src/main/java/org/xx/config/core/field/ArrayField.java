package org.xx.config.core.field;

import org.xx.config.core.ConfigContainer;
import org.xx.config.core.ConfigFieldMeta;
import org.xx.config.core.IConfig;
import org.xx.config.core.verify.VerifyContext;

import java.util.Collection;

/**
 * Created by jiangmin.wu on 2018/3/6.
 */
public abstract class ArrayField<T extends Collection> extends SingleField<T> {

    public ArrayField(String name, String javaType, String defaultVal) {
        super(name, javaType, defaultVal);
    }

    @Override
    public String verify(VerifyContext context, IConfig<?> configItem, ConfigFieldMeta fieldMeta, T value, ConfigContainer selfContainer, boolean exception) throws Exception {
        if (value == null) {
            return super.verify(context, configItem, fieldMeta, value, selfContainer, exception);
        }

        StringBuilder log = null;
        for (Object item : value) {
            String result = super.innerVerify(context, configItem, fieldMeta, item, selfContainer, exception);
            log = appendLog(log, result);
        }
        return log != null ? log.toString() : null;
    }
}
