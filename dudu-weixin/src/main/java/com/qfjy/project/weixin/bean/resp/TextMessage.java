package com.qfjy.project.weixin.bean.resp;

import lombok.Data;

/**
 * 文本消息
 */
@Data
public class TextMessage extends BaseMessage {

	// 回复的消息内容
	private String Content;


}
