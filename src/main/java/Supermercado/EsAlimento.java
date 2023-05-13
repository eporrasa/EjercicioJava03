package Supermercado;

import java.time.LocalDate;

/**
 *
 * @author edwin
 */
public interface EsAlimento {

    public void setCaducidad(LocalDate fc);

    public LocalDate getCaducidad();

    public int getCalorias();

}
