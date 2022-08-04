import java.io.Closeable;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.Scanner;

public class DateInputTest implements Closeable {

    private static final String DATE_FORMAT = "yyyy-MM-dd";

    private final Scanner scanner;

    public DateInputTest() {
    this.scanner = new Scanner(System.in);
    }

    public LocalDate getDateInput() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
    String line = scanner.nextLine();
    try {
        return LocalDate.parse(line, formatter);
        
    } catch (Exception e) {
        System.err.println("Invalid date value:: " + line);
    }
    return null;
    }
    public String getusername() {
    String name = scanner.nextLine();
	return name;
    }
    
    public String getlocation() {
        String location = scanner.nextLine();
    	return location;
	
    }
    public String getCTC() {
        String CTC = scanner.nextLine();
    	return CTC;
	
    }
    public String operation() {
        String add = scanner.nextLine();
    	return add;
	
    }
    public String userid() {
        String userid = scanner.nextLine();
    	return userid;
	
    }
    
    
    

    

    @Override
    public void close() throws IOException {
    scanner.close();
    }

    

}