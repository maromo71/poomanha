package exception;

public class CaixaException extends Exception {
    //Customizar as exeções que estariam
    //em fichas de requisito

    private String errCode;

    public CaixaException(String errCode) {
        this.errCode = errCode;
    }

    @Override
    public String getMessage() {
        if(errCode.equals("RF01EX01")){
            return "Valor do deposito deve ser positivo";
        }
        if(errCode.equals("RF01EX02")){
            return "Sem saldo suficiente para o saque";
        }
        return "";
    }
}
