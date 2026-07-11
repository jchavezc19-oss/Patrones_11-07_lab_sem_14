// Autor: Chavez Castillo Leonardo
package Internet.Factory; // Define el paquete de las fábricas

import Internet.Product.PlanDatos; // Importa la clase del producto abstracto

public interface PlanDatosFactory { // Interfaz que define el contrato de la fábrica abstracta
    PlanDatos crearPlanDatos(String tipo); // Método abstracto que todas las fábricas deben implementar
} 
