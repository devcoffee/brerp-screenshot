---
title: "Gerar Documentos Fiscais"
id: GerarDocumentosFiscaisPrc
---
<div id="d109210e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Gerar Documentos Fiscais

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2018-01-09 11:05:18.0

<span class="emphasis">*Atualizado:*</span>2018-01-09 11:05:18.0

<span class="emphasis"> *Descrição:* </span>Ao ser executado cria
Documentos Fiscais que estão pendentes de geração conforme critério de
seleção

<span class="emphasis"> *Comentário/Ajuda:* </span>Ao ser executado cria
Documentos Fiscais que estão pendentes de geração conforme critério de
seleção.

![](/img/manual/GerarDocumentosFiscais.png)

<div id="d109210e22" class="table">

<div class="table-title">

Table 1.1. GerarDocumentosFiscais
Parâmetros

</div>

<div class="table-contents">

|           Nome            | Nome da coluna |  Referência   |                                                                                                                                                                                                                                                                                                                                                                                                        Valores(Padrão)                                                                                                                                                                                                                                                                                                                                                                                                         |                 Descrição                 |                                                                                 Comentário/Ajuda                                                                                  |
| :-----------------------: | :------------: | :-----------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Data de Início       |   StartDate    |     Data      |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |     Primeira data efetiva (inclusive)     |                                                             A "Data de Início" indica o primeiro dia ou data inicial                                                              |
|        Data Final         |    EndDate     |     Data      |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |      Última data efetiva (inclusive)      |                                                                 A "Data Final" indica a última data nesta faixa.                                                                  |
| Tipo de Base de Documento |  DocBaseType   |     Lista     | Ajuste Estoque Previsto Memorando de Crédito AP Fatura AP Pagamento AP Memorando de Crédito AR Fatura Pro Forma AR Fatura AR Recibo AR Alocação de Pagamentos Extrato Bancário Diário de Caixa (Cash Journal) Ordem de Distribuição Documento de Ordem de Serviço Lançamento de Ativo Fixo Baixa de Ativo Fixo Depreciação de Ativo Fixo Documento de Razão Geral Diário de Razão Geral Folha de Pagamento Coletor de Custos de Produção Estoque Físico de Material Movimentação de Material Produção de Material Recebimento de Material Despacho de Material Ordem de Manutenção Ordem de Produção Ordem de Qualidade Confrontar Fatura Confrontar PC (Pedido de Compra) Nota Fiscal Brasil Emissão do Projeto Plano Mestre de Produção Pedido de Compra Requisição de Compras RPS / NFS Ordem de Venda Apuração de Impostos |         Tipo lógico de documento          | O campo "Tipo de Base de Documento" identifica a base ou ponto de partida para um documento. Múltiplos tipos de documentos podem compartilhar um único tipo de base de documento. |
|        Organização        |  AD\_Org\_ID   | Tabela Direta |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | Entidade organizacional dentro da Empresa |            Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.            |
|     Tipo de Documento     | C\_DocType\_ID | Tabela Direta |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |        Tipo de Documento ou regras        |                                               O "Tipo de Documento" determina a seqüência do documento e as regras de processamento                                               |

</div>

</div>

  

</div>
