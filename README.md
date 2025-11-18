🛒 Sistema de Processamento de Pagamentos — User Story
📌 Contexto

Você está trabalhando no time de desenvolvimento de um sistema de e-commerce.
Uma das funcionalidades principais é o processamento de pagamentos, permitindo que os clientes utilizem diferentes meios:

Cartão de Crédito

PIX

Boleto Bancário

Cada forma de pagamento possui regras e comportamentos específicos, mas o sistema deve ser modular, flexível e escalável, possibilitando adicionar novos métodos de pagamento futuramente sem grandes alterações na estrutura.

Para isso, todo o desenvolvimento deve seguir os princípios de Programação Orientada a Objetos:

Encapsulamento

Herança

Polimorfismo

Abstração

🎯 Objetivo da Atividade

Projetar e implementar um sistema completo de pagamentos que:

✔ Define uma estrutura comum para pagamentos por meio de uma interface e/ou classe abstrata
✔ Especializa cada tipo de pagamento com herança
✔ Garante segurança dos dados utilizando encapsulamento (atributos privados ou protegidos + getters/setters)
✔ Demonstra polimorfismo real, permitindo que vários tipos de pagamento sejam tratados de forma uniforme
✔ Permite a expansão futura sem quebrar o código existente
