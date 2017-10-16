package challenges;

import java.util.Date;


public  class Episode extends Rating{
	String name;
	Date airingDate;
	String code;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return airingDate;
	}
	public void setDate(Date airingDate) {
		this.airingDate = airingDate;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public Episode(String name, Date airingDate, String code) {
		super();
		this.name = name;
		this.airingDate = airingDate;
		this.code = code;
	}
	
	
}
