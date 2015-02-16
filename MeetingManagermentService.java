import java.util.ArrayList;
import java.util.Date;


public class MeetingManagermentService {
	
	static ArrayList<ReservationInfo> reservationInfos = new ArrayList<ReservationInfo>();
	static ArrayList<MeetingRoom> meetingRooms = new ArrayList<MeetingRoom>();
	
	boolean isReservPossible(Date startTime, Date endTime){
		// 동일 0
		// a.compareTo(b) > 0   a가 빠름
		//                < 0   b가 빠름
		for(int i=0; i<reservationInfos.size(); i++){
			
			Date rStart = reservationInfos.get(i).startTime;
			Date rEnd = reservationInfos.get(i).endTime;
			
			if( rStart.compareTo(startTime) > 0 && rEnd.compareTo(startTime) < 0  )
				return false;
			if( rStart.compareTo(endTime) > 0 && rEnd.compareTo(endTime) < 0 )
				return false;
		}
		
		return true;
	}
	
	ReservationInfo setReservation(Date startTime, Date endTime, String departmentName, String reserver, String contactNumber, String meetingTitle){
		ReservationInfo info = new ReservationInfo();
		info.startTime = startTime;
		info.endTime = endTime;
		info.departmentName = departmentName;
		info.contactNumber = contactNumber;
		info.meetingTitle = meetingTitle;
		
		return info;
	}

	public static void main(String[] args) {
		
		setDummyData();
		
		MeetingManagermentService ms = new MeetingManagermentService();
		
	}

	private static void setDummyData() {
		
		meetingRooms.add(new MeetingRoom(101, 1, 4, 0x0000000));
		meetingRooms.add(new MeetingRoom(102, 1, 5, 0x0000001));
		meetingRooms.add(new MeetingRoom(103, 1, 6, 0x0000011));
		meetingRooms.add(new MeetingRoom(201, 2, 4, 0x0000000));
		meetingRooms.add(new MeetingRoom(201, 2, 5, 0x0000001));
	}

}
