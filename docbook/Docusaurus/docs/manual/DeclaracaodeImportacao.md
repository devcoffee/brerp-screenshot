---
title: "Declaração de Importação"
id: DeclaracaodeImportacao
---
<div id="d41738e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Declaração de Importação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: DI -
    COF\_C\_DI](#d41738e23)</span>
  - <span class="section">[2. Tabela: Adições -
    COF\_C\_DIAdi](#d41738e280)</span>

</div>

<span class="emphasis">*Descrição:* </span> Declaração de Importação

<span class="emphasis">*Comentário/Ajuda:* </span>Preenchimento dos
dados básicos da Declaração de Importação utilizados na emissão de NFe

<span class="emphasis"> *Criado em:* </span>2016-01-15 00:19:34.0

<span class="emphasis">*Atualizado em:* </span>2016-01-15 00:19:34.0

![](/img/manual/DeclaracaodeImportacao.png)

<div id="d41738e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: DI - COF\_C\_DI

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_C_DI_data)

<span class="emphasis">*Descrição:*</span> Declaração de Importação

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d41738e36" class="table">

<div class="table-title">

Table 1.1. DI
Fields

</div>

<div class="table-contents">

|           Nome do campo           |      Referência      |                                                                                          Valores (Padrão)                                                                                          | Chave restritiva |                Regra de validação                |                                 Descrição                                 |  Comentário/Ajuda   |
| :-------------------------------: | :------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------: | :----------------------------------------------: | :-----------------------------------------------------------------------: | :-----------------: |
|     Declaração de Importação      |          ID          |                                                                                                                                                                                                    |                  |                                                  |                         Declaração de Importação                          |                     |
|              Empresa              |    Tabela Direta     |                                                                                        (@\#AD\_Client\_ID@)                                                                                        |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |                    (semelhante ao primeiro relatório)                     | (ver o mesmo acima) |
|            Organização            |    Tabela Direta     |                                                                                         (@\#AD\_Org\_ID@)                                                                                          |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                    (semelhante ao primeiro relatório)                     | (ver o mesmo acima) |
| Número do Documento de Importação | Texto Curto (String) |                                                                                                                                                                                                    |                  |                                                  |         Número do Documento de Importação E (DI, DSI, DIRE, ...)          |                     |
|   Data de Registro do documento   |         Data         |                                                                                                                                                                                                    |                  |                                                  |                                                                           |                     |
|   Data do Desembaraço Aduaneiro   |         Data         |                                                                                                                                                                                                    |                  |                                                  |                                                                           |                     |
|          UF Desembaraço           | Texto Curto (String) |                                                                                                                                                                                                    |                  |                                                  |             Sigla da UF onde ocorreu o Desembaraço Aduaneiro              |                     |
|       Local de desembaraço        | Texto Curto (String) |                                                                                                                                                                                                    |                  |                                                  |                                                                           |                     |
|         Via de Transporte         |        Lista         | 1 - Marítima 10 - Entrada / Saída ficta 11 - Courier 12 - Handcarry 2 - Fluvial 3 - Lacustre 4 - Aérea 5 - Postal 6 - Ferroviária 7 - Rodoviária 8 - Conduto / Rede Transmissão 9 - Meios Próprios |                  |                                                  | Via de transporte internacional informada na Declaração de Importação (DI |                     |
|               AFRMM               |        Valor         |                                                                                                (0)                                                                                                 |                  |                                                  |  Valor da AFRMM - Adicional ao Frete para Renovação da Marinha Mercante   |                     |
|        Forma de Importação        |        Lista         |                                                   1 - Importação por conta própria 2 - Importação por conta e ordem 3 - Importação por encomenda                                                   |                  |                                                  |                Forma de importação quanto a intermediação                 |                     |
|  CNPJ do Adquirente/Encomendante  | Texto Curto (String) |                                                                                                                                                                                                    |                  |                                                  |                   CNPJ do adquirente ou do encomendante                   |                     |
|   UF do Adquirente/Encomendante   | Texto Curto (String) |                                                                                                                                                                                                    |                  |                                                  |               Sigla da UF do adquirente ou do encomendante                |                     |
|       Código do Exportador        | Texto Curto (String) |                                                                                                                                                                                                    |                  |                                                  |                                                                           |                     |
|               Ativo               |       Sim-Não        |                                                                                                (Y)                                                                                                 |                  |                                                  |                    (semelhante ao primeiro relatório)                     | (ver o mesmo acima) |

</div>

</div>

  

<div id="d41738e280" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Adições - COF\_C\_DIAdi

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_C_DIAdi_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d41738e289" class="table">

<div class="table-title">

Table 1.2. Adições
Fields

</div>

<div class="table-contents">

|               Nome do campo                |      Referência      |   Valores (Padrão)   | Chave restritiva  |                Regra de validação                |                 Descrição                  |  Comentário/Ajuda   |
| :----------------------------------------: | :------------------: | :------------------: | :---------------: | :----------------------------------------------: | :----------------------------------------: | :-----------------: |
|                   Adição                   |          ID          |                      |                   |                                                  |                   Adição                   |       Adição        |
|                  Empresa                   |    Tabela Direta     | (@\#AD\_Client\_ID@) |                   |        AD\_Client.AD\_Client\_ID \< \> 0         |     (semelhante ao primeiro relatório)     | (ver o mesmo acima) |
|                Organização                 |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |     (semelhante ao primeiro relatório)     | (ver o mesmo acima) |
|          Declaração de Importação          |    Tabela Direta     |                      | COFCDI\_COFCDIAdi |                                                  |          Declaração de Importação          |                     |
|              Numero da Adição              |       Inteiro        |                      |                   |                                                  |                                            |                     |
| Numero sequencial do item dentro da Adição |       Inteiro        |                      |                   |                                                  | Numero sequencial do item dentro da Adição |                     |
|      Código do fabricante estrangeiro      | Texto Curto (String) |                      |                   |                                                  |                                            |                     |
|  Valor do desconto do item da DI – Adição  |        Valor         |                      |                   |                                                  |                                            |                     |
|   Número do ato concessório de Drawback    |       Inteiro        |                      |                   |                                                  |                                            |                     |
|                   Ativo                    |       Sim-Não        |         (Y)          |                   |                                                  |     (semelhante ao primeiro relatório)     | (ver o mesmo acima) |

</div>

</div>

  

</div>
