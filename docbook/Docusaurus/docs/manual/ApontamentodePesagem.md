---
title: "Apontamento de Pesagem"
id: ApontamentodePesagem
---
<div id="d6380e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Apontamento de Pesagem

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Apontamento de Pesagem -
    COF\_Pesagem](#d6380e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Apontamento de Pesagem

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2018-09-06 14:22:41.0

<span class="emphasis">*Atualizado em:* </span>2018-09-06 14:22:41.0

![](/img/manual/ApontamentodePesagem.png)

<div id="d6380e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Apontamento de Pesagem - COF\_Pesagem

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d6380e30" class="table">

<div class="table-title">

Table 1.1. Apontamento de Pesagem
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |   Valores (Padrão)   |      Chave restritiva       |                Regra de validação                |                Descrição                 |                          Comentário/Ajuda                           |
| :-------------------: | :------------------: | :------------------: | :-------------------------: | :----------------------------------------------: | :--------------------------------------: | :-----------------------------------------------------------------: |
|   COF\_Pesagem\_ID    |          ID          |                      |                             |                                                  |   Primary Key : Apontamento de Pesagem   |                Primary Key : Apontamento de Pesagem                 |
|   COF\_Pesagem\_UU    | Texto Curto (String) |                      |                             |                                                  |                                          |                                                                     |
|        Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) |                             |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                         (ver o mesmo acima)                         |
|      Organização      |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                             | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                         (ver o mesmo acima)                         |
|       Descrição       | Texto Curto (String) |                      |                             |                                                  | Optional short description of the record |             A description is limited to 255 characters.             |
|    Data Processada    |      Data+Hora       |      (@\#Date@)      |                             |                                                  |                                          |                                                                     |
| COF\_EquipLeitura\_ID |    Tabela Direta     |                      | COFEquipLeitura\_COFPesagem |                                                  |   Primary Key : Equipamento de Leitura   |                Primary Key : Equipamento de Leitura                 |
|        Tabela         |    Tabela Direta     |                      |     ADTable\_COFPesagem     |                                                  |        Database Table information        | The Database Table provides the information of the table definition |
|     Equipamentos      |       Procurar       |                      |  COFEquipments\_COFPesagem  |                                                  |         Primary Key : Equipments         |                      Primary Key : Equipments                       |
|    ID do Registro     |        Número        |         (0)          |                             |                                                  |                                          |                                                                     |
|         Peso          |        Número        |                      |                             |                                                  |                                          |                                                                     |
|    Nome da Coluna     | Texto Curto (String) |                      |                             |                                                  |                                          |                                                                     |
|         Ativo         |       Sim-Não        |         (Y)          |                             |                                                  |    (semelhante ao primeiro relatório)    |                         (ver o mesmo acima)                         |

</div>

</div>

  

</div>
