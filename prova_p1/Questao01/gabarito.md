
## Questão 1 (2,0 pts) - Paradigma Orientado a Objetos (Modelagem, Ciclo de Vida e Comportamentos)

* **I. A estrutura `CartaoCorporativo` atua como uma classe, funcionando como um molde de dados que especifica a tipagem dos atributos de estado e as assinaturas de comportamento, sem alocar memória persistente para dados individuais dos departamentos durante sua simples compilação.** — **CORRETA.** A classe define apenas a estrutura (o projeto/molde), e nenhum espaço em memória heap é alocado apenas por compilar o código.
* **II. A instrução `new CartaoCorporativo(...)` instancia um objeto no ambiente de memória heap, criando identidades e estados independentes para as referências `c1` e `c2`, de modo que a invocação de `autorizarCompra` afeta unicamente o objeto referenciado.** — **CORRETA.** O operador `new` cria instâncias separadas na memória heap para cada cartão (`c1` e `c2`), garantindo que a alteração de saldo em um não interfira no outro.
* **III. O método `autorizarCompra(double valor)` encapsula uma regra de negócios do domínio e, após a execução da linha `c2.autorizarCompra(3500.0)`, o estado de `c2` é alterado com sucesso, passando a registrar um saldo disponível de `-500,0`...** — **INCORRETA.** Olhando o código da classe `App`, o cartão `c2` foi instanciado com o limite total de `3000.0`. No método `autorizarCompra`, a validação verifica se o `valor > 0 && valor <= this.saldoDisponível`. Como a tentativa de compra é de `3500.0`, o valor excede o saldo disponível (`3000.0`), fazendo com que o método retorne `false` e a compra **não** seja autorizada. Portanto, o estado do saldo de `c2` não é alterado para `-500,0`.
* **IV. Por se tratar de um método de instância, `autorizarCompra` pode ser invocado diretamente através da classe `CartaoCorporativo.autorizarCompra(100.0)` em qualquer ponto do sistema, dispensando a necessidade de instanciação prévia por meio da palavra reservada `new`.** — **INCORRETA.** Métodos de instância (que não possuem a palavra-chave `static`) exigem obrigatoriamente a criação de um objeto por meio do operador `new` para poderem ser executados.

**Gabarito da Questão 1:**
* Alternativa Correta: (A) I e II, apenas.

