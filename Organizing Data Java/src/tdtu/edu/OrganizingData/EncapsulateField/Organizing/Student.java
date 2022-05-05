package tdtu.edu.OrganizingData.EncapsulateField.Organizing;

import java.util.Date;

public class Student {
	private String code;
	private String name;
	private Date dateOfBirth;

	public Student(String code, String name, Date dateOfBirth) {
		super();
		this.code = code;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		// check duplicate and valid code 
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		//check input name is valid
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		// check dateOfBirth
		this.dateOfBirth = dateOfBirth;
	}

}
