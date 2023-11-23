package application;

import entities.model.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Program {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "Kauã", "Kauã@gmail.com");
        Pessoa p2 = new Pessoa(null, "Nary", "Nary@gmail.com");
        Pessoa p3 = new Pessoa(null, "Gleice", "kaua@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("introductionJPA");

        EntityManager em = emf.createEntityManager();


            //=== INSERINDO DADOS NO BD ===

            em.getTransaction().begin();

            //em.persist(p1);
            em.persist(p2);
            //em.persist(p3);

            em.getTransaction().commit();


        /*
            === BUSCANDO DADO ===

            Pessoa p = em.find(Pessoa.class, 7);

            System.out.println(p);
        */


        /*
            === DELETANDO DADO ===

            Pessoa p = em.find(Pessoa.class, 2);

            em.getTransaction().begin();

            em.remove(p);

            em.getTransaction().commit();
        */


        emf.close();
        em.close();

        System.out.println("Pronto");
    }
}
