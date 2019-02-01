---
title: "Entrada de Despesas de Depreciação"
id: EntradadeDespesasdeDepreciacaoRpt
---
<div id="d84945e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Entrada de Despesas de Depreciação

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2008-05-30 16:49:20.0

<span class="emphasis">*Atualizado:*</span>2008-05-30 16:49:20.0

<span class="emphasis"> *Descrição:* </span>Usado para rever despesas de
depreciação ainda não processada

<span class="emphasis"> *ReportView:*
</span>RV\_Asset\_Depreciation\_Entry

<div id="d84945e21" class="table">

<div class="table-title">

Table 1.1. EntradadeDespesasdeDepreciacao
Parâmetros

</div>

<div class="table-contents">

|     Nome      | Nome da coluna | Referência | Valores(Padrão) |                Descrição                 |                                                                           Comentário/Ajuda                                                                           |
| :-----------: | :------------: | :--------: | :-------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Ativo     |  A\_Asset\_ID  |  Procurar  |                 | Ativo usado internamente ou por clientes |                     Um ativo é criado ou ao comprar ou ao entregar um produto. Um ativo pode ser usado internamente ou ser um ativo de cliente.                      |
| Data da Conta |    DateAcct    |    Data    |                 |              Data Contábil               | A "Data Contábil" indica a data a ser usada nos registros do livro de razão geral gerados a partir deste documento. É também usada para qualquer conversão de moeda. |

</div>

</div>

  

<div id="d84945e72" class="table">

<div class="table-title">

Table 1.2. RV\_Asset\_Depreciation\_Entry -
Colunas

</div>

<div class="table-contents">

|             Nome da coluna             |            Referência             |                             Valores padrão                              |       Valor de restrição        | Regra de validação |                   Descrição                   |                                                                          Comentário/Ajuda                                                                          |
| :------------------------------------: | :-------------------------------: | :---------------------------------------------------------------------: | :-----------------------------: | :----------------: | :-------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|              Conta Número              |               Conta               |                                                                         | aaccountnumber\_adepreciationex |                    |                                               |                                                                                                                                                                    |
|         Depreciação Acumulada          |               Valor               |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |
|     Depreciação Acumulada (delta)      |               Valor               |                                   (0)                                   |                                 |                    |                                               |                                                                                                                                                                    |
|     Depreciação Acumulada (fiscal)     |               Valor               |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |
| Depreciação Acumulada - fiscal (delta) |               Valor               |                                   (0)                                   |                                 |                    |                                               |                                                                                                                                                                    |
|            Adição de Ativo             |           Tabela Direta           |                                                                         | aassetaddition\_adepreciationex |                    |                                               |                                                                                                                                                                    |
|             Custo do Ativo             |               Valor               |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |
|           Custo Ativo Delta            |               Valor               |                                   (0)                                   |                                 |                    |                                               |                                                                                                                                                                    |
|             Asset Disposed             |           Tabela Direta           |                                                                         | aassetdisposed\_adepreciationex |                    |                                               |                                                                                                                                                                    |
|                 Ativo                  |             Procurar              |                                                                         |    aasset\_adepreciationexp     |                    |     Asset used internally or by customers     |                    An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                    |
|        Quantidade Remanescente         |               Valor               |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |
|    Quantidade Remanescente (fiscal)    |               Valor               |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |
|                Empresa                 |              Tabela               |                               AD\_Client                                |                                 |                    |                  (ver acima)                  |                                                                            (ver acima)                                                                             |
|         Entrada de Depreciação         |             Procurar              |                                                                         | adepreciationentry\_adepreciati |                    |                                               |                                                                                                                                                                    |
|          Exp. de Depreciação           |                ID                 |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |
|        A\_Depreciation\_Exp\_UU        |       Texto Curto (String)        |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |
|              Organização               |              Tabela               |                              AD\_Org (all)                              |                                 |                    |                  (ver acima)                  |                                                                            (ver acima)                                                                             |
|            Tipo de Entrada             |               Lista               |          Depreciation Disposals Forecasts New Splits Transfers          |                                 |                    |                                               |                                                                                                                                                                    |
|             Período/Anual              |              Inteiro              |                             C\_Period (all)                             |                                 |                    |                                               |                                                                                                                                                                    |
|            Conta (crédito)             |               Conta               |                           C\_ValidCombination                           |    craccou\_adepreciationexp    |                    |                 Account used                  |                                                                     The (natural) account used                                                                     |
|                 Criado                 |             Data+Hora             |                                (SYSDATE)                                |                                 |                    |         Date this record was created          |                                                 The Created field indicates the date that this record was created.                                                 |
|               Criado por               |              Tabela               |                                AD\_User                                 |                                 |                    |         User who created this records         |                                                  The Created By field indicates the user who created this record.                                                  |
|             Data da Conta              |               Data                |                                                                         |                                 |                    |                Accounting Date                | The Accounting Date indicates the date to be used on the General Ledger account entries generated from this document. It is also used for any currency conversion. |
|               Descrição                |       Texto Curto (String)        |                                                                         |                                 |                    |   Optional short description of the record    |                                                            A description is limited to 255 characters.                                                             |
|             Conta (débito)             |               Conta               |                           C\_ValidCombination                           |    draccou\_adepreciationexp    |                    |                 Account used                  |                                                                     The (natural) account used                                                                     |
|                Despesa                 |               Valor               |                                   (0)                                   |                                 |                    |                                               |                                                                                                                                                                    |
|            Despesa (fiscal)            |               Valor               |                                   (0)                                   |                                 |                    |                                               |                                                                                                                                                                    |
|            Comentário/Ajuda            | Texto Médio (até 2000 caracteres) |                                                                         |                                 |                    |                Comment or Hint                |                                            The Help field contains a hint, comment or help about the use of this item.                                             |
|                 Ativo                  |              Sim-Não              |                                                                         |                                 |                    |                  (ver acima)                  |                                                                            (ver acima)                                                                             |
|               Depreciar                |              Sim-Não              |                                                                         |                                 |                    |         The asset will be depreciated         |                                                        The asset is used internally and will be depreciated                                                        |
|           Tipo de Lançamento           |               Lista               | Real Orçamento Encerramento Comprometimento Reservas Estatísticas ('A') |                                 |                    | The type of posted amount for the transaction |                       The Posting Type indicates the type of amount (Actual, Budget, Reservation, Commitment, Statistical) the transaction.                        |
|               Processado               |              Sim-Não              |                                                                         |                                 |                    |        The document has been processed        |                                                The Processed checkbox indicates that a document has been processed.                                                |
|            Processar Agora             |               Botão               |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |
|               Atualizado               |             Data+Hora             |                                (SYSDATE)                                |                                 |                    |         Date this record was updated          |                                                 The Updated field indicates the date that this record was updated.                                                 |
|             Atualizado por             |              Tabela               |                                AD\_User                                 |                                 |                    |         User who updated this records         |                                                  The Updated By field indicates the user who updated this record.                                                  |
|           Vida Útil - Meses            |              Inteiro              |                                                                         |                                 |                    |    Months of the usable life of the asset     |                                                                                                                                                                    |
|       Use Vida - Meses (fiscal)        |              Inteiro              |                                                                         |                                 |                    |                                               |                                                                                                                                                                    |

</div>

</div>

  

</div>
