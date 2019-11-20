package com.qfjy.project.weixin.bean.req;

import lombok.Data;

/**
 * 链接消息
 */

@Data
public class LinkMessage extends BaseMessage {
	// 消息标题
	private String Title;
	// 消息描述
	private String Description;
	// 消息链接
	private String Url;


}
