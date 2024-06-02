public class App {
    public static void main(String[] args) throws Exception {
        
        Empleado[] empleados = new Empleado[2];

        empleados[0] = new EmpleadoTiempoCompleto("Juan", "123", 4000000.00);
        empleados[1] = new EmpleadoMedioTiempo("Carlos", "321", 5004785.00, 20);
    

    for (Empleado empleado : empleados) {
        System.out.println("Empleado: " + empleado.getNombre() + "Salario mensual: $" + empleado.calcularSalario());
    }

    for (int i = 0; i < empleados.length; i++){
        System.out.println("For normal");
        System.out.println("Empleado: " + empleados[i] + "Salario mensual: $" + empleados[i]);
    }


}
}

