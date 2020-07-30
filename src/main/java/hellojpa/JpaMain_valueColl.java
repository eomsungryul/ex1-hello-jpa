package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain_valueColl {

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

			Member member = new Member();
			member.setUsername("member1");
			member.setHomeAddress(new Address("city1","street","awd"));
			member.getFavoriateFoods().add("치킨");
			member.getFavoriateFoods().add("피자");
			member.getFavoriateFoods().add("치킨");

			member.getAddressHistory().add(new Address("ocity1","street","123124"));
			member.getAddressHistory().add(new Address("ocity2","street","234234"));

			em.persist(member);

			//깔끔하게 조회하게 정리
			em.flush();
			em.clear();

			System.out.println("========================");
			Member findMember = em.find(Member.class,member.getId() );

			findMember.getHomeAddress();//값타입은 통으로 갈아껴야함

			//컬렉션 업데이트
			//치킨 > 한식
			findMember.getFavoriateFoods().remove("치킨");
			findMember.getFavoriateFoods().add("한식");

			//주소를 갖고온다
			System.out.println("========ㅁㅇㅇ================");
			findMember.getAddressHistory().remove(new Address("ocity1","street","123124"));
			findMember.getAddressHistory().add(new Address("qncity1","street","123124"));
			//equals 해시코드 무조건 중요 ! 아니면 무조건 안지워짐






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
