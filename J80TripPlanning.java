import java.util.*;
class TripPlanning 
{
	public static void main(String[] args) {
		String [] contactlist = ("Guddi,Lalli,Sassu,Dissu,Bhajjji");
		System.out.println("contactList : "+Arrays.toString(contactList));
		String name = "Avii";
		ArrayList tripDetails = planningTrip();

		ArrayList<String> members = new ArrayList<String>();
		members.add(name);
		for (String person : contactList ) {
			boolean resp = calling(person,tripDetails);
			if (resp) {
				members.add(person);
			}
			System.out.println("Members : "+members);
			String [] offering = offering();
			System.out.println("Offerings : "+Arrays.toString(offering));
		}
		public static String [] offering()
		{
			String flower = "Hibiscus";
			String fruit = "Coconut";
			String sweets = "Modak";
			String [] offering = {flower,fruit,sweets};
            retuen offering;
		}
		public static boolean calling(String person, ArrayList tripDetails)
		{
			System.out.println("\n "+"Avii is Callinfg " +person);
			System.out.println(tripDetails);
			System.out.println("Chala chalna he ka ...?");
			String resp = new Scanner(System.in).next().toUpperCase();
			if(resp.equals("Ha"))
				return true;

			return false;
		}
		@SuppressWarnings("unchecked")
		public static ArrayList planningTrip()
		{
			String location = "Dagdusheth Ganpati";
			double distance = 3;
			String mode = "Walk";
			String dateTime= "Tuesday 4:00pm";
			double budget = 500;

		ArrayList tripDetails = new ArrayList();
		tripDetails.add(location);
		tripDetails.add(distance);
		tripDetails.add(dateTime);
		tripDetails.add(mode);
		tripDetails.add(budget);

		return tripDetails;
		}
	}
}









