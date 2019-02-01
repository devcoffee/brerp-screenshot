---
title: "Cálculo de Comissão"
id: CalculodeComissao
---
<div id="d17890e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Cálculo de Comissão

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Cálculo de Comissão -
    C\_CommissionRun](#d17890e22)</span>
  - <span class="section">[2. Tabela: Valor da Comissão -
    C\_CommissionAmt](#d17890e253)</span>
  - <span class="section">[3. Tabela: Detalhe de Comissão -
    C\_CommissionDetail](#d17890e441)</span>

</div>

<span class="emphasis">*Descrição:* </span> Verificação e Alteração de
Comissões

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Cálculo de
Comissão" mostra os resultados do processamento de comissões. Os
resultados são mostrados aqui quando o processo "Gerar Comissões" for
selecionado na Janela "Cálculo de Comissões". Se o resultado for
satisfatório, gere uma fatura de CAP (contas a pagar) para pagar a
comissão.

<span class="emphasis"> *Criado em:* </span>2001-03-31 11:50:27.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d17890e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Cálculo de Comissão - C\_CommissionRun

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_CommissionRun_data)

<span class="emphasis">*Descrição:*</span> Cálculo de comissão para um
período

<span class="emphasis">*Comentário/Ajuda:* </span> Cálculo de comissão
para um período definido na janela de Comissão.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d17890e39" class="table">

<div class="table-title">

Table 1.1. Commission Run
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |   Valores (Padrão)   |      Chave restritiva       |                  Regra de validação                   |                Descrição                 |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :------------------: | :------------------: | :------------------: | :-------------------------: | :---------------------------------------------------: | :--------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Cálculo de Comissão  |          ID          |                      |                             |                                                       |        Commission Run or Process         |                                                                                                                                                                                                                                                                       The Commission Run is a unique system defined identifier of a specific run of commission. When a Commission is processed on the Commission Screen, the Commission Run will display.                                                                                                                                                                                                                                                                       |
|        Ativo         |       Sim-Não        |         (Y)          |                             |                                                       |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|      Processado      |       Sim-Não        |                      |                             |                                                       |     The document has been processed      |                                                                                                                                                                                                                                                                                                                              The Processed checkbox indicates that a document has been processed.                                                                                                                                                                                                                                                                                                                               |
|       Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) |                             |           AD\_Client.AD\_Client\_ID \< \> 0           |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|     Organização      |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                             | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|       Comissão       |    Tabela Direta     |                      | ccommission\_ccommissionrun |                                                       |                Commission                |                                                                                                                                                                                                                                                                                                                       The Commission Rules or internal or external company agents, sales reps or vendors.                                                                                                                                                                                                                                                                                                                       |
| Número do Documento  | Texto Curto (String) |                      |                             |                                                       | Document sequence number of the document | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|      Descrição       | Texto Curto (String) |                      |                             |                                                       | Optional short description of the record |                                                                                                                                                                                                                                                                                                                                           A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                           |
|    Data de Início    |         Data         |                      |                             |                                                       |     First effective day (inclusive)      |                                                                                                                                                                                                                                                                                                                                       The Start Date indicates the first or starting date                                                                                                                                                                                                                                                                                                                                       |
|     Total Geral      |        Valor         |                      |                             |                                                       |         Total amount of document         |                                                                                                                                                                                                                                                                                                                    The Grand Total displays the total amount including Tax and Freight in document currency                                                                                                                                                                                                                                                                                                                     |
|     Criar Fatura     |        Botão         |                      |                             |                                                       |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|        Fatura        |       Procurar       | C\_Invoice (Vendor)  | cofInvoice\_CCommissionRun  |     C\_Invoice.C\_BPartner\_ID=@C\_BPartner\_ID@      |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| C\_CommissionRun\_UU | Texto Curto (String) |                      |                             |                                                       |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |

</div>

</div>

  

<div id="d17890e253" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Valor da Comissão - C\_CommissionAmt

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_CommissionAmt_data)

<span class="emphasis">*Descrição:*</span> Valores de linha de comissão

<span class="emphasis">*Comentário/Ajuda:* </span> Uma linha é gerada
para cada linha de comissão. Você pode sobreescrever o valor e a
quantidade para modificar o valor da comissão, mas o meio sugerido é
criar linhas adicionais de Detalhes de Comissão. Por favor esteja ciente
que alterações manuais não irão reconciliar com os Detalhes de Comissão.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d17890e270" class="table">

<div class="table-title">

