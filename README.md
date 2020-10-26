# Observer Pattern
## Objetivo
O padrão Observer adere ao principio de projeto em que se busca Designs levemente ligados entre objetos que interagem, isto é, eles interagem normalmente, no entanto sabem muito pouco um do outro.
## Motivação
O padrão Observer funciona da mesma forma que assinaturas de revistas e jornais, no entanto, tem-se que a editora (que publica) é o chamado SUBJECT no Padrão Observer e os assinantes (que recebem as novas publicações) são os chamados OBSERVER.
## Aplicabilidade
Os OBSERVERs registram-se no SUBJECT para receber atualizações quando os dados do SUBJECT são alterados. Os OBSERVERs também podem cancelar o seu registro e dessa forma não receber mais nenhuma atualização do SUBJECT.
## Estrutura
![structure](http://videos.web-03.net/artigos/Higor_Medeiros/PadraoObserver_Java/PadraoObserver_Java1.jpg)
## Participantes
#### Subject 
Define o comportamento dos objetos para se registrarem (Attach) e também para serem removidos (Detach)
#### ConcreteSubject
O ConcreteSubject é quem implementa a interface Subject, além de definir os métodos da interface ele ainda define o seu próprio estado
#### ConcreteObserver
A classe ConcreteObserver implementa a interface Observer, definindo assim o método update().
#### Observer
O método update() que é chamado quando o estado do Subject é alterado.
# Exemplo de Implementação

