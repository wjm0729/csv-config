package org.xx.config.core.field.impl;

import org.xx.config.core.field.Tuple2Field;
import org.xx.config.core.util.SplitUtil;
import org.xx.config.core.util.Tuple2;

/**
 * Created by jiangmin.wu on 2018/3/7.
 */
public class IntIntTuple2Field extends Tuple2Field<Tuple2<Integer, Integer>> {

    public IntIntTuple2Field() {
        super("tuple2<int,int>", "Tuple2<Integer,Integer>", "null");
    }

    @Override
    public Tuple2<Integer, Integer> parseValue(String rawVal) {
        if (rawVal == null) {
            return null;
        }
        return SplitUtil.convertContentToTuple2(rawVal, Integer.class, Integer.class);
    }
}
