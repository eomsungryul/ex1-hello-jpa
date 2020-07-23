//package hellojpa;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class JpaMain {
//
//	/**
//	 * @param args
//	 */
//	/**
//	 * @param args
//	 */
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//		EntityManager em = emf.createEntityManager();
//		
//		
//		// �듃�옖�옲�뀡
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//		
//		try {
////			// INSERT �삁�젣
////			Member member = new Member();
////			member.setId(2L);
////			member.setName("HelloB");
////			
////			em.persist(member); // persist ���옣
////	
//
////			// SELECT �삁�젣
////			Member findMember = em.find(Member.class, 1L);
////			System.out.println(findMember.getId());
////			System.out.println(findMember.getName());
//			
//			
////			// UPDATE
////			Member findMember = em.find(Member.class, 1L);
//////			 jpa瑜� �넻�빐 媛믪쓣 媛��졇�삤寃� �릺硫� 洹� 媛믪쓣 �쁺�냽�쟻�쑝濡� 愿�由� 
//////			 UPDATE 荑쇰━媛� 利됱떆 �닔�뻾 �맖.
////			findMember.setName("HelloJPA");
//			
//			
////			// JPQL �삁�젣
////			List<Member> result = em.createQuery("select m from Member as m", Member.class).getResultList()
//			
//			
////			// �럹�씠吏� �삁�젣
////			List<Member> result = em.createQuery("select m from Member as m", Member.class)
////					.setFirstResult(10)
////					.setMaxResults(50)
////					.getResultList();
////			
////			for(Member member : result) {
////				System.out.println("member.name = " + member.getName());
////			}
//	
//			
////			//媛앹껜瑜� �깮�꽦�븳 �긽�깭(鍮꾩쁺�냽)
////			Member member = new Member();
////			member.setId(101L);
////			member.setName("TEST");;
////			
////			System.out.println("=== BEFORE ===");
////			em.persist(member);
////			System.out.println("=== AFTER ===");
////			
//			
////			// �쁺�냽�꽦 而⑦뀓�뒪�듃 �삁�젣
////			Member member = new Member();
////			member.setId(101L);
////			member.setName("TEST");;
//			
//			
////			System.out.println("=== BEFORE ===");
////			em.persist(member);
////			System.out.println("=== AFTER ===");
////			
//			
////			Member findMember1 = em.find(Member.class, 101L);
////			Member findMember2 = em.find(Member.class, 101L);
////			
////			System.out.println("findMember id = " + findMember.getId());
////			System.out.println("findMember name = " + findMember.getName());
////			
//			
//			// �벐湲곗��뿰SQL ���옣�냼 �삁�젣
////			Member member1 = new Member(111L, "A");
////			Member member2 = new Member(222L, "B");
////
////			em.persist(member1);
////			em.persist(member2);
////			
////			System.out.println("=================");
////			
////			tx.commit();
//
//			//�뵆�윭�떆 �삁�젣
////			Member member = new Member(200L, "member200");
////			em.persist(member);
////			em.flush(); //媛뺤젣 �샇異�
////			System.out.println("=================");
//			
//			//以��쁺�냽 �긽�깭 �삁�젣
////			Member member = em.find(Member.class, 150L);
////			member.setName("AAAAA");
////			
////			em.detach(member); //以��쁺�냽 而⑦뀓�뒪�듃濡� 蹂�寃�. JPA�뿉�꽌 愿�由� X
////			em.clear(); //�쁺�냽�꽦 而⑦뀓�뒪�듃瑜� �넻吏몃줈 吏���. 珥덇린�솕. 1李� 罹먯떆�룄 �궗�씪吏�.
////			
////			Member member2 = em.find(Member.class, 150L); //珥덇린�솕 �릺�뿀湲곗뿉, �쁺�냽�꽦 而⑦뀓�뒪�듃媛� 泥섏쓬遺��꽣 �떎�떆 �삱�젮吏꾨떎.
//			
//			//7. �떒諛⑺뼢 �뿰愿�愿�怨�
//			//��, 硫ㅻ쾭 �깮�꽦
//			Team team = new Team();
//			team.setName("TeamA");
//			em.persist(team);
//			
//			
//			
//			Member member = new Member();
//			member.setUsername("member1");
//			member.setTeam(team);//jpa媛� team�뿉�꽌 PK媛믪쓣 爰쇰궡�뼱 insert �떆 �쇅�옒�궎濡� �궗�슜�븳�떎.
////			
////			//硫ㅻ쾭瑜� ���뿉 �냼�냽
////			member.setTeamId(team.getId()); //�븷留ㅽ븳 遺�遺�.
//			em.persist(member);
////			
////			em.flush();
////			em.clear(); //select 荑쇰━媛� �굹媛��뒗 寃껋쓣 �솗�씤�븷 �닔 �엳�떎.
//			
////			//�듅�젙 硫ㅻ쾭媛� �냼�냽�릺�뼱�엳�뒗 ���쓣 李얘퀬�옄 �븳�떎硫�...
//			Member findMember = em.find(Member.class, member.getId());//硫ㅻ쾭�쓽 �븘�씠�뵒瑜� 媛��졇�샂
////			Long findTeamId = findMember.getTeamId();//�� �븘�씠�뵒瑜� 媛��졇�샂
////			Team findTeam = em.find(Team.class, findTeamId);//�� �븘�씠�뵒濡� �� 議고쉶
////			//�뿰愿�愿�怨꾧� �뾾�뼱 �뿬�윭 踰� 吏덉쓽瑜� �빐�빞�븯�뒗 遺�遺꾩씠 �깮湲곌쾶 �맂�떎.
//			
//			//�듅�젙 硫ㅻ쾭媛� �냼�냽�릺�뼱�엳�뒗 ���쓣 李얘퀬�옄 �븳�떎硫�...ver.2
//			Team findTeam = findMember.getTeam();//�듅�젙 硫ㅻ쾭�쓽 ���쓣 諛붾줈 媛��졇�삱 �닔 �엳�떎
//			System.out.println("findTeam = "+findTeam.getName());
//			
//			//留뚯빟 �깉濡쒖슫 ���쑝濡� �쁺�엯�븯怨좎옄 �븳�떎硫�?
//			Team newTeam = em.find(Team.class, 100L);//pk媛� 100�씤 硫ㅻ쾭�쓣 李얜뒗�떎(100踰덉씤 硫ㅻ쾭媛� �엳�떎怨� 媛��젙). 
//			findMember.setTeam(newTeam);//李얠� 硫ㅻ쾭瑜� �깉濡쒖슫 ���쑝濡� �꽭�똿�븳�떎.
//			
//			tx.commit();
//
//			System.out.println("=================");
//		} catch(Exception e) {
//			tx.rollback();
//		} finally {
//			em.close();
//		}
//
//		emf.close();
//	}
//
//}
