package com.qfjy.project.weixin.bean.req;

import lombok.Data;

/**
 * 地理位置消息
 */

@Data
public class LocationMessage extends BaseMessage {
	// 地理位置维度
	private String Location_X;
	// 地理位置经度
	private String Location_Y;
	// 地图缩放大小
	private String Scale;
	// 地理位置信息
	private String Label;

}