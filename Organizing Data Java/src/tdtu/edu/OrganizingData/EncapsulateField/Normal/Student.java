package tdtu.edu.OrganizingData.EncapsulateField.Normal;

import java.util.Date;

public class Student {
	public String code;
	public String name;
	public Date dateOfBirth;

	public Student(String code, String name, Date dateOfBirth) {
		super();
		this.code = code;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

}
