---
title: "CEST"
id: CEST
---
<div id="d17471e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: CEST

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: CEST -
    COF\_CEST](#d17471e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-11-15 20:51:55.0

<span class="emphasis">*Atualizado em:* </span>2015-11-15 20:51:55.0

![](/img/manual/CEST.png)

<div id="d17471e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: CEST - COF\_CEST

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_CEST_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d17471e32" class="table">

<div class="table-title">

Table 1.1. CEST
Fields

</div>

<div class="table-contents">

| Nome do campo  |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                    Descrição                    |                                                                                                                                                                            Comentário/Ajuda                                                                                                                                                                            |
| :------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :---------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      CEST      |                ID                 |                      |                  |                                                  | Código Especificador da Substituição Tributária | O CEST (código especificador da substituição tributária) foi apresentado na NT 2015.003 e definido no Convênio do ICMS 92 (de 20 de agosto de 2015). Conforme a documentação “estabelece a sistemática de uniformização e identificação das mercadorias e bens passíveis de sujeição aos regimes de substituição tributária e de antecipação de recolhimento do ICMS”. |
|    Empresa     |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |       (semelhante ao primeiro relatório)        |                                                                                                                                                                          (ver o mesmo acima)                                                                                                                                                                           |
|  Organização   |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |       (semelhante ao primeiro relatório)        |                                                                                                                                                                          (ver o mesmo acima)                                                                                                                                                                           |
| Chave de Busca |       Texto Curto (String)        |                      |                  |                                                  |       (semelhante ao primeiro relatório)        |                                                                                                                                                                          (ver o mesmo acima)                                                                                                                                                                           |
|      Nome      | Texto Médio (até 2000 caracteres) |                      |                  |                                                  |      Alphanumeric identifier of the entity      |                                                                                                              The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                              |
|   Descrição    |       Texto Curto (String)        |                      |                  |                                                  |    Optional short description of the record     |                                                                                                                                                              A description is limited to 255 characters.                                                                                                                                                               |
|     Ativo      |              Sim-Não              |         (Y)          |                  |                                                  |       (semelhante ao primeiro relatório)        |                                                                                                                                                                          (ver o mesmo acima)                                                                                                                                                                           |

</div>

</div>

  

</div>
