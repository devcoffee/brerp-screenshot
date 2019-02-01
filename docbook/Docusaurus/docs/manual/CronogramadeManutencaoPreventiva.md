---
title: "Cronograma de Manutenção Preventiva"
id: CronogramadeManutencaoPreventiva
---
<div id="d38719e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Cronograma de Manutenção Preventiva

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Cronograma de Manutenção
    Preventiva - MP\_Maintain](#d38719e23)</span>
  - <span class="section">[2. Tabela: Tarefas de MP -
    MP\_Maintain\_Task](#d38719e458)</span>
  - <span class="section">[3. Tabela: Recursos da MP -
    MP\_Maintain\_Resource](#d38719e621)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-06-22 17:09:13.0

<span class="emphasis">*Atualizado em:* </span>2017-06-22 17:09:13.0

![](/img/manual/CronogramadeManutencaoPreventiva.png)

<div id="d38719e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Cronograma de Manutenção Preventiva - MP\_Maintain

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/MP_Maintain_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d38719e32" class="table">

<div class="table-title">

Table 1.1. Maintenance
Fields

</div>

<div class="table-contents">

|            Nome do campo            |      Referência      |              Valores (Padrão)              |       Chave restritiva       |      Regra de validação      |                Descrição                 |                                                                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                         |
| :---------------------------------: | :------------------: | :----------------------------------------: | :--------------------------: | :--------------------------: | :--------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Cronograma de Manutenção Preventiva |          ID          |                                            |                              |                              |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|              MP Atual               |        Número        |                                            |                              |                              |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|        Última Execução de MP        |      Data+Hora       |                                            |                              |                              |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|              Última MP              |        Número        |                                            |                              |                              |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|           Última Leitura            |        Número        |                                            |                              |                              |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|            MPCopyFromSJ             |        Botão         |                                            |                              |                              |             Copy From Record             |                                                                                                                                                                                                                                                                                                                                                        Copy From Record                                                                                                                                                                                                                                                                                                                                                         |
|       Cronograma de MP (Pai)        |        Tabela        |                MP\_Maintain                | MPMaintainParent\_MPMaintain |                              |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|  Checklist de Processos (Padrões)   |        Tabela        |               MP\_JobStandar               |   MPJobStandar\_MPMaintain   |                              |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|               Empresa               |    Tabela Direta     |                                            |     ADClient\_MPMaintain     |                              |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|             Organização             |    Tabela Direta     |                                            |      ADOrg\_MPMaintain       |                              |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|         Número do Documento         | Texto Curto (String) |                                            |                              |                              | Document sequence number of the document | The document number is usually automatically generated by the system and determined by the document type of the document. If the document is not saved, the preliminary number is displayed in "\< \> ". If the document type of your document has no automatic document sequence defined, the field is empty if you create a new document. This is for documents which usually have an external number (like vendor invoice). If you leave the field empty, the system will generate a document number for you. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|          Tipo de Documento          |    Tabela Direta     |                                            |     CDocType\_MPMaintain     | C\_DocType.DocBaseType='MOF' |          Document type or rules          |                                                                                                                                                                                                                                                                                                                               The Document Type determines document sequence and processing rules                                                                                                                                                                                                                                                                                                                               |
|                Ativo                |    Tabela Direta     |                                            |      AAsset\_MPMaintain      |                              |  Asset used internally or by customers   |                                                                                                                                                                                                                                                                                                  An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                                                                                                                                                                                                                                                                                                   |
|                Ativo                |       Sim-Não        |                                            |                              |                              |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                                                                                                                                                       (ver o mesmo acima)                                                                                                                                                                                                                                                                                                                                                       |
|              Descrição              | Texto Curto (String) |                                            |                              |                              | Optional short description of the record |                                                                                                                                                                                                                                                                                                                                           A description is limited to 255 characters.                                                                                                                                                                                                                                                                                                                                           |
|           Grupo de Ativo            |    Tabela Direta     |                                            |   AAssetGroup\_MPMaintain    |                              |             Group of Assets              |                                                                                                                                                                                                                                                                                      The group of assets determines default accounts. If an asset group is selected in the product category, assets are created when delivering the asset.                                                                                                                                                                                                                                                                                      |
|           Registro Filho            |       Sim-Não        |                                            |                              |                              |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|             Prioridade              |        Lista         | Urgente Alta Média Baixa Menor Importância |                              |                              |          Priority of a document          |                                                                                                                                                                                                                                                                                                                           The Priority indicates the importance (high, medium, low) of this document                                                                                                                                                                                                                                                                                                                            |
|         Tipo da Programação         |        Lista         |            Agendada Métrica (M)            |                              |                              |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|        Métrica de Prevenção         |        Tabela        |                 MP\_Meter                  |     MPMeter\_MPMaintain      |                              |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|              Intervalo              |        Número        |                                            |                              |                              |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|                Faixa                |        Número        |                                            |                              |                              |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|             Próxima MP              |        Número        |                                            |                              |                              |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|                 Uso                 |        Número        |                                            |                              |                              |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|    Data do último processamento     |      Data+Hora       |                                            |                              |                              |      Date the process was last run.      |                                                                                                                                                                                                                                                                                                                                The Date Last Run indicates the last time that a process was run.                                                                                                                                                                                                                                                                                                                                |
|      Data da Próxima Execução       |      Data+Hora       |                                            |                              |                              |      Date the process will run next      |                                                                                                                                                                                                                                                                                                                                The Date Next Run indicates the next time this process will run.                                                                                                                                                                                                                                                                                                                                 |
|         Estado do Documento         |        Lista         |         Crítico Ativo Inativo (AT)         |                              |                              |    The current status of the document    |                                                                                                                                                                                                                                                                                          The Document Status indicates the status of a document at this time. If you want to change the document status, use the Document Action field                                                                                                                                                                                                                                                                                          |
|          Data da Última OT          |      Data+Hora       |                                            |                              |                              |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |

</div>

</div>

  

<div id="d38719e458" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Tarefas de MP - MP\_Maintain\_Task

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d38719e465" class="table">

<div class="table-title">

Table 1.2. Tasks
Fields

</div>

<div class="table-contents">

|            Nome do campo            |      Referência      |                                                     Valores (Padrão)                                                      |      Chave restritiva      | Regra de validação |                       Descrição                       |                   Comentário/Ajuda                    |
| :---------------------------------: | :------------------: | :-----------------------------------------------------------------------------------------------------------------------: | :------------------------: | :----------------: | :---------------------------------------------------: | :---------------------------------------------------: |
|   Tarefa da Manutenção Preventiva   |          ID          |                                                                                                                           |                            |                    |                                                       |                                                       |
|               Empresa               |    Tabela Direta     |                                                                                                                           |  ADClient\_MPMaintainTask  |                    |          (semelhante ao primeiro relatório)           |                  (ver o mesmo acima)                  |
|             Organização             |    Tabela Direta     |                                                                                                                           |   ADOrg\_MPMaintainTask    |                    |          (semelhante ao primeiro relatório)           |                  (ver o mesmo acima)                  |
| Cronograma de Manutenção Preventiva |        Tabela        |                                                       MP\_Maintain                                                        | MPMaintain\_MPMaintainTask |                    |                                                       |                                                       |
|                Ativo                |       Sim-Não        |                                                                                                                           |                            |                    |          (semelhante ao primeiro relatório)           |                  (ver o mesmo acima)                  |
|              Seqüência              |       Inteiro        | (@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM MP\_Maintain\_Task WHERE MP\_Maintain\_ID=@MP\_Maintain\_ID@) |                            |                    | Method of ordering records; lowest number comes first |      The Sequence indicates the order of records      |
|              Descrição              | Texto Curto (String) |                                                                                                                           |                            |                    |       Optional short description of the record        |      A description is limited to 255 characters.      |
|                 UDM                 |    Tabela Direta     |                                                                                                                           |    CUOM\_MPMaintainTask    |                    |                    Unit of Measure                    | The UOM defines a unique non monetary Unit of Measure |
|               Duração               |        Número        |                                                                                                                           |                            |                    |           Normal Duration in Duration Unit            |  Expected (normal) Length of time for the execution   |

</div>

</div>

  

<div id="d38719e621" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Recursos da MP - MP\_Maintain\_Resource

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d38719e628" class="table">

<div class="table-title">

Table 1.3. Resources
Fields

</div>

<div class="table-contents">

|          Nome do campo           |  Referência   |                         Valores (Padrão)                         |        Chave restritiva         | Regra de validação |             Descrição              |                              Comentário/Ajuda                              |
| :------------------------------: | :-----------: | :--------------------------------------------------------------: | :-----------------------------: | :----------------: | :--------------------------------: | :------------------------------------------------------------------------: |
| Recurso da Manutenção Preventiva |      ID       |                                                                  |                                 |                    |                                    |                                                                            |
|             Empresa              | Tabela Direta |                                                                  |  ADClient\_MPMaintainResource   |                    | (semelhante ao primeiro relatório) |                            (ver o mesmo acima)                             |
|           Organização            | Tabela Direta |                                                                  |    ADOrg\_MPMaintainResource    |                    | (semelhante ao primeiro relatório) |                            (ver o mesmo acima)                             |
| Tarefa da Manutenção Preventiva  |    Tabela     |                        MP\_Maintain\_Task                        | MPMaintainTask\_MPMaintainResou |                    |                                    |                                                                            |
|              Ativo               |    Sim-Não    |                                                                  |                                 |                    | (semelhante ao primeiro relatório) |                            (ver o mesmo acima)                             |
|         Tipo do Recurso          |     Lista     | Peças de LdM Ferramentas de LdM Recursos Humanos Peça Ferramenta |                                 |                    |                                    |                                                                            |
|               BOM                | Tabela Direta |                                                                  |    MBOM\_MPMaintainResource     |                    |          Bill of Material          |                       The composition of the Product                       |
|             Produto              |   Procurar    |                                                                  |  MProduct\_MPMaintainResource   |                    |       Product, Service, Item       | Identifies an item which is either purchased or sold in this organization. |
|             Recurso              | Tabela Direta |                                                                  |  SResource\_MPMaintainResource  |                    |              Resource              |                                                                            |
|      Quantidade do Recurso       |  Quantidade   |                                                                  |                                 |                    |                                    |                                                                            |
|          Valor de Custo          |     Valor     |                                                                  |                                 |                    |          Value with Cost           |                                                                            |

</div>

</div>

  

</div>
