---
title: "CSC - Código de Segurança do Contribuinte"
id: CSCCodigodeSegurancadoContribuinte
---
<div id="d17785e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: CSC - Código de Segurança do Contribuinte

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: CSC - COF\_CSC](#d17785e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Código de Segurança do
Contribuinte

<span class="emphasis">*Comentário/Ajuda:* </span>O CSC - Código de
Segurança do Contribuinte é um código de segurança alfanumérico de
conhecimento apenas da SEFA/PR e do contribuinte (sócio), utilizado para
gerar o código bidimensional, denominado "QR Code" da NFC-e.

<span class="emphasis"> *Criado em:* </span>2016-01-25 10:27:29.0

<span class="emphasis">*Atualizado em:* </span>2016-01-25 10:27:29.0

![](/img/manual/CSCCodigodeSegurancadoContribuinte.png)

<div id="d17785e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: CSC - COF\_CSC

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_CSC_data)

<span class="emphasis">*Descrição:*</span> O CSC - Código de Segurança
do Contribuinte é um código de segurança alfanumérico de conhecimento
apenas da SEFA/PR e do contribuinte (sócio), utilizado para gerar o
código bidimensional, denominado "QR Code" da NFC-e.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d17785e36" class="table">

<div class="table-title">

Table 1.1. CSC
Fields

</div>

<div class="table-contents">

|            Nome do campo            |      Referência      |     Valores (Padrão)     | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------------------------: | :------------------: | :----------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Código de Segurança do Contribuinte |          ID          |                          |                  |                                                  |                                          |                                                                                                                                              |
|               Empresa               |    Tabela Direta     |   (@\#AD\_Client\_ID@)   |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|             Organização             |    Tabela Direta     |    (@\#AD\_Org\_ID@)     |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|              ID Token               | Texto Curto (String) |                          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|                Nome                 | Texto Curto (String) |                          |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|                 CSC                 | Texto Curto (String) |                          |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|            Ambiente NFe             |        Lista         | Produção Homologação (1) |                  |                                                  |                                          |                                                                                                                                              |
|               Padrão                |       Sim-Não        |                          |                  |                                                  |              Default value               |                                The Default Checkbox indicates if this record will be used as a default value.                                |
|                Ativo                |       Sim-Não        |           (Y)            |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
