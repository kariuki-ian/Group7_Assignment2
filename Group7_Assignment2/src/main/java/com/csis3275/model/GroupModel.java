package com.csis3275.model;

import java.util.List;

public class GroupModel {

	private List<String> imageNames;
	private String groupDescription;

	public GroupModel(List<String> imageNames, String groupDescription) {
		this.imageNames = imageNames;
		this.groupDescription = groupDescription;
	}

	public List<String> getImageNames() {
		return imageNames;
	}

	public void setImageNames(List<String> imageNames) {
		this.imageNames = imageNames;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

}
