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
			
			//7. 단방향 연관관계
			//팀, 멤버 생성
			Team team = new Team();
			team.setName("TeamA");
			em.persist(team);
			
			
			
			Member member = new Member();
			member.setUsername("member1");
			member.setTeam(team);//jpa가 team에서 PK값을 꺼내어 insert 시 외래키로 사용한다.
//			
//			//멤버를 팀에 소속
//			member.setTeamId(team.getId()); //애매한 부분.
			em.persist(member);
//			
//			em.flush();
//			em.clear(); //select 쿼리가 나가는 것을 확인할 수 있다.
			
//			//특정 멤버가 소속되어있는 팀을 찾고자 한다면...
			Member findMember = em.find(Member.class, member.getId());//멤버의 아이디를 가져옴
//			Long findTeamId = findMember.getTeamId();//팀 아이디를 가져옴
//			Team findTeam = em.find(Team.class, findTeamId);//팀 아이디로 팀 조회
//			//연관관계가 없어 여러 번 질의를 해야하는 부분이 생기게 된다.
			
			//특정 멤버가 소속되어있는 팀을 찾고자 한다면...ver.2
			Team findTeam = findMember.getTeam();//특정 멤버의 팀을 바로 가져올 수 있다
			System.out.println("findTeam = "+findTeam.getName());
			
			//만약 새로운 팀으로 영입하고자 한다면?
			Team newTeam = em.find(Team.class, 100L);//pk가 100인 멤버을 찾는다(100번인 멤버가 있다고 가정). 
			findMember.setTeam(newTeam);//찾은 멤버를 새로운 팀으로 세팅한다.
			
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
