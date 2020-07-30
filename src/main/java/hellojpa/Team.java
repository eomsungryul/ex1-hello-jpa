package hellojpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team {

	@Id @GeneratedValue
	@Column(name = "TEAM_ID")
	private Long id;
	private String name;

	//다대일 양방향으로 쓸경우
//	@OneToMany(mappedBy = "team")
//	List<Member> members = new ArrayList<Member>();

//	//일대다
//	@OneToMany
////	@JoinColumn(name="TEAM_ID") //주석 처리 시 테이블이 한개 더 생성
//	List<Member> members = new ArrayList<Member>();


//	public List<Member> getMembers() {
//		return members;
//	}
//	public void setMembers(List<Member> members) {
//		this.members = members;
//	}

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
//	public List<Member> getMembers() {
//		return members;
//	}
//	public void setMembers(List<Member> members) {
//		this.members = members;
//	}
//
	// 연관관계 편의 메소드
//	public void addMember(Member member) {
//		member.setTeam(this);
//		members.add(member);
//	}

}
