package com.universidadesdobrasil.data.repositories

import android.text.Html
import com.universidadesdobrasil.data.models.Step
import com.universidadesdobrasil.data.models.Tip

class TipsRepository {
    companion object Tips {
        val all = arrayListOf(
            Tip(
                "Como estudar para o exame de vestibular",
                "A preparação para o vestibular é tão importante quanto o dia do exame. As 5 primeiras dicas devem ajudar você a aprender para esse momento.",
                arrayListOf(
                    Step(
                        "1. Estabelecer um cronograma de estudo",
                        "Defina horários e divida os assuntos para que todo o conteúdo seja estudado até o dia do teste. Feito isso, é importante manter o foco, a disciplina e não sabotar a si mesmo."
                    ),
                    Step(
                        "2. Pratique com testes anteriores",
                        "Se você já escolheu o curso e a universidade, pode acessar os exames anteriores on-line. Idealmente, você deve tentar resolver as perguntas na mesma quantidade de tempo que terá no dia do exame. Faça isso sem distrações e sem consultar livros, internet ou calculadora."
                    ),
                    Step(
                        "3. Use a internet para sua vantagem",
                        "Deixe as mídias sociais um pouco de lado e use a Internet para melhorar seus estudos para o vestibular. No YouTube, por exemplo, você pode encontrar aulas de vídeo gratuitas. Além disso, existem inúmeros materiais disponíveis, além de testes, resumos e dicas de estudo."
                    ),
                    Step(
                        "4. Atualize-se sempre",
                        "O exame de admissão avalia se o aluno está atualizado sobre o que acontece no mundo. Portanto, assista às notícias, leia sobre os assuntos mais relevantes e procure ouvir opiniões, mesmo as contrárias às suas."
                    ),
                    Step(
                        "5. Respeite seus limites",
                        "Estudar é importante, mas descansar também é essencial. Portanto, não há necessidade de passar a noite ou passar o dia inteiro estudando sem interrupções. Afinal, se seu corpo está cansado, chega um momento em que você não consegue mais absorver o conteúdo dos assuntos. Faça pausas durante os estudos e tente dormir bem à noite."
                    )
                )
            ),
            Tip(
                "Como se preparar para a prova",
                "O dia do exame de admissão é cercado por muita ansiedade e expectativa. Mas você não pode deixar nada disso atrapalhar seu desempenho. Então, aqui estão 5 dicas para o dia anterior ou para o dia da prova.",
                arrayListOf(
                    Step(
                        "1. Descanse no dia anterior",
                        "Evite dormir até tarde no dia anterior ao exame de admissão. O ideal é que você descanse e chegue muito disposto a fazer o teste. Evite ir ao clube, ficar até tarde na televisão ou no computador. Estudar no dia anterior ao exame também não ajudará e pode até prejudicar seu desempenho."
                    ),
                    Step(
                        "2. Verifique seu material e documentos",
                        "No dia anterior ao exame de admissão, colete tudo o que você precisa fazer. Lembre-se de verificar no anúncio quais documentos são aceitos e se há algum requisito em relação ao material. Preste atenção nisso e não deixe que uma distração o impeça de fazer o teste."
                    ),
                    Step(
                        "3. Chegue cedo",
                        "O vestibular é sempre muito rigoroso com os horários programados. Isso significa que, se você se atrasar, poderá não conseguir entrar no local da corrida. Então tente chegar cedo. O ideal é planejar chegar com pelo menos uma hora de antecedência."
                    ),
                    Step(
                        "4. Traga água e algo para comer",
                        "Os exames de admissão geralmente são extensos e você pode sentir fome ou sede. Então lembre-se de trazer uma garrafa de água e um lanche. Mas evite alimentos barulhentos, fedorentos ou sujos. Isso pode atrapalhar você e os outros candidatos."
                    ),
                    Step(
                        "5. Mantenha a calma e gerencie seu tempo",
                        "O exame de admissão geralmente dura de 4 a 5 horas. Mas você precisa gerenciar bem esse tempo para poder fazer todos os testes. Portanto, fique calmo e evite distrações. Separe as perguntas em blocos e, entre elas, faça uma pequena pausa de 5 minutos. Estique as pernas, beba água e responda as perguntas novamente."
                    )
                )
            ),
            Tip(
                "13 dicas para ajudar você a escolher um curso de ensino superior",
                "13 dicas incríveis e muito práticas que podem ajudá-lo a fazer uma autoavaliação, pesquisar melhor sobre as possibilidades disponíveis e descobrir como escolher um curso superior. Pronto para tomar notas? Então, vamos lá!",
                arrayListOf(
                    Step(
                        "1. Analise as suas preferências",
                        "O primeiro passo para tomar uma decisão melhor em relação à sua carreira profissional é refletir profundamente sobre quais áreas do conhecimento você mais gosta. \n\n" +
                                "Aqui, recomendamos que você faça um pouco de exercício e pense nas matérias abordadas durante o ensino médio: você faz parte da equipe de quem gosta de matemática e física ou é um grande fã das aulas de história e literatura? Você conta os dias para treinar suas habilidades nas aulas de inglês ou espanhol ou prefere os exercícios no laboratório de ciências? \n\n" +
                                "A partir dessa análise, será mais fácil ver, pelo menos, qual das principais áreas do conhecimento - humana, exata ou biológica - se encaixa melhor no seu perfil pessoal. E então, com isso bem definido, você poderá pelo menos eliminar muitas das possibilidades e direcionar melhor suas opções."
                    ),
                    Step(
                        "2. Avalie suas habilidades",
                        "Identificar quais são suas habilidades pessoais é um passo tão importante na definição de qual curso da faculdade se encaixa melhor em seus objetivos quanto em descobrir quais são suas preferências. \n\n" +
                                "Portanto, quando se trata de “classificar” os cursos de graduação que mais lhe interessam, é preciso ir além do gosto pessoal: você deve considerar quais são seus talentos, o que faz bem, suas características positivas e também negativas - afinal, o ideal é investir em seus pontos fortes. \n\n" +
                                "Na maioria das vezes, as habilidades pessoais correspondem às nossas preferências, no entanto, nem sempre é assim. Pode acontecer que você goste das aulas práticas de Química no laboratório, por exemplo, mas tenha muita dificuldade em lidar com fórmulas e cálculos. \n\n" +
                                "Nesse ponto, uma boa dica é pensar com cuidado, se não valer mais a pena se dedicar a uma área na qual você acha mais fácil - e, é claro, isso também lhe dá prazer. Afinal, você se dedicará totalmente a ela por várias horas do dia."
                    ),
                    Step(
                        "3. Pense em suas expectativas e liste suas prioridades",
                        "Outro ponto importante a ser considerado ao escolher seu curso de graduação é o que você planeja para o futuro. Para isso, é importante identificar quais são suas expectativas de vida e o que você tem como prioridade - não apenas naquele momento, mas também em alguns anos, a médio e longo prazo. \n\n" +
                                "Um bom exercício para obter essas respostas é se perguntar qual é o padrão de vida que você deseja ter. Você pretende ganhar dinheiro e desfrutar de uma vida luxuosa? Ou você se importa pouco com bens materiais e só quer conforto e alguma estabilidade? Você está disposto a sacrificar suas preferências pessoais por uma carreira com maior retorno financeiro? \n\n" +
                                "É necessário lembrar que, enquanto algumas profissões são mais valorizadas no mercado e pagam salários mais altos, outras possuem rotinas mais calmas e flexíveis. Manter isso em mente pode fazer toda a diferença e contribuir diretamente para sua satisfação pessoal."
                    ),
                    Step(
                        "4. Conheça cada curso em profundidade",
                        "Nesse momento, você já deve ter selecionado algumas opções para os cursos de graduação ou, pelo menos, decidido entre qualquer uma das áreas de conhecimento disponíveis, certo? Chegou a hora de tirar o foco de si e estudar cada possibilidade de maneira prática. \n\n" +
                                "A internet está cheia de informações sobre os mais diversos cursos - apenas uma boa pesquisa nos grandes mecanismos de busca para encontrar sites e blogs com detalhes de cada um, como duração, áreas de atividade e currículo com as disciplinas oferecidas em cada um. semestre. \n\n" +
                                "Outra boa maneira de descobrir mais sobre as opções de graduação é participar de feiras, oficinas de carreira e mercado de trabalho ou eventos promovidos pelas próprias instituições de ensino. Nessas atividades, você pode descobrir informações importantes sobre os cursos, além de conhecer a infraestrutura da faculdade. \n\n" +
                                "Além disso, você poderá assistir a palestras ministradas pelos coordenadores e professores dos vários cursos, conhecer profissionais que já trabalham na área, responder suas perguntas diretamente com eles e aprender mais sobre as propostas e projetos acadêmicos oferecidos."
                    ),
                    Step(
                        "5. Pesquise em detalhes sobre instituições de ensino",
                        "A escolha de um diploma universitário também envolve a opção da faculdade ideal para o seu treinamento, pois o ideal é garantir uma qualificação que realmente corresponda às suas necessidades. E, para ajudá-lo a fazer uma escolha mais consciente, a seguir destacaremos alguns itens importantes que devem ser cuidadosamente observados: \n\n" +
                                Html.fromHtml(
                                    "&#8226; Selo de aprovação do MEC; <br>" +
                                            "&#8226; Indicadores de qualidade; <br>" +
                                            "&#8226; Qualificação do corpo docente; <br>" +
                                            "&#8226; Grade curricular; <br>" +
                                            "&#8226; Atividades extracurriculares; <br>" +
                                            "&#8226; Bolsas de estudo ou financiamentos estudantis; <br>" +
                                            "&#8226; Modalidades de ensino."
                                )
                    ),
                    Step(
                        "6. Estude sobre o mercado de trabalho",
                        "Como mencionamos no tópico anterior, a escolha do curso ideal não se baseia apenas no gosto pessoal. Questões práticas também devem ser consideradas, pois o estado do mercado de trabalho tem muita influência. \n\n" +
                                "Neste tópico, a Internet também é um bom aliado, você pode descobrir quais são as perspectivas do campo profissional que pretende escolher, quais são os requisitos para os profissionais, a média de horas de trabalho e faixa salarial, onde está a empresa e onde eles são mais procurados. Habilidades."
                    ),
                    Step(
                        "7. Fale com profissionais",
                        "Conhecer a opinião de quem já conhece a área em que pretende entrar é uma excelente estratégia para descobrir algumas informações importantes sobre o mercado de trabalho e o dia a dia corporativo. E aqui, temos três dicas para você: \n\n" +
                                Html.fromHtml(
                                    "&#8226; Converse com ex-alunos do curso que você escolheu, pois eles poderão traçar um paralelo entre o conteúdo aprendido na faculdade, as expectativas e a realidade do mundo profissional; <br>" +
                                            "&#8226; Converse com parentes e conhecidos para esclarecer suas dúvidas e descobrir quais são as vantagens e os principais desafios de suas profissões; <br>" +
                                            "&#8226; Entre em contato com as empresas para passar um dia monitorando de perto a rotina dos profissionais. Aqui, vale a pena consultar os que estão no início de suas carreiras e os que já estão consolidados profissionalmente, pois cada um desses perfis pode fornecer uma perspectiva diferente."
                                )
                    ),
                    Step(
                        "8. Faça exames profissionais",
                        "Uma excelente ferramenta para trabalhar sua autoconsciência e que certamente o ajudará a tomar uma decisão consciente sobre o melhor curso de graduação é um exame profissional. \n\n" +
                                "É importante observar que existem vários testes, muitos dos quais estão disponíveis gratuitamente na Internet ou mesmo em universidades. Portanto, tente fazer uma pesquisa em sites confiáveis, converse com a equipe educacional e pergunte se possível sobre a direção da sua escola. \n\n" +
                                "Outra ótima opção é procurar ajuda de profissionais especializados em aconselhamento de carreira, como psicólogos, psicopatas e treinadores. Eles têm o conhecimento necessário para ajudá-lo a escolher um diploma universitário. \n\n" +
                                "Além disso, eles usam questionários, exercícios e outras várias técnicas para realizar um trabalho mais personalizado e completo, para que você possa identificar com mais clareza suas características pessoais, preferências e habilidades que influenciam a escolha do curso ideal."
                    ),
                    Step(
                        "9. Mentalize a construção de uma carreira de sucesso",
                        "A escolha de um diploma universitário é o início de uma carreira profissional. Na faculdade, os alunos adquirem o conhecimento necessário para o primeiro estágio. Em muitos casos, os estagiários se destacam e são contratados por empresas. \n\n" +
                                "O pré-requisito para isso é que o aluno esteja muito comprometido durante seus estudos, porque precisa adquirir habilidades técnicas para implementá-las no mundo corporativo. Isso se torna mais prático quando você estuda com professores altamente qualificados e infraestrutura de ponta. \n\n" +
                                "Se uma instituição de ensino superior fornece aos alunos condições para ajustar adequadamente o currículo, há uma chance maior de que os alunos tenham um bom desempenho nos testes para recrutar estagiários e estagiários promovidos pelo setor privado. \n\n" +
                                "Muitos estudantes também escolhem concursos públicos para alcançar uma posição de prestígio no mercado de trabalho. Em um cenário de alto desemprego, é sem dúvida uma grande conquista ter um emprego estável com remuneração razoável. \n\n" +
                                "Com um grau muito sólido, o aluno aumenta a probabilidade de ganhar concursos públicos. Isso ocorre porque você está bem informado sobre as principais tendências de carreira geralmente listadas na seleção."
                    ),
                    Step(
                        "10. Foque na estabilidade financeira",
                        "Na maioria dos casos, ao escolher um curso universitário, o aluno já tem uma noção de como continuará sua carreira profissional no futuro. Essa atitude ajuda a consolidar uma posição de prestígio no mercado de trabalho, essencial para a estabilidade financeira. \n\n" +
                                "A conclusão exemplar de um curso em uma instituição educacional de renome ajuda a preparar melhor os alunos para a visita e, em determinadas situações, exceder as expectativas das empresas. Se um profissional obtém bons resultados para uma empresa, as chances de negociar um aumento são maiores. \n\n" +
                                "Em um cenário altamente competitivo, as empresas precisam valorizar os funcionários com produtividade acima da média e aumentar as vendas e a fidelidade do cliente. \n\n" +
                                "Também é importante notar que um aluno, ao assimilar corretamente o conteúdo do curso de graduação, estará mais apto a concluir um curso de pós-graduação e mestrado e doutorado. Quanto mais qualificado o profissional, maior a taxa de empregabilidade e as chances de obter resultados expressivos. \n\n" +
                                "As empresas querem profissionais capazes de assimilar demandas e alcançar objetivos facilmente. Dessa forma, é mais fácil para um funcionário permanecer ativo e ter estabilidade financeira."
                    ),
                    Step(
                        "11. Expanda os laços de amizade",
                        "Obter conhecimento e iniciar uma carreira de sucesso são dois benefícios proporcionados pela graduação, certo? No entanto, a escolha de um diploma universitário também é uma maneira de você se preparar para fazer novos amigos. \n\n" +
                                "Normalmente, as pessoas que escolhem as mesmas profissões têm várias características em comum. Esse aspecto favorece o surgimento de relacionamentos mais duradouros em termos pessoais. É normal, depois da faculdade, ter uma certa distância, mas isso não impede a manutenção dos laços. \n\n" +
                                "Ter amizades duradouras é bom para fortalecer a auto-estima e estar de bom humor. Isso ajuda a ter mais confiança para enfrentar os desafios da vida cotidiana e alcançar um melhor desempenho nas tarefas de âmbito pessoal e profissional. Certamente, vale a pena aproveitar o ensino superior para fazer novos amigos e ter mais opções para trocar experiências."
                    ),
                    Step(
                        "12. Analise a melhor maneira de ingressar em uma faculdade",
                        "Não basta escolher uma faculdade para começar a faculdade; é necessário verificar a melhor maneira de ingressar no curso de graduação. Muitas universidades estaduais e federais estão adotando o Sistema Único de Seleção (Sisu) para selecionar estudantes. Esse mecanismo considera a nota do Exame Nacional do Ensino Médio (Enem). \n\n" +
                                "Hoje, também existem muitas faculdades particulares que levam em consideração o desempenho do Enem para avaliar se os candidatos podem iniciar a vida acadêmica na instituição. Cabe destacar que as instituições de ensino públicas e privadas adotam apenas a primeira fase do Enem no processo de seleção e depois aplicam, por conta própria, testes para verificar o nível de conhecimento dos futuros alunos. \n\n" +
                                "O vestibular tradicional, com provas objetivas e discursivas, ainda é utilizado por algumas instituições de ensino superior. Nesse caso, o próprio corpo docente elabora as perguntas e organiza o processo de seleção. \n\n" +
                                "Outro método para escolher os alunos abrange os exames agendados. Eles permitem que o aluno faça os testes na data que for mais interessante para ele. A intenção é fazer com que os candidatos sofram menos com o cronograma de testes."
                    ),
                    Step(
                        "13. Analisar maneiras de permanecer na faculdade\n",
                        "É muito bom que você tenha em mente como escolher um diploma universitário. No entanto, isso não é suficiente para concluir a graduação dos seus sonhos. Além disso, é crucial pensar sobre a melhor maneira de manter a qualidade de vida durante os estudos. \n\n" +
                                "No caso dos alunos mais carenciados, a possibilidade de cursar o ensino superior aumentou com a criação do Programa Universidade para Todos (Prouni), que oferece bolsas parciais e totais nas faculdades ou universidades participantes, com base na pontuação do Enem. \n\n" +
                                "O Governo Federal também disponibiliza o Fundo de Financiamento a Estudantes do Ensino Superior (Fies), que oferece juros reduzidos aos estudantes para pagarem mensalidades de instituições privadas de ensino superior. \n\n" +
                                "O aluno só começa a pagar as parcelas do empréstimo 18 meses após o término dos cursos. Na Fies, o desempenho no Exame Nacional do Ensino Médio (Enem) também influencia a seleção daqueles que se beneficiarão desse tipo de financiamento."
                    )
                )
            ),
            Tip(
                "5 boas razões para ingressar em um curso de graduação",
                "Para lhe dar mais força neste período de tantas decisões importantes para o seu futuro, listaremos alguns dos principais benefícios que um ensino superior também pode trazer à sua vida profissional e pessoal. Confira!",
                arrayListOf(
                    Step(
                        "1. Aquisição de novos conhecimentos",
                        "É interessante começar com esse tópico, pois, ao longo do seu tempo na universidade, você terá acesso a novos conteúdos e aprendizados que farão toda a diferença quando se destacar em um mercado tão competitivo quanto o atual. Afinal, hoje em dia, conhecimento é poder! \n\n" +
                                "E aqui, não estamos falando apenas das matérias exigidas pelo corpo docente e das leituras obrigatórias dadas pelos professores, ok? \n\n" +
                                "Viver com pessoas que têm histórias de vida, opiniões e origens culturais diferentes é muito importante para exercitar a troca de experiências - na sala de aula e nas aulas práticas em laboratórios ou espaços de convivência -, enriquecer sua experiência e desenvolver habilidades de interação, altamente valorizadas por empresas."
                    ),
                    Step(
                        "2. Expansão do networking",
                        "Desde o primeiro semestre da faculdade, você terá várias oportunidades para expandir sua rede de contatos por meio da interação com colegas e professores durante diferentes disciplinas. \n\n" +
                                "Além disso, você terá boas chances de praticar networking, interagindo com estudantes de outros cursos em disciplinas opcionais e complementares. Você também pode participar de eventos como palestras, oficinas, congressos e feiras de carreira, que são excelentes ocasiões para abordar profissionais renomados e conhecer de perto as grandes empresas."
                    ),
                    Step(
                        "3. Crescimento profissional",
                        "Como já apontamos, a faculdade é um momento de intenso aprendizado e também pode ser a porta de entrada e o primeiro passo para o seu crescimento profissional. \n\n" +
                                "Independentemente de o estágio ser ou não necessário para concluir seu curso, aproveitar esse período para buscar oportunidades de conhecer o cotidiano corporativo na prática é muito importante para o seu treinamento. \n\n" +
                                "Nesse sentido, algumas instituições de ensino também oferecem oportunidades de ingressar em suas empresas juniores, ou empresas modelo, que permitem que os alunos vivenciem a rotina de uma empresa real, com seus aprendizados e desafios, e ainda contam pontos positivos para o currículo."
                    ),
                    Step(
                        "4. Enriquecimento do currículo",
                        "Falando das vantagens do curso, esse é outro ponto que podemos destacar: você pode escolher o seu curso superior e ir para a universidade. \n\n" +
                                "Nesse sentido, se considerarmos que um currículo (CV) é o primeiro contato entre um candidato e um profissional de recursos humanos responsável pelo processo de seleção de processos e recrutamento, o assunto do ensino superior pode ser preenchido como “completo” e isso fará toda a diferença. \n\n" +
                                "Além de poder competir por cargos mais altos e salários mais altos, ter um diploma em um programa também pode levá-lo a um programa de pós-graduação, MBA, mestrado ou doutorado, o que complementará seu ensino superior e fornecerá seu Os perfis de carreira agregam mais valor."
                    ),
                    Step(
                        "5. Crescimento pessoal",
                        "Por último, mas não menos importante, também é interessante enfatizar os benefícios que os cursos de ensino superior podem trazer para o seu treinamento de uma perspectiva pessoal. \n\n" +
                                "O início da vida e carreira universitária, sem dúvida, ajudará você a ganhar novos horizontes e a ampliar seus horizontes, inspirando uma visão mais crítica da situação. Portanto, procure soluções diferenciadas para superar os desafios atuais naquele dia. \n\n" +
                                "Por fim, é possível reconhecer que o treinamento de alta qualidade faz a diferença na vida daqueles que buscam um futuro de carreira de sucesso e desejam expandir suas possibilidades de ação no mercado. Agora tudo o que você precisa fazer é escolher um diploma universitário e estar pronto para conquistar um bom lugar no processo de seleção."
                    )
                )
            )
        )
    }
}
