/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverysystemclient;

import Services.Customer;


/**
 *
 * @author Carlos
 */
public class DeliverySystemClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*clientesADD(123, "Carlos", "Cartagena", "316867450", "carlos@correo.com", 1);*/
        /*addTDP(12, "Carlos", "Almirante", "Colombia", "Bolivar", 9999, 999, 0.8, 23, 5000);*/
        /*addBill(1, "Algo aca");*/
        
         System.out.println("Cliente: "+clientesSEARCH(123));
         System.out.println("Paquete: "+showTDP());
         /*System.out.println("Factura: "+showBill());*/
    }

    private static void clientesADD(int idC, java.lang.String nombreC, java.lang.String dirC, java.lang.String telC, java.lang.String emailC, int tipoC) {
        Services.ServicioClientes service = new Services.ServicioClientes();
        Services.ServicioClientesSoap port = service.getServicioClientesSoap();
        port.clientesADD(idC, nombreC, dirC, telC, emailC, tipoC);
    }

    private static Customer clientesEDIT(int id) {
        Services.ServicioClientes service = new Services.ServicioClientes();
        Services.ServicioClientesSoap port = service.getServicioClientesSoap();
        return port.clientesEDIT(id);
    }

    private static String clientesSEARCH(int id) {
        Services.ServicioClientes service = new Services.ServicioClientes();
        Services.ServicioClientesSoap port = service.getServicioClientesSoap();
        return port.clientesSEARCH(id);
    }

    private static String clientesSHOW() {
        Services.ServicioClientes service = new Services.ServicioClientes();
        Services.ServicioClientesSoap port = service.getServicioClientesSoap();
        return port.clientesSHOW();
    }

    private static String clientesTYPESEARCH(java.lang.String tipo) {
        Services.ServicioClientes service = new Services.ServicioClientes();
        Services.ServicioClientesSoap port = service.getServicioClientesSoap();
        return port.clientesTYPESEARCH(tipo);
    }

    private static void addNightPackage(int codigo, java.lang.String nombre, java.lang.String direccion, java.lang.String pais, java.lang.String departamento, int codPosRemitente, int codPosDestinatario, double peso, double costoPorGramos, double cuota) {
        org.tempuri.ServicioEnvioDePaquetes service = new org.tempuri.ServicioEnvioDePaquetes();
        org.tempuri.ServicioEnvioDePaquetesSoap port = service.getServicioEnvioDePaquetesSoap();
        port.addNightPackage(codigo, nombre, direccion, pais, departamento, codPosRemitente, codPosDestinatario, peso, costoPorGramos, cuota);
    }

    private static void addPaquetes(int codigo, java.lang.String nombre, java.lang.String direccion, java.lang.String pais, java.lang.String departamento, int codPosRemitente, int codPosDestinatario, double peso, double costoPorGramos) {
        org.tempuri.ServicioEnvioDePaquetes service = new org.tempuri.ServicioEnvioDePaquetes();
        org.tempuri.ServicioEnvioDePaquetesSoap port = service.getServicioEnvioDePaquetesSoap();
        port.addPaquetes(codigo, nombre, direccion, pais, departamento, codPosRemitente, codPosDestinatario, peso, costoPorGramos);
    }

    private static void addTDP(int codigo, java.lang.String nombre, java.lang.String direccion, java.lang.String pais, java.lang.String departamento, int codPosRemitente, int codPosDestinatario, double peso, double costoPorGramos, double cuota) {
        org.tempuri.ServicioEnvioDePaquetes service = new org.tempuri.ServicioEnvioDePaquetes();
        org.tempuri.ServicioEnvioDePaquetesSoap port = service.getServicioEnvioDePaquetesSoap();
        port.addTDP(codigo, nombre, direccion, pais, departamento, codPosRemitente, codPosDestinatario, peso, costoPorGramos, cuota);
    }

    private static String showNightPackages() {
        org.tempuri.ServicioEnvioDePaquetes service = new org.tempuri.ServicioEnvioDePaquetes();
        org.tempuri.ServicioEnvioDePaquetesSoap port = service.getServicioEnvioDePaquetesSoap();
        return port.showNightPackages();
    }

    private static String showPackages() {
        org.tempuri.ServicioEnvioDePaquetes service = new org.tempuri.ServicioEnvioDePaquetes();
        org.tempuri.ServicioEnvioDePaquetesSoap port = service.getServicioEnvioDePaquetesSoap();
        return port.showPackages();
    }

    private static String showPkgByID(int id) {
        org.tempuri.ServicioEnvioDePaquetes service = new org.tempuri.ServicioEnvioDePaquetes();
        org.tempuri.ServicioEnvioDePaquetesSoap port = service.getServicioEnvioDePaquetesSoap();
        return port.showPkgByID(id);
    }

    private static String showTDP() {
        org.tempuri.ServicioEnvioDePaquetes service = new org.tempuri.ServicioEnvioDePaquetes();
        org.tempuri.ServicioEnvioDePaquetesSoap port = service.getServicioEnvioDePaquetesSoap();
        return port.showTDP();
    }

    private static void addBill(int id, java.lang.String p) {
        org.tempuri.ServicioFacturas service = new org.tempuri.ServicioFacturas();
        org.tempuri.ServicioFacturasSoap port = service.getServicioFacturasSoap();
        port.addBill(id, p);
    }

    private static String showBill() {
        org.tempuri.ServicioFacturas service = new org.tempuri.ServicioFacturas();
        org.tempuri.ServicioFacturasSoap port = service.getServicioFacturasSoap();
        return port.showBill();
    }

      
    
    
}
