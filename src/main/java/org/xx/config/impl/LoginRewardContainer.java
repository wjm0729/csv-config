package org.xx.config.impl;
import java.util.*;

import com.google.common.collect.*;

import org.xx.config.core.Config;
import org.xx.config.core.ConfigContainer;

@Config("login_reward")
public class LoginRewardContainer extends ConfigContainer<Integer, LoginRewardConfig> {
	private List<LoginRewardConfig> list = ImmutableList.of();

	private Map<Integer, LoginRewardConfig> map = ImmutableMap.of();

	private Map<Integer, LoginRewardConfig> preMap = ImmutableMap.of();

	@Override
	public void init(List<LoginRewardConfig> list) {
		this.list = ImmutableList.copyOf(list);
		Map<Integer, LoginRewardConfig> map = new LinkedHashMap<>();

		Map<Integer, LoginRewardConfig> preMap = new HashMap<>();
		for(LoginRewardConfig t:this.list) {
			map.put(t.getId(), t);

			if(t.getNextId() > 0) {
				preMap.put(t.getNextId(), t);
			}
		}
		this.map = ImmutableMap.copyOf(map);
		this.preMap = ImmutableMap.copyOf(preMap);
	}

	public LoginRewardConfig getPre(int id) {
		return preMap.get(id);
	}

	@Override
	public List<LoginRewardConfig>  getAll() {
		return list;
	}

	@Override
	public Map<Integer, LoginRewardConfig>  getMap() {
		return map;
	}

}