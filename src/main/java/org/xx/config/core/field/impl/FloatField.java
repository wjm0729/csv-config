package org.xx.config.core.field.impl;

import org.xx.config.core.util.SplitUtil;
import org.xx.config.core.field.SingleField;

/**
 * Created by jiangmin.wu on 2018/3/7.
 */
public class FloatField extends SingleField<Float> {

    public FloatField() {
        super("float", "Float", "null");
    }

    @Override
    public Float parseValue(String rawVal) {
        if (rawVal == null || rawVal.equals("")) {
            return 0F;
        }
        return SplitUtil.convert(Float.class, rawVal);
    }
}
