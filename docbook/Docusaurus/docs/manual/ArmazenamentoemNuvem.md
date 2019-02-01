---
title: "Armazenamento em Nuvem"
id: ArmazenamentoemNuvem
---
<div id="d8379e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Armazenamento em Nuvem

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Armazenamento em Nuvem -
    COF\_ArmazenamentoNuvem](#d8379e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Armazenamento em Nuvem

<span class="emphasis">*Comentário/Ajuda:* </span>Armazenamento em Nuvem

<span class="emphasis"> *Criado em:* </span>2017-08-14 09:46:30.0

<span class="emphasis">*Atualizado em:* </span>2017-08-14 09:46:30.0

<div id="d8379e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Armazenamento em Nuvem - COF\_ArmazenamentoNuvem

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Armazenamento em Nuvem

<span class="emphasis">*Comentário/Ajuda:* </span> Armazenamento em
Nuvem

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d8379e37" class="table">

<div class="table-title">

Table 1.1. Armazenamento em Nuvem
Fields

</div>

<div class="table-contents">

|            Nome do campo            |            Referência             |              Valores (Padrão)               | Chave restritiva |                Regra de validação                |                   Descrição                    |                                                               Comentário/Ajuda                                                               |
| :---------------------------------: | :-------------------------------: | :-----------------------------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Armazenamento em Nuvem        |                ID                 |                                             |                  |                                                  |             Armazenamento em Nuvem             |                                                           Armazenamento em Nuvem.                                                            |
|     COF\_ArmazenamentoNuvem\_UU     |       Texto Curto (String)        |                                             |                  |                                                  |                                                |                                                                                                                                              |
|               Empresa               |           Tabela Direta           |            (@\#AD\_Client\_ID@)             |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |       (semelhante ao primeiro relatório)       |                                                             (ver o mesmo acima)                                                              |
|             Organização             |           Tabela Direta           |              (@\#AD\_Org\_ID@)              |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |       (semelhante ao primeiro relatório)       |                                                             (ver o mesmo acima)                                                              |
|           Chave de Busca            |       Texto Curto (String)        |                                             |                  |                                                  |       (semelhante ao primeiro relatório)       |                                                             (ver o mesmo acima)                                                              |
|               Serviço               |               Lista               |            Dropbox Google Drive             |                  |                                                  |       Serviço de armazenamento em nuvem        |                                                      Serviço de armazenamento em nuvem                                                       |
|                Nome                 |       Texto Curto (String)        |                                             |                  |                                                  |     Alphanumeric identifier of the entity      | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|              Descrição              |       Texto Curto (String)        |                                             |                  |                                                  |    Optional short description of the record    |                                                 A description is limited to 255 characters.                                                  |
|           Nome do Arquivo           |       Texto Curto (String)        |                                             |                  |                                                  |                Additional Name                 |                                                                                                                                              |
|           Caminho Destino           |       Texto Curto (String)        |                                             |                  |                                                  |                                                |                                                                                                                                              |
|                Ação                 |               Lista               |             Download Upload (U)             |                  |                                                  |                                                |                                                                                                                                              |
|                Ativo                |              Sim-Não              |                     (Y)                     |                  |                                                  |       (semelhante ao primeiro relatório)       |                                                             (ver o mesmo acima)                                                              |
|            Sobrescrever             |              Sim-Não              |                    ('N')                    |                  |                                                  |       Sobrescrever arquivo se existente.       |                                                      Sobrescrever arquivo se existente.                                                      |
|                Token                | Texto Médio (até 2000 caracteres) |                                             |                  |                                                  |             Token de autenticação              |                                                            Token de autenticação                                                             |
|      Email da Conta de Serviço      | Texto Médio (até 2000 caracteres) |                                             |                  |                                                  |           Email da Conta de Serviço            |                                                          Email da Conta de Serviço                                                           |
|  Link de Compartilhamento da Pasta  |       Texto Curto (String)        |                                             |                  |                                                  |  Link de Compartilhamento da Pasta de Destino  |                                                 Link de Compartilhamento da Pasta de Destino                                                 |
| Link de Compartilhamento do Arquivo |       Texto Curto (String)        |                                             |                  |                                                  | Link de Compartilhamento da Arquivo de Destino |                                                Link de Compartilhamento da Arquivo de Destino                                                |
|           Tipo de Arquivo           |               Lista               | Google Docs Google Drive File Google Sheets |                  |                                                  |     Tipo de arquivo do Google Drive (MIME)     |                                                    Tipo de arquivo do Google Drive (MIME)                                                    |
|             Msg de Erro             | Texto Longo (\> 2000 caracteres)  |                                             |                  |                                                  |                                                |                                                                                                                                              |

</div>

</div>

  

</div>
