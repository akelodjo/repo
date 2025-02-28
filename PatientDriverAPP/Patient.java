
public class Patient {
		private String first_name, middle_name,last_name, street_address,city,state,zip,
						phone_number,emergency_name,emergency_contact;
		//contructors
		public Patient() {
			
		}
		public Patient(String first_name,String middle_name,String last_name) {
			this.first_name=first_name;
			this.middle_name=middle_name;
			this.last_name=last_name;
		}
		public Patient(String first_name,String middle_name,String last_name,String street_address,String city,String state,String zip,String phone_number,String emergency_name,String emergency_contact) {
			this.first_name=first_name;
			this.middle_name=middle_name;
			this.last_name=last_name;
			this.street_address=street_address;
			this.city=city;
			this.state=state;
			this.zip=zip;
			this.phone_number=phone_number;
			this.emergency_name=emergency_name;
			this.emergency_contact=emergency_contact;
		}
		
		// accessor for each attributes
		public String getfirst_name() {
			 return this.first_name;
			}
		public String getmiddle_name() {
			return this.middle_name;
			}
		public String getlast_name() {
				return this.last_name;
			}
		public String getcity() {
		        return this.city;
			}
		public String getstate() {
			return this.state;
			}
		public String getzip() {
			return this.zip;
			}
		public String getphone_number() {
			return this.phone_number;
			}
		public String getemergency_name() {
			return this.emergency_name;
			}
		public String getemergency_contact() {
			return this.emergency_contact;
			}
		// mutator for each attributes
		public void setFirstName(String first_name) { 
				 this.first_name = first_name; 
			 }
		public void setMiddleName(String middle_name)
			    { 
			    	this.middle_name = middle_name; 
			    	}
		public void setLastName(String last_name) { 
			    	this.last_name = last_name;
			    	}
		public void setStreetAddress(String street_address) { 
			    	this.street_address = street_address;
			    	}
		public void setCity(String city) {
			    	this.city = city; 
			    	}
		public void setState(String state) { 
			    	this.state = state; 
			    	}
		public void setZip(String zip) { 
			    	this.zip = zip;
			    	}
		public void setPhoneNumber(String phone_number) { 
			    	this.phone_number = phone_number;
			    	}
		public void setEmergencyName(String emergency_name) { 
			    	this.emergency_name = emergency_name;
			    	}
		public void setEmergencyContact(String emergency_contact) {
			    	this.emergency_contact = emergency_contact;
			    	}
		public String buildFullName() {
				return first_name+" "+ middle_name+" "+last_name;
				
			}
		 /*
	     * this method display return a string which is patient address
	     */
		public String buildAddress() {
				return street_address+" "+city+" "+state+" "+zip;
			}
		 /*
	     * this method display return a string which is patient emergency info output
	     */
		public String buildEmergencyContact() {
				return emergency_name+" "+emergency_contact;
			}
		 /*
	     * this method display return a string which is the patient information output
	     */
		public  String toString () {
			return "Patient info:\n  Name: "+buildFullName()+"\n"+"  Address: "+buildAddress()+"\n"+"  EmergencyContact: "+ buildEmergencyContact()+"\n";
			}
}
