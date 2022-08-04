
public class UserService {
	DateInputTest test = new DateInputTest();
    UserModel user= new UserModel();

	public UserModel getadddetails() {
		//DateInputTest test = new DateInputTest();
        //UserModel user= new UserModel();
        System.out.print("Please enter username ");
        
        user.setName(test.getusername());
        System.out.print("Please enter dob a date [pattern yyyy-MM-dd]: ");
    //Optional.ofNullable(test.getDateInput()).ifPresent(System.out::println);
        user.setDOB(test.getDateInput());
        //System.out.println(user);
        System.out.print("Please enter doj a date [pattern yyyy-MM-dd]: ");

        user.setDOJ(test.getDateInput());
        System.out.print("Please enter location : ");
       user.setLocation(test.getlocation());
       System.out.print("Please enter CTC]: ");
       user.setCTC(test.getCTC());
       
       System.out.println(user);

		return user;
		
		
	}
	public UserModel getdeletedetails()
	{
		System.out.println("please enter userid");
		user.setUserid(test.userid());
		return user;

	}
	public UserModel getupdatedetails()
	{
		System.out.println("please enter userid");
		user.setUserid(test.userid());
		System.out.print("Please enter location : ");
	       user.setLocation(test.getlocation());
	       System.out.print("Please enter CTC]: ");
	       user.setCTC(test.getCTC());
	       
		
				return user;

	}

	
}
