
package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
@Entity
@Table(name = "Libros")
public class Documento{
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        
        private int id;
       
        private String titulo;
        
        @Column(name = "id_autor")
        private int autor;

    public Documento() {
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAutor() {
        return autor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(int autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Documento{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + '}';
    }
        
         
        
}
