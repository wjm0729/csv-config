package org.xx.config.core.field.impl;

import org.xx.config.core.field.MapField;
import org.xx.config.core.util.SplitUtil;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * Created by jiangmin.wu on 2018/3/7.
 */
public class IntIntMapField extends MapField<Map<Integer,Integer>> {

    public IntIntMapField() {
        super("map<int,int>", "ImmutableMap<Integer,Integer>", "ImmutableMap.copyOf(new LinkedHashMap<>())");
    }

    @Override
    public Map<Integer,Integer> parseValue(String rawVal) {
        if (rawVal == null) {
            return null;
        }
        return ImmutableMap.copyOf(SplitUtil.convertContentToMap(rawVal.trim(), Integer.class, Integer.class));
    }
}