Table 1.2. Commission Amount
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |  Valores (Padrão)  |      Chave restritiva       |                  Regra de validação                   |             Descrição              |                                                                                                                                                      Comentário/Ajuda                                                                                                                                                      |
| :------------------: | :------------------: | :----------------: | :-------------------------: | :---------------------------------------------------: | :--------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Valor da Comissão   |          ID          |                    |                             |                                                       |    Generated Commission Amount     |                                                                                                                        The Commission Amount indicates the resulting amount from a Commission Run.                                                                                                                         |
|       Empresa        |    Tabela Direta     | (@AD\_Client\_ID@) |                             |           AD\_Client.AD\_Client\_ID \< \> 0           | (semelhante ao primeiro relatório) |                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                     |
|     Organização      |    Tabela Direta     |  (@AD\_Org\_ID@)   |                             | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' | (semelhante ao primeiro relatório) |                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                     |
| Cálculo de Comissão  |    Tabela Direta     |                    | ccommentrun\_ccommissionamt |                                                       |     Commission Run or Process      |                                                                    The Commission Run is a unique system defined identifier of a specific run of commission. When a Commission is processed on the Commission Screen, the Commission Run will display.                                                                     |
|  Linha de Comissão   |    Tabela Direta     |                    |      ccomline\_ccomamt      |                                                       |          Commission Line           | The Commission Line is a unique instance of a Commission Run. If the commission run was done in summary mode then there will be a single line representing the selected documents totals. If the commission run was done in detail mode then each document that was included in the run will have its own commission line. |
|        Ativo         |       Sim-Não        |        (Y)         |                             |                                                       | (semelhante ao primeiro relatório) |                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                     |
|   Valor Convertido   |        Valor         |                    |                             |                                                       |          Converted Amount          |                                                                                                    The Converted Amount is the result of multiplying the Source Amount by the Conversion Rate for this target currency.                                                                                                    |
|   Quantidade Real    |      Quantidade      |                    |                             |                                                       |        The actual quantity         |                                                                                                                          The Actual Quantity indicates the quantity as referenced on a document.                                                                                                                           |
|  Valor da Comissão   |        Valor         |                    |                             |                                                       |         Commission Amount          |                                                                                                The Commission Amount is the total calculated commission. It is based on the parameters as defined for this Commission Run.                                                                                                 |
| C\_CommissionAmt\_UU | Texto Curto (String) |                    |                             |                                                       |                                    |                                                                                                                                                                                                                                                                                                                            |

</div>

</div>

  

<div id="d17890e441" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Detalhe de Comissão - C\_CommissionDetail

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Informação de Detalhe de
Comissão

<span class="emphasis">*Comentário/Ajuda:* </span> Você pode alterar o
valor e a quantidade dos registros de detalhes, mas o meio sugerido é
adicionar novas linhas de correção. Os valores são convertidos da moeda
de transação para a moeda de comissão (definida na janela de Comissão)
usando a data de início e a taxa de conversão dessa data (spot).

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d17890e456" class="table">

<div class="table-title">

Table 1.3. Commission Detail
Fields

</div>

<div class="table-contents">

|       Nome do campo       |      Referência      |  Valores (Padrão)  |       Chave restritiva        |                  Regra de validação                   |                   Descrição                   |                                                                     Comentário/Ajuda                                                                      |
| :-----------------------: | :------------------: | :----------------: | :---------------------------: | :---------------------------------------------------: | :-------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Detalhe de Comissão    |          ID          |                    |                               |                                                       | Supporting information for Commission Amounts | The Commission Detail provides supporting information on a Commission Run. Each document line that was part of the Commission Run will be reflected here. |
|          Empresa          |    Tabela Direta     | (@AD\_Client\_ID@) |                               |           AD\_Client.AD\_Client\_ID \< \> 0           |      (semelhante ao primeiro relatório)       |                                                                    (ver o mesmo acima)                                                                    |
|        Organização        |    Tabela Direta     |  (@AD\_Org\_ID@)   |                               | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |      (semelhante ao primeiro relatório)       |                                                                    (ver o mesmo acima)                                                                    |
|     Valor da Comissão     |    Tabela Direta     |                    |  ccommissionamt\_ccomdetail   |                                                       |          Generated Commission Amount          |                                        The Commission Amount indicates the resulting amount from a Commission Run.                                        |
|        Referência         | Texto Curto (String) |                    |                               |                                                       |           Reference for this record           |                                                    The Reference displays the source document number.                                                     |
| Linha de Pedido de Compra |       Procurar       |                    | corderline\_ccommissiondetail |                                                       |               Sales Order Line                |                                            The Sales Order Line is a unique identifier for a line in an order.                                            |
|      Linha de Fatura      |       Procurar       |                    | cinvoiceline\_ccommissiondet  |                                                       |              Invoice Detail Line              |                                             The Invoice Line uniquely identifies a single line of an Invoice.                                             |
|           Ativo           |       Sim-Não        |        (Y)         |                               |                                                       |      (semelhante ao primeiro relatório)       |                                                                    (ver o mesmo acima)                                                                    |
|        Informação         | Texto Curto (String) |                    |                               |                                                       |                  Information                  |                                               The Information displays data from the source document line.                                                |
|        Valor Real         |        Valor         |                    |                               |                                                       |               The actual amount               |                                              Actual amount indicates the agreed upon amount for a document.                                               |
|         Moeda De          |    Tabela Direta     |                    | ccurrency\_ccommissiondetail  |                                                       |         The Currency for this record          |                                       Indicates the Currency to be used when processing or reporting on this record                                       |
|     Valor Convertido      |        Valor         |                    |                               |                                                       |               Converted Amount                |                   The Converted Amount is the result of multiplying the Source Amount by the Conversion Rate for this target currency.                    |
|      Quantidade Real      |        Número        |                    |                               |                                                       |              The actual quantity              |                                          The Actual Quantity indicates the quantity as referenced on a document.                                          |
|  C\_CommissionDetail\_UU  | Texto Curto (String) |                    |                               |                                                       |                                               |                                                                                                                                                           |

</div>

</div>

  

</div>
