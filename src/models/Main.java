package models;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import models.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        ArrayList <Chofer> chofers = new ArrayList<>();
        ArrayList <Asignacion> fechas = new ArrayList<>();
        ArrayList <Eventos> evento = new ArrayList<>();
        ArrayList <Eventos> eventosRealizadosList = new ArrayList<>();
        int opcion;
        int dates;
        int opcion2;
        int eventosRealizados = 0;
        int suma =0;
        int vehiculoRegistar =0;
        int choferesRegistrar =0;
        int fechaIngresada =0;
        int sumass = 0;

        do {
            System.out.println("que desea hacer");
            System.out.println("1.- entrar al sistema");
            System.out.println("2.- ver fechas ingresadas");
            System.out.println("otra opcion cerrar sistema");
            opcion2 = scanner.nextInt();
            switch (opcion2) {
                case 1:
                    System.out.println("ingrese la fecha: ");
                    dates = scanner.nextInt();
                    Asignacion date = new Asignacion(dates);
                    fechas.add(date);
                do {

                    System.out.println("---------bienvenido-------------");
                    System.out.println("¿Eres chofer o administrador?");
                    System.out.println("1. Chofer");
                    System.out.println("2. Administrador");
                    System.out.println("3. Salir");
                    opcion = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcion) {
                        case 1:
                            System.out.println("-----------Bienvenido chofer-------");
                            String choferOpcion;
                            do {
                                System.out.println("¿Qué deseas hacer como chofer?");
                                System.out.println("1. Registrar evento (servicio) del día");
                                System.out.println("2. Realizar arqueo de servicios");
                                System.out.println("3. Salir");
                                choferOpcion = scanner.nextLine();

                                switch (choferOpcion) {
                                    case "1":
                                        System.out.println("registre eventos de hoy: "+dates);
                                        String servicio = scanner.next();
                                        Eventos events = new Eventos(servicio);
                                        evento.add(events);
                                        System.out.println("cuantos eventos realizo hoy? ");
                                        eventosRealizados = scanner.nextInt();
                                        sumass = sumass + eventosRealizados;

                                        scanner.nextLine();
                                        System.out.println("Registrando evento...");
                                        break;
                                    case "2":
                                        Arqueo arq = new Arqueo();
                                        for (int i = 0; i < sumass; i++) {
                                            System.out.println("ingrese su ganacia de hoy " +dates);
                                            int ganancia = scanner.nextInt();
                                            suma = suma+ ganancia;
                                            arq.setGanancia(suma);
                                        }
                                        arq.imprimir();
                                        scanner.nextLine();
                                        System.out.println("Realizando arqueo de servicios...");
                                        break;
                                    case "3":
                                        System.out.println("Saliendo...");
                                        break;
                                    default:
                                        System.out.println("Opción no válida");
                                        break;
                                }
                            } while (!choferOpcion.equals("3"));
                            break;
                        case 2:

                            System.out.println("¡Bienvenido administrador!");
                            String administradorOpcion;
                            do {
                                System.out.println("que desea hacer el dia de hoy");
                                System.out.println("1.- dar de alta vehiculos");
                                System.out.println("2.- dar de alta a choferes");
                                System.out.println("3.- asignar chofer a vehiculo");
                                System.out.println("---otra opcion salir---");
                                administradorOpcion = scanner.next();
                                switch (administradorOpcion) {
                                    case "1":

                                        System.out.println("---dar de alta a vehiculos-----");
                                        System.out.println("ingrese cantidad de vehiculos a registar: ");
                                        vehiculoRegistar = scanner.nextInt();
                                        for (int i = 0; i < vehiculoRegistar ; i++) {
                                            System.out.println("ingrese el numero del taxi: ");
                                            String numeroTaxi = scanner.next();
                                            scanner.nextLine();
                                            Vehiculo vehiculo = new Vehiculo(numeroTaxi);
                                            vehiculo.setVehiculos(vehiculos);
                                            vehiculos.add(vehiculo);
                                        }
                                        break;
                                    case "2":

                                        System.out.println("----dar de alta choferes-------");
                                        System.out.println("ingrese cantidad de choferes a agregar");
                                        choferesRegistrar = scanner.nextInt();
                                        for (int i = 0; i < choferesRegistrar; i++) {
                                            System.out.println("ingrese nombre del chofer: ");
                                            String nombreChofer = scanner.next();
                                            scanner.nextLine();
                                            Chofer chofer = new Chofer(nombreChofer);
                                            chofers.add(chofer);
                                        }
                                        break;
                                    case "3":
                                        System.out.println("-----asignar chofer a vehiculo-----");
                                        System.out.println("----taxis disponibles--- ");
                                        for (Vehiculo milton : vehiculos) {
                                            System.out.println("Vehiculos Disponible :" + milton);
                                        }
                                        System.out.println("---choferes disponibles----: ");

                                        for (Chofer imprimir : chofers) {
                                            System.out.println(" choferes disponibles: " + imprimir);
                                        }
                                        for (int i = 0; i <vehiculoRegistar ; i++) {
                                            System.out.println("chofer a elegir: ");
                                            String choferElegir = scanner.next();
                                            System.out.println(" vehiculo a elegir: ");
                                            int vehiculoElegir = scanner.nextInt();
                                            Asignacion vehiculo1=new Asignacion(choferElegir,vehiculoElegir);
                                            fechas.add(vehiculo1);
                                            vehiculo1.imprimir2();
                                            scanner.nextLine();

                                        }
                                        System.out.println("----- Asignaciones realizadas -----");
                                        for (Asignacion asignacion : fechas) {
                                            System.out.println("Chofer asignado: " + asignacion.getChofer() + ", Vehículo asignado: " + asignacion.getVehiculo());
                                        }
                                        System.out.println("-----------------------------------");
                                        break;
                                    case "4":
                                        System.out.println("Saliendo...");
                                        break;
                                    default:
                                        System.out.println("Opción no válida");
                                        break;
                                }
                            } while (!administradorOpcion.equals(("4")));

                            break;
                        case 3:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;

                    }

                } while (opcion != 3);
                break;

                case 2:
                    System.out.println("Fechas ingresadas:");
                    for (Asignacion asignacion : fechas) {
                        System.out.println(asignacion.getDates());
                    }
                break;
            }
        }while (opcion2 !=3);
    }

}
