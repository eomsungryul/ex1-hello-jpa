package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //JPA가 관리하는 객체
//@Table(name = "MBR") // MBR이라는 테이블과 매핑된다.
//@Entity(name = "Member") // 다른 패키지의 같은 이름의 클래스가 있는 경우 하나는 다른 이름을 써줘야 할 때 정도 사용.
// @Table(name = "USER") 테이블 서로 다를 경우 매핑
public class Member {
	@Id
	// @Column(name = "id") 칼럼명 서로 다를 경우 매핑
	private Long id;
	private String name;
	//private int age;
	//private int gogo;
	// Getter, Setter …
	
	public Member() {
		
	}
	
	public Member(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
