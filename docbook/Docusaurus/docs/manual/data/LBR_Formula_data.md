<div id="d398734e1" class="table">

<div class="table-title">

Table 1. Fórmula

</div>

<div class="table-contents">

|                                          |                      |                                                                                                                                                                                                                                                        |         |                                          |
| :--------------------------------------: | :------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----: | :--------------------------------------: |
|                Descrição                 | Preço Inclui Imposto |                                                                                                                        Fórmula                                                                                                                         | Fórmula |                   Nome                   |
|           Valor da Mercadoria            |                      |                                                                                                                         (AMT)                                                                                                                          | 1000018 |             Valor Mercadoria             |
|         Báse de Cálculo - ICMSST         |                      |                                                                                                              (1\*(1+IPI))\*(1+ICMSSTMVA)                                                                                                               | 1000019 |         Báse de Cálculo - ICMSST         |
|         Valor Mercadoria + Frete         |                      |                                                                                                         ((AMT + FREIGHT + OTHER + INSURANCE))                                                                                                          | 1000014 |         Valor Mercadoria + Frete         |
|  Base de Calculo ICMS Consumidor Final   |                      |                                                                               ((IPI \* (1-IPIREDBC)) \* (AMT+FREIGHT+OTHER+INSURANCE) ) + (AMT+FREIGHT+OTHER+INSURANCE)                                                                                | 1000020 |  Base de Calculo ICMS Consumidor Final   |
|      (ICMSDIFAL-ICMSPROD)/ICMSDIFAL      |        false         |                                                                                                             (ICMSDIFAL-ICMSPROD)/ICMSDIFAL                                                                                                             | 5000000 |            Fator Diferencial             |
| Base Zero (Exportação e Export/Exp Indi) |                      |                                                                                                                         (0.0)                                                                                                                          | 1000017 | Base Zero (Exportação e Export/Exp Indi) |
|              IPI Importação              |        false         |                                                                                      ((1-IPIREDBC) \* ((AMT+FREIGHT+INSURANCE)+ ((AMT+FREIGHT+INSURANCE)\*II)) )                                                                                       | 5000002 |              IPI Importação              |
|              Icms Iportação              |        false         | ((((AMT+FREIGHT+INSURANCE)+((AMT+FREIGHT+INSURANCE)\*II) + ((((1-IPIREDBC)\*(AMT+FREIGHT+INSURANCE))+((AMT+FREIGHT+INSURANCE)\*II))\*IPI)+ ((AMT+FREIGHT+INSURANCE)\*PISPROD)+ ( (AMT+FREIGHT+INSURANCE)\*COFINSPROD))+ICMSPRODSISCOMEX)/(1-ICMSPROD)) | 5000001 |             Icms Importacao              |
|             PISCOFINSIMPORT              |        false         |                                                                                                                (AMT+FREIGHT+INSURANCE )                                                                                                                | 5000004 |             PISCOFINSIMPORT              |
|                  FORMII                  |        false         |                                                                                                                (AMT+FREIGHT+INSURANCE)                                                                                                                 | 5000003 |                  FORMII                  |

</div>

</div>
