package datos;

public interface ManejoDatos {
    
    public abstract void crear(Object elemento);
    public abstract void actualizar();
    public abstract void eliminar(Object elemento);
    public abstract void listar();

}
