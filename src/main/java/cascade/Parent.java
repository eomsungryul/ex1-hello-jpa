package cascade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Parent {

	@Id @GeneratedValue
	private Long id;
	private String name;

	//다대일 양방향으로 쓸경우
	@OneToMany(mappedBy = "parent")
	List<Child> childList = new ArrayList<Child>();


	public List<Child> getChildList() {
		return childList;
	}

	public void setChildList(List<Child> childList) {
		this.childList = childList;
	}

	public void addChild(Child child) {
		childList.add(child);
		child.setParent(this);
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
