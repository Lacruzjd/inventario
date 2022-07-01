package datos;

import java.util.HashSet;

public class PruebasTerminal implements ManejoDatos {

    private HashSet<Object> datos = new HashSet<>();

    public PruebasTerminal(){}

    @Override
    public void crear(Object elemento) {
        this.datos.add(elemento);
    }

    @Override
    public void actualizar() {
        
    }

    @Override
    public void eliminar(Object elemento) {
        datos.remove(elemento);
        
    }

    @Override
    public void listar() {
        for (Object object : datos) {
            System.out.println(object.toString());
        }
        
    }

}
