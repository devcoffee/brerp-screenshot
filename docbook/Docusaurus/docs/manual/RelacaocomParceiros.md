---
title: "Relação com Parceiros"
id: RelacaocomParceiros
---
<div id="d195701e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Relação com Parceiros

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Relação -
    C\_BP\_Relation](#d195701e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento das Relações
com os Parceiros de Negócios

<span class="emphasis">*Comentário/Ajuda:* </span>A "Relação com
Parceiro de Negócios" permite gerenciar as regras de Relacionamento com
Terceiros: quem recebe faturas por embarques ou paga por faturas.

<span class="emphasis"> *Criado em:* </span>2004-02-19 13:23:20.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/RelacaocomParceiros.png)

<div id="d195701e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Relação - C\_BP\_Relation

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_BP_Relation_data)

<span class="emphasis">*Descrição:*</span> Relação com o Parceiro de
Negócios

<span class="emphasis">*Comentário/Ajuda:* </span> A "Relação com
Parceiro de Negócios" permite gerenciar as regras de Relacionamento com
Terceiros: quem recebe faturas por embarques ou paga por faturas. Se a
localização de um Parceiro de Negócios não estiver definida, a regra se
aplica a todas as localizações d'aquele Parceiro de Negócios

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d195701e40" class="table">

<div class="table-title">

Table 1.1. Relation
Fields

</div>

<div class="table-contents">

|            Nome do campo            |      Referência      |   Valores (Padrão)   |      Chave restritiva      |                       Regra de validação                        |                                  Descrição                                   |                                                                                                      Comentário/Ajuda                                                                                                      |
| :---------------------------------: | :------------------: | :------------------: | :------------------------: | :-------------------------------------------------------------: | :--------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Relação com Parceiros        |          ID          |                      |                            |                                                                 |                          Business Partner Relation                           |                                           Business Partner Relation allow to maintain Third Party Relationship rules: who receives invoices for shipments or pays for invoices.                                            |
|               Empresa               |    Tabela Direta     | (@\#AD\_Client\_ID@) |                            |                AD\_Client.AD\_Client\_ID \< \> 0                |                      (semelhante ao primeiro relatório)                      |                                                                                                    (ver o mesmo acima)                                                                                                     |
|             Organização             |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                            |        (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)         |                      (semelhante ao primeiro relatório)                      |                                                                                                    (ver o mesmo acima)                                                                                                     |
|                Nome                 | Texto Curto (String) |                      |                            |                                                                 |                    Alphanumeric identifier of the entity                     |                                        The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                        |
|              Descrição              | Texto Curto (String) |                      |                            |                                                                 |                   Optional short description of the record                   |                                                                                        A description is limited to 255 characters.                                                                                         |
|                Ativo                |       Sim-Não        |         (Y)          |                            |                                                                 |                      (semelhante ao primeiro relatório)                      |                                                                                                    (ver o mesmo acima)                                                                                                     |
|        Parceiro de Negócios         |       Procurar       |                      |   cbpartner\_cbprelation   |     C\_BPartner.IsActive='Y' AND C\_BPartner.IsSummary='N'      |                        Identifies a Business Partner                         |                                                      A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                       |
|       Localização do Parceiro       |    Tabela Direta     |                      |  cbplocation\_cbprelation  |     C\_BPartner\_Location.C\_BPartner\_ID=@C\_BPartner\_ID@     |          Identifies the (ship to) address for this Business Partner          |                                                                              The Partner address indicates the location of a Business Partner                                                                              |
|        Parceiro Relacionado         |       Procurar       |  C\_BPartner (Trx)   |  cbpartner\_cbprelationbp  |                                                                 |                           Related Business Partner                           | The related Business Partner Acts on behalf of the Business Partner - example the Related Partner pays invoices of the Business Partner - or we pay to the Related Partner for invoices received from the Business Partner |
| Localização do Parceiro Relacionado |        Tabela        | C\_BPartner Location | cbplocation\_cbprelationbp | C\_BPartner\_Location.C\_BPartner\_ID=@C\_BPartnerRelation\_ID@ |                   Location of the related Business Partner                   |                                                                                                                                                                                                                            |
|         Endereço de Entrega         |       Sim-Não        |         (N)          |                            |                                                                 |                      Business Partner Shipment Address                       |                                                     If the Ship Address is selected, the location is used to ship goods to a customer or receive goods from a vendor.                                                      |
|         Endereço de Fatura          |       Sim-Não        |                      |                            |                                                                 |                    Business Partner Invoice/Bill Address                     |                                                 If the Invoice Address is selected, the location is used to send invoices to a customer or receive invoices from a vendor.                                                 |
|        Endereço de Cobrança         |       Sim-Não        |                      |                            |                                                                 | Business Partner pays from that address and we'll send dunning letters there |                                        If the Pay-From Address is selected, this location is the address the Business Partner pays from and where dunning letters will be sent to.                                         |
|        Endereço de Pagamento        |       Sim-Não        |                      |                            |                                                                 |                       Business Partner payment address                       |                                                                 If the Remit-To Address is selected, the location is used to send payments to the vendor.                                                                  |
|         C\_BP\_Relation\_UU         | Texto Curto (String) |                      |                            |                                                                 |                                                                              |                                                                                                                                                                                                                            |

</div>

</div>

  

</div>
