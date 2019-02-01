---
title: "Importar Conta"
id: ImportarConta
---
<div id="d114463e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Importar Conta

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Importar Conta -
    I\_ElementValue](#d114463e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Importação de Valores de
Contas Naturais

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Importação
de Contas Naturais" é uma tabela interina que é utilizada ao importar
dados externos para dentro do sistema. Selecionar o botão 'Processar'
vai acrescentar ou modificar os registros apropriados.

<span class="emphasis"> *Criado em:* </span>2003-01-11 16:29:10.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/ImportarConta.png)

<div id="d114463e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Importar Conta - I\_ElementValue

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/I_ElementValue_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d114463e32" class="table">

<div class="table-title">

Table 1.1. Import Account
Fields

</div>

<div class="table-contents">

|         Nome do campo          |      Referência      |                           Valores (Padrão)                           |       Chave restritiva       |                Regra de validação                |                                          Descrição                                          |                                                                                                                                                 Comentário/Ajuda                                                                                                                                                 |
| :----------------------------: | :------------------: | :------------------------------------------------------------------: | :--------------------------: | :----------------------------------------------: | :-----------------------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|             Ativo              |       Sim-Não        |                                 (Y)                                  |                              |                                                  |                             (semelhante ao primeiro relatório)                              |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|         Importar Conta         |          ID          |                                                                      |                              |                                                  |                                    Import Account Value                                     |                                                                                                                                                                                                                                                                                                                  |
|           Importado            |       Sim-Não        |                                                                      |                              |                                                  |                               Has this import been processed                                |                                                                                                                       The Imported check box indicates if this import has been processed.                                                                                                                        |
|       Elemento de Contas       |    Tabela Direta     |                                                                      | celementvalue\_ielementvalue |                                                  |                                       Account Element                                       |                                                                                                                         Account Elements can be natural accounts or user defined values.                                                                                                                         |
| Mensagem de Erro de Importação | Texto Curto (String) |                                                                      |                              |                                                  |                           Messages generated from import process                            |                                                                                                            The Import Error Message displays any error messages generated during the import process.                                                                                                             |
|            Empresa             |    Tabela Direta     |                         (@\#AD\_Client\_ID@)                         |                              |        AD\_Client.AD\_Client\_ID \< \> 0         |                             (semelhante ao primeiro relatório)                              |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|          Organização           |    Tabela Direta     |                          (@\#AD\_Org\_ID@)                           |                              | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                             (semelhante ao primeiro relatório)                              |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|        Nome do Elemento        | Texto Curto (String) |                                                                      |                              |                                                  |                                     Name of the Element                                     |                                                                                                                                                                                                                                                                                                                  |
|            Elemento            |    Tabela Direta     |                                                                      |   celement\_ielementvalue    |                                                  |                                     Accounting Element                                      |                                                                                                    The Account Element uniquely identifies an Account Type. These are commonly known as a Chart of Accounts.                                                                                                     |
|         Chave de Busca         | Texto Curto (String) |                                                                      |                              |                                                  |                             (semelhante ao primeiro relatório)                              |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|              Nome              | Texto Curto (String) |                                                                      |                              |                                                  |                            Alphanumeric identifier of the entity                            |                                                                                   The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                   |
|           Descrição            | Texto Curto (String) |                                                                      |                              |                                                  |                          Optional short description of the record                           |                                                                                                                                   A description is limited to 255 characters.                                                                                                                                    |
|         Tipo de Conta          |        Lista         | Ativo Despesa Passivo Memorando Patrimônio dos Proprietários Receita |                              |                                                  |                                Indicates the type of account                                | Valid account types are A - Asset, E - Expense, L - Liability, O- Owner's Equity, R -Revenue and M- Memo. The account type is used to determine what taxes, if any are applicable, validating payables and receivables for business partners. Note: Memo account amounts are ignored when checking for balancing |
|         Sinal da Conta         |        Lista         |                        Crédito Débito Natural                        |                              |                                                  |               Indicates the Natural Sign of the Account as a Debit or Credit                |                                                     Indicates if the expected balance for this account should be a Debit or a Credit. If set to Natural, the account sign for an asset or expense account is Debit Sign (i.e. negative if a credit balance).                                                     |
|        Nível de Resumo         |       Sim-Não        |                                                                      |                              |                                                  |                                  This is a summary entity                                   |                                                                                   A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.                                                                                    |
|          Chave do Pai          | Texto Curto (String) |                                                                      |                              |                                                  |                                      Key if the Parent                                      |                                                                                                                                                                                                                                                                                                                  |
|           Conta Pai            |        Tabela        |                        C\_ElementValue (all)                         | cevalueparent\_ielementvalue |                                                  |                                The parent (summary) account                                 |                                                                                                                                                                                                                                                                                                                  |
|        Lançamento Real         |       Sim-Não        |                                                                      |                              |                                                  |                                 Actual Values can be posted                                 |                                                                                                                 The Post Actual indicates if actual values can be posted to this element value.                                                                                                                  |
|    Lançamento de Orçamento     |       Sim-Não        |                                                                      |                              |                                                  |                                 Budget values can be posted                                 |                                                                                                                 The Post Budget indicates if budget values can be posted to this element value.                                                                                                                  |
|   Lançamento de Estatísticas   |       Sim-Não        |                                                                      |                              |                                                  |                        Post statistical quantities to this account?                         |                                                                                                                                                                                                                                                                                                                  |
|    Lançamento de Obrigações    |       Sim-Não        |                                                                      |                              |                                                  |                              Post commitments to this account                               |                                                                                                                                                                                                                                                                                                                  |
|      Documento Controlado      |       Sim-Não        |                                                                      |                              |                                                  | Control account - If an account is controlled by a document, you cannot post manually to it |                                                                                                                                                                                                                                                                                                                  |
|          Conta Padrão          | Texto Curto (String) |                                                                      |                              |                                                  |                             Name of the Default Account Column                              |                                                                                                                                                                                                                                                                                                                  |
|             Coluna             |        Tabela        |                        I\_ElementValue Column                        |   adcolumn\_ielementvalue    |                                                  |                                     Column in the table                                     |                                                                                                                                     Link to the database column of the table                                                                                                                                     |
|        Importar Contas         |        Botão         |                                                                      |                              |                                                  |                                                                                             |                                                                                                                                                                                                                                                                                                                  |
|           Processado           |       Sim-Não        |                                                                      |                              |                                                  |                               The document has been processed                               |                                                                                                                       The Processed checkbox indicates that a document has been processed.                                                                                                                       |
|      I\_ElementValue\_UU       | Texto Curto (String) |                                                                      |                              |                                                  |                                                                                             |                                                                                                                                                                                                                                                                                                                  |

</div>

</div>

  

</div>
