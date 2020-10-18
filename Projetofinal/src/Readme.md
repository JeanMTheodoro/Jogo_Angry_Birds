Como projeto final da disciplina de POO, vocÃª deve desenvolver uma simulaÃ§Ã£o inspirada no jogo Angry Birds. Defina objetos para representar passarinhos e alvos (porcos, pedras e paus).


Para simplificar, crie uma fila de passarinhos, usando uma coleÃ§Ã£o do tipo Queue. Remova um passarinho da fila de cada vez e atire-o contra um alvo, tambÃ©m tirado de uma fila. 

Um alvo deve se tornar mais fraco a cada vez que for atingido por um passarinho, atÃ© que seja destruÃ­do. O nÃºmero de vezes que o alvo deve ser atingido vai variar conforme seu tipo. Alguns alvos podem ser destruÃ­dos com apenas um golpe, enquanto outros podem precisar de mais.

Se um alvo apenas enfraquecer, mas nÃ£o for destruÃ­do, ele deve voltar para a fila de alvos. JÃ¡ os passarinhos sÃ£o atirados apenas uma vez, e nÃ£o voltam para a fila. 

VocÃª deve desenvolver um programa demonstrando o funcionamento dos conceitos aprendidos na disciplina de POO, com atenÃ§Ã£o especial para:
•HeranÃ§a;
•Polimorfismo;
•Interfaces;
•ColeÃ§Ãµes.

O programa nÃ£o deve ter interface grÃ¡fica. Para demonstrar o funcionamento da simulaÃ§Ã£o, use apenas mensagens no console, escritas por meio de System.out. A saÃ­da de seu programa deve ser algo como:
Iniciando: 10 passarinhos, 3 alvos
Passarinho Amarelo atinge Porco Bigode - Queda de forÃ§a: 100 -> 60
Passarinho Vermelho atinge Porco Comum - Queda de forÃ§a: 60 -> 0, porco morto.
Passarinho Branco atinge Porco Bigode - Queda de forÃ§a: 100 -> 0, porco morto.
Passarinho Vermelho atinge Pedra - Pedra destruÃ­da.
Passarinhos venceram.


Se a fila de passarinhos terminar e ainda houver algum alvo na fila de alvos, os passarinhos perdem. Se todos os alvos forem destruÃ­dos, os passarinhos vencem (mesmo que nÃ£o haja mais passarinhos na fila).

Entrega

O projeto pode ser desenvolvido em duplas. NÃ£o se esqueÃ§a de preencher os nomes dos alunos no arquivo misc/info.txt, contido neste projeto.

O cÃ³digo-fonte deve ser entregue por meio do GitHub, como de costume. Apenas um dos alunos precisa publicar o cÃ³digo.

AlÃ©m do cÃ³digo-fonte, vocÃªs devem gravar um vÃ­deo, capturando a tela do Eclipse, como Ã© feito nas aulas, e explicando o funcionamento do seu programa. Mostre o programa em execuÃ§Ã£o. O vÃ­deo deve ser enviado para o YouTube e deve ser classificado como "nÃ£o listado". A URL de acesso ao vÃ­deo deve ser informada no arquivo misc/info.txt. Para captura de tela, recomenda-se o uso do software OBS Studio (Veja um tutorial aqui).

Prazo

O projeto deve ser entregue atÃ© o dia 18/10/2020.
