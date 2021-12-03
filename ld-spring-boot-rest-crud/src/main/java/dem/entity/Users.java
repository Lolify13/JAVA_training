
package dem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "USERS")
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
	private String createAt;
	
	@Column(name="UPDATED_AT")
	private String updateAt;
	
	
	public Users(Long userid, String username, String password, int numofaccounts, String listofaccounts,
			float totalbal, String contact, String createAt, String updateAt) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.numofaccounts = numofaccounts;
		this.listofaccounts = listofaccounts;
		this.totalbal = totalbal;
		this.contact = contact;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}


	public Users() {
		super();

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


	public float getTotalbal() {
		return totalbal;
	}


	public String getContact() {
		return contact;
	}


	public String getCreateAt() {
		return createAt;
	}


	public String getUpdateAt() {
		return updateAt;
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


	public void setTotalbal(float totalbal) {
		this.totalbal = totalbal;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}


	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}
	



	

}
