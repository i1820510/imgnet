package com.example.miapp0.modelos;

public class producto {
    private String imagen;
    private String nombre;
    private String precio;
    private String descripcion;


    //constructor de la clase producto

    public producto(String _imagen, String _nombre, String _precio, String _descripcion){
        this.imagen = _imagen;
        this.nombre = _nombre;
        this.precio = _precio;
        this.descripcion = _descripcion;
    }

    //metodos de la clase producto

    public String getImagen() {return this.imagen; }

    public String getNombre() {return nombre; }

    public String getPrecio() {return precio; }

    public String getDescripcion() {return descripcion; }

}
