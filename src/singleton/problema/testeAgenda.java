package singleton.problema;

public class testeAgenda {
    public static void main(String[] args) {

        reservaDia("Sexta");
        reservaDia("Sábado");


    }

    public static void reservaDia(String dia){
        agenda agenda = new agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

}
