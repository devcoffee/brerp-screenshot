---
title: "Combinação de Contas"
id: CombinacaodeContas
---
<div id="d28524e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Combinação de Contas

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Combinação -
    C\_ValidCombination](#d28524e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Combinações
de Contas Válidas

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Combinação
de Contas" define e mostra Combinações de Contas Válidas.

<span class="emphasis"> *Criado em:* </span>1999-09-26 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d28524e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Combinação - C\_ValidCombination

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_ValidCombination_data)

<span class="emphasis">*Descrição:*</span> Combinações de Contas Válidas

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Combinação de
Contas" define e mostra combinações de contas válidas. Um "Pseudônimo"
pode ser definido para facilitar o lançamento de documentos.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d28524e39" class="table">

<div class="table-title">

Table 1.1. Combination
Fields

</div>

<div class="table-contents">

|         Nome do campo          |      Referência      |       Valores (Padrão)       |        Chave restritiva        |                                                                                               Regra de validação                                                                                               |                             Descrição                             |                                                                                                                           Comentário/Ajuda                                                                                                                            |
| :----------------------------: | :------------------: | :--------------------------: | :----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|           Combinação           |          ID          |                              |                                |                                                                                                                                                                                                                |                     Valid Account Combination                     |                                                                                        The Combination identifies a valid combination of element which represent a GL account.                                                                                        |
|            Empresa             |    Tabela Direta     |     (@\#AD\_Client\_ID@)     |          adclient\_vc          |                                                                                       AD\_Client.AD\_Client\_ID \< \> 0                                                                                        |                (semelhante ao primeiro relatório)                 |                                                                                                                          (ver o mesmo acima)                                                                                                                          |
|        Esquema Contábil        |    Tabela Direta     |                              | cacctschema\_cvalidcombination |                                                                                                                                                                                                                |                       Rules for accounting                        |                                                                                An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                                                                                |
|           Pseudônimo           | Texto Curto (String) |                              |                                |                                                                                                                                                                                                                | Defines an alternate method of indicating an account combination. |                                      The Alias field allows you to define a alternate method for referring to a full account combination. For example, the Account Receivable Account for Garden World may be aliased as GW\_AR.                                      |
|           Combinação           | Texto Curto (String) |                              |                                |                                                                                                                                                                                                                |              Unique combination of account elements               |                                                                                  The Combination field defines the unique combination of element values which comprise this account.                                                                                  |
|           Descrição            | Texto Curto (String) |                              |                                |                                                                                                                                                                                                                |             Optional short description of the record              |                                                                                                              A description is limited to 255 characters.                                                                                                              |
|             Ativo              |       Sim-Não        |             (Y)              |                                |                                                                                                                                                                                                                |                (semelhante ao primeiro relatório)                 |                                                                                                                          (ver o mesmo acima)                                                                                                                          |
|     Totalmente Qualificado     |       Sim-Não        |                              |                                |                                                                                                                                                                                                                |                  This account is fully qualified                  |                                                                              The Fully Qualified check box indicates that all required elements for an account combination are present.                                                                               |
|          Organização           |    Tabela Direta     |      (@\#AD\_Org\_ID@)       |           adorg\_vc            |                                                         AD\_Org.AD\_Org\_ID = 0 OR (AD\_Org.AD\_Client\_ID=@AD\_Client\_ID@ AND AD\_Org.IsSummary='N')                                                         |                (semelhante ao primeiro relatório)                 |                                                                                                                          (ver o mesmo acima)                                                                                                                          |
| Organização de Transação (Trx) |        Tabela        |        AD\_Org (Trx)         |          adorgtrx\_vc          |                                                                                                                                                                                                                |               Performing or initiating organization               |      The organization which performs or initiates this transaction (for another organization). The owning Organization may not be the transaction organization in a service bureau environment, with centralized services, and inter-organization transactions.       |
|             Conta              |       Procurar       |    C\_ElementValue (trx)     |    celementvalueaccount\_vc    | EXISTS (SELECT \* FROM C\_AcctSchema\_Element ae WHERE C\_ElementValue.C\_Element\_ID=ae.C\_Element\_ID AND ae.ElementType='AC' AND ae.C\_AcctSchema\_ID=@C\_AcctSchema\_ID@) AND C\_ElementValue.IsActive='Y' |                           Account used                            |                                                                                                                      The (natural) account used                                                                                                                       |
|           Sub Conta            |    Tabela Direta     |                              |  csubacct\_cvalidcombination   |                                                                                  C\_SubAcct.C\_ElementValue\_ID=@Account\_ID@                                                                                  |                   Sub account for Element Value                   | The Element Value (e.g. Account) may have optional sub accounts for further detail. The sub account is dependent on the value of the account, so a further specification. If the sub-accounts are more or less the same, consider using another accounting dimension. |
|           Atividade            |        Tabela        |   C\_Activity (No summary)   |  cactivity\_cvalidcombination  |                                                                                                                                                                                                                |                         Business Activity                         |                                                                                        Activities indicate tasks that are performed and used to utilize Activity based Costing                                                                                        |
|            Produto             |       Procurar       |   M\_Product (no summary)    |          mproduct\_vc          |                                                                                                                                                                                                                |                      Product, Service, Item                       |                                                                                              Identifies an item which is either purchased or sold in this organization.                                                                                               |
|      Parceiro de Negócios      |       Procurar       |      C\_BPartner (Trx)       |         cbpartner\_vc          |                                                                                                                                                                                                                |                   Identifies a Business Partner                   |                                                                            A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                            |
|            Projeto             |        Tabela        |   C\_Project (No summary)    |          cproject\_vc          |                                                                                                                                                                                                                |                         Financial Project                         |                                                                                              A Project allows you to track and control internal or external activities.                                                                                               |
|            Campanha            |        Tabela        |   C\_Campaign (No summary)   |         socampaign\_vc         |                                                                                                                                                                                                                |                        Marketing Campaign                         |                                                 The Campaign defines a unique marketing program. Projects can be associated with a pre defined Marketing Campaign. You can then report based on a specific Campaign.                                                  |
|     Localização de Origem      |        Tabela        |         C\_Location          |       mlocationfrom\_vc        |                                                                                                                                                                                                                |              Location that inventory was moved from               |                                                                                                The Location From indicates the location that a product was moved from.                                                                                                |
|     Localização de Destino     |        Tabela        |         C\_Location          |        mlocationto\_vc         |                                                                                                                                                                                                                |               Location that inventory was moved to                |                                                                                                  The Location To indicates the location that a product was moved to.                                                                                                  |
|        Região de Vendas        |        Tabela        | C\_Sales Region (No summary) |        csalesregion\_vc        |                                                                                                                                                                                                                |                       Sales coverage region                       |                                                                                                     The Sales Region indicates a specific area of sales coverage.                                                                                                     |
|        Centro de Custo         |        Tabela        |     Account\_ID - User1      |     celementvalueuser1\_vc     |                 EXISTS (SELECT \* FROM C\_AcctSchema\_Element ae WHERE C\_ElementValue.C\_Element\_ID=ae.C\_Element\_ID AND ae.ElementType='U1' AND ae.C\_AcctSchema\_ID=@C\_AcctSchema\_ID@)                  |                   User defined list element \#1                   |                                                                             The user defined element displays the optional elements that have been defined for this account combination.                                                                              |
|       Centro de Custo 2        |        Tabela        |     Account\_ID - User2      |     celementvalueuser2\_vc     |                 EXISTS (SELECT \* FROM C\_AcctSchema\_Element ae WHERE C\_ElementValue.C\_Element\_ID=ae.C\_Element\_ID AND ae.ElementType='U2' AND ae.C\_AcctSchema\_ID=@C\_AcctSchema\_ID@)                  |                   User defined list element \#2                   |                                                                             The user defined element displays the optional elements that have been defined for this account combination.                                                                              |
|     Elemento do Usuário 1      |          ID          |                              |                                |                                                                                                                                                                                                                |                  User defined accounting Element                  |  A user defined accounting element referres to a iDempiere table. This allows to use any table content as an accounting dimension (e.g. Project Task). Note that User Elements are optional and are populated from the context of the document (i.e. not requested)   |
|     Elemento do Usuário 2      |          ID          |                              |                                |                                                                                                                                                                                                                |                  User defined accounting Element                  |  A user defined accounting element referres to a iDempiere table. This allows to use any table content as an accounting dimension (e.g. Project Task). Note that User Elements are optional and are populated from the context of the document (i.e. not requested)   |
|    C\_ValidCombination\_UU     | Texto Curto (String) |                              |                                |                                                                                                                                                                                                                |                                                                   |                                                                                                                                                                                                                                                                       |

</div>

</div>

  

</div>
