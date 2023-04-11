
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid Sanae
 */
public class teste {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("agendar");
        EntityManager em = factory.createEntityManager();
        
        AgendarAtendimento agendamento = new AgendarAtendimento();
        agendamento.setNomeCompleto("Ingrid Morio");
        agendamento.setCpf("000.000.000-00");
        agendamento.setPlanoDeSaude("sim");
        agendamento.setNumPlano("00.0000-00");
        agendamento.setTelefone("00000-0000");
        agendamento.setEmail("ingrid@email.com");
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(agendamento);
        tx.commit();
        em.close();
        factory.close();
                
    }
}
