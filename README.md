# Banco Digital - POO

Este projeto é um sistema de Banco Digital desenvolvido para praticar os quatro pilares da Programação Orientada a Objetos (POO): Abstração, Encapsulamento, Herança e Polimorfismo.

## Funcionalidades

- Criação de contas para clientes (corrente e poupança).
- Depósito, saque e transferência entre contas.
- Consulta de saldo e extrato das contas.

## Pilares da POO Aplicados

     1. Abstração
Neste projeto, a abstração foi usada para criar as classes que representam os elementos principais do sistema bancário. Exemplo de classes abstratas:

- Conta: uma classe genérica que define o comportamento comum entre contas bancárias.

    2. Encapsulamento
O encapsulamento foi aplicado para proteger os dados das classes, permitindo acesso controlado por meio de métodos getters e setters.

    3. Herança
A herança foi utilizada para criar tipos de contas específicas (Conta Corrente e Conta Poupança) que herdam os atributos e comportamentos da classe Conta.

- ContaCorrente e ContaPoupanca estendem a classe Conta, especializando comportamentos como o tipo de operação disponível.

    4. Polimorfismo
O polimorfismo foi implementado ao sobrescrever métodos na classe filha. Por exemplo, o método de sacar pode ter comportamentos diferentes entre a Conta Corrente e a Conta Poupança.
