---
title: "Formulário de Impressão"
id: FormulariodeImpressao
---
<div id="d108563e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Formulário de Impressão

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Formulário de Impressão -
    AD\_PrintForm](#d108563e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento dos
Formulários de Impressão (Notas Fiscais, Cheques, ...)

<span class="emphasis">*Comentário/Ajuda:* </span>Define os documentos
que você usa para esta Empresa/Organização. Note que o formato do cheque
é definido na Janela "Banco (Conta)".\< p\> O Formato de Impressão que
você define em um Tipo de Documento tem a maior prioridade (ex. Formato
específico de Exportação de Fatura). O próximo nível é o conjunto de
Formatos de Impressão que você definiu para a organização do documento
impresso. O padrão é que o conjunto de Formatos de Impressão seja
definido para todas as organizações da Empresa (Organization=\*).

<span class="emphasis"> *Criado em:* </span>2001-07-28 19:50:25.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/FormulariodeImpressao.png)

<div id="d108563e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Formulário de Impressão - AD\_PrintForm

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_PrintForm_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de informação
de Formulários de Impressão (Notas Fiscais, Cheques, ...)

<span class="emphasis">*Comentário/Ajuda:* </span> A seleção determina
qual Formato de Impressão é utilizado para imprimir um certo Formulário
para a sua Organização.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d108563e40" class="table">

<div class="table-title">

Table 1.1. Print Form
Fields

</div>

<div class="table-contents">

|               Nome do campo                |      Referência      |          Valores (Padrão)           |        Chave restritiva         |                Regra de validação                |                            Descrição                             |                                                               Comentário/Ajuda                                                               |
| :----------------------------------------: | :------------------: | :---------------------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|          Formulário de Impressão           |          ID          |                                     |                                 |                                                  |                               Form                               |                                                                                                                                              |
|                  Empresa                   |    Tabela Direta     |        (@\#AD\_Client\_ID@)         |      adclient\_adprintform      |        AD\_Client.AD\_Client\_ID \< \> 0         |                (semelhante ao primeiro relatório)                |                                                             (ver o mesmo acima)                                                              |
|                Organização                 |    Tabela Direta     |          (@\#AD\_Org\_ID@)          |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                (semelhante ao primeiro relatório)                |                                                             (ver o mesmo acima)                                                              |
|                    Nome                    | Texto Curto (String) |                                     |                                 |                                                  |              Alphanumeric identifier of the entity               | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|                 Descrição                  | Texto Curto (String) |                                     |                                 |                                                  |             Optional short description of the record             |                                                 A description is limited to 255 characters.                                                  |
|                   Ativo                    |       Sim-Não        |                 (Y)                 |                                 |                                                  |                (semelhante ao primeiro relatório)                |                                                             (ver o mesmo acima)                                                              |
|       Formato de Impressão de Pedido       |        Tabela        |        AD\_PrintFormat Order        |    adprintformat\_formorder     |                                                  |             Print Format for Orders, Quotes, Offers              |                                           You need to define a Print Format to print the document.                                           |
|          Texto de email de Pedido          |        Tabela        |             R\_MailText             |   rmailtext\_orderadprintform   |                                                  | Email text used for sending order acknowledgements or quotations |                             Standard email template used to send acknowledgements or quotations as attachments.                              |
|      Formato de Impressão de Entrega       |        Tabela        |      AD\_PrintFormat Shipment       |   adprintformat\_formshipment   |                                                  |         Print Format for Shipments, Receipts, Pick Lists         |                                           You need to define a Print Format to print the document.                                           |
|         Texto de email de Entrega          |        Tabela        |             R\_MailText             |   rmailtext\_shipadprintform    |                                                  |            Email text used for sending delivery notes            |                                     Standard email template used to send delivery notes as attachments.                                      |
|       Formato de Impressão de Fatura       |        Tabela        |       AD\_PrintFormat Invoice       |   adprintformat\_forminvoice    |                                                  |                Print Format for printing Invoices                |                                           You need to define a Print Format to print the document.                                           |
|          Texto de email de Fatura          |        Tabela        |             R\_MailText             |  rmailtext\_invoiceadprintform  |                                                  |               Email text used for sending invoices               |                                        Standard email template used to send invoices as attachments.                                         |
| Formato de Impressão de Remessa de Valores |        Tabela        |        AD\_PrintFormat Check        |  adprintformat\_formremittance  |                                                  |              Print Format for separate Remittances               |                                           You need to define a Print Format to print the document.                                           |
|         Texto de email de Remessas         |        Tabela        |             R\_MailText             |   rmailtext\_remitadprintform   |                                                  |         Email text used for sending payment remittances          |                                       Standard email template used to send remittances as attachments.                                       |
|      Formato de Impressão de Projeto       |        Tabela        |           AD\_PrintFormat           |   adprintformat\_formproject    |                                                  |                  Standard Project Print Format                   |                                                        Standard Project Print Format                                                         |
|         Texto de email de Projeto          |        Tabela        |             R\_MailText             |  rmailtext\_projectadprintform  |                                                  |                 Standard text for Project EMails                 |                                                       Standard text for Project EMails                                                       |
|      Distribution Order Print Format       |        Tabela        | AD\_PrintFormat Distribution Order  | distriborderprintformat\_adprin |                                                  |           Print Format for printing Distribution Order           |                                           You need to define a Print Format to print the document.                                           |
|        Distribution Order Mail Text        |        Tabela        |             R\_MailText             | distribordermailtext\_adprintfo |                                                  |          Email text used for sending Distribution Order          |                                   Standard email template used to send Manufacturing Order as attachments.                                   |
|      Manufacturing Order Print Format      |        Tabela        | AD\_PrintFormat Manufacturing Order | manuforderprintformat\_adprintf |                                                  |          Print Format for printing Manufacturing Order           |                                           You need to define a Print Format to print the document.                                           |
|       Manufacturing Order Mail Text        |        Tabela        |             R\_MailText             | manufordermailtext\_adprintform |                                                  |         Email text used for sending Manufacturing Order          |                                   Standard email template used to send Manufacturing Order as attachments.                                   |
|             AD\_PrintForm\_UU              | Texto Curto (String) |                                     |                                 |                                                  |                                                                  |                                                                                                                                              |

</div>

</div>

  

</div>
