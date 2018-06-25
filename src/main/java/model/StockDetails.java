package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDate;

@Entity
@Table(name = "stock_details")
public class StockDetails {
	@Id
	@Column(name = "stock_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stockId;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Stock stock;

	@Column(name = "comp_name")
	private String compName;

	@Column(name = "comp_desc")
	private String compDesc;

	@Temporal(TemporalType.DATE)
	@Column(name = "listed_date")
	private LocalDate listedDate = LocalDate.now();

	public StockDetails(Stock stock, String compName, String compDesc) {
		this.stock = stock;
		this.compName = compName;
		this.compDesc = compDesc;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getCompDesc() {
		return compDesc;
	}

	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}

	public LocalDate getListedDate() {
		return listedDate;
	}
}
