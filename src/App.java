import datos.PruebasTerminal;

import javax.print.DocFlavor.INPUT_STREAM;

import datos.ManejoDatos;
import entidades.Categoria;
import entidades.Ingrediente;
import entidades.SubCategoria;

public class App {
    public static void main(String[] args) throws Exception {
        
        Categoria categoria = new Categoria("Lacteos");
        SubCategoria subCategoria = new SubCategoria("Leche");
        SubCategoria subCategoria2 = new SubCategoria("Quesos");

        Ingrediente ingrediente = new Ingrediente(categoria, subCategoria, "Entera", "Conaprole", "56FH","12/05/22", 40.0);
        Ingrediente ingrediente2 = new Ingrediente(categoria, subCategoria2, "Brie", "Maia", "56FH","12/05/22", 40.0);


        ManejoDatos elemento = new PruebasTerminal();

        elemento.crear(ingrediente);
        elemento.crear(ingrediente2);
        elemento.listar();
     
    }
}
