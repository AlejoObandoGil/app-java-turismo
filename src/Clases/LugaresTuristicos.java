/*
Clase con atributos y metodos de los lugares.
Esta clase es irrelevante
No se pudo conectar los objetos con los eventos
solo sirve para futuras mejoras de Modelado Vision Control
*/
package Clases;
/**
 *
 * @author Natalia
 */
public class LugaresTuristicos {
    
    private int id;
    private String nombreLugar;
    private String direccion;
    private String Horario;
    private String Entrada;
    private String descripcion;
    //private imagenPerfil;
    public String rutaImagenPerfil;

    public LugaresTuristicos() {
    }
    
    public LugaresTuristicos(int id, String nombreLugar, String direccion, String Horario, String Entrada, String descripcion, String rutaImagenPerfil) {
        this.id = id;
        this.nombreLugar = nombreLugar;
        this.direccion = direccion;
        this.Horario = Horario;
        this.Entrada = Entrada;
        this.descripcion = descripcion;
        this.rutaImagenPerfil = rutaImagenPerfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getEntrada() {
        return Entrada;
    }

    public void setEntrada(String Entrada) {
        this.Entrada = Entrada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRutaImagenPerfil() {
        return rutaImagenPerfil;
    }

    public void setRutaImagenPerfil(String rutaImagenPerfil) {
        this.rutaImagenPerfil = rutaImagenPerfil;
    }           
    
}
