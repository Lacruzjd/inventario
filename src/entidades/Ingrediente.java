package entidades;

import util.FechaAccion;

public class Ingrediente {

    private final int ID;
    private static int contadorID;
    private Categoria categoria;
    private SubCategoria subCategoria;
    private String tipo;
    private String marca;
    private String lote;
    private String vencimiento;
    private String ingreso;
    private Float precio;

    public Ingrediente(){}

    public Ingrediente(Categoria categoria, SubCategoria subcategoria, String tipo, String marca, String lote,
            String vencimiento,
            Float precio) {
        this.categoria = categoria;
        this.subCategoria = subcategoria;
        this.tipo = tipo;
        this.marca = marca;
        this.lote = lote;
        this.vencimiento = vencimiento;
        this.precio = precio;
    }

    {
        this.ingreso = FechaAccion.getFecha();
        ID = ++contadorID;
    }

    @Override
    public String toString() {
        return "Ingrediente [ID=" + ID +
                ", categoria=" + categoria +
                ", subCategoria=" + subCategoria +
                ", tipo=" + tipo +
                ", marca=" + marca +
                ", lote=" + lote +
                ", vencimiento=" + vencimiento +
                ", inhreso=" + ingreso +
                ", precio=" + precio + "]";
    }

}
