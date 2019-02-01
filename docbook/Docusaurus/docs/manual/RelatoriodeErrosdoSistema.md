---
title: "Relatório de Erros do Sistema"
id: RelatoriodeErrosdoSistema
---
<div id="d199445e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Relatório de Erros do Sistema

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Erros do Sistema -
    AD\_Issue](#d199445e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Manutenção de erros do
sistema (automáticos ou manuais)

<span class="emphasis">*Comentário/Ajuda:* </span>Erros do Sistema são
criados para facilitar a resolução de problemas relacionados ao sistema.
Se habilitado, eles são automáticamente reportados à devCoffee. Nenhuma
informação confidencial ou dados sigilosos serão transmitidos.

<span class="emphasis"> *Criado em:* </span>2005-12-12 16:38:55.0

<span class="emphasis">*Atualizado em:* </span>2005-12-14 16:43:21.0

![](/img/manual/RelatoriodeErrosdoSistema.png)

<div id="d199445e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Erros do Sistema - AD\_Issue

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Issue_data)

<span class="emphasis">*Descrição:*</span> Automatically created or
manually entered System Issue Reporting

<span class="emphasis">*Comentário/Ajuda:* </span> System Issues are
created to speed up the resolution of any system related issues
(potential bugs). If enabled, they are automatically reported to
Compiere. No data or confidential information is transferred.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d199445e40" class="table">

<div class="table-title">

Table 1.1. System Issue
Fields

</div>

<div class="table-contents">

