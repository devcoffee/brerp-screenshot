---
title: "Manutenção de Boleto / CNAB"
id: ManutencaodeBoletoCNABI
---
<div id="d143492e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Manutenção de Boleto / CNAB

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2014-12-05 11:19:46.0

<span class="emphasis"> *Atualizado:* </span>2017-06-14 14:47:47.0

<span class="emphasis"> *Descrição:* </span>Informações de Boleto /
CNAB. Manutenção de Títulos.

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>COF\_Titulo t LEFT JOIN
COF\_C\_BankOccurrence o ON
(t.COF\_C\_BankOccurrence\_ID=o.COF\_C\_BankOccurrence\_ID)

<span class="emphasis"> *Order By :*</span>
t.cof\_titulo\_DataVencimento DESC, t.cof\_titulo\_numDoc

<div id="d143492e29" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|         Nome         |      Referência      |                            Sql SELECT                            |                                       QueryCriteria                                        |                 Descrição                 |                                                                                                         Comentário/Ajuda                                                                                                          |
| :------------------: | :------------------: | :--------------------------------------------------------------: | :----------------------------------------------------------------------------------------: | :---------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Data de Vencimento  |         Data         |                  t.cof\_titulo\_DataVencimento                   |                                                                                            |                   null                    |                                                                                                               null                                                                                                                |
|   Documento Fiscal   |       Procurar       |                       t.LBR\_DocFiscal\_ID                       |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                   null                    |                                                                                                               null                                                                                                                |
|       Borderô        | Texto Curto (String) |                        t.cof\_BorderoName                        | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper |                   null                    |                                                                                                               null                                                                                                                |
|     Organização      |    Tabela Direta     |                          t.AD\_Org\_ID                           |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   | Entidade organizacional dentro da Empresa |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
| Parceiro de Negócios |       Procurar       |                        t.C\_BPartner\_ID                         |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |    Identifica um Parceiro de Negócios.    |                               Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                |
|  Data de Vencimento  |         Data         |  t.cof\_titulo\_DataVencimento AS cof\_titulo\_DataVencimentoTo  | <span class="emphasis">*Operador:*</span>\< = <span class="emphasis">*Função:*</span>Trunc |                   null                    |                                                                                                               null                                                                                                                |
|    Boleto Gerado     |       Sim-Não        |                         t.cof\_Processed                         |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |       Indica que Boleto foi Gerado        |                                                                                                               null                                                                                                                |
|     CNAB Gerado      |       Sim-Não        |                        t.cof\_Processed2                         |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |  Indica que o Título contém CNAB Gerado   |                                                                                                               null                                                                                                                |
|        Pedido        |       Procurar       |                          t.C\_Order\_ID                          |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                  Pedido                   | O "Pedido" é um documento de controle. O "Pedido" está completo quando a quantidade pedida for a mesma que a quantidade enviada e faturada. Quando você fecha um pedido, as quantidades não entregues (pendentes) são canceladas. |
|       Parcela        | Texto Curto (String) |                       t.cof\_PayScheduleNo                       |                                                                                            |                   null                    |                                                                                                               null                                                                                                                |
|       Desconto       |        Valor         |                     t.cof\_titulo\_Desconto                      |                                                                                            |                   null                    |                                                                                                               null                                                                                                                |
|     Nosso Número     | Texto Curto (String) |                    t.cof\_titulo\_nossoNumero                    | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>null  |                   null                    |                                                                                                               null                                                                                                                |
| Digito Nosso Número  | Texto Curto (String) |                  t.cof\_titulo\_DigNossoNumero                   | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>null  |                   null                    |                                                                                                               null                                                                                                                |
|  Data de Vencimento  |         Data         | t.cof\_titulo\_DataVencimento AS cof\_titulo\_DataVencimentoFrom | <span class="emphasis">*Operador:*</span>\> = <span class="emphasis">*Função:*</span>Trunc |                   null                    |                                                                                                               null                                                                                                                |
|   Valor do Título    |        Valor         |                       t.cof\_titulo\_Valor                       |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |        Valor do Titulo a Ser Pago         |                                                                                                               null                                                                                                                |
|   Tipo de Carteira   |        Lista         |                       t.cof\_BillFoldType                        |  <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>Upper   |        Tipo da Carteira do Título         |                                                                                                               null                                                                                                                |
|         Pago         |       Sim-Não        |                             t.IsPaid                             |  <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>Upper   |           O documento está pago           |                                                                                                               null                                                                                                                |
|        Fatura        |       Procurar       |                         t.C\_Invoice\_ID                         |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |          Identificador de Fatura          |                                                                                                      O Documento da Fatura.                                                                                                       |
|    Valor da Multa    |        Valor         |                     t.cof\_titulo\_moraMulta                     |                                                                                            |         Valor da Multa a ser pago         |                                                                                                               null                                                                                                                |
| Percentual de Multa  |        Valor         |                  t.cof\_titulo\_multaPercentual                  |                                                                                            |                   null                    |                                                                                                               null                                                                                                                |
| Integração Bancária  |        Tabela        |                  t.COF\_C\_BankIntegration\_ID                   |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |            Integração Bancária            |                                                                                                        Integração Bancária                                                                                                        |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/ManutencaodeBoleto/CNABinfodata.html),

</div>
