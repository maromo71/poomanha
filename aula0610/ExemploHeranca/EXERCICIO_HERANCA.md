# Exercício: sistema de locação de veículos

## Cenário

Uma locadora precisa de um programa de console para cadastrar seus veículos e controlar locações. Carros e motocicletas compartilham informações, mas possuem características próprias e regras diferentes para calcular o valor de uma locação.

Implemente o programa em Java, usando herança e polimorfismo. Organize as classes em pacotes, por exemplo, `model` para as entidades e `controller` para a aplicação.

## Objetivos de aprendizagem

- Criar uma classe abstrata com atributos e comportamentos comuns.
- Estender essa classe para representar tipos específicos de veículo.
- Sobrescrever métodos para aplicar regras diferentes em cada tipo.
- Armazenar objetos de diferentes subclasses em uma única lista.
- Criar um menu de console para cadastrar e operar sobre os objetos.

## Requisitos

### 1. Classe base `Veiculo`

Crie uma classe abstrata `Veiculo` com, no mínimo:

- placa;
- modelo;
- valor da diária;
- situação (disponível ou alugado).

Implemente nela os comportamentos comuns para alugar e devolver um veículo. O aluguel deve ser permitido somente se o veículo estiver disponível e a quantidade de diárias for maior que zero. A classe também deve declarar um método para calcular o valor da locação e apresentar os dados do veículo.

### 2. Tipos de veículo

Crie duas subclasses:

- `Carro`, com a quantidade de portas;
- `Motocicleta`, com a cilindrada.

Cada tipo deve implementar sua própria regra de cálculo:

- **Carro:** diárias × valor da diária, mais uma taxa de proteção de 10% sobre esse subtotal.
- **Motocicleta:** diárias × valor da diária, mais uma taxa fixa de R$ 25,00 por locação para equipamentos de segurança.

Ao exibir um veículo, apresente também sua característica específica e sua situação atual.

### 3. Aplicação de console

Na classe `App`, mantenha uma lista de `Veiculo` e apresente um menu com as opções:

1. Cadastrar veículo
2. Listar veículos
3. Alugar veículo
4. Devolver veículo
5. Consultar veículo pela placa
6. Exibir total arrecadado
9. Encerrar o programa

O cadastro deve perguntar o tipo de veículo, os dados comuns e a característica específica. Para alugar, localize o veículo pela placa, solicite a quantidade de diárias e mostre o valor calculado. Some ao total arrecadado apenas locações realizadas com sucesso. Para devolver, localize o veículo pela placa e atualize sua situação.

Informe claramente quando a placa não estiver cadastrada, quando o veículo já estiver alugado ou quando uma operação não puder ser realizada.

## Organização sugerida

```text
src/
├── controller/
│   └── App.java
└── model/
    ├── Veiculo.java
    ├── Carro.java
    └── Motocicleta.java
```

## Roteiro de verificação

1. Cadastre um carro com diária de R$ 100,00 e uma motocicleta com diária de R$ 50,00.
2. Alugue o carro por 2 diárias: o valor deve ser R$ 220,00.
3. Alugue a motocicleta por 2 diárias: o valor deve ser R$ 125,00.
4. Tente alugar novamente um veículo que já está alugado; a operação deve ser recusada.
5. Devolva um veículo e confirme que ele voltou a ficar disponível.
6. Consulte os veículos e confira os dados específicos de cada tipo.
7. Confira que o total arrecadado considera somente locações concluídas.

## Desafio extra

Impeça o cadastro de placas repetidas e trate entradas inválidas sem encerrar o programa inesperadamente.
