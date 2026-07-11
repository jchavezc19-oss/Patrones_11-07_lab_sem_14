// Autor: Chavez Castillo Leonardo
package Internet.Factory;

import Internet.Product.*; // Importa todas las clases del paquete de productos

public class FabricaClaro implements PlanDatosFactory { // Implementa el contrato de la fábrica abstracta
    
    // Método privado auxiliar para identificar el tipo de objeto real y setear sus tasas correspondientes
    private void configuracionTasas(PlanDatos plan, float tasaAcademico, float tasaPersonal, float tasaNegocio) {
        if (plan instanceof PlanDatosAcademico) plan.setTasa(tasaAcademico);
        else if (plan instanceof PlanDatosPersonal) plan.setTasa(tasaPersonal);
        else if (plan instanceof PlanDatosNegocio) plan.setTasa(tasaNegocio);
    }

    @Override
    public PlanDatos crearPlanDatos(String tipo) { // Sobrescribe el método de creación
        PlanDatos plan = null; // Inicializa la variable de retorno en nulo
        
        // Evalúa el parámetro de tipo y crea la instancia correcta del producto
        if (tipo.equalsIgnoreCase("ACADEMICO")) {
            plan = new PlanDatosAcademico();
        } else if (tipo.equalsIgnoreCase("PERSONAL")) {
            plan = new PlanDatosPersonal();
        } else if (tipo.equalsIgnoreCase("NEGOCIO")) {
            plan = new PlanDatosNegocio();
        }

        if (plan != null) { // Si el plan fue creado exitosamente
            plan.setProveedor("Claro"); // Asigna el proveedor Claro
            configuracionTasas(plan, 0.6f, 1.6f, 1.2f); // Configura las tasas solicitadas para Claro
        }
        return plan; // Retorna el objeto configurado bajo la abstracción PlanDatos
    }
}