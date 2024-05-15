package epicode.it.pizza;

import java.sql.Date;
import java.util.List;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor

public class Order {
	private List <Item> orderList;
	private Double totalcost;
	private int orderNumber;
	private int numPeople;
	private Date orderTime;
	
	private OdersStatus status;

	public Order(List<Item> orderList, Double totalcost, int orderNumber, int numPeople, Date orderTime,
			OdersStatus status) {
		
		this.orderList = orderList;
		this.totalcost = totalcost;
		this.orderNumber = orderNumber;
		this.numPeople = numPeople;
		this.orderTime = new Date();
		this.status = OdersStatus.PENDING;
	}
	
	public Double calculateTotal(List<Item> orderList){
        Double tot = 0.0;
       for (Item e:orderList){
           tot+=e.getPrice();
       }
        return tot;
     }
	
	

}
