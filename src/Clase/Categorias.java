/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author Edi
 */
public class Categorias extends Inicio {
    private String NomAlbum;

    public Categorias(String NomAlbum, String NomGrupo, String anio) {
        super(NomGrupo, anio);
        this.NomAlbum = NomAlbum;
    }

    public String getNomAlbum() {
        return NomAlbum;
    }
    
    
}
