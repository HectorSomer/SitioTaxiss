import  models.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static ChoferesAsignados objetoChAsignados= new ChoferesAsignados();
    public static ListaChoferes objetoChofer = new ListaChoferes();
    public static ListaUnidades objetoUnidad = new ListaUnidades();
    public static ListaServicios objetoServicio = new ListaServicios();
    public static ListaArqueo objetoArqueo = new ListaArqueo();
    private static Scanner key =  new Scanner(System.in);
    public static void main(String[] args) {
     Administrador objetoAdmin= new Administrador();
     short loginOption;
     short actionOption;
        boolean validar;
     do {
         System.out.println("Ingrese su tipo de usuario, o si desea salir");
         System.out.println("1.-Administrador");
         System.out.println("2.-Chofer");
         System.out.println("3.-Salir");
         loginOption=key.nextShort();
         switch (loginOption) {
             case 1:
                 boolean adminFlag = false;
                 validar = false;
                 while (!adminFlag) {
                     String adminUser;
                     String passwordAdmin;
                     System.out.println("Ingrese su usuario");
                     adminUser = key.next();
                     if (adminUser.equals("salir")){
                         validar=true;
                         System.out.println("Ha salido");
                         break;
                     }
                     System.out.println("Ingrese su contraseña");
                     passwordAdmin= key.next();
                     if (passwordAdmin.equals("Salir")){
                         validar=true;
                         System.out.println("Ha salido");
                         break;
                     }
                     if (objetoAdmin.checkUser(adminUser) && objetoAdmin.checkPassword(passwordAdmin)) {
                         System.out.println("Usuario y contraseña correctos, prosiga");
                         adminFlag = true;} else if (!objetoAdmin.checkUser(adminUser) && !objetoAdmin.checkPassword(passwordAdmin)) {
                         System.out.println("Usuario y contraseña incorrectos, intente de nuevo o ingrese salir en usuario para salir");
                     } else if (!objetoAdmin.checkUser(adminUser)) {
                         System.out.println("Usuario incorrecto, intente de nuevo o ingrese salir en usuario para salir");
                     }
                     else {
                         System.out.println("Contraseña incorrecta, intente de nuevo ingrese salir en el usuario para salir");
                     }
                 }
                 do {
                     if (validar){
                         break;
                     }
                     System.out.println("Ingrese lo que desea hacer");
                     System.out.println("1.-Agregar chofer");
                     System.out.println("2.-Dar de alta una unidad ");
                     System.out.println("3.-Asignar unidad un chofer");
                     System.out.println("4.-Ver choferes");
                     System.out.println("5.-Ver unidades");
                     System.out.println("6.-Salir");
                     actionOption = key.nextShort();
                     key.nextLine();
                     switch (actionOption) {
                         case 1:
                             addChofer();
                             break;
                         case 2:
                             addUnidad();
                             break;
                         case 3:
                             asignarChofer();
                             break;
                         case 4:
                             mostrarChoferes();
                             break;
                         case 5:
                             mostrarUnidades();
                             break;
                         case 6:
                             System.out.println("Usted ha salido del usuario administrador");
                             break;
                         default:
                             System.out.println("Ingrese una opcion valida");
                             break;
                     }
                 }while (actionOption!=6);
                 break;
             case 2:
                 key.nextLine();
                 boolean choferFlag= false;
                 boolean choferFlag2;
                 choferFlag2=false;
                 String choferUser="";
                 while (!choferFlag){
                     String choferPassword;
                     System.out.println("Ingrese su usuario");
                     choferUser=key.nextLine();
                     if (choferUser.equals("salir")){
                         choferFlag2=true;
                         break;
                     }
                     System.out.println("Ingrese su contraseña");
                     choferPassword= key.nextLine();
                     if (choferPassword.equals("salir")){
                         choferFlag2=true;
                         break;
                     }
                     if (objetoChofer.compararUsuario(choferUser) && objetoChofer.comparePassword(choferPassword)){
                         System.out.println("Usuario y contraseña correctos, prosiga");
                         choferFlag=true;
                     }
                     else if (!objetoChofer.compararUsuario(choferUser) && !objetoChofer.comparePassword(choferPassword)) {
                         System.out.println("Usuario y contraseña incorrectos, intente de nuevo o ingrese salir en usuario para salir");
                     }
                     else if (!objetoChofer.compararUsuario(choferUser)) {
                         System.out.println("Usuario incorrecto, intente de nuevo o ingrese salir en usuario para salir");
                     }
                     else if (!objetoChofer.comparePassword(choferPassword)) {
                         System.out.println("Contraseña incorrecta, intente de nuevo o ingrese salir en usuario para salir");
                     }
                 }
                 do {
                     if (choferFlag2){
                         break;
                     }
                     System.out.println("Ingrese lo que desea hacer");
                     System.out.println("1.-Añadir servicio");
                     System.out.println("2.-Ver servicios");
                     System.out.println("3.-Hacer arqueo");
                     System.out.println("4.-Ver arqueos");
                     System.out.println("5.-Salir");
                     actionOption= key.nextShort();
                     key.nextLine();
                     switch (actionOption){
                         case 1:
                           addServicio(choferUser);
                           break;
                         case 2:
                             LocalDate fecha;
                             System.out.println("Ingrese la fecha en la que quiera ver los servicios hechos");
                             fecha = LocalDate.parse(key.nextLine());
                             if(!listService(fecha, choferUser)){
                                 System.out.println("En esta fecha no hay servicios");
                             }
                             break;
                         case 3:
                             LocalDate fecha2;
                             System.out.println("Ingrese la fecha ");
                             fecha2= LocalDate.parse(key.nextLine());
                             makeArching(fecha2, choferUser);
                             break;
                         case 4:
                             LocalDate fecha3;
                             System.out.println("Ingrese la fecha");
                             fecha3= LocalDate.parse(key.nextLine());
                             listArchig(fecha3, choferUser);
                             break;
                         case 5:
                             System.out.println("Usted ha salido");
                             break;
                         default:
                             System.out.println("Ingrese una opción valida");
                             break;
                     }
                 }while(actionOption !=5);
             default:
                 System.out.println("Ingrese una opción valida");
                 break;
         }
     }while(loginOption != 3);

}
    public static void addChofer(){
        String nombre;
        String apellido;
        LocalDate fechaDeNacimiento;
        String sexo;
        int id=0;
        String usuario="";
        String password;
        System.out.print("Nombre: ");
        nombre = key.nextLine();
        System.out.print("Apellido: ");
        apellido = key.nextLine();
        System.out.println("Fecha de nacimiento:");
        fechaDeNacimiento = LocalDate.parse(key.next());
        key.nextLine();
        System.out.println("Sexo:");
        sexo= key.nextLine();
        boolean bandera=false;
        while (!bandera) {
            bandera=true;
            id=objetoChofer.getIdAleatoria();
            if (objetoChofer.compararId(id)) {
                bandera=false;
            }
        }
        boolean banderaUsuario= false;
        while(!banderaUsuario){
            System.out.println("Ingrese el usuario del chofer (único)");
            usuario= key.nextLine();
            if(objetoChofer.compararUsuario(usuario)){
                System.out.println("Este nombre de usuario ya está ocupado, intente con otro");
            }
            else {
                banderaUsuario=true;
            }
        }
        System.out.println("Ingrese la contraseña del chofer");
        password= key.nextLine();

        Chofer chofer = new Chofer(nombre, apellido, fechaDeNacimiento, sexo, id, usuario, password);
        if (objetoChofer.addChofer(chofer))
            System.out.println("Registro exitoso");
        else
            System.out.println("Error en el registro. Intenta de nuevo.");
    }
    public static void addUnidad(){
        String marca;
        String color;
        String nombreUnidad;
        String placa;
        int year;
        int id=0;
        System.out.println("Ingrese la marca");
        marca= key.nextLine();
        System.out.println("Ingrese el color");
        color= key.nextLine();
        System.out.println("Ingrese el nombre de la unidad");
        nombreUnidad= key.nextLine();
        System.out.println("Ingrese la placa");
        placa= key.nextLine();
        System.out.println("Ingrese el año");
        year= key.nextInt();
        boolean banderaId=false;
        while (!banderaId) {
            banderaId=true;
            id=objetoUnidad.getIdAleatoria();
            if (objetoUnidad.compararId(id)) {
                banderaId=false;
            }
        }
        Unidad unidad = new Unidad(marca, color, nombreUnidad, placa, year, id);
        if(objetoUnidad.addUnidad(unidad)){
            System.out.println("Registro exitoso");
        }
        else {
            System.out.println("Fallo al registrar, intente de nuevo");
        }
    }
    public static void asignarChofer(){
        Unidad unidad=null;
        int idChofer;
        int idUnidad;
        boolean banderaChofer=false;
        short posicion;
        Chofer chofer = null;
        boolean banderaUnidad=false;
        while (!banderaChofer) {
            System.out.println("Ingrese la id del chofer al que le quiere asignar la unidad o ingrese 0 para salir");
            idChofer= key.nextInt();
            key.nextLine();
            posicion= objetoChofer.busquedaChofer(idChofer);
            if(posicion!=-1){
              if(!objetoChAsignados.buscarChoferAsignado(idChofer)){
                  chofer=objetoChofer.asignarChofer(posicion);
                  banderaChofer=true;
              }
              else {
                  System.out.println("Este chofer ya está asignado");
              }
            }
            else if(idChofer==0){
                System.out.println("Ha salido de la opcion");
                banderaUnidad=true;
                break;
            }
            else {
                System.out.println("Este chofer no está dentro de sus choferes");
            }
        }
        short posicionDos;
        while(!banderaUnidad) {
            System.out.println("Ingrese la id de la unidad que le va a asignar al chofer, intente con otron o ingrese 0 para salir");
            idUnidad= key.nextInt();
            posicionDos = objetoUnidad.busquedaUnidad(idUnidad);
            if (posicionDos!=-1){
                if (!objetoChAsignados.buscarUnidadAsignada(idUnidad)){
                    unidad=objetoUnidad.asignarUnidad(posicionDos);
                    banderaUnidad=true;
                }
                else {
                    System.out.println("Esta unidad ya está asignada");
                }
            }
            else if (idUnidad==0){
                System.out.println("Ha salido de la opcion");
                break;
            }
            else {
                System.out.println("Esta unidad no está dentro de sus unidades");
            }
        }
        if (banderaUnidad && banderaChofer){
            if (objetoChAsignados.addChoferAsignado(chofer)&&objetoChAsignados.addUnidadesAsignadas(unidad)){
                System.out.println("Chofer asignado con exito");
            }
            else {
                System.out.println("Fallo al asignar el chofer");
            }
        }
    }
    public static void mostrarChoferes(){
        ArrayList<Chofer> lista;
        lista = objetoChofer.getListaChoferes();
        for(short i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
    public static void mostrarUnidades(){
        ArrayList<Unidad> lista;
        lista = objetoUnidad.getListaUnidades();
        for(short i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
    public static void addServicio(String user){
        LocalTime hora;
        String lugar;
        float kilometrajeRecorrido;
        float gasolinaGastada;
        float cobro;
        LocalDate fecha;
        System.out.println("Ingrese la hora");
        hora= LocalTime.parse(key.nextLine());
        System.out.println("Ingrese la ubicacion");
        lugar= key.nextLine();
        System.out.println("Ingrese el kilomeraje recorrido");
        kilometrajeRecorrido=key.nextFloat();
        System.out.println("Ingrese la gasolina gastada");
        gasolinaGastada=key.nextFloat();
        System.out.println("Ingrese el cobro");
        cobro= key.nextFloat();
        key.nextLine();
        System.out.println("Ingrese la fecha");
        fecha=LocalDate.parse(key.nextLine());
        Servicio servicio = new Servicio(hora, lugar, kilometrajeRecorrido, gasolinaGastada, cobro, fecha, user);
        if(objetoServicio.addServicio(servicio)){
            System.out.println("Registro exitoso");
        }
        else {
            System.out.println("Fallo al registrar, intente de nuevo");
        }
    }
   public static boolean listService(LocalDate fecha, String user){
        boolean flag=false;
        ArrayList<Servicio> lista; 
        lista = objetoServicio.getListaServicios();
        for (short i=0; i<lista.size(); i++){
            if (lista.get(i).getFecha().equals(fecha) && lista.get(i).getUser().equals(user)){
                System.out.println(lista.get(i));
                flag=true;
            }
        }
        return flag;
   }
   public static boolean archingDate(LocalDate fecha){
       boolean flag=false;
       ArrayList<Servicio> lista;
       lista = objetoServicio.getListaServicios();
       for (short i=0; i<lista.size(); i++){
           if (lista.get(i).getFecha().equals(fecha)){
               flag=true;
           }
       }
       return flag;
   }
   public static void makeArching(LocalDate fecha, String user){
        float totalGastos;
        float totalCobro;
        float ganancias;
        if(archingDate(fecha)) {
            totalGastos = objetoServicio.totalGastos(fecha, user);
            totalCobro = objetoServicio.totalCobros(fecha, user);
            ganancias = totalCobro-totalGastos;
            Arqueo arqueo = new Arqueo(totalGastos, totalCobro, ganancias, fecha, user);
            if (objetoArqueo.addArqueo(arqueo)){
                System.out.println("Arqueo registrado con exito");
            }
            else {
                System.out.println("Fallo al registrar el arqueo, por favor intente de nuevo");
            }
            System.out.println(arqueo);
        }
        else {
            System.out.println("No hay servicios en esta fecha");
        }
   }
   public static void listArchig(LocalDate fecha, String user){
        ArrayList<Arqueo> lista;
        lista=objetoArqueo.getListaArqueo();
        for (short i=0; i<lista.size(); i++){
            if (lista.get(i).getFecha().equals(fecha) && lista.get(i).getUser().equals(user)){
                System.out.println(lista.get(i));
            }
            else {
                System.out.println("No existen servicios en esta fecha");
            }
        }
   }
}