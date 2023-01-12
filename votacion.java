/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed_t4_ejer1;

/**
 *
 * @author otecorse
 */
public class votacion {

    private String nombre;
    private Integer votos;

    public void Votacion(String nombre, Integer votos) {
        this.nombre = nombre;
        this.votos = votos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos() {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Votacion [nombre=" + nombre + ", votos=" + votos + "]";
    }
}
