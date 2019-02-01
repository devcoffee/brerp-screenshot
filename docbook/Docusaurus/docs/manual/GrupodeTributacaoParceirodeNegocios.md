---
title: "Grupo de Tributação (Parceiro de Negócios)"
id: GrupodeTributacaoParceirodeNegocios
---
<div id="d112729e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Grupo de Tributação (Parceiro de Negócios)

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Grupo -
    LBR\_FiscalGroup\_BPartner](#d112729e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2007-12-11 10:07:50.0

<span class="emphasis">*Atualizado em:* </span>2013-11-11 20:56:40.0

![](/img/manual/GrupodeTributacaoParceirodeNegocios.png)

<div id="d112729e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Grupo - LBR\_FiscalGroup\_BPartner

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d112729e30" class="table">

<div class="table-title">

Table 1.1. Group
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                  Descrição                   |                                                               Comentário/Ajuda                                                               |
| :-----------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Grupo de Tributação |          ID          |                      |                  |                                                  | Primary key table LBR\_FiscalGroup\_BPartner |                                                 Primary key table LBR\_FiscalGroup\_BPartner                                                 |
|       Empresa       |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |   AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@   |      (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|     Organização     |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |      (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|        Nome         | Texto Curto (String) |                      |                  |                                                  |    Alphanumeric identifier of the entity     | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição      |      Memorando       |                      |                  |                                                  |   Optional short description of the record   |                                                 A description is limited to 255 characters.                                                  |
|        Ativo        |       Sim-Não        |        ('Y')         |                  |                                                  |      (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
