---
title: "Faixa do Simples Nacional"
id: FaixadoSimplesNacional
---
<div id="d94472e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Faixa do Simples Nacional

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Faixa do Simples Nacional -
    COF\_C\_SNRange](#d94472e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-05-31 16:33:45.0

<span class="emphasis">*Atualizado em:* </span>2016-05-31 16:33:45.0

![](/img/manual/FaixadoSimplesNacional.png)

<div id="d94472e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Faixa do Simples Nacional - COF\_C\_SNRange

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> COF\_C\_SNRange\_ID

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d94472e34" class="table">

<div class="table-title">

Table 1.1. National Simple Range
Fields

</div>

<div class="table-contents">

|         Nome do campo         |      Referência      |                   Valores (Padrão)                   | Chave restritiva |                Regra de validação                |                                                       Descrição                                                       |          Comentário/Ajuda           |
| :---------------------------: | :------------------: | :--------------------------------------------------: | :--------------: | :----------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------: | :---------------------------------: |
|    Faixa Simples Nacional     |          ID          |                                                      |                  |                                                  |                                          Primary Key : National Simple Range                                          | Primary Key : National Simple Range |
|            Empresa            |    Tabela Direta     |                 (@\#AD\_Client\_ID@)                 |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |                                          (semelhante ao primeiro relatório)                                           |         (ver o mesmo acima)         |
|          Organização          |    Tabela Direta     |                  (@\#AD\_Org\_ID@)                   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                                          (semelhante ao primeiro relatório)                                           |         (ver o mesmo acima)         |
|        Chave de Busca         | Texto Curto (String) |                                                      |                  |                                                  |                                          (semelhante ao primeiro relatório)                                           |         (ver o mesmo acima)         |
|             Ativo             |       Sim-Não        |                         (Y)                          |                  |                                                  |                                          (semelhante ao primeiro relatório)                                           |         (ver o mesmo acima)         |
|          Receita De           |        Valor         |                         (0)                          |                  |                                                  |                                             Revenue From (Amount or Date)                                             |                                     |
|          Receita Até          |        Valor         |                         (0)                          |                  |                                                  |                                              Revenue To (Amount or Date)                                              |                                     |
|         Tabela Anexos         |        Lista         | Anexo I Anexo II Anexo III Anexo IV Anexo V Anexo VI |                  |                                                  |                                                     Tabela Anexos                                                     |                                     |
|       Valor a Descontar       |        Valor         |                         (0)                          |                  |                                                  |                                                                                                                       |                                     |
| Porcentagem Total de Impostos |        Valor         |                         (0)                          |                  |                                                  |                                                                                                                       |                                     |
|            ICMS %             |        Valor         |                         (0)                          |                  |                                                  |                       Percentual de ICMS ( Imposto Sobre Circulação de Mercadorias e Serviços)                        |                                     |
|             IPI %             |        Valor         |                         (0)                          |                  |                                                  |                                                                                                                       |                                     |
|             PIS %             |        Valor         |                         (0)                          |                  |                                                  |                                   Percentual do PIS (Programa de Integração Social)                                   |                                     |
|           COFINS %            |        Valor         |                         (0)                          |                  |                                                  |                                                 Percentual de COFINS                                                  |                                     |
|            IRPJ %             |        Valor         |                         (0)                          |                  |                                                  |                                 Percentual de IRPJ (Imposto de Renda Pessoa Jurídica)                                 |                                     |
|            CSLL %             |        Valor         |                         (0)                          |                  |                                                  |                            Percentual de CSLL (Contribuição Social sobre o Lucro Líquido)                             |                                     |
|         PIS / Pasep %         |        Valor         |                         (0)                          |                  |                                                  | Percentual do PIS / PASEP (Programa de Integração Social e do Programa de Formação do Patrimônio do Servidor Público) |                                     |
|             CPP %             |        Valor         |                         (0)                          |                  |                                                  |                               Percentual de CPP (Contribuição Patronal Previdenciária)                                |                                     |
|             ISS %             |        Valor         |                         (0)                          |                  |                                                  |                                                                                                                       |                                     |

</div>

</div>

  

</div>
