package singleton.solucao;

import singleton.problema.agenda;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class testeAgenda {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

//        AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
//        AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();
//        reservaDiaEAGER("Sexta");
//        reservaDiaEAGER("Sábado");


//        AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
//        AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();
//        System.out.println(agenda1);
//        System.out.println(agenda2);
//
//        reservaLAZY("Sexta");
//        reservaLAZY("Sábado");

//        =====================================================================

//        Constructor<AgendaSingletonLAZY> constructorTravesso = AgendaSingletonLAZY.class.getDeclaredConstructor();
//        constructorTravesso.setAccessible(true);
//        AgendaSingletonLAZY agendaTravessa = constructorTravesso.newInstance();
//        AgendaSingletonLAZY agendaTravessa2 = constructorTravesso.newInstance();
//
//        System.out.println(agendaTravessa);
//        System.out.println(agendaTravessa2);
        // Dessa segunda forma conseguimos quebrar o private do constructor da class AgendaSingletonLAZY

        //  =======================================================================


        AgendaSingletonENUM agenda1 = AgendaSingletonENUM.getInstance();
        AgendaSingletonENUM agenda2 = AgendaSingletonENUM.getInstance();
        System.out.println(agenda1);
        System.out.println(agenda2);

        reservaENUM("Sexta");
        reservaENUM("Sábado");

        Constructor<AgendaSingletonENUM> constructorTravesso = AgendaSingletonENUM.class.getDeclaredConstructor();
        constructorTravesso.setAccessible(true);
        AgendaSingletonENUM agendaTravessa = constructorTravesso.newInstance();
        AgendaSingletonENUM agendaTravessa2 = constructorTravesso.newInstance();

        System.out.println(agendaTravessa.hashCode());
        System.out.println(agendaTravessa2.hashCode());


        reservaENUM("Sexta");
        reservaENUM("Sábado");

    }

    public static void reservaDiaEAGER(String dia){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
    public static void reservaLAZY(String dia){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
    public static void reservaENUM(String dia){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}

