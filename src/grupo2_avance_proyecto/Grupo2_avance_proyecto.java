package grupo2_avance_proyecto;
import javax.swing.JOptionPane;
public class Grupo2_avance_proyecto {

    
    public static void main(String[] args) {
        
        marca listademarcas[] = new marca[10];
        categoria listadecategorias[] = new categoria[10];
        producto listadeproductos[] = new producto[10];       
        int contadordeproductos=0;
        int contadordemarcas=0;
        int contadordecategorias=0;
        int loop = 0;
        while (loop == 0){
            int entrada = Integer.parseInt(JOptionPane.showInputDialog("🐥Bienvenido a los pollitos🐥\n1. Registro\n2. Ver inventario\n3. Registrar una venta \n4. Salir"));
            switch(entrada){
                case 1:
                    int loop1=0;
                    while (loop1==0){
                        int entrada1 = Integer.parseInt(JOptionPane.showInputDialog("🐥Menu de Registro🐥\n1. Registrar nuevos productos\n2. Registrar una marca\n3. Registrar una categoria \n4. Regresar"));
                        int contador=0;
                        switch (entrada1) {
                            case 1:
                            if (contadordemarcas==0 || contadordecategorias ==0){
                                JOptionPane.showMessageDialog(null, "Imposible almacenar productos sin haber registrado marcas o categorias...");
                                break;
                            }
                            String nombre = JOptionPane.showInputDialog("🐥Registro de Producto🐥\nPor favor digite el nombre del nuevo articulo que desea registrar:");
                            //muestra las marcas para que el usuario seleccione al momento de guardar un producto
                            String mensaje="";
                            //muestra las categorias para que el usuario seleccione al momento de guardar un producto
                            String mensaje2="";
                            for (int indice = 0 ; indice < contadordemarcas; indice++) {
                            mensaje+=(indice+1)+". "+listademarcas[indice].getNombre_marca()+"\n";
                            
                        }
                            int marca = Integer.parseInt(JOptionPane.showInputDialog("🐥Registro de Producto🐥\nPor favor seleccione la marca del nuevo producto:\n"+mensaje));
                            if (marca > contadordemarcas){
                            JOptionPane.showMessageDialog(null, "Opción invalida");
                            break;
                        }
                            for (int indice = 0 ; indice < contadordecategorias; indice++) {
                            mensaje2+=(indice+1)+". "+listadecategorias[indice].getNombre_categoria()+"\n";
                            
                        }
                            int categoria = Integer.parseInt(JOptionPane.showInputDialog("🐥Registro de productos🐥\nPor favor seleccione la categoria del nuevo producto:\n"+mensaje2));
                            if (marca > contadordemarcas){
                            JOptionPane.showMessageDialog(null, "Opción invalida");
                            break;
                        }
                            int precio = Integer.parseInt(JOptionPane.showInputDialog("🐥Registro de productos🐥\nPor digite el precio del nuevo producto:"));
                            //confirmacion de guardado
                            int decision = Integer.parseInt(JOptionPane.showInputDialog("🐥Registro de productos🐥\nEl producto sera almacenado, desea continuar?\n1. Si\n2. No"));                         
                            switch (decision) {
                                case 1:
                                    listadeproductos[contadordeproductos]= new producto(nombre,listademarcas[(marca-1)].getNombre_marca(),listadecategorias[(categoria-1)].getNombre_categoria(),precio);
                                    contadordeproductos+=1;
                                    JOptionPane.showMessageDialog(null,"guardado exitoso...");
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null,"entendido, saliendo sin guardar...");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opción invalida");
                                    break;
                            }
                            break;
                            //registro de marcas
                            case 2:
                            String entrada1_2 = JOptionPane.showInputDialog("🐥Registro de Marca🐥\nPor favor digite el nombre de la nueva marca en el espacio en blanco:");
                            int decision2 = Integer.parseInt(JOptionPane.showInputDialog("🐥Registro de marcas🐥\nLa marca sera almacenada, desea continuar?\n1. Si\n2. No"));
                            switch (decision2) {
                                case 1:
                                    boolean existe=false;
                                    for (int indice=0;indice<contadordemarcas;indice++){
                                        if (entrada1_2.equals(listademarcas[indice].getNombre_marca())){
                                            existe = true;
                                        }
                                    }
                                    if (existe==true){
                                        JOptionPane.showMessageDialog(null, "Esa marca ya existe, intente nuevamente.");
                                        break; 
                                    }
                                    else{
                                        listademarcas[contadordemarcas] = new marca(entrada1_2);
                                        contadordemarcas+=1;
                                        JOptionPane.showMessageDialog(null,"guardado exitoso...");
                                        break;
                                    }
                                   
                                    
                                case 2:
                                    JOptionPane.showMessageDialog(null,"entendido, saliendo sin guardar...");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opción invalida");
                                    break;
                            }
                        
                       
                            break;
                            //registro de categorias
                            case 3:
                                String entrada1_3 = JOptionPane.showInputDialog("🐥Registro de Categorias🐥\nPor favor digite el nombre de la nueva categoria en el espacion en blanco:");
                                int decision3 = Integer.parseInt(JOptionPane.showInputDialog("🐥Registro de categorias🐥\nLa categoria sera almacenada, desea continuar?\n1. Si\n2. No"));
                                boolean existe=false;
                                switch (decision3) {
                                    case 1:
                                        for (int indice=0;indice<contadordecategorias;indice++){
                                            if (entrada1_3.equals(listadecategorias[indice].getNombre_categoria())){
                                                existe = true;
                                            }
                                        }
                                        if (existe ==true){
                                           JOptionPane.showMessageDialog(null, "Esa categoria ya existe, intente nuevamente.");
                                           break;  
                                        }
                                        else{
                                            listadecategorias[contadordecategorias] = new categoria(entrada1_3);
                                            contadordecategorias+=1;
                                            JOptionPane.showMessageDialog(null,"guardado exitoso...");
                                            break;
                                        }
                                    case 2:
                                        JOptionPane.showMessageDialog(null,"entendido, saliendo sin guardar...");
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opción invalida");
                                        break;
                                }
                       
                            break;
                            //volver a menu principal
                            case 4:                      
                                loop1=-1;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción invalida");
                                break;
                        }
                    }
                    break;
                case 2:
                    
                    String textoProductos = "";
                    for (int indice = 0 ; indice < contadordeproductos; indice++) {
                        textoProductos += "\n" + (indice+1) + ". Nombre: "+listadeproductos[indice].getNombre()+
                                "- Categoria: " +listadeproductos[indice].getCategoria() +
                                "- Marca: " +listadeproductos[indice].getMarca();
                    }
                    int menuInventario1 = Integer.parseInt(JOptionPane.showInputDialog("Lista de productos:"
                            + "\n" + textoProductos
                            + "\n\n Seleccione una opcion: "
                            + "\n1. Filtrar por categoria"
                            + "\n2. Regresar"));
                    if (menuInventario1>2){
                        JOptionPane.showMessageDialog(null, "Opción invalida");
                    }
                    switch (menuInventario1){
                        case 1: //Filtrar por categoria
                            //muestra categorias
                            String textoCategorias="";
                            for (int indice = 0 ; indice < contadordecategorias; indice++) {
                               textoCategorias+=(indice+1)+". "+listadecategorias[indice].getNombre_categoria()+"\n";
                            }
                            int categoria = Integer.parseInt(JOptionPane.showInputDialog("\nPor favor seleccione la categoria a filtrar:"
                                    + "\n"+textoCategorias));
                            
                            //mostrar los productos que la categoria se igual a la elegida
                            textoProductos = "";
                            for (int indice = 0 ; indice < contadordeproductos; indice++) {
                                if (listadeproductos[indice].getCategoria().equals(listadecategorias[categoria-1].getNombre_categoria())){
                                    textoProductos += "\n" + (indice+1) + ". Nombre: "+listadeproductos[indice].getNombre()+
                                        "- Categoria: " +listadeproductos[indice].getCategoria() +
                                        "- Marca: " +listadeproductos[indice].getMarca();
                                }
                            }  
                            int menuInventario2 = Integer.parseInt(JOptionPane.showInputDialog("Productos filtrados por categoria:"
                                + "\n"+ textoProductos
                                + "\n\n Seleccione una opcion: "
                                + "\n1. Filtrar por marca"
                                + "\n2. Regresar"));       
                            if (menuInventario2>2){
                                JOptionPane.showMessageDialog(null, "Opción invalida");
                                break;
                            }
                            switch (menuInventario2){
                                case 1: //Filtrar por marca
                                    //muestra marcas
                                    String textoMarcas = "";
                                    for (int indice = 0 ; indice < contadordemarcas; indice++) {
                                        textoMarcas+=(indice+1)+". "+listademarcas[indice].getNombre_marca()+"\n";
                                    }
                                
                                    int marca = Integer.parseInt(JOptionPane.showInputDialog("Por favor seleccione la marca para filtrar:"
                                        + "\n"+textoMarcas));
                                    
                                    textoProductos = "";
                                    for (int indice = 0 ; indice < contadordeproductos; indice++) {
                                        if ((listadeproductos[indice].getCategoria().equals(listadecategorias[categoria-1].getNombre_categoria())) &&
                                             (listadeproductos[indice].getMarca().equals(listademarcas[marca-1].getNombre_marca()))){
                                            
                                            textoProductos += "\n" + (indice+1) + ". Nombre: "+listadeproductos[indice].getNombre()+
                                                "- Categoria: " +listadeproductos[indice].getCategoria() +
                                                "- Marca: " +listadeproductos[indice].getMarca();
                                        }
                                    }  
                                    JOptionPane.showMessageDialog(
                                            null,
                                            "Productos filtrados por categoria y marca:\n"
                                                    + textoProductos);
                                    break;
                                case 2: //Regresar
                                    break;
                                default:
                                    break;
                            }  
                            
                            break;
                        case 2: //Regresar
                            break;
                        default:
                            break;
                    }  
                              
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

