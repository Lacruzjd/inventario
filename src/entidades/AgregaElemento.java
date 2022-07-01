package entidades;

import java.util.ArrayList;

public class AgregaElemento {

    private ArrayList<Object> elementos = new ArrayList<>();

    public void agregarElemento(Object elemento){
        this.elementos.add(elemento);
    }

    public void listarElementos(){
        for (Object object : elementos) {
            System.out.println(object);
            
        }
    }

    @Override
    public String toString() {
        return "Elemento ["+ elementos + "]";
    }

    

}
