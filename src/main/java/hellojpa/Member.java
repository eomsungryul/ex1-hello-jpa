package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
// @Table(name = "USER") 테이블 서로 다를 경우 매핑
public class Member {
	@Id
	// @Column(name = "id") 칼럼명 서로 다를 경우 매핑
	private Long id;
	private String name;
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