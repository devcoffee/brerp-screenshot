---
title: "Fórmula"
id: Formula
---
<div id="d108207e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Fórmula

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Formulas -
    LBR\_Formula](#d108207e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2011-04-05 21:16:10.0

<span class="emphasis">*Atualizado em:* </span>2013-11-11 20:57:25.0

![](/img/manual/Formula.png)

<div id="d108207e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Formulas - LBR\_Formula

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/LBR_Formula_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d108207e32" class="table">

<div class="table-title">

Table 1.1. Formulas
Fields

</div>

<div class="table-contents">

|    Nome do campo     |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Fórmula        |                ID                 |                      |                  |                                                  |                                          |                                                                                                                                              |
|       Empresa        |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização      |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Nome         |       Texto Curto (String)        |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Ativo         |              Sim-Não              |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Descrição       | Texto Médio (até 2000 caracteres) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|       Fórmula        |             Memorando             |                      |                  |                                                  |         Defines the Tax Formula          |                                                           Defines the Tax Formula                                                            |
| Preço Inclui Imposto |              Sim-Não              |                      |                  |                                                  |       Tax is included in the price       |                    The Tax Included checkbox indicates if the prices include tax. This is also known as the gross price.                     |

</div>

</div>

  

</div>
