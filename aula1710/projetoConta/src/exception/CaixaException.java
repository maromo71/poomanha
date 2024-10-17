package exception;

public class CaixaException extends Exception {
    private String codErr;

    public CaixaException(String codErr) {
        this.codErr = codErr;
    }

    @Override
    public String getMessage() {
        String errMessage;
        if(codErr.equalsIgnoreCase("RF01E01")){
            errMessage = "Sem saldo suficiente para o saque";
        }else if(codErr.equalsIgnoreCase("RF01E02")){
            errMessage = "Valor inválido para o depósito";
        }else{
            errMessage = "Erro inesperado";
        }
        return errMessage;
    }
}
