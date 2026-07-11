// Autor: Chavez Castillo Leonardo
package Internet.Product; // Define el paquete donde se encuentra la clase

public abstract class PlanDatos { // Clase abstracta base que representa un plan genérico
    protected String nombre;     // Atributo protegido para el nombre del plan (accesible por subclases)
    protected float tasa;        // Atributo protegido para el costo por megabyte
    protected String proveedor;   // Atributo protegido para almacenar si es Claro o Movistar

    // Método modificador para asignar la tasa de pago del plan
    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    // Método modificador para asignar el nombre del proveedor
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    // Método que calcula el costo total multiplicando los megas consumidos por la tasa
    public float calculoPago(int datos) {
        return datos * this.tasa;
    }

    // Sobrescribe el método toString para formatear la salida del objeto en texto legible
    @Override
    public String toString() {
        return String.format("Plan: %s | Proveedor: %s | Tasa por MB: S/. %.2f", 
                nombre, proveedor, tasa);
    }
}