// Autor: Chavez Castillo Leonardo
package Internet; // Paquete principal del cliente

import Internet.Factory.*; // Importa las fábricas
import Internet.Product.PlanDatos; // Importa el tipo de producto base

public class PlanDatosCliente { // Clase controladora cliente
    public static void main(String[] args) { // Método de ejecución principal de la aplicación
        System.out.println("=== PRUEBA DE ABSTRACT FACTORY ===");

        // Instancia la fábrica concreta de Claro usando la interfaz general
        PlanDatosFactory fabricaClaro = new FabricaClaro();
        // Solicita la creación de un plan académico
        PlanDatos planClaroAca = fabricaClaro.crearPlanDatos("ACADEMICO");
        // Imprime los datos formateados y realiza un cálculo simulado de 100 megas
        System.out.println(planClaroAca + " | Pago por 100MB: S/. " + planClaroAca.calculoPago(100));

        // Instancia la fábrica concreta de Movistar usando la interfaz general
        PlanDatosFactory fabricaMovistar = new FabricaMovistar();
        // Solicita la creación de un plan de negocio
        PlanDatos planMoviNeg = fabricaMovistar.crearPlanDatos("NEGOCIO");
        // Imprime el resultado y el cálculo analítico
        System.out.println(planMoviNeg + " | Pago por 100MB: S/. " + planMoviNeg.calculoPago(100));
    }
}