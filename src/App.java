import datos.PruebasTerminal;

import javax.print.DocFlavor.INPUT_STREAM;

import datos.ManejoDatos;
import entidades.Categoria;
import entidades.Ingrediente;
import entidades.SubCategoria;

public class App {
    public static void main(String[] args) throws Exception {
        
        Categoria lacteos = new Categoria("Lacteos");
        ManejoDatos categorias = new PruebasTerminal();
        categorias.crear(lacteos);

        SubCategoria leche = new SubCategoria("Leche");
        SubCategoria quesos = new SubCategoria("Quesos");
        ManejoDatos subCategorias = new PruebasTerminal();
        subCategorias.crear(leche);
        subCategorias.crear(quesos);
        subCategorias.eliminar(quesos);

        categorias.listar();
        subCategorias.listar();

       Ingrediente ingrediente = new Ingrediente(lacteos, leche, "Entera", "Conaprole", "56FH","12/05/22", 40.0);
        Ingrediente ingrediente2 = new Ingrediente(lacteos, quesos, "Brie", "Maia", "56FH","12/05/22", 40.0);


        ManejoDatos elemento = new PruebasTerminal();

        elemento.crear(ingrediente);
        elemento.crear(ingrediente2);
        elemento.listar();
     
    }
}
