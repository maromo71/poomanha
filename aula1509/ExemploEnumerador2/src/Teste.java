public class Teste {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println("Dia " + i + " = " + DiaSemana.values()[i-1]);
        }

        //jeito mais simples
        for(DiaSemana dia : DiaSemana.values()){
            System.out.println(dia);
        }

        DiaSemana dia = DiaSemana.quarta;
        DiaSemana outro = DiaSemana.sabado;


        if(outro.ordinal() < dia.ordinal()){
            System.out.println(outro + " vem antes de " + dia);
        }else{
            System.out.println(dia + " vem antes de " + outro);
        }
    }
}
