---
title: "Elemento de Contas"
id: ElementodeContas
---
<div id="d82727e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Elemento de Contas

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Elemento -
    C\_Element](#d82727e23)</span>
  - <span class="section">[2. Tabela: Valor do Elemento -
    C\_ElementValue](#d82727e298)</span>
  - <span class="section">[3. Tabela: Tradução -
    C\_ElementValue\_Trl](#d82727e793)</span>
  - <span class="section">[4. Tabela: Sub Conta -
    C\_SubAcct](#d82727e972)</span>
  - <span class="section">[5. Tabela: Element Value Reference -
    COF\_ElementValueReference](#d82727e1155)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento dos Elementos
de Contas

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Elemento
Contábil" é usada para definir e manter o Elemento Contábil e os
Elementos Definidos pelo Usuário. Um dos segmentos de contabilidade é o
seu segmento de contabilidade natural (Plano de Contas). Você pode
acrescentar um novo Elemento Contábil para relatórios paralelos ou para
segmentos de contabilidade definidos pelo usuário.

<span class="emphasis"> *Criado em:* </span>1999-06-11 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/ElementodeContas.png)

<div id="d82727e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Elemento - C\_Element

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Element_data)

<span class="emphasis">*Descrição:*</span> Definição de Elemento
Contábil

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Elemento"
define o Nome, Descrição e Formato de um Elemento. Adicionalmente, um
"Tipo de Conta" ou "Definido pelo Usuário" é selecionado. Cada Esquema
de Contas tem que ter um tipo de Elemento Contábil. Os Elementos
Definidos pelo Usuário são opcionais.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d82727e40" class="table">

<div class="table-title">

Table 1.1. Element
Fields

</div>

<div class="table-contents">

|  Nome do campo   |      Referência      |        Valores (Padrão)         |  Chave restritiva  |                        Regra de validação                         |                                     Descrição                                      |                                                                                                                                                                                                                                                     Comentário/Ajuda                                                                                                                                                                                                                                                      |
| :--------------: | :------------------: | :-----------------------------: | :----------------: | :---------------------------------------------------------------: | :--------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Elemento     |          ID          |                                 |                    |                                                                   |                                 Accounting Element                                 |                                                                                                                                                                                                         The Account Element uniquely identifies an Account Type. These are commonly known as a Chart of Accounts.                                                                                                                                                                                                         |
|     Empresa      |    Tabela Direta     |      (@\#AD\_Client\_ID@)       | adclient\_celement |                 AD\_Client.AD\_Client\_ID \< \> 0                 |                         (semelhante ao primeiro relatório)                         |                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                    |
|   Organização    |    Tabela Direta     |        (@\#AD\_Org\_ID@)        |   c\_elementorg    |         (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)          |                         (semelhante ao primeiro relatório)                         |                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                    |
|       Nome       | Texto Curto (String) |                                 |                    |                                                                   |                       Alphanumeric identifier of the entity                        |                                                                                                                                                                                       The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                                                                                        |
|    Descrição     | Texto Curto (String) |                                 |                    |                                                                   |                      Optional short description of the record                      |                                                                                                                                                                                                                                        A description is limited to 255 characters.                                                                                                                                                                                                                                        |
|      Ativo       |       Sim-Não        |               (Y)               |                    |                                                                   |                         (semelhante ao primeiro relatório)                         |                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                    |
| Formato do Valor | Texto Curto (String) |                                 |                    |                                                                   | Format of the value; Can contain fixed format elements, Variables: "\_lLoOaAcCa09" | \< B\> Validation elements:\< /B\> (Space) any character \_ Space (fixed character) l any Letter a..Z NO space L any Letter a..Z NO space converted to upper case o any Letter a..Z or space O any Letter a..Z or space converted to upper case a any Letters %26 Digits NO space A any Letters %26 Digits NO space converted to upper case c any Letters %26 Digits or space C any Letters %26 Digits or space converted to upper case 0 Digits 0..9 NO space 9 Digits 0..9 or space Example of format "(000)\_000-0000" |
|       Tipo       |        Lista         | Conta Definido pelo usuário (A) |                    |                                                                   |                       Element Type (account or user defined)                       |                                                                                                                                                                                                              The Element Type indicates if this element is the Account element or is a User Defined element.                                                                                                                                                                                                              |
|  Conta Natural   |       Sim-Não        |                                 |                    |                                                                   |                            The primary natural account                             |                                                                                                                                                                                                                        The natural account is often based on (industry specific) chart of accounts                                                                                                                                                                                                                        |
|   Balanceando    |       Sim-Não        |                                 |                    |                                                                   |     All transactions within an element value must balance (e.g. cost centers)      |                                                            The Balancing checkbox indicates the this element must balance in each journal transaction. For example, if cost centers have been defined as an element which is balance then the debits and credits for each unique cost center must net to 0.00. This is commonly used to define parts of an organization which report as their own entity. Balancing is not an option for the Account element.                                                             |
|      Árvore      |    Tabela Direta     |                                 |  adtree\_celement  | AD\_Tree.TreeType IN ('EV','U1','U2') AND AD\_Tree.IsAllNodes='Y' |                                 Identifies a Tree                                  |                                                                                                                                                               The Tree field identifies a unique Tree in the system. Trees define roll ups or summary levels of information. They are used in reports for defining report points and summarization levels.                                                                                                                                                                |
|   Referenciado   |       Sim-Não        |               (N)               |                    |                                                                   |                                                                                    |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|     Entidade     |        Lista         |   SUSEP RECEITA COSIF OUTROS    |                    |                                                                   |                                                                                    |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|   Válido Desde   |         Data         |                                 |                    |                                                                   |                     Valid from including this date (first day)                     |                                                                                                                                                                                                                                The Valid From date indicates the first day of a date range                                                                                                                                                                                                                                |
|    Válido Até    |         Data         |                                 |                    |                                                                   |                      Valid to including this date (last day)                       |                                                                                                                                                                                                                                 The Valid To date indicates the last day of a date range                                                                                                                                                                                                                                  |
|  C\_Element\_UU  | Texto Curto (String) |                                 |                    |                                                                   |                                                                                    |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |

</div>

</div>

  

<div id="d82727e298" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Valor do Elemento - C\_ElementValue

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_ElementValue_data)

<span class="emphasis">*Descrição:*</span> Definir Valores de Elementos

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Valor de
Elemento" define o valor individual válido para o Elemento. Os valores
devem utilizar o formato definido. Se o Elemento for um Tipo de Conta
então a Classificação de Conta (Ativo, Passivo etc.) e os controles de
contabilização também serão definidos

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d82727e315" class="table">

<div class="table-title">

Table 1.2. Element Value
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      |                                           Valores (Padrão)                                            |      Chave restritiva       |                Regra de validação                |                                          Descrição                                          |                                                                                                                                                 Comentário/Ajuda                                                                                                                                                 |
| :-------------------------: | :------------------: | :---------------------------------------------------------------------------------------------------: | :-------------------------: | :----------------------------------------------: | :-----------------------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Válido até          |         Data         |                                                                                                       |                             |                                                  |                           Valid to including this date (last day)                           |                                                                                                                             The Valid To date indicates the last day of a date range                                                                                                                             |
|  Lançamento de Obrigações   |       Sim-Não        |                                                  (Y)                                                  |                             |                                                  |                              Post commitments to this account                               |                                                                                                                                                                                                                                                                                                                  |
|     Elemento de Contas      |          ID          |                                                                                                       |                             |                                                  |                                       Account Element                                       |                                                                                                                         Account Elements can be natural accounts or user defined values.                                                                                                                         |
|        Válido desde         |         Data         |                                                                                                       |                             |                                                  |                         Valid from including this date (first day)                          |                                                                                                                           The Valid From date indicates the first day of a date range                                                                                                                            |
|           Empresa           |    Tabela Direta     |                                          (@AD\_Client\_ID@)                                           |   adclient\_celementvalue   |        AD\_Client.AD\_Client\_ID \< \> 0         |                             (semelhante ao primeiro relatório)                              |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|         Organização         |    Tabela Direta     |                                            (@AD\_Org\_ID@)                                            |    adorg\_celementvalue     | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                             (semelhante ao primeiro relatório)                              |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|          Elemento           |    Tabela Direta     |                                                                                                       |   celement\_celementvalue   |                                                  |                                     Accounting Element                                      |                                                                                                    The Account Element uniquely identifies an Account Type. These are commonly known as a Chart of Accounts.                                                                                                     |
|       Chave de Busca        | Texto Curto (String) |                                                                                                       |                             |                                                  |                             (semelhante ao primeiro relatório)                              |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|            Nome             | Texto Curto (String) |                                                                                                       |                             |                                                  |                            Alphanumeric identifier of the entity                            |                                                                                   The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                   |
|          Descrição          | Texto Curto (String) |                                                                                                       |                             |                                                  |                          Optional short description of the record                           |                                                                                                                                   A description is limited to 255 characters.                                                                                                                                    |
|            Ativo            |       Sim-Não        |                                                  (Y)                                                  |                             |                                                  |                             (semelhante ao primeiro relatório)                              |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|       Nível de Resumo       |       Sim-Não        |                                                                                                       |                             |                                                  |                                  This is a summary entity                                   |                                                                                   A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.                                                                                    |
|        Tipo de Conta        |        Lista         |               Ativo Despesa Passivo Memorando Patrimônio dos Proprietários Receita (E)                |                             |                                                  |                                Indicates the type of account                                | Valid account types are A - Asset, E - Expense, L - Liability, O- Owner's Equity, R -Revenue and M- Memo. The account type is used to determine what taxes, if any are applicable, validating payables and receivables for business partners. Note: Memo account amounts are ignored when checking for balancing |
|       Lançamento Real       |       Sim-Não        |                                                  (Y)                                                  |                             |                                                  |                                 Actual Values can be posted                                 |                                                                                                                 The Post Actual indicates if actual values can be posted to this element value.                                                                                                                  |
|       Sinal da Conta        |        Lista         |                                      Crédito Débito Natural (N)                                       |                             |                                                  |               Indicates the Natural Sign of the Account as a Debit or Credit                |                                                     Indicates if the expected balance for this account should be a Debit or a Credit. If set to Natural, the account sign for an asset or expense account is Debit Sign (i.e. negative if a credit balance).                                                     |
|   Lançamento de Orçamento   |       Sim-Não        |                                                  (Y)                                                  |                             |                                                  |                                 Budget values can be posted                                 |                                                                                                                 The Post Budget indicates if budget values can be posted to this element value.                                                                                                                  |
|    Documento Controlado     |       Sim-Não        |                                                                                                       |                             |                                                  | Control account - If an account is controlled by a document, you cannot post manually to it |                                                                                                                                                                                                                                                                                                                  |
| Lançamento de Estatísticas  |       Sim-Não        |                                                  (Y)                                                  |                             |                                                  |                        Post statistical quantities to this account?                         |                                                                                                                                                                                                                                                                                                                  |
|       Conta Bancária        |       Sim-Não        |                                                                                                       |                             |                                                  |                            Indicates if this is the Bank Account                            |                                                                                                                   The Bank Account checkbox indicates if this is account is the bank account.                                                                                                                    |
|       Conta Bancária        |    Tabela Direta     |                                                                                                       | cbankaccount\_celementvalue |                                                  |                                     Account at the Bank                                     |                                                                                                                               The Bank Account identifies an account at this Bank.                                                                                                                               |
| Conta de Moeda Estrangeira  |       Sim-Não        |                                                                                                       |                             |                                                  |          Balances in foreign currency accounts are held in the nominated currency           |                                                                                                  Balances in foreign currency accounts are held in the nominated currency and translated to functional currency                                                                                                  |
|          Moeda De           |    Tabela Direta     |                                                                                                       |  ccurrency\_celementvalue   |                                                  |                                The Currency for this record                                 |                                                                                                                  Indicates the Currency to be used when processing or reporting on this record                                                                                                                   |
|  Manage Business Partners   |       Sim-Não        |                                                  (N)                                                  |                             |                                                  |                                                                                             |                                                                                                                                                                                                                                                                                                                  |
| Tipo de Parceiro de Negócio |        Lista         |                                       Customer Employee Vendor                                        |                             |                                                  |                                                                                             |                                                                                                                                                                                                                                                                                                                  |
|       Manage Products       |       Sim-Não        |                                                  (N)                                                  |                             |                                                  |                                                                                             |                                                                                                                                                                                                                                                                                                                  |
|    Código de Aglutinação    |       Procurar       |                                         C\_ElementValue (all)                                         |  cofCodAgl\_CElementValue   | C\_ElementValue.C\_Element\_ID=@C\_Element\_ID@  |                                                                                             |                                                                                                                                                                                                                                                                                                                  |
|      Versão Detalhada       |       Sim-Não        |                                                  (N)                                                  |                             |                                                  |                                                                                             |                                                                                                                                                                                                                                                                                                                  |
| Código de Natureza da Conta |        Lista         | Contas de Ativo Contas de Passivo Patrimônio Líquido Contas de resultado Contas de compensação Outras |                             |                                                  |                                                                                             |                                                                                                                                                                                                                                                                                                                  |
|  Tipo do Valor do Elemento  |        Lista         |                       Remessa do Arquivo Original Remessa do Arquivo Substituto                       |                             |                                                  |                                                                                             |                                                                                                                                                                                                                                                                                                                  |
|        Válido Desde         |         Data         |                                                                                                       |                             |                                                  |                         Valid from including this date (first day)                          |                                                                                                                           The Valid From date indicates the first day of a date range                                                                                                                            |
|         Válido Até          |         Data         |                                                                                                       |                             |                                                  |                           Valid to including this date (last day)                           |                                                                                                                             The Valid To date indicates the last day of a date range                                                                                                                             |

</div>

</div>

  

<div id="d82727e793" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Tradução - C\_ElementValue\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_ElementValue_Trl_data)

<span class="emphasis">*Descrição:*</span> Definir Tradução

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Tradução"
define a tradução para um idioma alternativo

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d82727e814" class="table">

<div class="table-title">

Table 1.3. Translation
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      |  Valores (Padrão)  |       Chave restritiva       |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :----------------------: | :------------------: | :----------------: | :--------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa          |    Tabela Direta     | (@AD\_Client\_ID@) |                              |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Organização        |    Tabela Direta     |  (@AD\_Org\_ID@)   |                              | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Elemento de Contas    |    Tabela Direta     |                    |  celementvalue\_cevaluetrl   |                                                  |             Account Element              |                                       Account Elements can be natural accounts or user defined values.                                       |
|          Idioma          |        Tabela        |    AD\_Language    | adlanguage\_celementvaluetrl |                                                  |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|          Ativo           |       Sim-Não        |        (Y)         |                              |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|           Nome           | Texto Curto (String) |                    |                              |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição         | Texto Curto (String) |                    |                              |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|        Traduzida         |       Sim-Não        |                    |                              |                                                  |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
| C\_ElementValue\_Trl\_UU | Texto Curto (String) |                    |                              |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d82727e972" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Sub Conta - C\_SubAcct

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Sub Account for Element Value

<span class="emphasis">*Comentário/Ajuda:* </span> The Element Value
(e.g. Account) may have optional sub accounts for further detail. The
sub account is dependent on the value of the account, so a further
specification. If the sub-accounts are more or less the same, consider
using another accounting dimension.

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d82727e987" class="table">

<div class="table-title">

Table 1.4. Sub Account
Fields

</div>

<div class="table-contents">

|   Nome do campo    |            Referência             | Valores (Padrão) |    Chave restritiva     |        Regra de validação         |                Descrição                 |                                                                                                                           Comentário/Ajuda                                                                                                                            |
| :----------------: | :-------------------------------: | :--------------: | :---------------------: | :-------------------------------: | :--------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Sub Conta      |                ID                 |                  |                         |                                   |      Sub account for Element Value       | The Element Value (e.g. Account) may have optional sub accounts for further detail. The sub account is dependent on the value of the account, so a further specification. If the sub-accounts are more or less the same, consider using another accounting dimension. |
|      Empresa       |           Tabela Direta           |                  |                         | AD\_Client.AD\_Client\_ID \< \> 0 |    (semelhante ao primeiro relatório)    |                                                                                                                          (ver o mesmo acima)                                                                                                                          |
|    Organização     |           Tabela Direta           |                  |                         |                                   |    (semelhante ao primeiro relatório)    |                                                                                                                          (ver o mesmo acima)                                                                                                                          |
| Elemento de Contas |           Tabela Direta           |                  | celementvalue\_csubacct |                                   |             Account Element              |                                                                                                   Account Elements can be natural accounts or user defined values.                                                                                                    |
|   Chave de Busca   |       Texto Curto (String)        |                  |                         |                                   |    (semelhante ao primeiro relatório)    |                                                                                                                          (ver o mesmo acima)                                                                                                                          |
|        Nome        |       Texto Curto (String)        |                  |                         |                                   |  Alphanumeric identifier of the entity   |                                                             The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                              |
|     Descrição      |       Texto Curto (String)        |                  |                         |                                   | Optional short description of the record |                                                                                                              A description is limited to 255 characters.                                                                                                              |
|  Comentário/Ajuda  | Texto Médio (até 2000 caracteres) |                  |                         |                                   |             Comment or Hint              |                                                                                              The Help field contains a hint, comment or help about the use of this item.                                                                                              |
|       Ativo        |              Sim-Não              |                  |                         |                                   |    (semelhante ao primeiro relatório)    |                                                                                                                          (ver o mesmo acima)                                                                                                                          |
|   C\_SubAcct\_UU   |       Texto Curto (String)        |                  |                         |                                   |                                          |                                                                                                                                                                                                                                                                       |

</div>

</div>

  

<div id="d82727e1155" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Element Value Reference - COF\_ElementValueReference

</div>

</div>

</div>

<span class="emphasis">*Lógica de visualização:*</span>
@cof\_IsReference@='N'

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d82727e1166" class="table">

<div class="table-title">

Table 1.5. Element Value Reference
Fields

</div>

<div class="table-contents">

|         Nome do campo          |  Referência   |      Valores (Padrão)      |        Chave restritiva         |                                                           Regra de validação                                                           |                Descrição                |                                             Comentário/Ajuda                                              |
| :----------------------------: | :-----------: | :------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------: | :-------------------------------------: | :-------------------------------------------------------------------------------------------------------: |
| COF\_ElementValueReference\_ID |      ID       |                            |                                 |                                                                                                                                        | Primary Key : Account Element Reference |                                  Primary Key : Account Element Reference                                  |
|            Empresa             | Tabela Direta |    (@\#AD\_Client\_ID@)    |                                 |                                              AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@                                              |   (semelhante ao primeiro relatório)    |                                            (ver o mesmo acima)                                            |
|          Organização           | Tabela Direta |     (@\#AD\_Org\_ID@)      |                                 |                                 AD\_Org.AD\_Client\_ID=@AD\_Client\_ID@ AND AD\_Org.AD\_Org\_ID\< \> 0                                 |   (semelhante ao primeiro relatório)    |                                            (ver o mesmo acima)                                            |
|       Elemento de Contas       |   Procurar    |     COF\_ElementValue      | CElementValue\_COFElementValueR |                                         C\_ElementValue.C\_Element\_ID=@COF\_ElementFrom\_ID@                                          |             Account Element             |                     Account Elements can be natural accounts or user defined values.                      |
|             Ativo              |    Sim-Não    |            (Y)             |                                 |                                                                                                                                        |   (semelhante ao primeiro relatório)    |                                            (ver o mesmo acima)                                            |
|            Entidade            |     Lista     | SUSEP RECEITA COSIF OUTROS |                                 |                                                                                                                                        |                                         |                                                                                                           |
|            Elemento            | Tabela Direta |            (0)             |                                 | (C\_Element.cof\_IsReference='Y' AND (C\_Element.cof\_Entity = '@3|cof\_Entity:99@' OR C\_Element.cof\_Entity = '@4|cof\_Entity:99@')) |           Accounting Element            | The Account Element uniquely identifies an Account Type. These are commonly known as a Chart of Accounts. |
| Valor do Elemento Referenciado |   Procurar    |     COF\_ElementValue      |                                 |                                            C\_ElementValue.C\_Element\_ID=@C\_Element\_ID@                                             |                                         |                                                                                                           |

</div>

</div>

  

</div>
