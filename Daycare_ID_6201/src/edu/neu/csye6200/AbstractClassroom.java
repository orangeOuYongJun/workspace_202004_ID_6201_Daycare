package edu.neu.csye6200;

import java.util.List;

public abstract class AbstractClassroom {

	public abstract List<Group> getGroupsList();

	public abstract void setGroupsList(List<Group> groupsList);

	public abstract int getRoomId();

	public abstract void setRoomId(int roomId);

	public abstract int getRoomSize();

	public abstract void setRoomSize(int roomSize);

}
