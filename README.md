package MeetingManagementService;

import java.sql.Date;
import java.util.ArrayList;


public class MeetingManagement {
	
	public class MeetingManagementService {
	    Date startTime;
	    Date endTime;
	    String departmentName;
	    String reserver;
	    String contactNumber;
	    String meetingTitle;
	    String roomNumber;
	    int floor;
	    int capacityNumber;
	    boolean equipment;
	    
	    public MeetingManagementService(Date start, Date end, String department, String reserverN, String contact, String title, String room, int floorN, int capacity, boolean equipmentN){
	    	startTime = start;
	    	endTime = end;
	    	departmentName = department;
	    	reserver = reserverN;
	    	contactNumber = contact;
	    	meetingTitle = title;
	    	roomNumber = room;
	    	floor = floorN;
	    	capacityNumber = capacity;
	    	equipment = equipmentN;
	    }
}

	
	private static ArrayList<MeetingManagementService> reservInfo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reservInfo = new ArrayList<MeetingManagementService>();
		
		
	}

}
