---
title: "NCM"
id: NCM
---
<div id="d149721e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: NCM

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: NCM -
    LBR\_NCM](#d149721e22)</span>
  - <span class="section">[2. Tabela: NVE -
    cof\_nve](#d149721e190)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2007-12-04 14:33:09.0

<span class="emphasis">*Atualizado em:* </span>2013-11-11 20:58:47.0

<div id="d149721e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: NCM - LBR\_NCM

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/LBR_NCM_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d149721e31" class="table">

<div class="table-title">

Table 1.1. NCM
Fields

</div>

<div class="table-contents">

|   Nome do campo    |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :----------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|        NCM         |                ID                 |                      |                  |                                                  |        Primary key table LBR\_NCM        | \< a href="http://www4.receita.fazenda.gov.br/simulador/PesquisarNCM.jsp" target="\_blank"\> Pesquisar NCM\< /a\> Primary key table LBR\_NCM |
|       Ativo        |              Sim-Não              |        ('Y')         |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Empresa       |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |   AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Organização     |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Chave de Busca   |       Texto Curto (String)        |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Descrição      | Texto Médio (até 2000 caracteres) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| Imposto Brasileiro |       Impostos Brasileiros        |                      |                  |                                                  |        Primary key table LBR\_Tax        |                                                          Primary key table LBR\_Tax                                                          |
|     Possui NVE     |              Sim-Não              |        ('N')         |                  |                                                  |                                          |                                                                                                                                              |
|       Is DBN       |              Sim-Não              |         (N)          |                  |                                                  |          Flag to indicate a DBN          |                                        Flag to indicate a DBN - (Detailing Brazilian of Nomenclature)                                        |

</div>

</div>

  

<div id="d149721e190" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: NVE - cof\_nve

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/cof_nve_data)

<span class="emphasis">*Lógica de visualização:*</span> @cof\_isnve@ =
'Y'

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d149721e203" class="table">

<div class="table-title">

Table 1.2. NVE
Fields

</div>

<div class="table-contents">

| Nome do campo  |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    COF\_Nve    |          ID          |                      |                  |                                                  |                                          |                                                                                                                                              |
|    Empresa     |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Organização   |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      NCM       |    Tabela Direta     |                      |                  |                                                  |        Primary key table LBR\_NCM        | \< a href="http://www4.receita.fazenda.gov.br/simulador/PesquisarNCM.jsp" target="\_blank"\> Pesquisar NCM\< /a\> Primary key table LBR\_NCM |
| Chave de Busca | Texto Curto (String) |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Descrição    | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|     Ativo      |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
