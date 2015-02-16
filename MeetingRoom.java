
public class MeetingRoom {
	public int roomNumber;		// 회의실 번호
	public int floor;				// 층
	public int capacityNumber;		// 수용인원
	public int equipment;			// 장비
    
    public MeetingRoom(int roomNumber, int floor, int capacityNumber, int equipment){
    	this.roomNumber = roomNumber;
    	this.floor = floor;
    	this.capacityNumber = capacityNumber;
    	this.equipment = equipment;
    }
}
