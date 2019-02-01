---
title: "Plano de Contas Referencial"
id: PlanodeContasReferencial
---
<div id="d176542e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Plano de Contas Referencial

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Plano de Contas -
    COF\_ElementValueReference](#d176542e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Plano de Contas Referencial

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-10-07 10:11:55.0

<span class="emphasis">*Atualizado em:* </span>2015-10-21 14:33:42.0

<div id="d176542e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Plano de Contas - COF\_ElementValueReference

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d176542e29" class="table">

<div class="table-title">

Table 1.1. Chart of Accounts
Fields

</div>

<div class="table-contents">

|         Nome do campo          |  Referência   |      Valores (Padrão)      |        Chave restritiva         |                                                           Regra de validação                                                           |                Descrição                |                                             Comentário/Ajuda                                              |
| :----------------------------: | :-----------: | :------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------: | :-------------------------------------: | :-------------------------------------------------------------------------------------------------------: |
| COF\_ElementValueReference\_ID |      ID       |                            |                                 |                                                                                                                                        | Primary Key : Account Element Reference |                                  Primary Key : Account Element Reference                                  |
|            Entidade            |     Lista     | SUSEP RECEITA COSIF OUTROS |                                 |                                                                                                                                        |                                         |                                                                                                           |
|            Empresa             | Tabela Direta |    (@\#AD\_Client\_ID@)    |                                 |                                              AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@                                              |   (semelhante ao primeiro relatório)    |                                            (ver o mesmo acima)                                            |
|          Organização           | Tabela Direta |     (@\#AD\_Org\_ID@)      |                                 |                                 AD\_Org.AD\_Client\_ID=@AD\_Client\_ID@ AND AD\_Org.AD\_Org\_ID\< \> 0                                 |   (semelhante ao primeiro relatório)    |                                            (ver o mesmo acima)                                            |
|             Ativo              |    Sim-Não    |            (Y)             |                                 |                                                                                                                                        |   (semelhante ao primeiro relatório)    |                                            (ver o mesmo acima)                                            |
|            Elemento            |    Tabela     |       C\_Element(0)        | COFElementFrom\_COFElementValue |                                                    C\_Element.cof\_IsReference='N'                                                     |           Accounting Element            | The Account Element uniquely identifies an Account Type. These are commonly known as a Chart of Accounts. |
|       Elemento de Contas       |   Procurar    |     COF\_ElementValue      | CElementValue\_COFElementValueR |                                         C\_ElementValue.C\_Element\_ID=@COF\_ElementFrom\_ID@                                          |             Account Element             |                     Account Elements can be natural accounts or user defined values.                      |
|            Elemento            | Tabela Direta |            (0)             |                                 | (C\_Element.cof\_IsReference='Y' AND (C\_Element.cof\_Entity = '@3|cof\_Entity:99@' OR C\_Element.cof\_Entity = '@4|cof\_Entity:99@')) |           Accounting Element            | The Account Element uniquely identifies an Account Type. These are commonly known as a Chart of Accounts. |
| Valor do Elemento Referenciado |   Procurar    |     COF\_ElementValue      |                                 |                                            C\_ElementValue.C\_Element\_ID=@C\_Element\_ID@                                             |                                         |                                                                                                           |

</div>

</div>

  

</div>
