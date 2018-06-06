package org.xx.config.impl;
import java.util.*;

import com.google.common.collect.*;

import org.xx.config.core.Config;
import org.xx.config.core.ConfigContainer;
import org.xx.config.core.verify.VerifyContext;

@Config("exp")
public class ExpContainer extends ConfigContainer<Integer, ExpConfig> {
	private List<ExpConfig> list = ImmutableList.of();

	private Map<Integer, ExpConfig> map = ImmutableMap.of();

	@Override
	public void init(List<ExpConfig> list) {
		this.list = ImmutableList.copyOf(list);
		Map<Integer, ExpConfig> map = new LinkedHashMap<>();
		for(ExpConfig t:this.list) {
			map.put(t.getId(), t);
		}
		this.map = ImmutableMap.copyOf(map);
	}

	@Override
	public String check(VerifyContext context, boolean exception) throws Exception {
		return super.check(context, exception);
	}

	@Override
	public List<ExpConfig>  getAll() {
		return list;
	}

	@Override
	public Map<Integer, ExpConfig>  getMap() {
		return map;
	}

}