|     Nome do campo      |            Referência             |                                       Valores (Padrão)                                        |    Chave restritiva     |                       Regra de validação                        |                              Descrição                               |                                                                                                   Comentário/Ajuda                                                                                                   |
| :--------------------: | :-------------------------------: | :-------------------------------------------------------------------------------------------: | :---------------------: | :-------------------------------------------------------------: | :------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Emissão de Sistema   |                ID                 |                                                                                               |                         |                                                                 |        Automatically created or manually entered System Issue        |  System Issues are created to speed up the resolution of any system related issues (potential bugs). If enabled, they are automatically reported to iDempiere. No data or confidential information is transferred.   |
|        Empresa         |           Tabela Direta           |                                                                                               |                         |                AD\_Client.AD\_Client\_ID \< \> 0                |                  (semelhante ao primeiro relatório)                  |                                                                                                 (ver o mesmo acima)                                                                                                  |
|      Organização       |           Tabela Direta           |                                                                                               |                         |                                                                 |                  (semelhante ao primeiro relatório)                  |                                                                                                 (ver o mesmo acima)                                                                                                  |
|         Criado         |             Data+Hora             |                                           (SYSDATE)                                           |                         |                                                                 |                     Date this record was created                     |                                                                          The Created field indicates the date that this record was created.                                                                          |
|         Ativo          |              Sim-Não              |                                                                                               |                         |                                                                 |                  (semelhante ao primeiro relatório)                  |                                                                                                 (ver o mesmo acima)                                                                                                  |
|     Núm. Liberação     |       Texto Curto (String)        |                                              (.)                                              |                         |                                                                 |                       Internal Release Number                        |                                                                                                                                                                                                                      |
|         Versão         |       Texto Curto (String)        |                                              (.)                                              |                         |                                                                 |                   Version of the table definition                    |                                                                             The Version indicates the version of this table definition.                                                                              |
|     Vanilla System     |               Lista               |                                            Não Sim                                            |                         |                                                                 | The system was NOT compiled from Source - i.e. standard distribution |                                          You may have customizations, like additional columns, tables, etc - but no code modifications which require compiling from source.                                          |
|      Release Tag       |       Texto Curto (String)        |                                                                                               |                         |                                                                 |                             Release Tag                              |                                                                                                                                                                                                                      |
|         Origem         |               Lista               | Bancada de Trabalho Detail Fluxo de Trabalho Info Processo Relatório Tarefa Janela Formulário |                         |                                                                 |                             Issue Source                             |                                                                                                 Source of the Issue                                                                                                  |
|         Janela         |             Procurar              |                                                                                               |    adwindow\_adissue    |                                                                 |                     Data entry or display window                     |                                                                              The Window field identifies a unique Window in the system.                                                                              |
|        Processo        |             Procurar              |                                                                                               |   adprocess\_adissue    |                                                                 |                          Process or Report                           |                                                                        The Process field identifies a unique Process or Report in the system.                                                                        |
|  Formulário Especial   |           Tabela Direta           |                                                                                               |     adform\_adissue     |                                                                 |                             Special Form                             |                                                                        The Special Form field identifies a unique Special Form in the system.                                                                        |
|     Issue Summary      |       Texto Curto (String)        |                                                                                               |                         |                                                                 |                            Issue Summary                             |                                                                                                                                                                                                                      |
|      Reproduzível      |               Lista               |                                            Não Sim                                            |                         |                                                                 |               Problem can re reproduced in Gardenworld               |                                                                 The problem occurs also in the standard distribution in the demo client Gardenworld.                                                                 |
|      Comentários       | Texto Médio (até 2000 caracteres) |                                                                                               |                         |                                                                 |                  Comments or additional information                  |                                                                       The Comments field allows for free form entry of additional information.                                                                       |
|         Logger         |       Texto Curto (String)        |                                                                                               |                         |                                                                 |                             Logger Name                              |                                                                                                                                                                                                                      |
|     Source Method      |       Texto Curto (String)        |                                                                                               |                         |                                                                 |                          Source Method Name                          |                                                                                                                                                                                                                      |
|      Source Class      |       Texto Curto (String)        |                                                                                               |                         |                                                                 |                          Source Class Name                           |                                                                                                                                                                                                                      |
|         Linha          |              Inteiro              |                                                                                               |                         |                                                                 |                               Line No                                |                                                                                                                                                                                                                      |
|      Stack Trace       | Texto Médio (até 2000 caracteres) |                                                                                               |                         |                                                                 |                           System Log Trace                           |                                                                                                                                                                                                                      |
|      Error Trace       | Texto Médio (até 2000 caracteres) |                                                                                               |                         |                                                                 |                          System Error Trace                          |                                                                                                   Java Trace Info                                                                                                    |
|   Texto de Resposta    | Texto Médio (até 2000 caracteres) |                                                                                               |                         | <span class="emphasis">*ReadOnly Logic*</span>: @Record\_ID@\!0 |                        Request Response Text                         |                                                                                  Text block to be copied into request response text                                                                                  |
|     System Status      |               Lista               |                            Evaluation Implementation Produção (E)                             |                         | <span class="emphasis">*ReadOnly Logic*</span>: @Record\_ID@=0  |   Status of the system - Support priority depends on system status   |                                                                                 System status helps to prioritize support resources                                                                                  |
|      Known Issue       |             Procurar              |                                                                                               |  rknownissue\_adissue   |                                                                 |                             Known Issue                              |                                                                                                                                                                                                                      |
| Solicitar Documento No |       Texto Curto (String)        |                                                                                               |                         |                                                                 |                    iDempiere Request Document No                     |                                                                                                                                                                                                                      |
|      Solicitação       |             Procurar              |                                                                                               |    rrequest\_adissue    |                                                                 |             Request from a Business Partner or Prospect              |                                                                     The Request identifies a unique request from a Business Partner or Prospect.                                                                     |
|         Ativo          |           Tabela Direta           |                                                                                               |     aasset\_adissue     |                                                                 |                Asset used internally or by customers                 |                                             An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                                             |
|     Issue Project      |             Procurar              |                                                                                               | rissueproject\_adissue  |                                                                 |                       Implementation Projects                        |                                                                                                                                                                                                                      |
|     Support EMail      |       Texto Curto (String)        |                                                                                               |                         |                                                                 |       EMail address to send support information and updates to       |                                                                                     If not entered the registered email is used.                                                                                     |
|          Nome          |       Texto Curto (String)        |                                              (.)                                              |                         |                                                                 |                Alphanumeric identifier of the entity                 |                                     The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                     |
|    Email Registrado    |       Texto Curto (String)        |                                              (.)                                              |                         |                                                                 |                                                                      |                                                                                                                                                                                                                      |
|      Issue System      |             Procurar              |                                                                                               | rissuesystem\_ad\_issue |                                                                 |                      System creating the issue                       |                                                                                                                                                                                                                      |
|       IssueUser        |             Procurar              |                                                                                               |   rissueuser\_adissue   |                                                                 |                       User who reported issues                       |                                                                                                                                                                                                                      |
|      Endereço BD       |       Texto Curto (String)        |                                                                                               |                         |                                                                 |                   JDBC URL of the database server                    |                                                                                                                                                                                                                      |
|       Local Host       |       Texto Curto (String)        |                                                                                               |                         |                                                                 |                           Local Host Info                            |                                                                                                                                                                                                                      |
|      Estatísticas      |       Texto Curto (String)        |                                                                                               |                         |                                                                 | Information to help profiling the system for solving support issues  |                               Profile information do not contain sensitive information and are used to support issue detection and diagnostics as well as general anonymous statistics                               |
|        Profile         |       Texto Curto (String)        |                                                                                               |                         |                                                                 | Information to help profiling the system for solving support issues  |                                                   Profile information do not contain sensitive information and are used to support issue detection and diagnostics                                                   |
|   Hospedeiro Remoto    |       Texto Curto (String)        |                                              (.)                                              |                         |                                                                 |                           Remote host Info                           |                                                                                                                                                                                                                      |
|       End.Remoto       |       Texto Curto (String)        |                                              (.)                                              |                         |                                                                 |                            Remote Address                            |                                                                           The Remote Address indicates an alternative or external address.                                                                           |
|    Operating System    |       Texto Curto (String)        |                                                                                               |                         |                                                                 |                        Operating System Info                         |                                                                                                                                                                                                                      |
|       Java Info        |       Texto Curto (String)        |                                                                                               |                         |                                                                 |                          Java Version Info                           |                                                                                                                                                                                                                      |
|     Banco de Dados     |       Texto Curto (String)        |                                                                                               |                         |                                                                 |                         Database Information                         |                                                                                                                                                                                                                      |
|       Processado       |              Sim-Não              |                                              (N)                                              |                         |                                                                 |                   The document has been processed                    |                                                                         The Processed checkbox indicates that a document has been processed.                                                                         |
| Report or Update Issue |               Botão               |                                                                                               |                         |                                                                 |                                                                      |                                                                                                                                                                                                                      |
|     ID do Registro     |              Inteiro              |                                              (1)                                              |                         |                                                                 |                      Direct internal record ID                       | The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known. |
|     AD\_Issue\_UU      |       Texto Curto (String)        |                                                                                               |                         |                                                                 |                                                                      |                                                                                                                                                                                                                      |

</div>

</div>

  

</div>
