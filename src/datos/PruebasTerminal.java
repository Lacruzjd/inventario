package datos;


public class PruebasTerminal implements ManejoDatos {

    
    public PruebasTerminal(){}

    @Override
    public void crear(Object elemento) {
        DATOS.add(elemento);;
    }

    @Override
    public void actualizar() {
        
    }

    @Override
    public void eliminar() {
        
    }

    @Override
    public void listar() {
        for (Object object : DATOS) {
            System.out.println(object);
        }
        
    }

}
