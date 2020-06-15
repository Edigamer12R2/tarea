/*
 * 
 */
package Clase;

/**
 *
 * @author Edi
 */
public class Tipos extends Categorias {
    private String Categori;

    public Tipos(String Categori, String NomAlbum, String NomGrupo, String anio) {
        super(NomAlbum, NomGrupo, anio);
        this.Categori = Categori;
    }

    public String getCategori() {
        return Categori;
    }
    
    
}
