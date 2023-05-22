import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Solicitar los datos del empleado
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
        double salarioPorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario básico por hora"));
        int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de horas trabajadas en el mes"));

        // Crear el objeto empleado con los datos recogidos
        Empleado empleado = new Empleado(nombre, salarioPorHora, horasTrabajadas);

        // Calcular el salario mensual
        double salario = empleado.calcularSalarioMensual();

        // Mostrar el resultado
        if (salario > 450000) {
            JOptionPane.showMessageDialog(null, "El empleado " + empleado.getNombre() +
                    " tiene un salario mensual de: " + salario);
        } else {
            JOptionPane.showMessageDialog(null, "El empleado: " + empleado.getNombre());
        }
    }
}
