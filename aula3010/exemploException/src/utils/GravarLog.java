package utils;

public class GravarLog {
    public static void registrar_log(Exception e){
        //Abriria o banco de dados
        //Gravaria a informacao sequinte nele
        System.out.println(e.getStackTrace().toString());
    }
}
