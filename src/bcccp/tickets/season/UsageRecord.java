
package bcccp.tickets.season;

public class UsageRecord implements IUsageRecord {
	
	String ticketId;
	long startDateTime;
	long endDateTime;
	
	
	//Constructor to intialize the variables
	public UsageRecord(String ticketId, long startDateTime) {
		//TODO Implement constructor
		ticketId = ticketId;
		startDateTime = startDateTime;
	}



	@Override
	//to update the endDateTime
	public void finalise(long endDateTime) {
		// TODO Auto-generated method stub
		endDateTime = endDateTime;
		
	}



	@Override
	//returns the starttime
	public long getStartTime() {
		// TODO Auto-generated method stub
		return (startDateTime);;
	}



	@Override
	public long getEndTime() {
		// TODO Auto-generated method stub
		return (endDateTime);
	}



	@Override
	public String getSeasonTicketId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
