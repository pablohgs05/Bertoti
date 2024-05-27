### Escolher um sistema e definir uma arquitetura, explicando de acordo com os requisitos não funcionais descritos em seu trade-off:

Escolhendo a arquitetura de microserviços para nossa loja de computadores, que envolve a venda e manutenção de hardware e software, aqui está como planejo definir nossa arquitetura com foco nos requisitos não funcionais e nos trade-offs associados:

### Escalabilidade
Opto pelos microserviços devido à escalabilidade horizontal. Podemos escalar serviços individuais conforme a demanda, como o sistema de pedidos durante promoções, sem impactar outras partes do sistema. No entanto, isso vem com o desafio de gerenciar a comunicação e as dependências entre serviços, exigindo ferramentas de orquestração como Kubernetes.

### Manutenção e Atualizações
Com microserviços, podemos desenvolver e atualizar serviços independentemente. Isso significa que a equipe de manutenção pode atualizar o serviço de inventário sem afetar o sistema de vendas. Apesar disso, a gestão de múltiplos pipelines de CI/CD se torna mais complexa, necessitando de uma automação robusta.

### Resiliência e Tolerância a Falhas
A arquitetura de microserviços oferece resiliência, já que a falha de um serviço não derruba todo o sistema. Cada serviço pode ter seus próprios mecanismos de recuperação. O desafio aqui é implementar monitoramento e testes eficientes para detectar e isolar falhas rapidamente.

### Desempenho
Cada microserviço pode ser otimizado individualmente, melhorando o desempenho geral. Por outro lado, a comunicação entre serviços pode introduzir latência, o que requer a escolha cuidadosa de protocolos eficientes e estratégias para minimizar overhead.

### Segurança
A separação de serviços proporciona maior isolamento, limitando o impacto de uma violação. Contudo, gerenciar segurança e autenticação em múltiplos serviços aumenta a complexidade. Utilizaremos OAuth2 e JWT para gerenciar a autenticação e autorização de forma centralizada.

### Deploy e Entrega Contínua
Os microserviços facilitam deploys independentes e frequentes, permitindo entregas contínuas de melhorias e correções. Ainda assim, coordenar deploys entre serviços interdependentes pode ser complicado, e precisaremos de uma boa estratégia de orquestração para lidar com isso.

### Flexibilidade Tecnológica
Com microserviços, podemos usar a melhor tecnologia para cada serviço. Isso dá flexibilidade, mas também exige uma equipe com habilidades diversificadas e uma gestão cuidadosa para assegurar a integração e compatibilidade entre diferentes stacks tecnológicos.

### Conclusão
A escolha da arquitetura de microserviços nos proporciona escalabilidade, resiliência e flexibilidade, mas vem com desafios de gerenciamento e complexidade. Com uma boa automação, monitoramento e estratégias de segurança, podemos mitigar esses desafios e criar um sistema robusto e eficiente para nossa loja de computadores.
