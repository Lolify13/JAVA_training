/*
 * package dem.entity;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.OneToOne; import
 * javax.persistence.PrimaryKeyJoinColumn; import javax.persistence.Table;
 * 
 * 
 * 
 * @Entity
 * 
 * @Table(name="ACCOUNT_DETAILS") public class AccountDetails {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY)
 * 
 * @Column(name = "USER_ID") Long userid;
 * 
 * @OneToOne
 * 
 * @PrimaryKeyJoinColumn(name = "USER_ID") Users users;
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */