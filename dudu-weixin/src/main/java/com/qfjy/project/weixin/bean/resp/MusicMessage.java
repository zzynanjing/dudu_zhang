package com.qfjy.project.weixin.bean.resp;

import lombok.Data;

/**
 * 音乐消息
 */
@Data
public class MusicMessage extends BaseMessage {

	// 音乐
	private Music Music;

}
