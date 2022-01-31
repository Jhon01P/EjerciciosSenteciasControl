
package ec.edu.intsuperior.controlador;
public class Pais {
     private String codigoPais;
     private String nombrePais;

    public Pais() {
    }

    public Pais(String codigoPais, String nombrePais) {
        this.codigoPais = codigoPais;
        this.nombrePais = nombrePais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }
@Override
    public String toString() {
        return getCodigoPais() + " - " + getNombrePais();
    }
}
