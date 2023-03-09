package com.einfochips.demomvc121.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class user {
	

		private String name;
		@Id
		private String email;
		private String no;
		private String country;
		public user(String name, String email, String no, String country) {
			super();
			this.name = name;
			this.email = email;
			this.no = no;
			this.country = country;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getNo() {
			return no;
		}
		public void setNo(String no) {
			this.no = no;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		@Override
		public String toString() {
			return "user [name=" + name + ", email=" + email + ", no=" + no + ", country=" + country + "]";
		}
		
		
}
