package tdtu.edu.OrganizingData.ReplaceAnArraywithObject;

public class People {
	private String name;
	private String phone;
	private String address;

	public People() {
	};

	public People(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
