/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidades.Documento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Lautarito
 */
public class ControladorBuscador {
    
    
    public List<Documento> buscar(String consulta){
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("buscadorPU");
        EntityManager em = emf.createEntityManager();
        List<Documento> lista = em.createQuery("select 1 from Libros 1", Documento.class).getResultList();
        return lista;
        
    }
}
