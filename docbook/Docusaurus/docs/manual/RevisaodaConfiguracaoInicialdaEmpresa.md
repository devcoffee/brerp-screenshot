---
title: "Revisão da Configuração Inicial da Empresa"
id: RevisaodaConfiguracaoInicialdaEmpresa
---
<div id="d208801e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Workflow: Revisão da Configuração Inicial da Empresa

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2000-09-24 18:54:54.0

<span class="emphasis">*Atualizado:*</span>2005-12-25 17:17:13.0

<span class="emphasis"> *Descrição:* </span> Revisão em nível de sistema
da configuração de uma nova Empresa

<span class="emphasis"> *Comentário/Ajuda:* </span>This workflow reviews
the system setup of a new client as performed by the automatic Initial
Client Setup. You may want to check also the following Workflows: -
Accounting Setup - Business Partner Setup - Product Setup - Price list
Setup - Warehouse Setup - Tax Setup

<span class="emphasis"> *Nó inicial:* </span>Empresa

<span class="emphasis"> *WorkFlowType:* </span>W

![](/img/manual/RevisaodaConfiguracaoInicialdaEmpresa.png)

<div id="d208801e30" class="table">

<div class="table-title">

Table 1.1. Revisão da Configuração Inicial da Empresa Workflow
Transitions

</div>

<div class="table-contents">

|                 Nó                  |                     Descrição                      |    Ação    |        Próximo nó        | Condição |
| :---------------------------------: | :------------------------------------------------: | :--------: | :----------------------: | :------: |
|               Empresa               |       Gerenciamento de Empresas / Locatários       | UserWindow |       Organization       |          |
|             Organização             |           Gerenciamento das Organizações           | UserWindow |           Role           |          |
|               Perfil                |  Gerenciamento das Responsabilidades dos Usuários  | UserWindow |           User           |          |
|               Usuário               |       Gerenciamento dos Usuários do Sistema        | UserWindow |    Import File Loader    |          |
| Carregador de Arquivo de Importação | Carregar arquivos planos nas tabelas de importação |  UserForm  |      Import Account      |          |
|           Importar Conta            |      Importação de Valores de Contas Naturais      | UserWindow | Calendar Year and Period |          |
|         Período e Ano Civil         |       Gerenciamento de Períodos e Anos Civís       | UserWindow |                          |          |

</div>

</div>

  

</div>
