---
title: "Relatório de Requisições de Matéria Prima por Consumo"
id: RelatoriodeRequisicoesdeMateriaPrimaporConsumoRpt
---
<div id="d202254e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatório de Requisições de Matéria Prima por Consumo

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2017-04-19 15:43:53.0

<span class="emphasis">*Atualizado:*</span>2017-04-19 15:43:53.0

<span class="emphasis"> *ReportView:* </span>cof\_rv\_gestaoxconsumo

![](/img/manual/RelatoriodeRequisicoesdeMateriaPrimaporConsumo.png)

<div id="d202254e18" class="table">

<div class="table-title">

Table 1.1. RelatoriodeRequisicoesdeMateriaPrimaporConsumo
Parâmetros

</div>

<div class="table-contents">

|           Nome           |        Nome da coluna        | Referência |            Valores(Padrão)            |                      Descrição                      |      Comentário/Ajuda       |
| :----------------------: | :--------------------------: | :--------: | :-----------------------------------: | :-------------------------------------------------: | :-------------------------: |
| Plano Mestre de Produção | COF\_PP\_PlanoMestreProd\_ID |  Procurar  | COF\_PP\_PlanoMestreProd (DocumentNo) |                    Plano Mestre                     |        Plano Mestre         |
|    Classe do Produto     |    COF\_ProductClass\_ID     |  Procurar  |         COF\_ProductClass\_ID         | Coluna de relação com a tabela de classe de produto | Primary Key : Product Class |
|     Grupo do Produto     |    COF\_ProductGroup\_ID     |  Procurar  |     COF\_ProductGroup Value Name      | Coluna de relação com a tabela de grupo do produto  | Primary Key : Product Group |
|       Produto (PA)       |            pa\_id            |  Procurar  |        M\_Product (Value+Name)        |                        null                         |            null             |
|       Produto (MP)       |            mp\_id            |  Procurar  |        M\_Product (Value+Name)        |                        null                         |            null             |
|     Tipo do Produto      |     COF\_ProductType\_ID     |  Procurar  |      COF\_ProductType Name Value      |  Coluna de relação com a tabela de tipo de produto  | Primary Key : Product Type  |

</div>

</div>

  

<div id="d202254e121" class="table">

<div class="table-title">

Table 1.2. cof\_rv\_gestaoxconsumo -
Colunas

</div>

<div class="table-contents">

|      Nome da coluna      |            Referência             |        Valores padrão        | Valor de restrição |                Regra de validação                |           Descrição           |                                           Comentário/Ajuda                                            |
| :----------------------: | :-------------------------------: | :--------------------------: | :----------------: | :----------------------------------------------: | :---------------------------: | :---------------------------------------------------------------------------------------------------: |
|         Empresa          |           Tabela Direta           |     (@\#AD\_Client\_ID@)     |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |          (ver acima)          |                                              (ver acima)                                              |
|       Organização        |           Tabela Direta           |      (@\#AD\_Org\_ID@)       |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |          (ver acima)          |                                              (ver acima)                                              |
|          classe          |       Texto Curto (String)        |                              |                    |                                                  |                               |                                                                                                       |
| Plano Mestre de Produção |           Tabela Direta           |                              |                    |                                                  |         Plano Mestre          |                                             Plano Mestre                                              |
|    Classe do Produto     |              Tabela               | COF\_ProductClass Value Name |                    |                                                  |  Primary Key : Product Class  |                                      Primary Key : Product Class                                      |
|     Grupo do Produto     |              Tabela               | COF\_ProductGroup Value Name |                    |                                                  |  Primary Key : Product Group  |                                      Primary Key : Product Group                                      |
|     Tipo do Produto      |              Tabela               | COF\_ProductType Name Value  |                    |                                                  |  Primary Key : Product Type   |                                      Primary Key : Product Type                                       |
|          Criado          |             Data+Hora             |          (SYSDATE)           |                    |                                                  | Date this record was created  |                  The Created field indicates the date that this record was created.                   |
|        Criado por        |              Tabela               |           AD\_User           |                    |                                                  | User who created this records |                   The Created By field indicates the user who created this record.                    |
|           data           |             Data+Hora             |                              |                    |                                                  |                               |                                                                                                       |
|          grupo           |       Texto Curto (String)        |                              |                    |                                                  |                               |                                                                                                       |
|          Ativo           |              Sim-Não              |             (Y)              |                    |                                                  |          (ver acima)          |                                              (ver acima)                                              |
|      materia\_prima      |       Texto Curto (String)        |                              |                    |                                                  |                               |                                                                                                       |
|    Linha de Movimento    |           Tabela Direta           |                              |                    |                                                  | Inventory Move document Line  | The Movement Line indicates the inventory movement document line (if applicable) for this transaction |
|       Produto (MP)       |             Procurar              |   M\_Product (Value+Name)    |                    |                                                  |                               |                                                                                                       |
|     ordem\_producao      | Texto Médio (até 2000 caracteres) |                              |                    |                                                  |                               |                                                                                                       |
|       Produto (PA)       |             Procurar              |   M\_Product (Value+Name)    |                    |                                                  |                               |                                                                                                       |
|       produto\_pmp       |       Texto Curto (String)        |                              |                    |                                                  |                               |                                                                                                       |
|        quantidade        |              Número               |                              |                    |                                                  |                               |                                                                                                       |
|           tipo           |       Texto Curto (String)        |                              |                    |                                                  |                               |                                                                                                       |
|     tipo\_movimento      | Texto Médio (até 2000 caracteres) |                              |                    |                                                  |                               |                                                                                                       |
|        Atualizado        |             Data+Hora             |          (SYSDATE)           |                    |                                                  | Date this record was updated  |                  The Updated field indicates the date that this record was updated.                   |
|      Atualizado por      |              Tabela               |           AD\_User           |                    |                                                  | User who updated this records |                   The Updated By field indicates the user who updated this record.                    |

</div>

</div>

  

</div>
