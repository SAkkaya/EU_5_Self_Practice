package assignment8_methods;

public class Question16 {

	public static void main(String[] args) {
		
		
		System.out.println(simpleRoomBook(false,2,1,2018));//false
	    System.out.println(simpleRoomBook(true,2,1,2018)); //true
	    System.out.println(simpleRoomBook(true,7,2,2018));//false
	    

	}

	public static boolean simpleRoomBook(boolean b, int i, int j, int k) {
		
		return b&&(i!=7||!(j>=1&&j<=8)&&k==2018);
		}
		
		
	}





/*To book a room first it needs to be available for rent and make sure its available at the date selected:

the room is already booked between 7/1/2018 - 7/8/2018 and not available accepting bookings only for year of 2018

example:

simpleRoomBook(false,2,1,2018)
return false

simpleRoomBook(true,2,1,2018)
return true

simpleRoomBook(true,7,2,2018)
return false*/