package org.xx.config.core.field;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.xx.config.core.verify.IVerify;
import org.xx.config.core.verify.VerifyFactory;

/**
 * Created by jiangmin.wu on 2018/3/6.
 */
public abstract class AbstractFieldType<T> implements IFieldType<T> {

    protected String name;
    protected String javaType;
    protected String defaultVal;

    public AbstractFieldType(String name, String javaType, String defaultVal) {
        this.name = name;
        this.javaType = javaType;
        this.defaultVal = defaultVal;
    }

    protected IVerify createVerity(JSONObject cfg) {
        String type = cfg.getString("t");
        JSONArray params = cfg.getJSONArray("p");
        return VerifyFactory.create(type, params);
    }

    protected StringBuilder appendLog(StringBuilder log, String result) {
        if (result != null) {
            if (log == null) {
                log = new StringBuilder();
            }
            log.append(result);
        }
        return log;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getJavaType() {
        return javaType;
    }

    @Override
    public String getDefaultVal() {
        return defaultVal;
    }
}
