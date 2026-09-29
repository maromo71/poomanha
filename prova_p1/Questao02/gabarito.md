
## Questão 2 (6,0 pts) - Contexto do Problema: Sistema de Emissão de Passagens Aéreas

### A. Modelagem/Código: Declaração da classe `BilheteAereo`

```java
public class BilheteAereo {
    // Atributos individuais de estado
    private String codigoLocalizador;
    private String nomePassageiro;
    private double valorBaseTarifa;

    // Atributos globais/estáticos da empresa
    private static double taxaEmbarque = 45.50;
    private static int contadorBilhetes = 0;

    // Construtor para inicializar os dados individuais e incrementar o contador global
    public BilheteAereo(String codigoLocalizador, String nomePassageiro, double valorBaseTarifa) {
        this.codigoLocalizador = codigoLocalizador;
        this.nomePassageiro = nomePassageiro;
        this.valorBaseTarifa = valorBaseTarifa;
        
        // Incrementa automaticamente o contador global a cada nova instância
        BilheteAereo.contadorBilhetes++;
    }

    // Método para calcular e retornar o valor total a ser pago
    public double calcularValorFinal() {
        return this.valorBaseTarifa + BilheteAereo.taxaEmbarque;
    }
}

```

### B. Fundamentação Teórica

A solução adotada contempla os seguintes princípios de Programação Orientada a Objetos:

1. **Encapsulamento:** Os atributos da classe (`codigoLocalizador`, `nomePassageiro`, etc.) foram definidos como `private`, protegendo o estado interno do objeto e controlando o acesso direto de fora da classe.
2. **Atributos de Classe (Estáticos):** O uso da palavra-chave `static` em `taxaEmbarque` e `contadorBilhetes` assegura que esses dados sejam compartilhados globalmente por todas as instâncias da classe, cumprindo o requisito de controle único e centralizado da empresa.
3. **Construtores e Ocultação de Ocultação de Escopo (`this`):** O construtor utiliza a palavra-chave `this` para diferenciar os atributos de instância dos parâmetros locais recebidos na assinatura, eliminando qualquer ambiguidade de nomenclatura.


