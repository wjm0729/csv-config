package org.xx.config.impl;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import com.google.common.collect.*;

import org.apache.commons.lang3.StringUtils;
import org.xx.config.core.Config;
import org.xx.config.core.ConfigContainer;
import org.xx.config.core.util.Tuple3;

@Config("prize")
public class PrizeContainer extends ConfigContainer<Integer, PrizeConfig> {
	private List<PrizeConfig> list = ImmutableList.of();

	private Map<Integer, PrizeConfig> map = ImmutableMap.of();

	@Override
	public void init(List<PrizeConfig> list) {
		this.list = ImmutableList.copyOf(list);
		Map<Integer, PrizeConfig> map = new LinkedHashMap<>();
		for(PrizeConfig t:this.list) {
			map.put(t.getId(), t);
		}
		this.map = ImmutableMap.copyOf(map);
	}

	public Map<Integer, Integer> getAwards(int id) {
		Map<Integer, Integer> rewards = Maps.newHashMap();
		PrizeConfig config = getConfig(id);
		if(config == null) {
			return rewards;
		}
		// goods
		// 物品id;数量;权重|物品id;数量;权重
		// 随机次数 random_num	是否重复给 repeat
		for(int i=0; i<config.getRandomNum(); i++) {
			Tuple3<Integer,Integer,Integer> item = random(config.getGoods());
			if(rewards.containsKey(item.getFirst())) {
				if(config.getRepeat() == 1) {
					rewards.put(item.getFirst(), Math.min(Integer.MAX_VALUE, rewards.get(item.getFirst()) + item.getSecond()));
				}
			} else {
				rewards.put(item.getFirst(), item.getSecond());
			}
		}
		return rewards;
	}

	public Tuple3<Integer,Integer,Integer> random(List<Tuple3<Integer,Integer,Integer>> probability) {
		int result = Integer.MAX_VALUE;
		int total = 0;
		for (int i = 0; i < probability.size(); i++) {
			total += probability.get(i).getThird() == null ? 0 : probability.get(i).getThird();
		}
		if (total <= 0)
			throw new IllegalArgumentException(
					String.format("random, probability{%s} is invalid", StringUtils.join(probability, ",")));
		int p = 0;
		int rndNum = ThreadLocalRandom.current().nextInt(total) + 1;
		for (int i = 0, size = probability.size(); i < size; i++) {
			if (probability.get(i).getThird() == 0) {
				continue;
			}
			p += probability.get(i).getThird();
			if (rndNum <= p) {
				result = i;
				break;
			}
		}
		return probability.get(result);
	}

	@Override
	public List<PrizeConfig>  getAll() {
		return list;
	}

	@Override
	public Map<Integer, PrizeConfig>  getMap() {
		return map;
	}

}