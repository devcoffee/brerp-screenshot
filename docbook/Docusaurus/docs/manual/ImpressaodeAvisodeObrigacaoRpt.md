---
title: "Impressão de Aviso de Obrigação"
id: ImpressaodeAvisodeObrigacaoRpt
---
<div id="d120338e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Impressão de Aviso de Obrigação

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2017-03-08 14:43:57.0

<span class="emphasis">*Atualizado:*</span>2017-03-08 14:43:57.0

<span class="emphasis"> *ReportView:* </span>null

<div id="d120338e17" class="table">

<div class="table-title">

Table 1.1. ImpressaodeAvisodeObrigacao
Parâmetros

</div>

<div class="table-contents">

|          Nome          |    Nome da coluna    |  Referência   |                                                                  Valores(Padrão)                                                                  |                    Descrição                     |                                                                                                 Comentário/Ajuda                                                                                                  |
| :--------------------: | :------------------: | :-----------: | :-----------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Estado do Documento   |      DocStatus       |     Lista     | Desconhecido Aprovado Fechado Completado Esboçado Inválido Em Progresso Não Aprovado Estornado Anulado Aguardando Confirmação Esperando pagamento |           O estado atual do documento            |                               O "Estado do Documento" indica o estado de um documento neste momento. Se você deseja alterar o Estado do Documento, use o campo "Ação do Documento"                                |
|  Transação de Vendas   |       IsSOTrx        |    Sim-Não    |                                                                        (N)                                                                        |          Esta é uma Transação de Vendas          |                                                            A caixa de verificação "Transação de Vendas" indica se este item é uma Transação de Vendas.                                                            |
|  Parceiro de Negócios  |   C\_BPartner\_ID    |   Procurar    |                                                                                                                                                   |       Identifica um Parceiro de Negócios.        |                       Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                        |
|      Organização       |     AD\_Org\_ID      | Tabela Direta |                                                                 (@\#AD\_Org\_ID@)                                                                 |    Entidade organizacional dentro da Empresa     |                            Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                            |
| Tipo de Documento Alvo | C\_DocTypeTarget\_ID |    Tabela     |                                                                    C\_DocType                                                                     | Tipo de Documento Alvo para converter documentos | Você pode converter tipos de documento (por exemplo de Oferta para Pedido ou Fatura). A conversão é então refletida no tipo atual. Este processamento é iniciado ao se selecionar a Ação de Documento apropriada. |
|     Data Faturada      |     DateInvoiced     |     Data      |                                                                                                                                                   |      Data impressa na Fatura (Nota Fiscal)       |                                                                          A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                                          |
|     Data da Conta      |       DateAcct       |     Data      |                                                                                                                                                   |                  Data Contábil                   |                       A "Data Contábil" indica a data a ser usada nos registros do livro de razão geral gerados a partir deste documento. É também usada para qualquer conversão de moeda.                        |

</div>

</div>

  

</div>
