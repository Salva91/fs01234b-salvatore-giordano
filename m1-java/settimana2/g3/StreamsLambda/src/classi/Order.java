package classi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private long id;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private Customer customer;
	
	public List<Product> products = new ArrayList<>();
	
	
	
	public void aggiungiProdotto(long id, String name, String category, Double price) {
	    Product nuovoProdotto = new Product(id, name, category, price);
	    products.add(nuovoProdotto);
	}


	
	
	public Order(long id, String status, LocalDate orderDate, LocalDate deliveryDate, Customer customer) {
		super();
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.customer = customer;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public LocalDate getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}


	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}


	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate
				+ ", customer=" + customer + "]";
	}
	
	
	
	
	

}
