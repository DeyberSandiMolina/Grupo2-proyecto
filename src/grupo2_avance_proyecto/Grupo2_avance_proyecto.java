package grupo2_avance_proyecto;
import javax.swing.JOptionPane;
public class Grupo2_avance_proyecto {

    
    public static void main(String[] args) {
        int loop = 0;
        while (loop == 0){
        int entrada = Integer.parseInt(JOptionPane.showInputDialog("🐥Bienvenido a los pollitos🐥\n1. Registro\n2. Ver inventario\n3. Registrar una venta \n4. Salir"));
            switch(entrada){
                case 1:
                    int entrada1 = Integer.parseInt(JOptionPane.showInputDialog("🐥Menu de Registro🐥\n1. Registrar nuevos productos\n2. Registrar una marca\n3. Registrar una categoria \n4. Regresar"));
                    JOptionPane.showMessageDialog(null, "🐥comming soon...🐥");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "🐥comming soon...🐥");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "🐥comming soon...🐥");
                    break;
                case 4:
                    loop=-1;
                    JOptionPane.showMessageDialog(null, "🐥Muchas gracias por usar nustro sistema, vuelva pronto🐥");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida");
                    break;
            }
        }
    }
    
}
