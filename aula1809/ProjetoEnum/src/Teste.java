import model.Mes;

public class Teste {
    public static void main(String[] args) {
        Mes mesLancamento = Mes.maio;

        System.out.println("Meses do ano");
        for(Mes mes : Mes.values()){
            System.out.println(mes);
        }
        if(mesLancamento == Mes.maio){
            System.out.println("Mes OK");
        }else{
            System.out.println("LAcamento foi" + mesLancamento);
        }
    }
}
