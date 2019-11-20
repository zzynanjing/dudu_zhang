package com.qfjy.project.weixin.pojo;

import lombok.Data;

/**
 * view类型的菜单
 */

@Data
public class ViewButton extends Button {
	private String type;
	private String url;

}