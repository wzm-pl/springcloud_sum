package com.jk.model;

import java.util.List;

import lombok.Data;

@Data
public class TreeBean {

	private Integer id;
	
	private String text;
	
	private Integer pid;
	
	private String path;
	
	private List<TreeBean> nodes;
	
	private Boolean selectable;
}
