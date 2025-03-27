public class Teste {
    public static void main(String[] args) {
        DiasSemana dia = DiasSemana.QUINTA_FEIRA;
        System.out.println(dia);
        System.out.println("Pular Linha");
        System.out.println(dia.ordinal());
        System.out.println();
        for(DiasSemana cd : DiasSemana.values()) {
            System.out.println(cd);
        }
    }
}
