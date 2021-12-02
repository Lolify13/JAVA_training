
package dem;

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

	public Users() {
		super();
	}

	public Users(Long userid, String username, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public Long  getUserid() {
		return userid;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserid(Long  userid) {
		this.userid = userid;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
