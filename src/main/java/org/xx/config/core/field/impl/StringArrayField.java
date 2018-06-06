package org.xx.config.core.field.impl;

import org.xx.config.core.field.ArrayField;
import org.xx.config.core.util.SplitUtil;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * Created by jiangmin.wu on 2018/3/7.
 */
public class StringArrayField extends ArrayField<List<String>> {

    public StringArrayField() {
        super("array<string>", "ImmutableList<String>", "ImmutableList.copyOf(new ArrayList<>())");
    }

    @Override
    public List<String> parseValue(String rawVal) {
        if (rawVal == null) {
            return null;
        }
        return ImmutableList.copyOf(SplitUtil.convertContentToList(rawVal.trim(), String.class));
    }
}
