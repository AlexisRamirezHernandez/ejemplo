
/**
 * Write a description of class proyecto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class proyecto
{
    
    public static int mostrarMenu(){
        int opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione una opcion \n 1.Ver el total de la tienda \n 2.Comprar producto \n 3.Actualizar Tienda \n 4.Salir"));
        return opcion;
    }
    public static double totaldeInventario(int cantidades[][],double precios[][]){
        double total=0.0;
        double monto=0.0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                monto=cantidades[i][j]*precios[i][j];
                total=total+monto;
            }
        }
        return total;
    }
    public static void imprimirLista(String productoss[][],int cantidades[][],double precios[][]){
        String id="";
        
        System.out.println("           Bienvenido a Tienda la Tropicalita");
        System.out.println("____________________________________________");
        System.out.printf("%-30s %-10s %-10s ","Id","Producto","Cantidad","Precio U");
        System.out.println();
        for(int i=0;i<10;i++){
                    
              for(int j=0;j<10;j++){
                 id=i+""+j+"";
                 System.out.printf("%-5s %-25s %-10d %-8.2f  ",id,productoss[i][j],cantidades[i][j],precios[i][j]);
                      
              }
              System.out.println();
        }
        
    }
    public static void main (String args[]){
        String productos [][]={
        {"Aceites comestibles","Aderezos","Arroz","Consome","Crema de cacahuate","Crema para cafe","Pure de tomate","Alimento para bebe","Alimento para mascotas","Atole","Avena"},
        {"Azucar","Cafe","Cereales","Chile piquin","Flan en polvo","Formulas infantiles","Gelatinas en polvo/Grenetina","Harina/Harina preparada","Mole","Sal"},
        {"Salsas envasadas","Sazonadores","Sopas en sobre","Cajeta","Catsup","Mayonesa","Mermelada","Miel","Te","Vinagre"},
        {"Huevo","Pasta","Granos de elote","Aceitunas","Chicharos","Frijoles","Frutas en almibar","Sardinas","Atun en agua/aceite","Chiles"},
        {"Sopa","Vegetales en conserva","Leche condesada/evaporada","Yogur","Leche entera","Crema/media crema","Leche en polvo","Mantequilla","Margarina","Queso"},
        {"Papas","Palomitas","Frituras de maiz","Cacahuates","Barras alimenticias","Nueces y semillas","Caramelos","Dulces enchilados","Chocolate de mesa/en polvo","Gomas de mascar"},
        {"Mazapan","Malvaviscos","Pulpa de tamarindo","Pastillas de dulce","Paletas de dulce","Tortillas de harina/maiz","Galletas dulces/saladas","Pastelillos","Pan tostado","Pan dulce"},
        {"Aguacate","Ajo","Cebolla","Chile","Cilantro","Jitomate","Papas","Limones","Manzanas","Naranjas"},
        {"Platanos","Agua natural","Jarabes","Jugos/Nectares","Naranjadas","Bebidas de soya","Energetizantes","Refrescos","Bebidas alcoholicas","Bebidas preparadas"},
        {"Salchichas","Mortadela","Tocino","Jamon","Manteca","Chorizo","Carne de puerco/res/pollo","Agua oxigenada","Preservativos","Alcohol"}
        };
        int cantidad [][]={
                    {6,26,49,58,60,72,76,79,11,50},
                    {55,63,47,11,61,34,56,93,64,35},
                    {37,4,31,71,82,37,96,72,93,39},
                    {58,20,12,30,86,15,96,73,26,54},
                    {20,88,47,83,48,78,27,51,54,70},
                    {94,77,78,92,23,76,8,85,75,10},
                    {23,12,99,34,60,40,18,4,81,72},
                    {40,30,15,34,6,92,87,11,90,3},
                    {48,61,51,5,41,20,55,68,19,48},
                    {81,66,72,15,72,12,62,49,80,30}
        };
        
        double precio[][]={ 
                    {46.15 ,86.19 ,77.97 ,43.00 ,95.15 ,48.51 ,1.13  ,86.98 ,62.13 ,56.90},
                    {47.78 ,37.78 ,34.62 ,65.60 ,28.25 ,3.58  ,52.32 ,9.38  ,87.56 ,8.72},
                    {30.76 ,55.36 ,79.36 ,20.72  ,30.57 ,87.85 ,35.65 ,52.31 ,55.12 ,27.87},
                    {76.71 ,68.47 ,7.01  ,93.79 ,91.70 ,70.14 ,56.07 ,90.65 ,75.89 ,6.22}, 
                    {8.59  ,45.13 ,34.65 ,59.01 ,10.85  ,64.12 ,48.34 ,77.66 ,73.11 ,76.99},
                    {36.95 ,2.12  ,18.06 ,14.87 ,24.67 ,44.29 ,53.66 ,66.68 ,37.93 ,56.15},
                    {74.83 ,8.26  ,72.89 ,50.18 ,22.40 ,81.74 ,31.42 ,4.66  ,54.86 ,1.99},
                    {73.75 ,17.03 ,29.34 ,53.12 ,5.46  ,97.60 ,47.22 ,57.80 ,34.65 ,24.66},
                    {27.55 ,90.15 ,5.36  ,34.53 ,18.84 ,96.13 ,23.40 ,84.03 ,28.72 ,98.50},
                    {1.29  ,81.70 ,45.78 ,99.80 ,60.80 ,1.00  ,78.81 ,93.04 ,66.25 ,45.10},
                    };
        String ids []= new String [30];
        String productoss []= new String[30];
        int cantidades []=new int [30];
        double precios []=new double[30];
        
        
        imprimirLista(productos, cantidad, precio);
        
       boolean salir = false;
       int opc=0;
       int inicio=0;
       int contador=0;
        while(!salir){
        
        opc=mostrarMenu();
        switch(opc){
            case 1:
                System.out.println("El total del inventario es: "+totaldeInventario(cantidad,precio));
                break;
            case 2: 
                // mostrar al usuario los productos
                String id="";
                int fila=0,columna=0;
                for(int i=0;i<10;i++){
                    
                    for(int j=0;j<10;j++){
                        id=i+""+j+"";
                        System.out.printf("%5s %-25s %-8.2f  ",id,productos[i][j],precio[i][j]);
                        
                    }
                    System.out.println();
                }
                String idP=JOptionPane.showInputDialog(null,"Ingresa el Id del articulo incluso con el cero a la izquierda");
                fila=Integer.parseInt(idP.charAt(0)+"");
                columna=Integer.parseInt(idP.charAt(1)+"");
                int cantidadMatriz=cantidad[fila][columna];
                int cantidadUsuario=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos productos quieres llevar"));
                int actualizarCantidad=cantidadMatriz-cantidadUsuario;
                cantidad[fila][columna]=actualizarCantidad;
                
                
                ids[inicio]=idP;
                productoss[inicio]=productos[fila][columna];
                cantidades[inicio]=cantidadUsuario;
                precios[inicio]=precio[fila][columna];
                inicio++;
                contador++;
                
                
                int resp=JOptionPane.showConfirmDialog(null,"Deseas pagar ya");
                               
                if (JOptionPane.OK_OPTION == resp){
                    System.out.println("           Bienvenido a Tienda la Tropicalita");
                    System.out.println("____________________________________________");
                    System.out.printf("%-30s %-10s %-10s ","Producto","Cantidad","Sub Total");
                    System.out.println();
                    double totalCompra=0.0;
                    for(int i=0;i<contador;i++){
                        System.out.printf("%-30s %-10d %-10.2f ",productoss[i],cantidades[i],cantidades[i]*precios[i]);
                        totalCompra=totalCompra+(cantidades[i]*precios[i]);
                        System.out.println();   
                        
                    }
                    System.out.println("Total: "+totalCompra);
                }
                
            break;
            case 3:
                
                imprimirLista(productos, cantidad, precio);
                
                 String idPr=JOptionPane.showInputDialog(null,"Ingresa el Id del articulo incluso con el cero a la izquierda");
                 fila=Integer.parseInt(idPr.charAt(0)+"");
                 columna=Integer.parseInt(idPr.charAt(1)+"");
                 int resp1=JOptionPane.showConfirmDialog(null,"Deseas modificar el nombre?");            
                 if (JOptionPane.OK_OPTION == resp1){
                    String nuevoNombre=JOptionPane.showInputDialog(null,"Actualiza el nombre");
                    productos[fila][columna]=nuevoNombre;
                 }
                int resp2=JOptionPane.showConfirmDialog(null,"Deseas modificar la cantidad?");            
                 if (JOptionPane.OK_OPTION == resp2){
                    int nuevaCantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos productos quieres ingresar"));
                    cantidad[fila][columna]=cantidad[fila][columna]+nuevaCantidad;
                 }
                 int resp3=JOptionPane.showConfirmDialog(null,"Deseas modificar la precio?");            
                 if (JOptionPane.OK_OPTION == resp3){
                    double nuevoPrecio=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa el nuevo precio"));
                    precio[fila][columna]=nuevoPrecio;
                 }
                 for(int i=0;i<10;i++){
                    for(int j=0;j<10;j++){
                       System.out.printf("%-30s %-10d %-10.2f ",productos[i][j],cantidad[i][j],precio[i][j]);
                       System.out.println();
                    }
                }
                break;
                case 4: 
                    salir=true;
                break;
        }
        
    }
}
}
