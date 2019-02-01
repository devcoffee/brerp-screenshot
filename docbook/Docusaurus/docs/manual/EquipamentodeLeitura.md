---
title: "Equipamento de Leitura"
id: EquipamentodeLeitura
---
<div id="d85466e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Equipamento de Leitura

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Equipamento de Leitura -
    COF\_EquipLeitura](#d85466e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2018-09-14 09:13:55.0

<span class="emphasis">*Atualizado em:* </span>2018-09-14 09:13:55.0

![](/img/manual/EquipamentodeLeitura.png)

<div id="d85466e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Equipamento de Leitura - COF\_EquipLeitura

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d85466e30" class="table">

<div class="table-title">

Table 1.1. Equipamento de Leitura
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                Comentário/Ajuda                                |
| :-------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :----------------------------------------------------------------------------: |
| COF\_EquipLeitura\_UU | Texto Curto (String) |                      |                  |                                                  |                                          |                                                                                |
| COF\_EquipLeitura\_ID |          ID          |                      |                  |                                                  |   Primary Key : Equipamento de Leitura   |                      Primary Key : Equipamento de Leitura                      |
|        Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                              (ver o mesmo acima)                               |
|      Organização      |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                              (ver o mesmo acima)                               |
|    Chave de Busca     | Texto Curto (String) |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                              (ver o mesmo acima)                               |
|        Padrão         |       Sim-Não        |         (N)          |                  |                                                  |              Default value               | The Default Checkbox indicates if this record will be used as a default value. |
|         Ativo         |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                              (ver o mesmo acima)                               |
|       Descrição       | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                  A description is limited to 255 characters.                   |
|   Expressão Regular   | Texto Curto (String) |                      |                  |                                                  |                                          |                                                                                |

</div>

</div>

  

</div>
