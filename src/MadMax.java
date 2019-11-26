import java.util.Scanner;

public class MadMax {

    public static void main(String[] args) {

        // El productor de las fábricas.
        ProductorFabricas productor = new ProductorFabricas();
        // La fábrica de llantas.
        FabricaComponentes fabricaLlantas = productor.getFabrica("llanta");
        // La fábrica de motores.
        FabricaComponentes fabricaMotores = productor.getFabrica("motor");
        // La fábrica de carrocerías.
        FabricaComponentes fabricaCarrocerias = productor.getFabrica("carroceria");
        // La fábrica de blindajes.
        FabricaComponentes fabricaBlindajes = productor.getFabrica("blindaje");
        // La fábrica de armas.
        FabricaComponentes fabricaArmas = productor.getFabrica("arma");

        // Las llantas del auto 1.
        Llanta llantas1 =
            (Llanta)fabricaLlantas.getComponente("simple");
        // El motor del auto 1.
        Motor motor1 =
            (Motor)fabricaMotores.getComponente("simple");
        // La carrocería del auto 1.
        Carroceria carroceria1 =
            (Carroceria)fabricaCarrocerias.getComponente("casual");
        // El blindaje del auto 1.
        Blindaje blindaje1 =
            (Blindaje)fabricaBlindajes.getComponente("simple");
        // El arma del auto 1.
        Arma arma1 =
            (Arma)fabricaArmas.getComponente("lanza");
        // El auto 1.
        Auto auto1 = new Auto(llantas1, motor1, carroceria1, blindaje1, arma1);

        // Las llantas del auto 2.
        Llanta llantas2 =
            (Llanta)fabricaLlantas.getComponente("deportiva");
        // El motor del auto 2.
        Motor motor2 =
            (Motor)fabricaMotores.getComponente("deportivo");
        // La carrocería del auto 2.
        Carroceria carroceria2 =
            (Carroceria)fabricaCarrocerias.getComponente("deportiva");
        // El blindaje del auto 2.
        Blindaje blindaje2 =
            (Blindaje)fabricaBlindajes.getComponente("simple");
        // El arma del auto 2.
        Arma arma2 =
            (Arma)fabricaArmas.getComponente("metralleta");
        // El auto 2.
        Auto auto2 = new Auto(llantas2, motor2, carroceria2, blindaje2, arma2);

        // Las llantas del auto 3.
        Llanta llantas3 =
            (Llanta)fabricaLlantas.getComponente("orugadetanque");
        // El motor del auto 3.
        Motor motor3 =
            (Motor)fabricaMotores.getComponente("deportivo");
        // La carrocería del auto 3.
        Carroceria carroceria3 =
            (Carroceria)fabricaCarrocerias.getComponente("camion");
        // El blindaje del auto 3.
        Blindaje blindaje3 =
            (Blindaje)fabricaBlindajes.getComponente("tanque");
        // El arma del auto 3.
        Arma arma3 =
            (Arma)fabricaArmas.getComponente("sierra");
        // El auto 3.
        Auto auto3 = new Auto(llantas3, motor3, carroceria3, blindaje3, arma3);

        limpiaPantalla();
        System.out.println("Escriba su nombre de usuario:");
        Scanner nombre = new Scanner(System.in);

        Usuario usuario = new Usuario(nombre.next());

        limpiaPantalla();
        System.out.println("¡Bienvenido a MadMax, " + usuario.getNombre() + "!\n");
        String s = String.format("Usted cuenta con $%d pesos.\n",
                                 usuario.getDinero());
        System.out.println(s + "¿Desea construir un auto ó prefiere que le " +
                           "brindemos uno de nuestros autos selectos?\n");

        String menu = "Digite la opción que desee.\n" +
                      "1. Construir un auto.\n" +
                      "2. Escoger un auto selecto.\n";

        Scanner input = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println(menu);
            if (input.hasNextInt()) {
                int i = input.nextInt();
                opcion = (i== 1 || i == 2)?i:0;
            } else {
                System.out.println("Digite una opción correcta.\n");
                input.nextLine();
                continue;
            }
            limpiaPantalla();

            switch (opcion) {
                case 1 :
                int opcion2 = 2;
                do{
                    System.out.println("Digite el número del tipo de llantas " +
                                       "para su auto:\n");
                    int tipo = 0;
                    do {
                        System.out.println(menuLlantas());
                        if (input.hasNextInt()) {
                            int i = input.nextInt();
                            tipo = (i == 1 || i == 2 || i == 3 || i == 4)?i:0;
                        } else {
                            System.out.println("Digite una opción correcta.\n");
                            input.nextLine();
                            continue;
                        }
                        if (tipo == 1)
                            llantas1 =
                                (Llanta)fabricaLlantas.getComponente("simple");
                        else if (tipo == 2)
                            llantas1 =
                                (Llanta)fabricaLlantas.getComponente("deportiva");
                        else if (tipo == 3)
                            llantas1 =
                                (Llanta)fabricaLlantas.getComponente("offroad");
                        else if (tipo == 4)
                            llantas1 =
                                (Llanta)fabricaLlantas.getComponente("orugadetanque");
                        else
                            System.out.println("Digite una opción correcta.\n");
                    } while (tipo == 0);

                    limpiaPantalla();
                    System.out.println("Digite el número del tipo de motor " +
                                       "para su auto:\n");
                    do {
                        System.out.println(menuMotores());
                        if (input.hasNextInt()) {
                            int i = input.nextInt();
                            tipo = (i == 1 || i == 2 || i == 3)?i:0;
                        } else {
                            System.out.println("Digite una opción correcta.\n");
                            input.nextLine();
                            continue;
                        }
                        if (tipo == 1)
                            motor1 =
                                (Motor)fabricaMotores.getComponente("deportivo");
                        else if (tipo == 2)
                            motor1 =
                                (Motor)fabricaMotores.getComponente("diesel");
                        else if (tipo == 3)
                            motor1 =
                                (Motor)fabricaMotores.getComponente("simple");
                        else
                            System.out.println("Digite una opción correcta.\n");
                    } while (tipo == 0);

                    limpiaPantalla();
                    System.out.println("Digite el número del tipo de " +
                                       "carrocería para su auto:\n");
                    do {
                        System.out.println(menuCarrocerias());
                        if (input.hasNextInt()) {
                            int i = input.nextInt();
                            tipo = (i == 1 || i == 2 || i == 3)?i:0;
                        } else {
                            System.out.println("Digite una opción correcta.\n");
                            input.nextLine();
                            continue;
                        }
                        if (tipo == 1)
                            carroceria1 =
                                (Carroceria)fabricaCarrocerias.getComponente("casual");
                        else if (tipo == 2)
                            carroceria1 =
                                (Carroceria)fabricaCarrocerias.getComponente("camion");
                        else if (tipo == 3)
                            carroceria1 =
                                (Carroceria)fabricaCarrocerias.getComponente("deportiva");
                        else
                            System.out.println("Digite una opción correcta.\n");
                    } while (tipo == 0);

                    limpiaPantalla();
                    System.out.println("Digite el número del tipo de blindaje" +
                                       " para su auto:\n");
                    do {
                        System.out.println(menuBlindajes());
                        if (input.hasNextInt()) {
                            int i = input.nextInt();
                            tipo = (i == 1 || i == 2 || i == 3)?i:0;
                        } else {
                            System.out.println("Digite una opción correcta.\n");
                            input.nextLine();
                            continue;
                        }
                        if (tipo == 1)
                            blindaje1 =
                                (Blindaje)fabricaBlindajes.getComponente("simple");
                        else if (tipo == 2)
                            blindaje1 =
                                (Blindaje)fabricaBlindajes.getComponente("reforzado");
                        else if (tipo == 3)
                            blindaje1 =
                                (Blindaje)fabricaBlindajes.getComponente("tanque");
                        else
                            System.out.println("Digite una opción correcta.\n");
                    } while (tipo == 0);

                    limpiaPantalla();
                    System.out.println("Digite el número del tipo de arma " +
                                       "para su auto:\n");
                    do {
                        System.out.println(menuArmas());
                        if (input.hasNextInt()) {
                            int i = input.nextInt();
                            tipo = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5)?i:0;
                        } else {
                            System.out.println("Digite una opción correcta.\n");
                            input.nextLine();
                            continue;
                        }
                        if (tipo == 1)
                            arma1 =
                                (Arma)fabricaArmas.getComponente("arpon");
                        else if (tipo == 2)
                            arma1 =
                                (Arma)fabricaArmas.getComponente("lanzallamas");
                        else if (tipo == 3)
                            arma1 =
                                (Arma)fabricaArmas.getComponente("lanza");
                        else if (tipo == 4)
                            arma1 =
                                (Arma)fabricaArmas.getComponente("sierra");
                        else if (tipo == 5)
                            arma1 =
                                (Arma)fabricaArmas.getComponente("metralleta");
                        else
                            System.out.println("Digite una opción correcta.\n");
                    } while (tipo == 0);

                    limpiaPantalla();
                    Auto auto =
                        new Auto(llantas1, motor1, carroceria1, blindaje1, arma1);
                    auto.muestraAuto();

                    do {
                        System.out.println("\n¿Desea comprar el auto?\n" +
                                           "1. Comprar.\n" +
                                           "2. Construir otro auto.\n");
                        if (input.hasNextInt()) {
                            int i = input.nextInt();
                            tipo = (i == 1 || i == 2)?i:0;
                        } else {
                            System.out.println("Digite una opción correcta.\n");
                            input.nextLine();
                            continue;
                        }
                        if (tipo == 1) {
                            limpiaPantalla();
                            if (usuario.getDinero() < auto.getCosto()) {
                                System.out.println("Lo sentimos, no cuenta " +
                                                   "con el dinero suficiente.");
                            } else
                                System.out.println("Muchas gracias por su " +
                                                   "compra.\n¡Esperamos que " +
                                                   "disfrute su nuevo auto " +
                                                   "estilo Mad Max!");
                            System.out.println("¡Vuelva pronto!");
                            System.exit(1);
                        } else if (tipo == 2) {
                            opcion2 = tipo;
                            limpiaPantalla();
                        } else
                            System.out.println("Digite una opción correcta.\n");
                    } while (tipo == 0);

                } while (opcion2 == 2);

                case 2 :
                opcion2 = 2;
                do {
                    int tipo = 0;
                    do {
                        System.out.println("Digite el número del auto de su " +
                                           "preferencia.\n" +
                                           "1. Auto Simple.\n" +
                                           "2. Auto Deportivo.\n" +
                                           "3. Auto Tanque.");
                        if (input.hasNextInt()) {
                            int i = input.nextInt();
                            tipo = (i == 1 || i == 2 || i == 3)?i:0;
                        } else {
                            System.out.println("Digite una opción correcta.\n");
                            input.nextLine();
                            continue;
                        }
                        if (tipo == 1) {
                            limpiaPantalla();
                            auto1.muestraAuto();
                        } else if (tipo == 2) {
                            limpiaPantalla();
                            auto2.muestraAuto();
                        } else if (tipo == 3) {
                            limpiaPantalla();
                            auto3.muestraAuto();
                        } else
                            System.out.println("Digite una opción correcta.\n");
                    } while (tipo == 0);

                    do {
                        System.out.println("\n¿Desea comprar el auto?\n" +
                                           "1. Comprar.\n" +
                                           "2. Escoger otro auto.\n");
                        if (input.hasNextInt()) {
                            int i = input.nextInt();
                            tipo = (i == 1 || i == 2)?i:0;
                        } else {
                            System.out.println("Digite una opción correcta.\n");
                            input.nextLine();
                            continue;
                        }
                        if (tipo == 1) {
                            limpiaPantalla();
                            System.out.println("Muchas gracias por su " +
                                               "compra.\n¡Esperamos que " +
                                               "disfrute su nuevo auto " +
                                               "estilo Mad Max!");
                            System.out.println("¡Vuelva pronto!");
                            System.exit(1);
                        } else if (tipo == 2) {
                            opcion2 = tipo;
                            limpiaPantalla();
                        } else
                            System.out.println("Digite una opción correcta.\n");
                    } while (tipo == 0);

                } while (opcion2 == 2);

                default : System.out.println("Digite una opción correcta.\n");
            }

        } while (opcion == 0);
    }

    // Método auxiliar para imprimir el menú de llantas.
    private static String menuLlantas() {
        String r = "1. Simples: Ataque + 0.\n" +
                   "            Defensa + 0.\n" +
                   "            Velocidad + 50.\n" +
                   "            Costo: $50.\n" +
                   "2. Deportivas: Ataque + 0.\n" +
                   "               Defensa + 0.\n" +
                   "               Velocidad + 100.\n" +
                   "               Costo: $60.\n" +
                   "3. Off-Road: Ataque + 10.\n" +
                   "             Defensa + 10.\n" +
                   "             Velocidad + 30.\n" +
                   "             Costo: $70.\n" +
                   "4. Oruga de Tanque: Ataque + 0.\n" +
                   "                    Defensa + 50.\n" +
                   "                    Velocidad + 40.\n" +
                   "                    Costo: $80.\n";
        return r;
    }

    // Método auxiliar para imprimir el menú de motores.
    private static String menuMotores() {
        String r = "1. Deportivo: Ataque + 5.\n" +
                   "              Defensa + 12.\n" +
                   "              Velocidad + 8.\n" +
                   "              Costo: $35.\n" +
                   "2. Diesel: Ataque + 12.\n" +
                   "           Defensa + 22.\n" +
                   "           Velocidad + 5.\n" +
                   "           Costo: $45.\n" +
                   "3. Simple: Ataque + 22.\n" +
                   "           Defensa + 25.\n" +
                   "           Velocidad + 15.\n" +
                   "           Costo: $60.\n";
        return r;
    }

    // Método auxiliar para imprimir el menú de carrocerías.
    private static String menuCarrocerias() {
        String r = "1. Casual: Ataque + 34.\n" +
                   "           Defensa + 50.\n" +
                   "           Velocidad + 10.\n" +
                   "           Costo: $70.\n" +
                   "2. Camión: Ataque + 13.\n" +
                   "           Defensa + 23.\n" +
                   "           Velocidad + 33.\n" +
                   "           Costo: $80.\n" +
                   "3. Deportiva: Ataque + 35.\n" +
                   "              Defensa + 25.\n" +
                   "              Velocidad + 17.\n" +
                   "              Costo: $75.\n";
        return r;
    }

    // Método auxiliar para imprimir el menú de blindajes.
    private static String menuBlindajes() {
        String r = "1. Simple: Ataque + 5.\n" +
                   "           Defensa + 30.\n" +
                   "           Velocidad + 1.\n" +
                   "           Costo: $40.\n" +
                   "2. Reforzado: Ataque + 10.\n" +
                   "              Defensa + 45.\n" +
                   "              Velocidad + 1.\n" +
                   "              Costo: $50.\n" +
                   "3. Tanque: Ataque + 10.\n" +
                   "           Defensa + 70.\n" +
                   "           Velocidad + 1.\n" +
                   "           Costo: $80.\n";
        return r;
    }

    // Método auxiliar para imprimir el menú de armas.
    private static String menuArmas() {
        String r = "1. Arpón: Ataque + 50.\n" +
                   "          Defensa + 0.\n" +
                   "          Velocidad + 0.\n" +
                   "          Costo: $50.\n" +
                   "2. Lanzallamas: Ataque + 80.\n" +
                   "                Defensa + 0.\n" +
                   "                Velocidad + 0.\n" +
                   "                Costo: $80.\n" +
                   "3. Lanza: Ataque + 25.\n" +
                   "          Defensa + 0.\n" +
                   "          Velocidad + 0.\n" +
                   "          Costo: $25.\n" +
                   "4. Sierra: Ataque + 70.\n" +
                   "           Defensa + 0.\n" +
                   "           Velocidad + 0.\n" +
                   "           Costo: $70.\n" +
                   "5. Metralleta: Ataque + 100.\n" +
                   "               Defensa + 0.\n" +
                   "               Velocidad + 0.\n" +
                   "               Costo: $100.\n";
        return r;
    }

    // Método auxiliar para limpiar la pantalla.
    private static void limpiaPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
