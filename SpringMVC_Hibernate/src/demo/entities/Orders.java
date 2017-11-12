package demo.entities;
// Generated Oct 29, 2017 9:19:33 PM by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Orders generated by hbm2java
 */
@Entity
@Table(name = "Orders", catalog = "mydemo")
public class Orders implements java.io.Serializable {

	private int id;
	private Account account;
	private String name;
	private Date creationDate;
	private String payment;
	private Boolean status;
	private Set<OrdersDetail> ordersDetails = new HashSet<OrdersDetail>(0);

	public Orders() {
	}

	public Orders(int id) {
		this.id = id;
	}

	public Orders(int id, Account account, String name, Date creationDate, String payment, Boolean status,
			Set<OrdersDetail> ordersDetails) {
		this.id = id;
		this.account = account;
		this.name = name;
		this.creationDate = creationDate;
		this.payment = payment;
		this.status = status;
		this.ordersDetails = ordersDetails;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AccountId")
	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Column(name = "name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creationDate", length = 23)
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Column(name = "payment", length = 50)
	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
	public Set<OrdersDetail> getOrdersDetails() {
		return this.ordersDetails;
	}

	public void setOrdersDetails(Set<OrdersDetail> ordersDetails) {
		this.ordersDetails = ordersDetails;
	}

}
