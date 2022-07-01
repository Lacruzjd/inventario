import datos.DatosArchivo;
import entidades.Categoria;
import entidades.Ingrediente;
import entidades.SubCategoria;

public class App {
    public static void main(String[] args) throws Exception {
        
        DatosArchivo elemento = new DatosArchivo();
        Categoria categoria = new Categoria("Lacteos");
        SubCategoria subCategoria = new SubCategoria("Leche");
        SubCategoria subCategoria2 = new SubCategoria("Queso");
        
    }
}
