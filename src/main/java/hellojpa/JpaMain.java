package hellojpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

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
		
		
		// 트랜잭션
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		try {
//			// INSERT 예제
//			Member member = new Member();
//			member.setId(2L);
//			member.setName("HelloB");
//			
//			em.persist(member); // persist 저장
//	

//			// SELECT 예제
//			Member findMember = em.find(Member.class, 1L);
//			System.out.println(findMember.getId());
//			System.out.println(findMember.getName());
			
			
//			// UPDATE
//			Member findMember = em.find(Member.class, 1L);
////			 jpa를 통해 값을 가져오게 되면 그 값을 영속적으로 관리 
////			 UPDATE 쿼리가 즉시 수행 됨.
//			findMember.setName("HelloJPA");
			
			
//			// JPQL 예제
//			List<Member> result = em.createQuery("select m from Member as m", Member.class).getResultList()
			
			
//			// 페이징 예제
//			List<Member> result = em.createQuery("select m from Member as m", Member.class)
//					.setFirstResult(10)
//					.setMaxResults(50)
//					.getResultList();
//			
//			for(Member member : result) {
//				System.out.println("member.name = " + member.getName());
//			}
	
			
//			//객체를 생성한 상태(비영속)
//			Member member = new Member();
//			member.setId(101L);
//			member.setName("TEST");;
//			
//			System.out.println("=== BEFORE ===");
//			em.persist(member);
//			System.out.println("=== AFTER ===");
//			
			
//			// 영속성 컨텍스트 예제
//			Member member = new Member();
//			member.setId(101L);
//			member.setName("TEST");;
			
			
//			System.out.println("=== BEFORE ===");
//			em.persist(member);
//			System.out.println("=== AFTER ===");
//			
			
//			Member findMember1 = em.find(Member.class, 101L);
//			Member findMember2 = em.find(Member.class, 101L);
//			
//			System.out.println("findMember id = " + findMember.getId());
//			System.out.println("findMember name = " + findMember.getName());
//			
			
			// 쓰기지연SQL 저장소 예제
//			Member member1 = new Member(111L, "A");
//			Member member2 = new Member(222L, "B");
//
//			em.persist(member1);
//			em.persist(member2);
//			
//			System.out.println("=================");
//			
//			tx.commit();
			
			//플러시 예제
//			Member member = new Member(200L, "member200");
//			em.persist(member);
//			em.flush(); //강제 호출
//			System.out.println("=================");
			
			//준영속 상태 예제
//			Member member = em.find(Member.class, 150L);
//			member.setName("AAAAA");
//			
//			em.detach(member); //준영속 컨텍스트로 변경. JPA에서 관리 X
//			em.clear(); //영속성 컨텍스트를 통째로 지움. 초기화. 1차 캐시도 사라짐.
//			
//			Member member2 = em.find(Member.class, 150L); //초기화 되었기에, 영속성 컨텍스트가 처음부터 다시 올려진다.
			
			System.out.println("=================");
		} catch(Exception e) {
			tx.rollback();
		} finally {
			em.close();
		}

		emf.close();
	}

}
