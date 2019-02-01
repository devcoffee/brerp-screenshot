---
title: "Registro de Entradas / Saídas"
id: RegistrodeEntradasSaidasRpt
---
<div id="d194834e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Registro de Entradas / Saídas

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2012-12-05 22:30:03.0

<span class="emphasis">*Atualizado:*</span>2016-01-14 16:59:56.0

<span class="emphasis"> *Descrição:* </span>Registro de Entradas e
Saídas (P1, P2)

<span class="emphasis"> *Comentário/Ajuda:* </span>Impressão dos
Registros de Entradas ou Saídas Definir o Tipo da Operação para
Impressão Entradas - Registro de Entradas P1 Saídas - Registro de
Saídas P2

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/RegistrodeEntradas/Saidas.png)

<div id="d194834e26" class="table">

<div class="table-title">

Table 1.1. RegistrodeEntradas/Saidas
Parâmetros

</div>

<div class="table-contents">

|           Nome            |         Nome da coluna          |            Referência             |                                                                                                                   Valores(Padrão)                                                                                                                   |                          Descrição                           |                                                                            Comentário/Ajuda                                                                            |
| :-----------------------: | :-----------------------------: | :-------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Empresa          |         AD\_Client\_ID          |              Tabela               |                                                                                                           AD\_Client(@\#AD\_Client\_ID@)                                                                                                            |           Empresa/Locatário para esta instalação.            | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|        Organização        |           AD\_Org\_ID           |              Tabela               |                                                                                                           AD\_Org (Trx)(@\#AD\_Org\_ID@)                                                                                                            |          Entidade organizacional dentro da Empresa           |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
|     Tipo de Operação      |            ide\_tpNF            |               Lista               |                                                                                                             0 - Entrada 1 - Saída ('1')                                                                                                             |            Define o Tipo de Operação do Documento            |                                                                        0 - Entradas 1 - Saídas                                                                         |
|      Página Inicial       |         cof\_PagInicial         |              Número               |                                                                                                                         (1)                                                                                                                         |                             null                             |                                                                                  null                                                                                  |
|      Número de Ordem      |           cof\_NOrdem           |              Número               |                                                                                                                         (0)                                                                                                                         |                             null                             |                                                                                  null                                                                                  |
|    Impressão Completa     |         cof\_PrintFull          |              Sim-Não              |                                                                                                                        ('N')                                                                                                                        | Impressão Completa de Relatórios - Incluso Capa, Rodapé, etc |                                                                                  null                                                                                  |
| Considerar Data Contábil  |      cof\_ConsiderDateAcct      |              Sim-Não              |                                                                                                                        ('Y')                                                                                                                        |     Considerar Data Contábil nos Documentos / Relatórios     |                                                                                  null                                                                                  |
| Coluna SQL Valor Contábil | COF\_COLUNASQL\_VALOR\_CONTABIL | Texto Médio (até 2000 caracteres) | (@SQL=SELECT get\_sysconfig('COF\_COLUNASQL\_VALOR\_CONTABIL', 'COALESCE(det\_prod\_vProd,0) + COALESCE(det\_prod\_vOutro,0) + COALESCE(det\_prod\_vFrete,0) + COALESCE(det\_prod\_vSeg,0) - COALESCE(det\_prod\_vDesc,0)', @\#AD\_Client\_ID@, 0)) |                             null                             |                                                                                  null                                                                                  |
|  Data e Hora de Emissão   |           ide\_dhEmi            |               Data                |                                                                                     (@SQL=SELECT TO\_DATE( '01/'||TO\_CHAR(SYSDATE, 'mm/yyyy') , 'dd/mm/yyyy'))                                                                                     |          Data e Hora de Emissão do Documento Fiscal          |                                                                      Formato AAAA-MM-DDTHH:MM:DD                                                                       |

</div>

</div>

  

</div>
