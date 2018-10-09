package com.passcloud.common.base.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The class Sharding context dto.
 *
 * @author liyuzhang
 */
@Data
//@NoArgsConstructor
public class ShardingContextDto {
	/**
	 * The Sharding total count.
	 */
	int shardingTotalCount;
	/**
	 * The Sharding item.
	 */
	int shardingItem;
	
	
	public ShardingContextDto(int shardingTotalCount, int shardingItem) {
		this.shardingTotalCount = shardingTotalCount;
		this.shardingItem = shardingItem;
	}
}
