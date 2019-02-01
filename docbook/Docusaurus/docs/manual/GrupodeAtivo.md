---
title: "Grupo de Ativo"
id: GrupodeAtivo
---
<div id="d110526e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Grupo de Ativo

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Grupo de Ativo -
    A\_Asset\_Group](#d110526e22)</span>
  - <span class="section">[2. Tabela: Contabilidade -
    A\_Asset\_Group\_Acct](#d110526e313)</span>
  - <span class="section">[3. Tabela: Tradução -
    A\_Asset\_Group\_Trl](#d110526e994)</span>

</div>

<span class="emphasis">*Descrição:* </span> Grupo de Ativos

<span class="emphasis">*Comentário/Ajuda:* </span>O grupo de ativos
determina as contas padrão. Os ativos serão criados ao entregar o ativo
se um Grupo de Ativo for selecionado na Categoria de Produto.

<span class="emphasis"> *Criado em:* </span>2003-01-23 01:02:42.0

<span class="emphasis">*Atualizado em:* </span>2010-06-17 15:34:15.0

<div id="d110526e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Grupo de Ativo - A\_Asset\_Group

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/A_Asset_Group_data)

<span class="emphasis">*Descrição:*</span> Grupo de Ativos

<span class="emphasis">*Comentário/Ajuda:* </span> O grupo de ativos
determina as contas padrão. Os ativos serão criados ao entregar o ativo
se um Grupo de Ativo for selecionado na Categoria de Produto.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d110526e39" class="table">

<div class="table-title">

Table 1.1. Asset Group
Fields

</div>

<div class="table-contents">

|    Nome do campo    |            Referência             |   Valores (Padrão)    |     Chave restritiva     |                Regra de validação                |                Descrição                 |                                                                       Comentário/Ajuda                                                                        |
| :-----------------: | :-------------------------------: | :-------------------: | :----------------------: | :----------------------------------------------: | :--------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Grupo de Ativo    |                ID                 |                       |                          |                                                  |             Group of Assets              |     The group of assets determines default accounts. If an asset group is selected in the product category, assets are created when delivering the asset.     |
|   Classe do Ativo   |             Procurar              | A\_Asset\_Class (all) | aassetclass\_aassetgroup |                                                  |                                          |                                                                                                                                                               |
|    Track Issues     |              Sim-Não              |          (N)          |                          |                                                  |  Enable tracking issues for this asset   |                                                          Issues created by automatic Error Reporting                                                          |
|  Criar como Ativo   |              Sim-Não              |          (Y)          |                          |                                                  |       Create Asset and activate it       |                      You may want to consider not to automatically make the asset active if you need to get some additional information                       |
|    Tipo do Ativo    |           Tabela Direta           |                       | aassettype\_aassetgroup  |                                                  |                                          |                                                                                                                                                               |
|       Empresa       |           Tabela Direta           | (@\#AD\_Client\_ID@)  |                          |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                                      (ver o mesmo acima)                                                                      |
|     Organização     |           Tabela Direta           |          (0)          |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                      (ver o mesmo acima)                                                                      |
|        Nome         |       Texto Curto (String)        |                       |                          |                                                  |  Alphanumeric identifier of the entity   |         The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.          |
|      Descrição      |       Texto Curto (String)        |                       |                          |                                                  | Optional short description of the record |                                                          A description is limited to 255 characters.                                                          |
|  Comentário/Ajuda   | Texto Médio (até 2000 caracteres) |                       |                          |                                                  |             Comment or Hint              |                                          The Help field contains a hint, comment or help about the use of this item.                                          |
|        Ativo        |              Sim-Não              |          (Y)          |                          |                                                  |    (semelhante ao primeiro relatório)    |                                                                      (ver o mesmo acima)                                                                      |
|       Padrão        |              Sim-Não              |         ('N')         |                          |                                                  |              Default value               |                                        The Default Checkbox indicates if this record will be used as a default value.                                         |
|      Em Poder       |              Sim-Não              |                       |                          |                                                  |  The asset is owned by the organization  |                                    The asset may not be in possession, but the asset is legally owned by the organization                                     |
|      Depreciar      |              Sim-Não              |                       |                          |                                                  |      The asset will be depreciated       |                                                     The asset is used internally and will be depreciated                                                      |
|  Um ativo por UDM   |              Sim-Não              |                       |                          |                                                  |         Create one asset per UOM         | If selected, one asset per UOM is created, otherwise one asset with the quantity received/shipped. If you have multiple lines, one asset is created per line. |
|       É Ativo       |              Sim-Não              |          (Y)          |                          |                                                  |                                          |                                                                                                                                                               |
| A\_Asset\_Group\_UU |       Texto Curto (String)        |                       |                          |                                                  |                                          |                                                                                                                                                               |

</div>

</div>

  

<div id="d110526e313" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Contabilidade - A\_Asset\_Group\_Acct

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/A_Asset_Group_Acct_data)

<span class="emphasis">*Descrição:*</span> Configurações contábeis para
o grupo de ativo

<span class="emphasis">*Comentário/Ajuda:* </span> Configurações
contábeis para o grupo de ativo que permitem qe um usuário defina
valores padrões para um grupo de ativo.

<span class="emphasis">*Coluna linkada:* </span> Asset Group

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d110526e334" class="table">

<div class="table-title">

Table 1.2. Group Account
Fields

</div>

<div class="table-contents">

|                        Nome do campo                         |      Referência      |                            Valores (Padrão)                             |        Chave restritiva         |                  Regra de validação                   |                   Descrição                   |                                                                   Comentário/Ajuda                                                                    |
| :----------------------------------------------------------: | :------------------: | :---------------------------------------------------------------------: | :-----------------------------: | :---------------------------------------------------: | :-------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------: |
|                    Conta Grupo dos Ativos                    |          ID          |                                                                         |                                 |                                                       |                                               |                                                                                                                                                       |
|                       Processar Agora                        |       Sim-Não        |                                                                         |                                 |                                                       |                                               |                                                                                                                                                       |
|                            Ativo                             |       Sim-Não        |                                                                         |                                 |                                                       |      (semelhante ao primeiro relatório)       |                                                                  (ver o mesmo acima)                                                                  |
|                     Tipo de Depreciação                      |        Tabela        |                          A\_Depreciation\_Type                          |                                 |                                                       |                                               |                                                                                                                                                       |
|                      Tipo de Convenção                       |        Tabela        |                            A\_ConventionType                            |                                 |                                                       |                                               |                                                                                                                                                       |
|                      Ganho a Disposição                      |        Conta         |                                                                         |                                 |                                                       |                                               |                                                                                                                                                       |
|               Tipo de Cálculo para Depreciação               |        Tabela        |                         A\_Depreciation\_Method                         |                                 |                                                       |                                               |                                                                                                                                                       |
|                      Asset Spread Type                       |        Tabela        |                            A\_Asset\_Spread                             |                                 |                                                       |                                               |                                                                                                                                                       |
|                Reaval. Depexp Offset da Conta                |        Conta         |                                                                         | arevaldepexpoffset\_aassetgroup |                                                       |                                               |                                                                                                                                                       |
|           Reaval de Custos Offset da Conta Prévia            |        Conta         |                                                                         | arevalcostoffsetprior\_aassetgr |                                                       |                                               |                                                                                                                                                       |
|              Reaval. de Custos Offset da Conta               |        Conta         |                                                                         | arevalcostoffset\_aassetgroupac |                                                       |                                               |                                                                                                                                                       |
|              A\_Reval\_Accumdep\_Offset\_Prior               |        Conta         |                                                                         | arevaladepoffsetprior\_aassetgr |                                                       |                                               |                                                                                                                                                       |
|               A\_Reval\_Accumdep\_Offset\_Cur                |        Conta         |                                                                         | arevaladepoffsetcur\_aassetgrou |                                                       |                                               |                                                                                                                                                       |
|                   Conta Ganho a Disposição                   |        Conta         |                                                                         | adisposalgain\_aassetgroupacct  |                                                       |                                               |                                                                                                                                                       |
|               Tipo de Cálculo para Depreciação               |        Tabela        |                         A\_Depreciation\_Method                         | adepreciationmethod\_aassetgrou |                                                       |                                               |                                                                                                                                                       |
|              Convenção da Depreciação (fiscal)               |        Tabela        |                            A\_ConventionType                            | adepreciationconvf\_aassetgroup |                                                       |                                               |                                                                                                                                                       |
|                      Tipo de Convenção                       |        Tabela        |                            A\_ConventionType                            | adepreciationconv\_aassetgroupa |                                                       |                                               |                                                                                                                                                       |
|                Método de Depreciação (fiscal)                |        Tabela        |                         A\_Depreciation\_Method                         | adepreciationmethodf\_aassetgro |                                                       |                                               |                                                                                                                                                       |
|                       Perda de Cessão                        |        Conta         |                                                                         |                                 |                                                       |                                               |                                                                                                                                                       |
|                    Dividir em Percentagem                    |        Número        |                                   (1)                                   |                                 |                                                       |                                               |                                                                                                                                                       |
|                Despesa de Reavaliação Offset                 |        Conta         |                                                                         |                                 |                                                       |                                               |                                                                                                                                                       |
|      Reavaliação de Custos Offset da Para o Ano Prévio       |        Conta         |                                                                         |                                 |                                                       |                                               |                                                                                                                                                       |
|       Reavaliação de Custos Offset da Para o Ano Atual       |        Conta         |                                                                         |                                 |                                                       |                                               |                                                                                                                                                       |
|               Método de Cálculo de Reavaliação               |        Lista         |                 Default Inception to date Year Balances                 |                                 |                                                       |                                               |                                                                                                                                                       |
|  Reavaliação Depreciação Acumulada Offset para Ano Anterior  |        Conta         |                                                                         |                                 |                                                       |                                               |                                                                                                                                                       |
| Reavaliação Offset da Depreciação Acumulada Para o Ano Atual |        Conta         |                                                                         |                                 |                                                       |                                               |                                                                                                                                                       |
|                     Receita a Disposição                     |        Conta         |                                                                         |                                 |                                                       |                                               |                                                                                                                                                       |
|                           Empresa                            |    Tabela Direta     |                                                                         |                                 |           AD\_Client.AD\_Client\_ID \< \> 0           |      (semelhante ao primeiro relatório)       |                                                                  (ver o mesmo acima)                                                                  |
|                         Organização                          |    Tabela Direta     |                                                                         |                                 | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |      (semelhante ao primeiro relatório)       |                                                                  (ver o mesmo acima)                                                                  |
|                        Grupo de Ativo                        |    Tabela Direta     |                                                                         |  aassetgroup\_aassetgroupacct   |                                                       |                Group of Assets                | The group of assets determines default accounts. If an asset group is selected in the product category, assets are created when delivering the asset. |
|                       Esquema Contábil                       |    Tabela Direta     |                                                                         |  cacctschema\_aassetgroupacct   |                                                       |             Rules for accounting              |                        An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                        |
|                      Tipo de Lançamento                      |        Lista         | Real Orçamento Encerramento Comprometimento Reservas Estatísticas ('A') |                                 |                                                       | The type of posted amount for the transaction |                 The Posting Type indicates the type of amount (Actual, Budget, Reservation, Commitment, Statistical) the transaction.                 |
|                     Tipo de Depreciação                      |        Tabela        |                          A\_Depreciation\_Type                          | adepreciation\_aassetgroupacct  |                                                       |                                               |                                                                                                                                                       |
|                     Depreciação (fiscal)                     |        Tabela        |                          A\_Depreciation\_Type                          | adepreciationf\_aassetgroupacct |                                                       |                                               |                                                                                                                                                       |
|                       Vida Útil - Anos                       |       Inteiro        |                                                                         |                                 |                                                       |     Years of the usable life of the asset     |                                                                                                                                                       |
|                   Use Vida - Anos (fiscal)                   |       Inteiro        |                                   (0)                                   |                                 |                                                       |                                               |                                                                                                                                                       |
|                      Vida Útil - Meses                       |       Inteiro        |                                   (0)                                   |                                 |                                                       |    Months of the usable life of the asset     |                                                                                                                                                       |
|                  Use Vida - Meses (fiscal)                   |       Inteiro        |                                   (0)                                   |                                 |                                                       |                                               |                                                                                                                                                       |
|                      Conta Custo Ativo                       |        Conta         |                                                                         |     aasset\_aassetgroupacct     |                                                       |                                               |                                                                                                                                                       |
|                    Depreciação Acumulada                     |        Conta         |                                                                         | aaccumdepreciation\_aassetgroup |                                                       |                                               |                                                                                                                                                       |
|                 Conta Despesa de Depreciação                 |        Conta         |                                                                         | adepreciationvc\_aassetgroupacc |                                                       |                                               |                                                                                                                                                       |
|                  Conta Receita a Disposição                  |        Conta         |                                                                         | adisposalrevenue\_aassetgroupac |                                                       |                                               |                                                                                                                                                       |
|                   Conta Perda a Disposição                   |        Conta         |                                                                         | adisposalloss\_aassetgroupacct  |                                                       |                                               |                                                                                                                                                       |
|                  A\_Asset\_Group\_Acct\_UU                   | Texto Curto (String) |                                                                         |                                 |                                                       |                                               |                                                                                                                                                       |

</div>

</div>

  

<div id="d110526e994" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Tradução - A\_Asset\_Group\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/A_Asset_Group_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Asset Group

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d110526e1007" class="table">

<div class="table-title">

Table 1.3. Translation
Fields

</div>

<div class="table-contents">

|  Nome do campo   |            Referência             |   Valores (Padrão)   |      Chave restritiva       |                                  Regra de validação                                   |                Descrição                 |                                                                   Comentário/Ajuda                                                                    |
| :--------------: | :-------------------------------: | :------------------: | :-------------------------: | :-----------------------------------------------------------------------------------: | :--------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Empresa      |           Tabela Direta           | (@\#AD\_Client\_ID@) |  ADClient\_AAssetGroupTrl   | AD\_Client.AD\_Client\_ID \< \> 0 <span class="emphasis">*ReadOnly Logic*</span>: 1=1 |    (semelhante ao primeiro relatório)    |                                                                  (ver o mesmo acima)                                                                  |
|   Organização    |           Tabela Direta           |                      |    ADOrg\_AAssetGroupTrl    |                                                                                       |    (semelhante ao primeiro relatório)    |                                                                  (ver o mesmo acima)                                                                  |
|  Grupo de Ativo  |             Procurar              |                      | AAssetGroup\_AAssetGroupTrl |                                                                                       |             Group of Assets              | The group of assets determines default accounts. If an asset group is selected in the product category, assets are created when delivering the asset. |
|      Idioma      |              Tabela               |     AD\_Language     | ADLanguage\_AAssetGroupTrl  |                                                                                       |         Language for this entity         |                                        The Language identifies the language to use for display and formatting                                         |
|      Ativo       |              Sim-Não              |         (Y)          |                             |                                                                                       |    (semelhante ao primeiro relatório)    |                                                                  (ver o mesmo acima)                                                                  |
|    Traduzida     |              Sim-Não              |         (N)          |                             |                                                                                       |        This column is translated         |                                            The Translated checkbox indicates if this column is translated.                                            |
|       Nome       |       Texto Curto (String)        |                      |                             |                                                                                       |  Alphanumeric identifier of the entity   |     The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.      |
|    Descrição     |       Texto Curto (String)        |                      |                             |                                                                                       | Optional short description of the record |                                                      A description is limited to 255 characters.                                                      |
| Comentário/Ajuda | Texto Médio (até 2000 caracteres) |                      |                             |                                                                                       |             Comment or Hint              |                                      The Help field contains a hint, comment or help about the use of this item.                                      |

</div>

</div>

  

</div>
