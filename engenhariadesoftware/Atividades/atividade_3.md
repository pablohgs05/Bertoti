## Arquiteturas de Software

### Layered Architecture Style
Um exemplo comum no desenvolvimento Web. A adição de camadas pode levar a uma comunicação mais estruturada entre componentes, mas também pode resultar em sobrecarga devido à necessidade de gerenciar interfaces entre essas camadas. 
- **Trade-off**: Estruturação e organização versus sobrecarga de gerenciamento e desempenho.

### Pipeline Architecture Style
Utilizada frequentemente em sistemas de análise de dados. O trade-off principal é entre simplicidade e flexibilidade. A arquitetura oferece uma linearidade clara no processamento de dados, mas pode apresentar desafios quando há necessidade de adaptar o pipeline a mudanças nos requisitos ou adicionar novas funcionalidades.
- **Trade-off**: Simplicidade e linearidade versus dificuldade em adaptações e adições de funcionalidades.

### Microkernel Architecture Style
Adequada para integração em sistemas operacionais existentes, facilitando testes e "pre-updates" antes de atualizações reais. Essa arquitetura pode reduzir custos de progressão do software, mas a tolerância a falhas é baixa. Se ocorrer um problema, a correção pode ser mais complexa do que métodos preventivos.
- **Trade-off**: Flexibilidade para atualizações e testes versus baixa tolerância a falhas e complexidade na correção de problemas.

### Service-Based Architecture Style
Utilizada para criar aplicações empresariais através de serviços, como o "Power Apps" da Microsoft. É uma arquitetura mais estável, com requisitos não funcionais balanceados. No entanto, pode ter um custo elevado e menor tolerância a falhas. Além disso, pode não ser muito flexível para reorganizações de projetos.
- **Trade-off**: Estabilidade e balanceamento de requisitos versus custo elevado e menor flexibilidade para mudanças.

### Event-Driven Architecture Style
Ideal para softwares de streaming, como a Netflix. Esta arquitetura se adapta bem à evolução e à necessidade de alta adaptabilidade. No entanto, a complexidade de implementação e utilização é um fator a considerar, devido à necessidade de gerenciar eventos e respostas de forma eficiente.
- **Trade-off**: Alta adaptabilidade e evolução versus complexidade de implementação e gestão de eventos.

### Microservices Architecture Style
Excelente para o desenvolvimento de softwares robustos e escaláveis, sendo ideal para grandes empresas como a Amazon. Apesar dos muitos pontos fortes, como escalabilidade e eficiência, o custo pode ser inviável para projetos de menor porte.
- **Trade-off**: Escalabilidade e eficiência versus custo elevado e complexidade de gestão.
