package demo.entities;
// Generated Oct 29, 2017 9:19:33 PM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrdersDetailId generated by hbm2java
 */
@Embeddable
public class OrdersDetailId implements java.io.Serializable {

	private int ordersId;
	private int productId;

	public OrdersDetailId() {
	}

	public OrdersDetailId(int ordersId, int productId) {
		this.ordersId = ordersId;
		this.productId = productId;
	}

	@Column(name = "ordersId", nullable = false)
	public int getOrdersId() {
		return this.ordersId;
	}

	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}

	@Column(name = "productId", nullable = false)
	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrdersDetailId))
			return false;
		OrdersDetailId castOther = (OrdersDetailId) other;

		return (this.getOrdersId() == castOther.getOrdersId()) && (this.getProductId() == castOther.getProductId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getOrdersId();
		result = 37 * result + this.getProductId();
		return result;
	}

}
