package com.mbraceHub.hibernateSpecs;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

	@Entity
	public class Availability implements Serializable {
	     
	    private static final long serialVersionUID = 1L;
	     

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		private String institution_id;
		@Temporal(TemporalType.TIMESTAMP)
		private Date time ;
		
		
		public String getInstitution_id() {
			return institution_id;
		}
		public void setInstitution_id(String institution_id) {
			this.institution_id = institution_id;
		}
		public Date getTime() {
			return time;
		}
		public void setTime(Date time) {
			this.time = time;
		}



	}
