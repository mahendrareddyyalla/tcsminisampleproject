import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class UserModel {
    private String userid;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	private String name;
	private LocalDate DOJ;
	private LocalDate DOB;
	private String location;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCTC() {
		return CTC;
	}
	public void setCTC(String cTC) {
		CTC = cTC;
	}
	private String CTC;
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "UserModel [userid=" + userid + ", name=" + name + ", DOJ=" + DOJ + ", DOB=" + DOB + ", location="
				+ location + ", CTC=" + CTC + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDOJ() {
		return DOJ;
	}
	public void setDOJ(LocalDate dOJ) {
		DOJ = dOJ;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
}