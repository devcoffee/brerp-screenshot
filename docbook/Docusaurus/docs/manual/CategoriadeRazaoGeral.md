---
title: "Categoria de Razão Geral"
id: CategoriadeRazaoGeral
---
<div id="d20469e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Categoria de Razão Geral

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Categoria de Lançamento Contábil -
    GL\_Category](#d20469e23)</span>
  - <span class="section">[2. Tabela: Translation -
    GL\_Category\_Trl](#d20469e213)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Categorias
de Razão Geral

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Categoria de
Razão Geral" permite a você definir categorias a serem utilizadas em
diários. Estas categorias oferecem um método opcional de agrupamento e
reportagem nos diários.

<span class="emphasis"> *Criado em:* </span>1999-06-29 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/CategoriadeRazaoGeral.png)

<div id="d20469e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Categoria de Lançamento Contábil - GL\_Category

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/GL_Category_data)

<span class="emphasis">*Descrição:*</span> Definir Categorias de
Lançamentos Contábeis

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Categoria de
Lançamento Contábil" define identificadores opcionais para um documento
ou diário. Cada Categoria pode ser usada em um documento, diário manual
ou importação

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d20469e40" class="table">

<div class="table-title">

Table 1.1. GL Category
Fields

</div>

<div class="table-contents">

|       Nome do campo       |      Referência      |                                                                                                                                                                                                                                                                                                                                                                                                        Valores (Padrão)                                                                                                                                                                                                                                                                                                                                                                                                        | Chave restritiva |                Regra de validação                |                Descrição                 |                                                                 Comentário/Ajuda                                                                  |
| :-----------------------: | :------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------: |
| Categoria de Razão Geral  |          ID          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                  |                                                  |         General Ledger Category          |                            The General Ledger Category is an optional, user defined method of grouping journal lines.                             |
|          Empresa          |    Tabela Direta     |                                                                                                                                                                                                                                                                                                                                                                                                      (@\#AD\_Client\_ID@)                                                                                                                                                                                                                                                                                                                                                                                                      |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                                (ver o mesmo acima)                                                                |
|        Organização        |    Tabela Direta     |                                                                                                                                                                                                                                                                                                                                                                                                       (@\#AD\_Org\_ID@)                                                                                                                                                                                                                                                                                                                                                                                                        |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                (ver o mesmo acima)                                                                |
|           Nome            | Texto Curto (String) |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                  |                                                  |  Alphanumeric identifier of the entity   |   The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.    |
|         Descrição         | Texto Curto (String) |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                  |                                                  | Optional short description of the record |                                                    A description is limited to 255 characters.                                                    |
|           Ativo           |       Sim-Não        |                                                                                                                                                                                                                                                                                                                                                                                                              (Y)                                                                                                                                                                                                                                                                                                                                                                                                               |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                                (ver o mesmo acima)                                                                |
|     Tipo de Categoria     |        Lista         |                                                                                                                                                                                                                                                                                                                                                                                         Documento Importar Manual System generated (M)                                                                                                                                                                                                                                                                                                                                                                                         |                  |                                                  | Source of the Journal with this category | The Category Type indicates the source of the journal for this category. Journals can be generated from a document, entered manually or imported. |
| Tipo de Base de Documento |        Lista         | Ajuste Estoque Previsto Memorando de Crédito AP Fatura AP Pagamento AP Memorando de Crédito AR Fatura Pro Forma AR Fatura AR Recibo AR Alocação de Pagamentos Extrato Bancário Diário de Caixa (Cash Journal) Ordem de Distribuição Documento de Ordem de Serviço Lançamento de Ativo Fixo Baixa de Ativo Fixo Depreciação de Ativo Fixo Documento de Razão Geral Diário de Razão Geral Folha de Pagamento Coletor de Custos de Produção Estoque Físico de Material Movimentação de Material Produção de Material Recebimento de Material Despacho de Material Ordem de Manutenção Ordem de Produção Ordem de Qualidade Confrontar Fatura Confrontar PC (Pedido de Compra) Nota Fiscal Brasil Emissão do Projeto Plano Mestre de Produção Pedido de Compra Requisição de Compras RPS / NFS Ordem de Venda Apuração de Impostos |                  |                                                  |         Logical type of document         |    The Document Base Type identifies the base or starting point for a document. Multiple document types may share a single document base type.    |
|          Padrão           |       Sim-Não        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                  |                                                  |              Default value               |                                  The Default Checkbox indicates if this record will be used as a default value.                                   |
|     GL\_Category\_UU      | Texto Curto (String) |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                  |                                                  |                                          |                                                                                                                                                   |

</div>

</div>

  

<div id="d20469e213" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Translation - GL\_Category\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/GL_Category_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> GL Category

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d20469e226" class="table">

<div class="table-title">

Table 1.2. Translation
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      |   Valores (Padrão)   |     Chave restritiva      |                                  Regra de validação                                   |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :----------------------: | :------------------: | :------------------: | :-----------------------: | :-----------------------------------------------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa          |    Tabela Direta     | (@\#AD\_Client\_ID@) |  ADClient\_GLCategoryTrl  | AD\_Client.AD\_Client\_ID \< \> 0 <span class="emphasis">*ReadOnly Logic*</span>: 1=1 |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|       Organização        |    Tabela Direta     |                      |   ADOrg\_GLCategoryTrl    |                                                                                       |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
| Categoria de Razão Geral |       Procurar       |                      | GLCategory\_GLCategoryTrl |                                                                                       |        General Ledger Category        |                          The General Ledger Category is an optional, user defined method of grouping journal lines.                          |
|          Idioma          |        Tabela        |     AD\_Language     | ADLanguage\_GLCategoryTrl |                                                                                       |       Language for this entity        |                                    The Language identifies the language to use for display and formatting                                    |
|        Traduzida         |       Sim-Não        |         (N)          |                           |                                                                                       |       This column is translated       |                                       The Translated checkbox indicates if this column is translated.                                        |
|          Ativo           |       Sim-Não        |         (Y)          |                           |                                                                                       |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|           Nome           | Texto Curto (String) |                      |                           |                                                                                       | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |

</div>

</div>

  

</div>
