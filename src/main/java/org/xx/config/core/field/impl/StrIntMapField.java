package org.xx.config.core.field.impl;

import org.xx.config.core.field.MapField;
import org.xx.config.core.util.SplitUtil;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

/**
 * Created by jiangmin.wu on 2018/3/7.
 */
public class StrIntMapField extends MapField<Map<String, Integer>> {

    public StrIntMapField() {
        super("map<string,int>", "ImmutableMap<String,Integer>", "ImmutableMap.copyOf(new LinkedHashMap<>())");
    }

    @Override
    public Map<String, Integer> parseValue(String rawVal) {
        if (rawVal == null) {
            return null;
        }
        return ImmutableMap.copyOf(SplitUtil.convertContentToMap(rawVal.trim(), String.class, Integer.class));
    }
}
