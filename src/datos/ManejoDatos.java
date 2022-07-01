package datos;

import java.util.ArrayList;

public interface ManejoDatos {
    
    public static final ArrayList<Object> DATOS = new ArrayList<>();

    public abstract void crear(Object elemento);
    public abstract void actualizar();
    public abstract void eliminar();
    public abstract void listar();

}
