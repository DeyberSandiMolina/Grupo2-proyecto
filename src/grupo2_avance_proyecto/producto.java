
package grupo2_avance_proyecto;


public class producto {
    private String nombre;
    private String marca;
    private String categoria;
    private int precio;
    
    public producto(String Nombre,String Marca,String Categoria,int Precio){
        nombre=Nombre;
        marca=Marca;
        categoria=Categoria;
        precio=Precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}