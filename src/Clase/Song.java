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
public class Song extends Inicio {
    private String NomSong;
    private double time;

    public Song(String NomSong, double time, String NomGrupo, String anio) {
        super(NomGrupo, anio);
        this.NomSong = NomSong;
        this.time = time;
    }

  

    public String getNomSong() {
        return NomSong;
    }

    public void setNomSong(String NomSong) {
        this.NomSong = NomSong;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
    
    
    
}
