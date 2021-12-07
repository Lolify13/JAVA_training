
package dem.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;




@Entity

@Table(name = "USERS")
@SecondaryTable(name = "ACCOUNT_DETAILS", pkJoinColumns = @PrimaryKeyJoinColumn(name = "USER_ID"))
public class Users {
	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;

	@Column(name = "USER_NAME")
	private String username;

	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "NUMBER_OF_ACCOUNTS")
	private int numofaccounts;
	
	@Column(name="LIST_OF_ACCOUNTS")
	private String listofaccounts;
	
	@Column(name="TOTAL_BALANCE")
	private float totalbal;
	
	@Column(name="CONCTACT_NUMBER")
	private String contact;
	
	@Column(name="CREATED_AT")
	LocalDateTime createdAt = LocalDateTime.now();
	
	@Column(name="UPDATED_AT")
	LocalDateTime updatedAt = LocalDateTime.now();
	
	@Column(name="ACCOUNT_NUMBER", table = "ACCOUNT_DETAILS")
	private String accnumber;
	
	@Column(name="ACCOUNT_TYPE", table = "ACCOUNT_DETAILS")
	private String acctype;
	
	@Column(name="ACCOUNT_BALANCE", table = "ACCOUNT_DETAILS")
	private float accbal;
	
	

	public Users() {
		super();
	}



	public Users(Long userid, String username, String password, int numofaccounts, String listofaccounts,
			float totalbal, String contact, LocalDateTime createdAt, LocalDateTime updatedAt, String accnumber,
			String acctype, float accbal) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.numofaccounts = numofaccounts;
		this.listofaccounts = listofaccounts;
		this.totalbal = totalbal;
		this.contact = contact;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.accnumber = accnumber;
		this.acctype = acctype;
		this.accbal = accbal;
	}



	public Long getUserid() {
		return userid;
	}



	public String getUsername() {
		return username;
	}



	public String getPassword() {
		return password;
	}



	public int getNumofaccounts() {
		return numofaccounts;
	}



	public String getListofaccounts() {
		return listofaccounts;
	}



	public float getTotalbal() {
		return totalbal;
	}



	public String getContact() {
		return contact;
	}



	public LocalDateTime getCreatedAt() {
		return createdAt;
	}



	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}



	public String getAccnumber() {
		return accnumber;
	}



	public String getAcctype() {
		return acctype;
	}



	public float getAccbal() {
		return accbal;
	}



	public void setUserid(Long userid) {
		this.userid = userid;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void setNumofaccounts(int numofaccounts) {
		this.numofaccounts = numofaccounts;
	}



	public void setListofaccounts(String listofaccounts) {
		this.listofaccounts = listofaccounts;
	}



	public void setTotalbal(float totalbal) {
		this.totalbal = totalbal;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}



	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}



	public void setAccnumber(String accnumber) {
		this.accnumber = accnumber;
	}



	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}



	public void setAccbal(float accbal) {
		this.accbal = accbal;
	}

	
	
}
