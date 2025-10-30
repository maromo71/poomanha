package exceptions;

//Classe tipo checked exception
public class ProdutoException extends Exception{
    private String errCode;

    public ProdutoException(String errCode){
        this.errCode = errCode;
    }

    @Override
    public String getMessage() {
        if (errCode.equalsIgnoreCase("RF01EX01")) {
            return "Valor de entrada deve ser maior que ZERO";
        }else if (errCode.equalsIgnoreCase("RF01EX02")) {
            return "Valor indisponível no Estoque";
        }
        return "Erro desconhecido";
    }
}
