---
title: "Configurador do Sistema"
id: ConfiguradordoSistema
---
<div id="d33557e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Configurador do Sistema

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: System Configurator -
    AD\_SysConfig](#d33557e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Configuração de Parâmetros
do Sistema

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2007-02-28 01:39:29.0

<span class="emphasis">*Atualizado em:* </span>2007-02-28 01:39:29.0

![](/img/manual/ConfiguradordoSistema.png)

<div id="d33557e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: System Configurator - AD\_SysConfig

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_SysConfig_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d33557e32" class="table">

<div class="table-title">

Table 1.1. System Configurator
Fields

</div>

<div class="table-contents">

|     Nome do campo     |            Referência            |                                   Valores (Padrão)                                   |   Chave restritiva   |                       Regra de validação                       |                            Descrição                             |                                                                                          Comentário/Ajuda                                                                                           |
| :-------------------: | :------------------------------: | :----------------------------------------------------------------------------------: | :------------------: | :------------------------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  System Configurator  |                ID                |                                                                                      |                      |                                                                |                                                                  |                                                                                                                                                                                                     |
|        Empresa        |          Tabela Direta           |                                                                                      |                      |               AD\_Client.AD\_Client\_ID \< \> 0                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|      Organização      |          Tabela Direta           |                                                                                      |                      |                                                                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|         Nome          |       Texto Curto (String)       |                                                                                      |                      |                                                                |              Alphanumeric identifier of the entity               |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|       Descrição       |       Texto Curto (String)       |                                                                                      |                      |                                                                |             Optional short description of the record             |                                                                             A description is limited to 255 characters.                                                                             |
|    Chave de Busca     | Texto Longo (\> 2000 caracteres) |                                                                                      |                      |                                                                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|   Tipo de Entidade    |              Tabela              | \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual) | entityt\_adsysconfig | <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D | Dictionary Entity Type; Determines ownership and synchronization | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
| Configuração de nível |              Lista               |                            Client Organization System (S)                            |                      |                                                                |              Configuration Level for this parameter              |                            Configuration Level for this parameter S - just allowed system configuration C - client configurable parameter O - org configurable parameter                            |
|         Ativo         |             Sim-Não              |                                                                                      |                      |                                                                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|   AD\_SysConfig\_UU   |       Texto Curto (String)       |                                                                                      |                      |                                                                |                                                                  |                                                                                                                                                                                                     |

</div>

</div>

  

</div>
