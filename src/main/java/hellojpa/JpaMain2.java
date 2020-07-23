package hellojpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain2 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
	
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {

//			연관관계의 매핑 떄문에 Member에 team이 입력되지 않는다.
//			Member member = new Member();
//			member.setUsername("memberA");
//			em.persist(member);
//			
//			Team team = new Team();
//			team.setName("teamA");
//			team.getMembers().add(member);
//			em.persist(team);

			Team team = new Team();
			team.setName("teamA");
//			team.getMembers().add(member);
			em.persist(team);			
			
			Member member = new Member();
			member.setUsername("memberA");
			member.setTeam(team);
			em.persist(member);
			
			team.addMember(member);

			em.flush();
			em.clear();
			
			Team findTeam = em.find(Team.class, team.getId());
			List<Member> members = findTeam.getMembers();
			
			tx.commit();

			System.out.println("=================");
		} catch(Exception e) {
			tx.rollback();
		} finally {
			em.close();
		}

		emf.close();
	}

}
