# Portfólio – Projeto LuminIA
## 🧩 Desafio Proposto pelo Cliente

O cliente possuía uma base de dados de suporte legada, com diversas limitações que impactavam diretamente a operação, governança e capacidade de análise. Entre os principais desafios estavam:

Estrutura de dados incompatível com requisitos modernos de LGPD, auditoria e rastreabilidade.

Ausência de logs estruturados e trilhas completas de histórico.

Dificuldade de realizar análises históricas, operacionais e preditivas.

Relatórios rígidos e pouco flexíveis, dificultando decisões estratégicas.

Falta de visão hierarquizada por níveis de suporte (N1, N2, N3, PO, Gerência).

O objetivo principal foi modernizar todo o ecossistema de dados do suporte, criando uma solução robusta capaz de entregar indicadores estratégicos e operacionais em tempo real.

---

## 🛠️ Ferramenta Desenvolvida – LuminIA

LuminIA é uma plataforma completa de visualização e inteligência de suporte, desenvolvida para transformar dados de chamados em indicadores visuais, estratégicos e gerenciais.

A solução inclui:

- Dashboard interativo com métricas de:

- Análise de sentimento

- Volume de tickets

- Recorrência

- SLA

- Temas mais frequentes

- Desempenho por período

- Sistema de permissões: Analista, Gerente e Administrador.

- Gestão de usuários com LGPD, consentimento e autenticação via JWT.

- ETL automatizado para tratar, padronizar e enriquecer dados do SQL Server → MongoDB.

- Modelos de IA (Prophet, Flair, Sentence Transformers) para análises avançadas.

- Arquitetura completa separada entre Front-End, Back-End, ETL e banco de dados.

A ferramenta foi desenvolvida pelo grupo New Generation (Fatec SJC) em parceria com a Pro4Tech.

---

💻 Tecnologias Utilizadas
- Front-End

- Vue.js

- Chart.js

- JWT Decode

- Figma (protótipos)

- Back-End

- Python

- FastAPI

- Uvicorn

- PyJWT

- Inteligência Artificial e Processamento

- Prophet

- Flair

- Pandas

- Banco de Dados

- MongoDB (produção)

- PyODBC

- Dados migrados e tratados para MongoDB

---

👨‍💻 Contribuições Pessoais

Ao longo do projeto, minhas contribuições diretas envolveram:

- Modelagem e Arquitetura

- Estruturação do novo banco compatível com LGPD, histórico e trilhas de auditoria.

- Definição das coleções principais (users, tickets, history, FAQs, deleted-users).

- Diagramas e documentação técnica.

- Desenvolvimento Back-End

- Implementação de rotas FastAPI.

- Criação do serviço de autenticação com JWT.

- CRUD de usuários com registro de histórico.

- Implementação de filtros avançados para indicadores.

- ETL e Integração de Dados

- Desenvolvimento do fluxo completo SQL Server → MongoDB.

- Normalização, tratamento e enriquecimento de dados.

- Ajuste de tipos, datas, SLA e cálculo de métricas.

- Dashboards e Indicadores

- Criação de cálculos e endpoints para:

  * SLA

  * Recorrência

  * Análise de sentimento

  * Tickets por período

  * Temas mais frequentes

  * Tendências e volumes

  * Documentação

  * Desenvolvimento e revisão da documentação técnica e de usuário.

  * Organização em markdown para visualização no GitHub e entrega ao cliente.

---

🧠 Hard Skills

Durante o desenvolvimento do LuminIA, aprofundei e utilizei as seguintes competências técnicas:

- Modelagem de Banco de Dados NoSQL (MongoDB)

- APIs REST com FastAPI (Python)

- ETL Python com PyODBC e manipulação avançada de dados

- Vue.js para dashboards interativos

- Integração com bibliotecas de IA e NLP (Prophet, Flair, Transformers)

- Padronização de logs e auditoria

- Autenticação e Autorização com JWT

- Design responsivo e UX para dashboards

- Desenvolvimento baseado em requisitos de LGPD

---

🤝 Soft Skills

- O projeto exigiu competências interpessoais e organizacionais importantes:

- Comunicação clara com equipe, cliente e parceiros externos.

- Trabalho em equipe no desenvolvimento integrado entre módulos.

- Visão analítica para converter problemas em indicadores úteis.

- Gestão de prioridades para atender prazos e sprints.

- Resolução de problemas durante a refatoração da base legada.

- Organização e documentação técnica detalhada.

- Adaptação rápida a tecnologias novas (IA, ETL, dashboards).

[Repositório do projeto Luminia](https://github.com/new-ge/Luminia)
