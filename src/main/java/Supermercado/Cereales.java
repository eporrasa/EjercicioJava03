package Supermercado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author edwin
 */
public class Cereales implements EsAlimento {

    private String marca;
    private String tipoCereal;
    private double precio;
    private LocalDate caducidad;

    public Cereales(String marca, String tipoCereal, double precio) {
        this.marca = marca;
        this.tipoCereal = tipoCereal;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        this.caducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return this.caducidad;
    }

    @Override
    public int getCalorias() {
        switch (this.tipoCereal.toLowerCase()) {
            case "espelta":
                return 5;
            case "maiz":
                return 8;
            case "trigo":
                return 12;
            default:
                return 15;
        }
    }

    @Override
    public String toString() {
        return "Cereales{" + "marca=" + marca + ", tipoCereal=" + tipoCereal
                + ", precio=" + precio
                + ", Caducidad=" + caducidad.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy"))
                + ", Calorias=" + getCalorias() + '}';
    }

}
