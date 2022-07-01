import entidades.Categoria;
import entidades.AgregaElemento;
import entidades.Ingrediente;
import entidades.SubCategoria;

public class App {
    public static void main(String[] args) throws Exception {
        
        AgregaElemento elemento = new AgregaElemento();
        Categoria categoria = new Categoria("Lacteos");
        SubCategoria subCategoria = new SubCategoria("Leche");
        SubCategoria subCategoria2 = new SubCategoria("Queso");
        
        Ingrediente ingrediente = new Ingrediente( categoria, subCategoria,"Entera","Conaprole", "345JK", "10/08/2022", 40F);
        elemento.agregarElemento(ingrediente);
        
        Ingrediente ingrediente2 = new Ingrediente(categoria, subCategoria, "Descremada","Camprolet", "345JK", "10/08/2022", 40F);
        elemento.agregarElemento(ingrediente2);

        Ingrediente ingrediente3 = new Ingrediente(categoria, subCategoria2,"Brie","Conaprole", "345JK", "10/08/2022", 40F);
        elemento.agregarElemento(ingrediente3);
        
        elemento.listarElementos();

        System.out.println(categoria.getNombre()+subCategoria.getNombre());
    }
}
