package hellojpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Table(name = "MBR") // MBR이라는 테이블과 매핑된다.
//@Entity(name = "Member") // 다른 패키지의 같은 이름의 클래스가 있는 경우 하나는 다른 이름을 써줘야 할 때 정도 사용.
// @Table(name = "USER") 테이블 서로 다를 경우 매핑
@Entity //JPA가 관리하는 객체
public class Member {
	@Id @GeneratedValue
	// @Column(name = "id") 칼럼명 서로 다를 경우 매핑
	@Column(name = "MEMBER_ID")
	private Long id;

	@Column(name = "USERNAME")
	private String username;
	
//	@Column(name = "TEAM_ID")
//	private Long teamId;
	
	//외래키가 있는 곳이 연관관계의 주인.
	@ManyToOne//N:1//Member와 Team이 어떠한 관계인지 나타내준다 1대다? 다대1?
	@JoinColumn(name = "TEAM_ID")//조인할 컬럼을 명시한다.
	private Team team; 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
//	
//	//연관관계 편의 메소드
//	public void changeTeam(Team team) {
//		this.team = team;
//		team.getMembers().add(this);
//	}
//	

//	public Long getTeamId() {
//		return teamId;
//	}
//
//	public void setTeamId(Long teamId) {
//		this.teamId = teamId;
//	}
	
	
	
	//private String name;
	//private int age;
	//private int gogo;
	// Getter, Setter …
	
//	public Member() {
//		
//	}
//	
//	public Member(Long id, String name) {
//		this.id = id;
//		this.name = name;
//	}
//	
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
}

