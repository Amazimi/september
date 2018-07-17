package com.johnny.september.java8.collection.treeset;

import java.io.Serializable;
import java.util.Date;

/**
 * 一句话描述
 *
 * @author johnny
 * @version 2.0
 * @date 2017/9/21
 * @since JDK 1.8
 */
public class Sku implements Comparable<Sku>, Serializable {

	private Long skuId;
	private String skuName;
	private Date updateTime;
	private Integer groupType;

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getGroupType() {
		return groupType;
	}

	public void setGroupType(Integer groupType) {
		this.groupType = groupType;
	}

	@Override public int compareTo(Sku o) {
		if (groupType > o.groupType) {
			return -1;
		}
		if (this.updateTime == null && o.updateTime == null) {
			return this.skuId.compareTo(o.skuId);
		} else if (this.updateTime == null) {
			return -1;
		} else if (o.updateTime == null) {
			return 1;
		}
		int result = o.updateTime.compareTo(this.updateTime);
		if (result == 0) {
			return this.skuId.compareTo(o.skuId);
		}
		return result;
	}
}

