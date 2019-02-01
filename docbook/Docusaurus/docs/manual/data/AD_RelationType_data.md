<div id="d67229e1" class="table">

<div class="table-title">

Table 1. Tipo de
Relação

</div>

<div class="table-contents">

|                     |                 |                 |           |                  |          |                                                     |                |                   |      |
| :-----------------: | :-------------: | :-------------: | :-------: | :--------------: | :------: | :-------------------------------------------------: | :------------: | :---------------: | :--: |
| Fonte de Referência | Meta Referência | Tipo de Relação | Descrição | Tipo de Entidade | Dirigido |                        Nome                         | Regra da Fonte | Perfil de Destino | Tipo |
|       1500420       |     1500423     |     5000002     |           |        D         |  false   |  DocFiscalLine \< -\> TaxDeterminationLine (Saida)  |                |                   |  I   |
|       1500284       |     1500285     |     1000001     |           |        D         |  false   |              Packing List \< -\> InOut              |                |                   |  I   |
|       1500416       |     1500419     |     5000000     |           |        D         |  false   |          Payment \< -\> BankStatementLine           |                |                   |  I   |
|        53352        |      53353      |      50005      |           |        D         |  false   |           BPartner\< -\> Customer Return            |                |                   |  I   |
|       1500420       |     1500421     |     5000001     |           |        D         |  false   | DocFiscalLine \< -\> TaxDeterminationLine (Entrada) |                |                   |  I   |
|        53352        |      53354      |      50004      |           |        D         |  false   |             BPartner\< -\> VendorReturn             |                |                   |  I   |
|       1500602       |     1500602     |     1500003     |           |        U         |  false   |    C\_DocType(InvoiceShipment) \< -\> C\_DocType    |                |                   |  I   |
|       1500654       |     1500653     |     1500007     |           |        U         |   true   |     Order Ref (Sales) \< \> Invoice (Customer)      |                |                   |  I   |
|       1500691       |     1500691     |     1500008     |           |        U         |  false   |     Contrato Original \< -\> Contratos Aditados     |                |                   |  I   |
|       1500653       |     1500654     |     1500005     |           |        U         |   true   |     Invoice (Customer) \< \> Order Ref (Sales)      |                |                   |  I   |
|        53349        |      53347      |      50002      |           |        D         |   true   |        Order (Sales) \< -\> InOut (Shipment)        |                |                   |  I   |
|        53348        |      53345      |      50003      |           |        D         |   true   |     Invoice (Customer) \< -\> InOut (Shipment)      |                |                   |  I   |
|       1500713       |     1500714     |     1500009     |           |        U         |   true   |    Order Ref (Purchase) \< \> Invoice (Provider)    |                |                   |  I   |
|       1500714       |     1500713     |     1500010     |           |        U         |   true   |    Invoice (Provider) \< \> Order Ref (Purchase)    |                |                   |  I   |
|       1500715       |     1500716     |     1500011     |           |        U         |   true   |      Invoice (Provider) \< -\> InOut (Receipt)      |                |                   |  I   |
|       1500716       |     1500715     |     1500012     |           |        U         |   true   |      InOut (Receipt) \< -\> Invoice (Provider)      |                |                   |  I   |
|       1500720       |     1500721     |     1500013     |           |        U         |   true   |      Order (Purchase) \< -\> InOut (Receiving)      |                |                   |  I   |
|       1500721       |     1500720     |     1500014     |           |        U         |   true   |      InOut (Receiving) \< -\> Order (Purchase)      |                |                   |  I   |

</div>

</div>
