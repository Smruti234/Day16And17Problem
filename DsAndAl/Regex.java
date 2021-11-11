package Com.DsAndAl;


public class Regex {
	public static void main(String args[]) {
		FileOperations u = new FileOperations();

		UserDetails user = new UserDetails();
		System.out.println();

		// asking user to enter his data
		System.out.println("Enter FirstName:");
		user.setfName(u.inputString());
		System.out.println();

		System.out.println("Enter LastName:");
		user.setlName(u.inputString());
		System.out.println();

		System.out.println("Enter Mobile Number:");
		user.setmobileNo(u.inputString());
		System.out.println();
		
		System.out.println("Enter Date");
		user.setdate(u.inputString());
		System.out.println();

		System.out.println(u.convertString(user, u.getFileText("C:\\Users\\hp\\Desktop\\newfile.txt")));
	}
}
