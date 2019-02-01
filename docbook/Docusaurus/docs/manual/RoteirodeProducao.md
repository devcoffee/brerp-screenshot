---
title: "Roteiro de Produção"
id: RoteirodeProducao
---
<div id="d208934e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Roteiro de Produção

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Roteiro de Produção -
    COF\_PP\_RoteiroProd](#d208934e23)</span>
  - <span class="section">[2. Tabela: Detalhes do Roteiro -
    COF\_PP\_RoteiroDetalhe](#d208934e375)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-01-19 14:33:19.0

<span class="emphasis">*Atualizado em:* </span>2017-01-19 14:33:19.0

![](/img/manual/RoteirodeProducao.png)

<div id="d208934e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Roteiro de Produção - COF\_PP\_RoteiroProd

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_PP_RoteiroProd_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d208934e32" class="table">

<div class="table-title">

Table 1.1. Roteiro de Produção
Fields

</div>

<div class="table-contents">

|           Nome do campo            |            Referência             |       Valores (Padrão)       |        Chave restritiva         |                                   Regra de validação                                   |                                   Descrição                                    |                                Comentário/Ajuda                                |
| :--------------------------------: | :-------------------------------: | :--------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------: | :----------------------------------------------------------------------------: |
|        Roteiro de Produção         |                ID                 |                              |                                 |                                                                                        |                       Primary Key : Roteiro de Produção                        |                       Primary Key : Roteiro de Produção                        |
|              Empresa               |           Tabela Direta           |     (@\#AD\_Client\_ID@)     |                                 |                           AD\_Client.AD\_Client\_ID \< \> 0                            |                       (semelhante ao primeiro relatório)                       |                              (ver o mesmo acima)                               |
|            Organização             |           Tabela Direta           |      (@\#AD\_Org\_ID@)       |                                 |                    (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                    |                       (semelhante ao primeiro relatório)                       |                              (ver o mesmo acima)                               |
|         Código do Roteiro          |       Texto Curto (String)        |                              |                                 |                                                                                        |                       (semelhante ao primeiro relatório)                       |                              (ver o mesmo acima)                               |
|           Roteiro Padrão           |              Sim-Não              |             (Y)              |                                 |                                                                                        |                  Indica se o roteiro é padrão para um produto                  |                                                                                |
|             Descrição              |       Texto Curto (String)        |                              |                                 |                                                                                        |                    Optional short description of the record                    |                  A description is limited to 255 characters.                   |
|              Produto               |             Procurar              |                              |   MProduct\_COFPPRoteiroProd    | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND M\_Product.IsManufactured='Y' |                             Product, Service, Item                             |   Identifies an item which is either purchased or sold in this organization.   |
|                UDM                 |           Tabela Direta           |                              |     CUOM\_COFPPRoteiroProd      |                                                                                        |                                Unit of Measure                                 |             The UOM defines a unique non monetary Unit of Measure              |
|    Fator de conversão (divisão)    |              Número               |                              |                                 |                                                                                        |                                                                                |                                                                                |
| Fator de Conversão (multiplicação) |              Número               |                              |                                 |                                                                                        |                                                                                |                                                                                |
|          Tipo do Produto           |              Tabela               | COF\_ProductType Name Value  | COFProductType\_COFPPRoteiroPro |                                                                                        |                           Primary Key : Product Type                           |                           Primary Key : Product Type                           |
|         Classe do Produto          |              Tabela               | COF\_ProductClass Value Name | COFProductClass\_COFPPRoteiroPr |                                                                                        |                          Primary Key : Product Class                           |                          Primary Key : Product Class                           |
|          Grupo do Produto          |              Tabela               | COF\_ProductGroup Value Name | COFProductGroup\_COFPPRoteiroPr |                                                                                        |                          Primary Key : Product Group                           |                          Primary Key : Product Group                           |
|              N. Peças              |              Inteiro              |                              |                                 |                                                                                        |                                                                                |                                                                                |
|             Perda (%)              |              Número               |                              |                                 |                                                                                        |                                                                                |                                                                                |
|        Quantidade por Ciclo        |              Número               |                              |                                 |                                                                                        |                                                                                |                                                                                |
|        Horas Ciclo Estimada        |              Número               |                              |                                 |                                                                                        |                                                                                |                                                                                |
|           Perda Estimada           |              Número               |                              |                                 |                                                                                        |                        % de perda estimado no processo                         |                                                                                |
|            Lote Minimo             |              Número               |                              |                                 |                                                                                        |                 Quantidade mpinima a ser produzida no roteiro                  |                                                                                |
|          Qtd Horas Setup           |              Número               |                              |                                 |                                                                                        |                Quantidade em horas de setup processo produtivo                 |                                                                                |
|             Instruções             | Texto Médio (até 2000 caracteres) |                              |                                 |                                                                                        | Instruções para a execução da O.P/Plano Mestre de Produção/Roteiro de Produção | Instruções para a execução da O.P/Plano Mestre de Produção/Roteiro de Produção |
|               Ativo                |              Sim-Não              |             (Y)              |                                 |                                                                                        |                       (semelhante ao primeiro relatório)                       |                              (ver o mesmo acima)                               |

</div>

</div>

  

<div id="d208934e375" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Detalhes do Roteiro - COF\_PP\_RoteiroDetalhe

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_PP_RoteiroDetalhe_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d208934e384" class="table">

<div class="table-title">

Table 1.2. Detalhes do Roteiro
Fields

</div>

<div class="table-contents">

|        Nome do campo        |  Referência   |          Valores (Padrão)          |        Chave restritiva         |                                                                             Regra de validação                                                                              |                    Descrição                    |         Comentário/Ajuda          |
| :-------------------------: | :-----------: | :--------------------------------: | :-----------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------: | :-------------------------------: |
| COF\_PP\_RoteiroDetalhe\_ID |      ID       |                                    |                                 |                                                                                                                                                                             |        Primary Key : Detalhes do Roteiro        | Primary Key : Detalhes do Roteiro |
|           Empresa           | Tabela Direta |        (@\#AD\_Client\_ID@)        |                                 |                                                                      AD\_Client.AD\_Client\_ID \< \> 0                                                                      |       (semelhante ao primeiro relatório)        |        (ver o mesmo acima)        |
|         Organização         | Tabela Direta |         (@\#AD\_Org\_ID@)          |                                 |                                                              (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                               |       (semelhante ao primeiro relatório)        |        (ver o mesmo acima)        |
|     Roteiro de Produção     | Tabela Direta |                                    | COFPPRoteiroProd\_COFPPRoteiroD |                                                                                                                                                                             |        Primary Key : Roteiro de Produção        | Primary Key : Roteiro de Produção |
|          Recursos           |    Tabela     |       COF\_PP\_Recursos\_ID        | COFPPRecursos\_COFPPRoteiroDeta |                                                                                                                                                                             |             Primary Key : Recursos              |      Primary Key : Recursos       |
|     Centro de Trabalho      |    Tabela     | COF\_PP\_CentroTrabalho Value Name | COFPPCentroTrabalho\_COFPPRotei |                                                                                                                                                                             |          Primary Key : Centro Trabalho          |   Primary Key : Centro Trabalho   |
|         Ferramenta          |    Tabela     |  COF\_PP\_Ferramenta name + value  | COFPPFerramenta\_COFPPRoteiroDe | COF\_PP\_Ferramenta.COF\_PP\_Ferramenta\_ID IN (SELECT rc.COF\_PP\_Ferramenta\_ID FROM COF\_PP\_RecursosConfig rc WHERE rc.COF\_PP\_Recursos\_ID = @COF\_PP\_Recursos\_ID@) |            Primary Key : Ferramenta             |     Primary Key : Ferramenta      |
|       Qtd Horas Setup       |    Número     |                                    |                                 |                                                                                                                                                                             | Quantidade em horas de setup processo produtivo |                                   |
|    Horas Ciclo Estimada     |    Número     |                                    |                                 |                                                                                                                                                                             |                                                 |                                   |
|            Ativo            |    Sim-Não    |                (Y)                 |                                 |                                                                                                                                                                             |       (semelhante ao primeiro relatório)        |        (ver o mesmo acima)        |

</div>

</div>

  

</div>
