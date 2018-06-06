package org.xx.config.impl;
import java.util.*;

import com.google.common.collect.*;

import org.xx.config.core.Config;
import org.xx.config.core.ConfigContainer;

@Config("activity_reward")
public class ActivityRewardContainer extends ConfigContainer<Integer, ActivityRewardConfig> {
	private List<ActivityRewardConfig> list = ImmutableList.of();

	private Map<Integer, ActivityRewardConfig> map = ImmutableMap.of();

	@Override
	public void init(List<ActivityRewardConfig> list) {
		this.list = ImmutableList.copyOf(list);
		Map<Integer, ActivityRewardConfig> map = new LinkedHashMap<>();
		for(ActivityRewardConfig t:this.list) {
			map.put(t.getId(), t);
		}
		this.map = ImmutableMap.copyOf(map);
	}

	@Override
	public List<ActivityRewardConfig>  getAll() {
		return list;
	}

	@Override
	public Map<Integer, ActivityRewardConfig>  getMap() {
		return map;
	}

}