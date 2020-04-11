package edu.neu.csye6200;

import java.util.List;

//finish

public class AbstractClassroom {
    private int roomId;
	private int roomSize;
	private List<Group> groupsList;

	public List<Group> getGroupsList() {
		return groupsList;
	}

	public void setGroupsList(List<Group> groupsList) {
		this.groupsList = groupsList;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getRoomSize() {
		return roomSize;
	}

	public void setRoomSize(int roomSize) {
		this.roomSize = roomSize;
	}


}