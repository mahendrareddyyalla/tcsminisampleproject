import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String... args) throws Invaliddataexception {
        DateInputTest test = new DateInputTest();
        List<UserModel> userModellist = new ArrayList<>();
 	   Properties properties = new Properties();

        UserService userService = new UserService();
        UserModel userModel;
       System.out.print("Please enter operation: ");
       String operation = test.operation();

       if("ADD".equals(operation))
       {
    	   userModel=userService.getadddetails();
    	   userModellist.add(userModel);
    	   List<UserModel> list = userModellist.stream().filter(name->name.getName()!=null)
    	   .filter(dob->dob.getDOB()!=null).filter(doj->doj.getDOJ()!=null)
    	   .filter(location->location.getLocation()!=null)
    	   .filter(ctc->ctc.getCTC()!=null).toList();
    	   //System.out.println("successfully added");
          LocalDate datenow= LocalDate.now();
          int age=Period.between(userModel.getDOB(), datenow).getYears();
          System.out.println("yrars"+age);
    	   if(list.isEmpty()) {
    		  throw new Invaliddataexception("invalid request");
    	   }
    	   if(userModel.getDOJ().isAfter(datenow)) {
     		  throw new Invaliddataexception("DOJ should be before today");
    	   
    	   }
    	   if(!(age>18)) {
      		  throw new Invaliddataexception("age should be 18+");

    	   }
    	   
		   System.out.println("successfull created employee"); 
       }
       if("DELETE".equals(operation))
       {
    	   userModel=userService.getdeletedetails();
    	   if(userModel.getUserid().isEmpty() || userModel.getUserid()==null)
    	   {
      		  throw new Invaliddataexception("user id should not empty");

    	   }
    	   System.out.println("deleted succesfully");
    		   
       }
       if("SELECT".equals(operation))
       {
    	   userModel=userService.getadddetails();
    	   userModellist.add(userModel);
    	   UserModel userModeldata=new UserModel();
    	   userModeldata.setUserid("1234");
    	   userModeldata.setName("mahendra");
    	   userModeldata.setDOB(LocalDate.now());
    	   userModeldata.setDOJ(LocalDate.now());
    	   userModeldata.setLocation("bangalore");
    	   userModeldata.setCTC("12LPA");
    	   
    	  
    	 
    	   List<UserModel> list = userModellist.stream().filter(name->name.getName().equalsIgnoreCase(userModeldata.getName()))
    	   .filter(dob->dob.getDOB().equals(userModeldata.getDOB())).filter(doj->doj.getDOJ().equals(userModeldata.getDOJ()))
    	   .filter(location->location.getLocation().equalsIgnoreCase(userModeldata.getLocation()))
    	   .filter(ctc->ctc.getCTC().equalsIgnoreCase(userModeldata.getCTC())).toList();
    	   
    	   if(!list.isEmpty()) {
    		   Map<String, List<UserModel>> list1 =list.stream().sorted().collect(Collectors.groupingBy(UserModel::getLocation));
    		   System.out.println("records"+list);
    	   }else System.out.println("records not found"+list);
       }
       if("UPDATE".equals(operation))
       {
    	   userModel=userService.getupdatedetails();
    	   if(userModel.getUserid().isEmpty() || userModel.getUserid()==null)
    	   {
      		  throw new Invaliddataexception("user id should not empty");

    	   }
    	   

    	   System.out.println("update user"+userModel );
       }
       else
		   System.out.println("invalid operation"); 
    }
    }



