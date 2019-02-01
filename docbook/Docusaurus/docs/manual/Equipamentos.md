---
title: "Equipamentos"
id: Equipamentos
---
<div id="d85547e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Equipamentos

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Equipamentos -
    COF\_Equipments](#d85547e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-04-22 16:51:21.0

<span class="emphasis">*Atualizado em:* </span>2015-05-19 22:26:41.0

![](/img/manual/Equipamentos.png)

<div id="d85547e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Equipamentos - COF\_Equipments

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d85547e30" class="table">

<div class="table-title">

Table 1.1. Equipments
Fields

</div>

<div class="table-contents">

|       Nome do campo       |      Referência      |                                     Valores (Padrão)                                     |       Chave restritiva       |                Regra de validação                |                Descrição                 |                                                       Comentário/Ajuda                                                       |
| :-----------------------: | :------------------: | :--------------------------------------------------------------------------------------: | :--------------------------: | :----------------------------------------------: | :--------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------: |
|       Equipamentos        |          ID          |                                                                                          |                              |                                                  |         Primary Key : Equipments         |                                                   Primary Key : Equipments                                                   |
|          Empresa          |    Tabela Direta     |                                   (@\#AD\_Client\_ID@)                                   |                              |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                     (ver o mesmo acima)                                                      |
|        Organização        |    Tabela Direta     |                                    (@\#AD\_Org\_ID@)                                     |                              | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                     (ver o mesmo acima)                                                      |
|     Número Ativo Fixo     | Texto Curto (String) |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|           Ativo           |       Sim-Não        |                                           (Y)                                            |                              |                                                  |    (semelhante ao primeiro relatório)    |                                                     (ver o mesmo acima)                                                      |
|           Marca           | Texto Curto (String) |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|            Cor            |        Lista         |                Preto Azul Cinza Verde Outro Vermelho Prata Branco Amarelo                |                              |                                                  |                                          |                                                                                                                              |
|          Modelo           | Texto Curto (String) |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|           Placa           | Texto Curto (String) |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|       Estado Placa        |        Tabela        |                                        C\_Region                                         | cofStatePlate\_COFEquipments |           C\_Region.C\_Country\_ID=139           |                                          |                                                                                                                              |
|    Capacidade de Carga    |        Número        |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|     Capacidade Maxima     |        Número        |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|         Motorista         |       Procurar       |                                                                                          |   cofdriver\_cofequipments   |                                                  |           Primary Key : Driver           |                                                     Primary Key : Driver                                                     |
|          É Ativo          |       Sim-Não        |                                           (N)                                            |                              |                                                  |                                          |                                                                                                                              |
|           Ativo           |       Procurar       |                                                                                          |    AAsset\_COFEquipments     |                                                  |  Asset used internally or by customers   | An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset. |
|     Ano de Fabricação     |       Inteiro        |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|        Ano Modelo         |       Inteiro        |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|          Chassi           | Texto Curto (String) |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|           Eixos           |        Número        |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|         Rastreado         |       Sim-Não        |                                           (N)                                            |                              |                                                  |                                          |                                                                                                                              |
|    Código de Rastreio     | Texto Curto (String) |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|         Descrição         | Texto Curto (String) |                                                                                          |                              |                                                  | Optional short description of the record |                                         A description is limited to 255 characters.                                          |
| Bloqueado para Manutenção |       Sim-Não        |                                           (N)                                            |                              |                                                  |                                          |                                                                                                                              |
|     Última Manutenção     |         Data         |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|    Próxima Manutenção     |         Data         |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|          RENAVAM          | Texto Curto (String) |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|   Mês de Licenciamento    |        Lista         | Janeiro Fevereiro Março Abril Maio Junho Julho Agosto Setembro Outubro Novembro Dezembro |                              |                                                  |                                          |                                                                                                                              |
|   Último Licenciamento    |         Data         |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|   Próximo Licenciamento   |         Data         |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|   Habilitação Requerida   |        Lista         |                                        A B C D E                                         |                              |                                                  |                                          |                                                                                                                              |
|        Notificar a        | Texto Curto (String) |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|           Tara            |        Número        |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|         KM Atual          |       Inteiro        |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|        Tara Mínima        |        Número        |                                                                                          |                              |                                                  |                                          |                                                                                                                              |
|        Tara Máxima        |        Número        |                                                                                          |                              |                                                  |                                          |                                                                                                                              |

</div>

</div>

  

</div>
