package org.xx.config.core.field.impl;

import org.xx.config.core.field.SingleField;
import org.xx.config.core.util.SplitUtil;

/**
 * Created by jiangmin.wu on 2018/3/7.
 */
public class IntField extends SingleField<Integer> {

    public IntField() {
        super("int", "Integer", "null");
    }

    @Override
    public Integer parseValue(String rawVal) {
        if (rawVal == null || rawVal.equals("")) {
            return 0;
        }
        return SplitUtil.convert(Integer.class, rawVal);
    }
}
