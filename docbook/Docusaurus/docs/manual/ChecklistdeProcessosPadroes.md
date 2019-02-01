---
title: "Checklist de Processos (Padrões)"
id: ChecklistdeProcessosPadroes
---
<div id="d20937e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Checklist de Processos (Padrões)

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Checklist de Processos (Padrões) -
    MP\_JobStandar](#d20937e23)</span>
  - <span class="section">[2. Tabela: Tarefas do Checklist -
    MP\_JobStandar\_Task](#d20937e200)</span>
  - <span class="section">[3. Tabela: Recursos do Checklist -
    MP\_JobStandar\_Resource](#d20937e363)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-06-22 17:09:12.0

<span class="emphasis">*Atualizado em:* </span>2017-06-22 17:09:12.0

![](/img/manual/ChecklistdeProcessosPadroes.png)

<div id="d20937e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Checklist de Processos (Padrões) - MP\_JobStandar

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d20937e30" class="table">

<div class="table-title">

Table 1.1. Job Standard
Fields

</div>

<div class="table-contents">

|          Nome do campo           |      Referência      |      Valores (Padrão)       |     Chave restritiva      | Regra de validação |               Descrição               |                                                                   Comentário/Ajuda                                                                    |
| :------------------------------: | :------------------: | :-------------------------: | :-----------------------: | :----------------: | :-----------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------: |
| Checklist de Processos (Padrões) |          ID          |                             |                           |                    |                                       |                                                                                                                                                       |
|             Empresa              |    Tabela Direta     |                             |  ADClient\_MPJobStandar   |                    |  (semelhante ao primeiro relatório)   |                                                                  (ver o mesmo acima)                                                                  |
|           Organização            |    Tabela Direta     |                             |    ADOrg\_MPJobStandar    |                    |  (semelhante ao primeiro relatório)   |                                                                  (ver o mesmo acima)                                                                  |
|        Tipo de Checklist         |        Lista         | Type B Monitoramento Type A |                           |                    |                                       |                                                                                                                                                       |
|              Ativo               |       Sim-Não        |                             |                           |                    |  (semelhante ao primeiro relatório)   |                                                                  (ver o mesmo acima)                                                                  |
|               Nome               | Texto Curto (String) |                             |                           |                    | Alphanumeric identifier of the entity |     The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.      |
|              Ativo               |    Tabela Direta     |                             |   AAsset\_MPJobStandar    |                    | Asset used internally or by customers |             An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.              |
|          Grupo de Ativo          |    Tabela Direta     |                             | AAssetGroup\_MPJobStandar |                    |            Group of Assets            | The group of assets determines default accounts. If an asset group is selected in the product category, assets are created when delivering the asset. |
|        Área de Manutenção        |        Lista         |       Externo Interno       |                           |                    |                                       |                                                                                                                                                       |
|  Copiar Checklist de Processos   |        Botão         |                             |                           |                    |                                       |                                                                                                                                                       |

</div>

</div>

  

<div id="d20937e200" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Tarefas do Checklist - MP\_JobStandar\_Task

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d20937e207" class="table">

<div class="table-title">

Table 1.2. Task
Fields

</div>

<div class="table-contents">

|               Nome do campo               |            Referência             |                                                        Valores (Padrão)                                                         |        Chave restritiva        | Regra de validação |                       Descrição                       |                   Comentário/Ajuda                    |
| :---------------------------------------: | :-------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------: | :----------------------------: | :----------------: | :---------------------------------------------------: | :---------------------------------------------------: |
| Tarefa do Checklist de Processos (Padrão) |                ID                 |                                                                                                                                 |                                |                    |                                                       |                                                       |
|                  Empresa                  |           Tabela Direta           |                                                                                                                                 |   ADClient\_MPJobStandarTask   |                    |          (semelhante ao primeiro relatório)           |                  (ver o mesmo acima)                  |
|                Organização                |           Tabela Direta           |                                                                                                                                 |    ADOrg\_MPJobStandarTask     |                    |          (semelhante ao primeiro relatório)           |                  (ver o mesmo acima)                  |
|     Checklist de Processos (Padrões)      |              Tabela               |                                                         MP\_JobStandar                                                          | MPJobStandar\_MPJobStandarTask |                    |                                                       |                                                       |
|                   Ativo                   |              Sim-Não              |                                                                                                                                 |                                |                    |          (semelhante ao primeiro relatório)           |                  (ver o mesmo acima)                  |
|                 Seqüência                 |              Inteiro              | (@SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM MP\_JobStandar\_Task WHERE MP\_JobStandar\_ID=@MP\_JobStandar\_ID@) |                                |                    | Method of ordering records; lowest number comes first |      The Sequence indicates the order of records      |
|                 Descrição                 | Texto Médio (até 2000 caracteres) |                                                                                                                                 |                                |                    |       Optional short description of the record        |      A description is limited to 255 characters.      |
|                    UDM                    |           Tabela Direta           |                                                                                                                                 |     CUOM\_MPJobStandarTask     |                    |                    Unit of Measure                    | The UOM defines a unique non monetary Unit of Measure |
|                  Duração                  |              Número               |                                                                                                                                 |                                |                    |           Normal Duration in Duration Unit            |  Expected (normal) Length of time for the execution   |

</div>

</div>

  

<div id="d20937e363" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Recursos do Checklist - MP\_JobStandar\_Resource

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d20937e370" class="table">

<div class="table-title">

Table 1.3. Resource
Fields

</div>

<div class="table-contents">

|               Nome do campo                |  Referência   |                         Valores (Padrão)                         |        Chave restritiva         | Regra de validação |             Descrição              |                              Comentário/Ajuda                              |
| :----------------------------------------: | :-----------: | :--------------------------------------------------------------: | :-----------------------------: | :----------------: | :--------------------------------: | :------------------------------------------------------------------------: |
| Recurso do Checklist de Processos (Padrão) |      ID       |                                                                  |                                 |                    |                                    |                                                                            |
|                  Empresa                   | Tabela Direta |                                                                  | ADClient\_MPJobStandarResource  |                    | (semelhante ao primeiro relatório) |                            (ver o mesmo acima)                             |
|                Organização                 | Tabela Direta |                                                                  |   ADOrg\_MPJobStandarResource   |                    | (semelhante ao primeiro relatório) |                            (ver o mesmo acima)                             |
| Tarefa do Checklist de Processos (Padrão)  |    Tabela     |                       MP\_JobStandar\_Task                       | MPJobStandarTask\_MPJobStandarR |                    |                                    |                                                                            |
|                   Ativo                    |    Sim-Não    |                                                                  |                                 |                    | (semelhante ao primeiro relatório) |                            (ver o mesmo acima)                             |
|              Tipo do Recurso               |     Lista     | Peças de LdM Ferramentas de LdM Recursos Humanos Peça Ferramenta |                                 |                    |                                    |                                                                            |
|                    BOM                     | Tabela Direta |                                                                  |   MBOM\_MPJobStandarResource    |                    |          Bill of Material          |                       The composition of the Product                       |
|                  Produto                   |   Procurar    |                                                                  | MProduct\_MPJobStandarResource  |                    |       Product, Service, Item       | Identifies an item which is either purchased or sold in this organization. |
|                  Recurso                   | Tabela Direta |                                                                  | SResource\_MPJobStandarResource |                    |              Resource              |                                                                            |
|           Quantidade do Recurso            |  Quantidade   |                                                                  |                                 |                    |                                    |                                                                            |
|               Valor de Custo               |     Valor     |                                                                  |                                 |                    |          Value with Cost           |                                                                            |

</div>

</div>

  

</div>
