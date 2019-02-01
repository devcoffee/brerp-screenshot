---
title: "Configuração OVS"
id: ConfiguracaoOVS
---
<div id="d30048e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Configuração OVS

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Configuração OVS -
    COF\_ConfigOVS](#d30048e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2018-02-27 14:57:18.0

<span class="emphasis">*Atualizado em:* </span>2018-02-27 14:57:18.0

![](/img/manual/ConfiguracaoOVS.png)

<div id="d30048e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Configuração OVS - COF\_ConfigOVS

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d30048e30" class="table">

<div class="table-title">

Table 1.1. Configuração OVS
Fields

</div>

<div class="table-contents">

|         Nome do campo         |      Referência      |                                                                      Valores (Padrão)                                                                      |     Chave restritiva     |                                                                                Regra de validação                                                                                |                                                   Descrição                                                   |                                                                                            Comentário/Ajuda                                                                                            |
| :---------------------------: | :------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      COF\_ConfigOVS\_UU       | Texto Curto (String) |                                                                                                                                                            |                          |                                                                                                                                                                                  |                                                                                                               |                                                                                                                                                                                                        |
|      COF\_ConfigOVS\_ID       |          ID          |                                                                                                                                                            |                          |                                                                                                                                                                                  |                                         Primary Key : COF\_ConfigOVS                                          |                                                                                      Primary Key : COF\_ConfigOVS                                                                                      |
|            Empresa            |    Tabela Direta     |                                                                    (@\#AD\_Client\_ID@)                                                                    |                          |                                                                        AD\_Client.AD\_Client\_ID \< \> 0                                                                         |                                      (semelhante ao primeiro relatório)                                       |                                                                                          (ver o mesmo acima)                                                                                           |
|          Organização          |    Tabela Direta     |                                                                     (@\#AD\_Org\_ID@)                                                                      |                          |                                                                 (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                 |                                      (semelhante ao primeiro relatório)                                       |                                                                                          (ver o mesmo acima)                                                                                           |
|             Nome              | Texto Curto (String) |                                                                                                                                                            |                          |                                                                                                                                                                                  |                                     Alphanumeric identifier of the entity                                     |                              The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                              |
|             Ativo             |       Sim-Não        |                                                                            (Y)                                                                             |                          |                                                                                                                                                                                  |                                      (semelhante ao primeiro relatório)                                       |                                                                                          (ver o mesmo acima)                                                                                           |
|            Perfil             |       Procurar       |                                                                          AD\_Role                                                                          |  COFRole\_COFConfigOVS   |                                                                                                                                                                                  |                                                                                                               |                                                                                                                                                                                                        |
|        Usuário/Contato        |       Procurar       |                                                                                                                                                            |   ADUser\_COFConfigOVS   |                                                                                                                                                                                  |                         User within the system - Internal or Business Partner Contact                         |                                             The User identifies a unique user in the system. This could be an internal user or a business partner contact                                              |
|    Tipo de Documento Alvo     |        Tabela        |                                                                         C\_DocType                                                                         |  cdoctypetarget\_corder  | C\_DocType.DocBaseType IN ('SOO', 'POO') AND C\_DocType.IsSOTrx='@IsSOTrx@' AND COALESCE(C\_DocType.DocSubTypeSO,' ')\< \> 'RM' AND C\_DocType.AD\_Client\_ID=@\#AD\_Client\_ID@ |                                 Target document type for conversing documents                                 | You can convert document types (e.g. from Offer to Order or Invoice). The conversion is then reflected in the current type. This processing is initiated by selecting the appropriate Document Action. |
| Ativar Tipo de Documento Alvo |       Sim-Não        |                                                                            (N)                                                                             |                          |                                                                                                                                                                                  |                                              Ativa o TDD na OVS                                               |                                                                                                                                                                                                        |
|        Lista de Preço         |    Tabela Direta     |                                                                                                                                                            | MPriceList\_COFConfigOVS |                                                                             COF\_LiberadosWeb = 'Y'                                                                              |                                       Unique identifier of a Price List                                       |                                                       Price Lists are used to determine the pricing, margin and cost of items purchased or sold.                                                       |
|    Permitir Alterar Preço     |       Sim-Não        |                                                                            (N)                                                                             |                          |                                                                                                                                                                                  |                                   Permitir alterar preço na OV Simplificada                                   |                                                                               Permitir alterar preço na OV Simplificada                                                                                |
|       Ação do Documento       |        Lista         | \< Nenhum\> Aprovar Fechar Completo Invalidar Lançar Preparar Estornar - Provisão Estornar - Corrigir Reativar Rejeitar Anulado Espere Completar Destravar |                          |                                                                                                                                                                                  |                                      The targeted status of the document                                      |                                                      You find the current status in the Document Status field. The options are listed in a popup                                                       |
|       Tipo de Transação       |        Lista         |                Consumidor Final Exportação Indireta Exportação Importação Uso Interno Industrialização Outros Remessa Revenda Transferência                |                          |                                                                                                                                                                                  |                                         Defines the Transaction Type                                          |                                                                                      Defines the Transaction Type                                                                                      |
|           Descrição           | Texto Curto (String) |                                                                                                                                                            |                          |                                                                                                                                                                                  |                                   Optional short description of the record                                    |                                                                              A description is limited to 255 characters.                                                                               |
|          Prioridade           |       Inteiro        |                                                                            (0)                                                                             |                          |                                                                                                                                                                                  |                        Indicates if this request is of a high, medium or low priority.                        |                                                                         The Priority indicates the importance of this request.                                                                         |
|       Pesquisar Produto       |       Sim-Não        |                                                                           ('Y')                                                                            |                          |                                                                                                                                                                                  | Se definido como sim, o campo de produto exibe a janela de consulta para pesquisa. Caso não, exibe uma lista. |                                             Se definido como sim, o campo de produto exibe a janela de consulta para pesquisa. Caso não, exibe uma lista.                                              |

</div>

</div>

  

</div>
