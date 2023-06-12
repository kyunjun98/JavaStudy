package Personal.com.ict.edu.mybatis2;

// customer 테이블 컬럼명과 일치시키자
public class VO {
	private String id, name, phone, addr, com;

	String getId() {
		return id;
	}
	void setId(String id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getPhone() {
		return phone;
	}

	void setPhone(String phone) {
		this.phone = phone;
	}

	String getAddr() {
		return addr;
	}

	void setAddr(String addr) {
		this.addr = addr;
	}

	String getCom() {
		return com;
	}

	void setCom(String com) {
		this.com = com;
	}
	
	
}
