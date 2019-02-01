---
title: "Teste de Qualidade"
id: TestedeQualidade
---
<div id="d240176e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Teste de Qualidade

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Teste -
    M\_QualityTest](#d240176e22)</span>
  - <span class="section">[2. Tabela: Produto -
    M\_Product\_QualityTest](#d240176e172)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2011-07-27 15:16:55.0

<span class="emphasis">*Atualizado em:* </span>2011-07-27 15:16:55.0

<div id="d240176e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Teste - M\_QualityTest

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d240176e29" class="table">

<div class="table-title">

Table 1.1. Test
Fields

</div>

<div class="table-contents">

|   Nome do campo    |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :----------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Teste de Qualidade |                ID                 |                      |                  |                                                  |                                          |                                                                                                                                              |
|      Empresa       |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Organização     |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Ativo        |              Sim-Não              |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Nome        |       Texto Curto (String)        |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição      |       Texto Curto (String)        |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|  Comentário/Ajuda  | Texto Médio (até 2000 caracteres) |                      |                  |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
| M\_QualityTest\_UU |       Texto Curto (String)        |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d240176e172" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Produto - M\_Product\_QualityTest

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> Quality Test

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d240176e183" class="table">

<div class="table-title">

Table 1.2. Product
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |             Descrição              |                              Comentário/Ajuda                              |
| :-------------------------: | :------------------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------: | :------------------------------------------------------------------------: |
| Produdo Teste de Qualidade  |          ID          |                      |                                 |                                                  |                                    |                                                                            |
|           Empresa           |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                            (ver o mesmo acima)                             |
|         Organização         |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                            (ver o mesmo acima)                             |
|     Teste de Qualidade      |    Tabela Direta     |                      | mqualitytest\_mproductqualityte |                                                  |                                    |                                                                            |
|           Produto           |       Procurar       |                      |  mproduct\_mproductqualitytest  |                                                  |       Product, Service, Item       | Identifies an item which is either purchased or sold in this organization. |
|            Ativo            |       Sim-Não        |         (Y)          |                                 |                                                  | (semelhante ao primeiro relatório) |                            (ver o mesmo acima)                             |
|     Resultado Experado      | Texto Curto (String) |                      |                                 |                                                  |                                    |                                                                            |
| M\_Product\_QualityTest\_UU | Texto Curto (String) |                      |                                 |                                                  |                                    |                                                                            |

</div>

</div>

  

</div>
