package com.abhi.springdemo.invoice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class InvoiceEntity {

	@Entity
	public class InvoiceEntity {
		@Id
		@Column(name= "invoice_id")
		int id;
		
		
		@Column
		int patient_id;
		
		@Column
		String invoice_date;
		
		@Column
		String invoice_time;
		
		@Column
		int item_number;
		
		@Column
		String description;
		
		@Column
		int price;
		
		@Column
		int total_amount;
		
		@Column
		int tax;
		
		
		

		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getpatient_id() {
			return patient_id;
		}

		public void setpatient_id()(int patient_id) {
			this.patient_id= patient_id;
		}
		
		

		public String getinvoice_date() {
			return invoice_date;
		}

		public void setinvoice_date(String invoice_date) {
			this.invoice_date= invoice_date;
		}

		


		public String getinvoice_time() {
			return invoice_time;
		}

		public void setinvoice_time(String invoice_time) {
			this.invoice_time = invoice_time;
		}
		
		public int getitem_number() {
			return item_number;
		}

		public void setitem_number(int item_number) {
			this.item_number = item_number;
		}
		
		
		public String getdescription() {
			return description;
		}

		public void setdescription(String description) {
			this.description= description;
		}
		
		
		public int getprice() {
			return price;
		}

		public void setprice(int price) {
			this.price = price;
		}
		
		
		public int gettotal_amount() {
			return total_amount;
		}

		public void settotal_amount(int total_amount) {
			this.total_amount= total_amount;
		}
		
		
		public int gettax() {
			return tax;
		}

		public void settax(int tax) {
			this.tax= tax;
		}
		
		
		
		

	}
	
}
