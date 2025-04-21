# CRUD---EPIs
**_Sistema de Controle de EPIs, Empréstimos e Devoluções_**

Este projeto é um sistema em Java para gerenciar as operações de Cadastro, 
Listagem, Atualização e Remoção de dados sobre Usuários, EPIs, Empréstimos e Devoluções. 
O sistema utiliza menus interativos e validações para garantir que os dados inseridos sejam corretos.

**_Funcionalidades_**

**O sistema possui os seguintes módulos:**

CRUD de Usuários: Permite cadastrar, listar, atualizar e remover usuários.

CRUD de EPIs: Permite cadastrar, listar, atualizar e remover 
Equipamentos de Proteção Individual (EPIs).

CRUD de Empréstimos: Permite cadastrar, listar, atualizar e remover empréstimos 
de EPIs aos usuários.

CRUD de Devoluções: Permite cadastrar, listar, atualizar e 
remover devoluções de EPIs.

**_Tecnologias Utilizadas_**

Linguagem: Java

Bibliotecas: java.util.Scanner para interação com o usuário e java.util.ArrayList 
para armazenar dados.

**_Interagir com o Menu_**

----- Sistema de Controle -----
1. CRUD de Usuários
2. CRUD de EPIs
3. CRUD de Empréstimos
4. CRUD de Devoluções
0. Sair

Ao escolher a opção desejada, o programa irá redirecioná-lo 
para o submenu da operação escolhida 
(Cadastrar, Listar, Atualizar ou Remover).

**_Exemplo de Interação:_**

----- CRUD de Usuários -----
1. Cadastrar Usuário
2. Listar Usuários
3. Atualizar Usuário
4. Remover Usuário
0. Voltar

Você pode escolher a opção desejada e 
interagir com o sistema.

# Sistema de Gerenciamento Modular

Este projeto consiste em um sistema de gerenciamento modular em Java, 
com um **submenu CRUD reutilizável** para operações de 
**Cadastro**, **Leitura**, **Atualização** e **Remoção** de dados. 
O sistema é modular e pode ser facilmente expandido para diferentes entidades, como 
**EPIs**, **Funcionários** e **Empréstimos**.

### Funcionalidades

- **Menu Principal** com as opções:
    - Módulo de EPIs
    - Módulo de Funcionários
    - Módulo de Empréstimos
    - Sair

- **Submenu CRUD** reutilizável:
    - **Cadastrar** novos itens (como EPIs, Funcionários, Empréstimos).
    - **Listar** itens cadastrados.
    - **Atualizar** um item existente.
    - **Remover** um item.

- **Validações**:
    - O sistema não permite cadastros ou atualizações com entradas vazias.
    - Mensagens claras são fornecidas ao usuário em todas as operações.
    - O sistema valida a entrada de índices para operações de atualização e remoção.

### Arquivos

1. **`SistemaModular.java`**: Classe principal, responsável pelo menu inicial e pela chamada aos submenus de cada módulo (EPIs, Funcionários e Empréstimos).
2. **`SubmenuCRUD.java`**: Classe que contém o submenu reutilizável, responsável por realizar as operações CRUD para qualquer lista de dados.

**_Contribuições_**

Sinta-se à vontade para contribuir com
melhorias ou correções.


