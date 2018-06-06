package org.xx.config.core.field.impl;

import com.google.common.collect.ImmutableList;
import org.xx.config.core.util.SplitUtil;
import org.xx.config.core.field.ArrayField;

import java.util.List;

/**
 * Created by jiangmin.wu on 2018/3/7.
 */
public class IntArrayField extends ArrayField<List<Integer>> {

    public IntArrayField() {
        super("array<int>", "ImmutableList<Integer>", "ImmutableList.copyOf(new ArrayList<>())");
    }

    @Override
    public List<Integer> parseValue(String rawVal) {
        if (rawVal == null) {
            return null;
        }
        return ImmutableList.copyOf(SplitUtil.convertContentToList(rawVal.trim(), Integer.class));
    }
}
