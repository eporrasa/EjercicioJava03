package Principal;

import Supermercado.Cereales;
import Supermercado.Detergente;
import Supermercado.EsAlimento;
import Supermercado.Vino;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author edwin
 */
public class ProgramaPrueba {

    public static void main(String[] args) {

        Detergente det1 = new Detergente("limpiamas", 2.5);
        det1.setVolumen(33);
        det1.setDescuento(2);
        det1.setTipoEnvase("Botella de plástico pequeña");

        System.out.println(det1);

        Cereales cer1 = new Cereales("Crunchy", "espelta", 3);
        cer1.setCaducidad(LocalDate.of(2024, 6, 15));

        System.out.println("Cereal: " + cer1);

        Vino vin1 = new Vino("plimpar", "Tinto", 12, 8);
        vin1.setVolumen(330);
        vin1.setTipoEnvase("Botella de cristal");
        vin1.setCaducidad(LocalDate.of(2024, 4, 29));
        vin1.setDescuento(5);

        System.out.println("Vino: " + vin1);

        ArrayList<EsAlimento> lista = new ArrayList<>();
        lista.add(cer1);
        lista.add(vin1);

        int totalCalorias = 0;
        for (EsAlimento alimento : lista) {
            totalCalorias += alimento.getCalorias();
        }
        
        System.out.println("Total Calorias : " + totalCalorias);

    }

}
