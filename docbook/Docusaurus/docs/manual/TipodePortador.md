---
title: "Tipo de Portador"
id: TipodePortador
---
<div id="d242829e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipo de Portador

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tipo de Portador -
    COF\_C\_CheckCustody](#d242829e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Tipo de Portador

<span class="emphasis">*Comentário/Ajuda:* </span>Tipo de Portador /
Custódia do Cheque

<span class="emphasis"> *Criado em:* </span>2016-04-29 23:09:10.0

<span class="emphasis">*Atualizado em:* </span>2016-04-29 23:09:10.0

![](/img/manual/TipodePortador.png)

<div id="d242829e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tipo de Portador - COF\_C\_CheckCustody

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_C_CheckCustody_data)

<span class="emphasis">*Comentário/Ajuda:* </span> Tipo de Portador /
Custódia do Cheque

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d242829e36" class="table">

<div class="table-title">

Table 1.1. Check Custody
Fields

</div>

<div class="table-contents">

|  Nome do campo   |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Tipo de Portador |          ID          |                      |                  |                                                  |       Primary Key : Check Custody        |                                                         Primary Key : Check Custody                                                          |
|     Empresa      |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Organização    |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Chave de Busca  | Texto Curto (String) |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Nome       | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição     | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|      Ativo       |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
