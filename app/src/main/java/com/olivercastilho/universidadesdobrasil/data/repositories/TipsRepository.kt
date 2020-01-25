package com.olivercastilho.universidadesdobrasil.data.repositories

import com.olivercastilho.universidadesdobrasil.data.models.Tip

class TipsRepository {
    companion object Tips {
        val all = arrayListOf(
            Tip(
                "1. Monte um cronograma de estudos",
                "Defina horários e divida as matérias para que todo o conteúdo seja estudado até o dia da prova. Feito isso, é importante que você mantenha o foco, a disciplina e não se sabote."
            ),
            Tip(
                "2. Pratique com provas passadas",
                "Se você já escolheu o curso e a universidade, pode acessar online as provas anteriores. O ideal é que tente resolver as questões no mesmo período de tempo que terá no dia do exame. Faça isso sem distrações e sem consultar livros, internet ou calculadora."
            ),
            Tip(
                "3. Utilize a internet a seu favor",
                "Deixe um pouco de lado as redes sociais e utilize a internet para aprimorar seus estudos para o vestibular. No YouTube, por exemplo, é possível encontrar videoaulas gratuitas. Além disso, há inúmeros materiais disponíveis, assim como testes, resumos e dicas de estudo."
            ),
            Tip(
                "4. Mantenha-se atualizado",
                "O vestibular avalia se o estudante está atualizado sobre o que acontece no mundo. Portanto, assista aos telejornais, leia sobre os assuntos mais relevantes e busque ouvir opiniões, mesmo aquelas contrárias às suas."
            ),
            Tip(
                "5. Respeite seus limites",
                "Estudar é importante, mas descansar também é essencial. Por isso, nada de virar a noite ou passar o dia todo estudando sem intervalos. Afinal, se seu corpo estiver cansado, chega uma hora que você não consegue mais absorver o conteúdo das disciplinas. Faça pausas durante os estudos e procure dormir bem à noite."
            ),
            Tip(
                "6. Descanse no dia anterior",
                "Evite dormir tarde na véspera do vestibular. O ideal é que você descanse e chegue com muita disposição para fazer a prova. Evite sair para a balada, ficar até tarde na televisão ou no computador. Estudar na véspera do exame também não vai ajudar e pode até atrapalhar seu rendimento."
            ),
            Tip(
                "7. Confira seu material e documentos",
                "No dia anterior ao vestibular, reúna tudo que o você precisa levar. Lembre-se de verificar no edital quais documentos são aceitos e se há alguma exigência quanto ao material. Atente-se para isso e não deixe que uma distração o impeça de fazer a prova."
            ),
            Tip(
                "8. Chegue cedo ao local",
                "O vestibular é sempre muito rigoroso com os horários marcados. Isso significa que, se você se atrasar, pode não conseguir entrar no local da prova. Sendo assim, procure chegar cedo. O ideal é se programar para chegar com, pelo menos, uma hora de antecedência."
            ),
            Tip(
                "9. Leve água e algo para comer",
                "As provas de vestibular normalmente são extensas e você pode sentir fome ou sede. Por isso, lembre-se de levar uma garrafa de água e um lanchinho. Mas evite alimentos barulhentos, com cheiro forte ou que façam sujeira. Isso pode atrapalhar você e os outros candidatos."
            ),
            Tip(
                "10. Mantenha a calma e administre seu tempo",
                "O vestibular costuma durar de 4 a 5 horas. Mas você precisa administrar bem esse tempo para conseguir fazer toda a prova. Por isso, mantenha a calma e evite distrações. Separe as questões em blocos e, entre um e outro, faça uma pequena pausa de 5 minutos. Alongue as pernas, beba água e volte a responder as questões."
            )
        )
    }
}
