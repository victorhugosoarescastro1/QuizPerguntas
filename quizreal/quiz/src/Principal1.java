 public class Principal1 {
     public static void main(String[] args) {

            int acertos = 0;
            int erros = 0;

        System.out.println(
                    "||=========================================================================================||");

        System.out.println("Faculdade: Centro Universitário - Alfredo Nasser");
        System.out.println("Curso: Engenharia de Software");
        System.out.println("Turma: ESNB2");
        System.out.println("Aluno: Victor Hugo Soares Castro");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Bem-vindo ao quiz de 15 perguntas sobre o tema 'Consumo'!");
        System.out.println("Você responderá a 15 perguntas de múltipla escolha sobre consumo.");
        System.out.println();

                    Questao[] questoes = new Questao[15];

        questoes[0] = new Questao();
        questoes[0].pergunta = "1- Qual o maior planeta do Sistema Solar?: ";
        questoes[0].opcaoA = "a - Jupiter ";
        questoes[0].opcaoB = "b - Marte";
        questoes[0].opcaoC = "c - Mercúrio";
        questoes[0].opcaoD = "d - Terra";
        questoes[0].opcaoE = "e - Urano";
        questoes[0].correta = "a";

        questoes[1] = new Questao();
        questoes[1].pergunta = "2 - Quantos planetas existem no Sistema Solar?: ";
        questoes[1].opcaoA = "a - 11";
        questoes[1].opcaoB = "b - 12";
        questoes[1].opcaoC = "c - 5";
        questoes[1].opcaoD = "d - 7";
        questoes[1].opcaoE = "e - 8";
        questoes[1].correta = "e";

        questoes[2] = new Questao();
        questoes[2].pergunta = "3 - Qual a estrela presente no Sistema Solar?: ";
        questoes[2].opcaoA = "a - Lua";
        questoes[2].opcaoB = "b - Sol";
        questoes[2].opcaoC = "c - Buraco Negro";
        questoes[2].opcaoD = "d - Aurora Boreal";
        questoes[2].opcaoE = "e - BON 67";
        questoes[2].correta = "b";

        questoes[3] = new Questao();
        questoes[3].pergunta = "4 - Quantas estrelas existem no Universo Observável?: ";
        questoes[3].opcaoA = "a - 1 bilhão 600 milhoes 934 mil";
        questoes[3].opcaoB = "b - 23 milhões e 500 mil ";
        questoes[3].opcaoC = "c - 27 elevado a sétima pontência ";
        questoes[3].opcaoD = "d - 498 milhões ";
        questoes[3].opcaoE = "e - 7 × 10 elevado a 22";
        questoes[3].correta = "e";

        questoes[4] = new Questao();
        questoes[4].pergunta = "5 - Quais são os nomes corretos das fases da lua?: ";
        questoes[4].opcaoA = "a - Nova, Crescente, Cheia e Minguante.";
        questoes[4].opcaoB = "b - Velha, Decrescente, Vazia e Minguante.";
        questoes[4].opcaoC = "c - Nova, Crescente, Vazia e Míngua.";
        questoes[4]. opcaoD = "d - Nova, Crescente, Cheia e Minguante.";
        questoes[4].opcaoE = "e - Velha, Crescente, Cheia e Minguante.";
        questoes[4].correta = "d";

        questoes[5] = new Questao();
        questoes[5].pergunta = "6 - A crosta, o manto e o núcleo são camadas de qual planeta?: ";
        questoes[5].opcaoA = "a - Marte.";
        questoes[5].opcaoB = "b - Saturno";
        questoes[5].opcaoC = "c - Sol";
        questoes[5].opcaoD = "d - Terra";
        questoes[5].opcaoE = "e - Mercúrio";
        questoes[5].correta = "d";

        questoes[6] = new Questao();
        questoes[6].pergunta = "7 - Qual o nome dado à morte de uma estrela? ";
        questoes[6].opcaoA = "a - Morte Nuclear";
        questoes[6].opcaoB = "b - Explosão Vermelha";
        questoes[6].opcaoC = "c - SuperNova";
        questoes[6].opcaoD = "d - Império";
        questoes[6].opcaoE = "e - HiperEstrela";
        questoes[6].correta = "c";

        questoes[7] = new Questao();
        questoes[7].pergunta = "8 - Qual é o nome da primeira missão de viagem à Lua? ";
        questoes[7].opcaoA = "a - Apollo 11.";
        questoes[7].opcaoB = "b - Operação Espacial.";
        questoes[7].opcaoC = "c - Corrida Armamentista.";
        questoes[7].opcaoD = "d - Apolo 73.";
        questoes[7].opcaoE = "e - Novo Horizonte.";
        questoes[7].correta = "a";

        questoes[8] = new Questao();
        questoes[8].pergunta = "9 - Qual foi o primeiro Homem a pisar na Lua?: ";
        questoes[8].opcaoA = "a - Michael Collins.";
        questoes[8].opcaoB = "b - Sérgio Sacani.";
        questoes[8].opcaoC = "c - Vinicius Júnior";
        questoes[8].opcaoD = "d - Edwin 'Buzz' Aldrin.";
        questoes[8].opcaoE = "e - Neil Armstrong.";
        questoes[8].correta = "e";

        questoes[9] = new Questao();
        questoes[9].pergunta = "10 - Qual a principal composição de um cometa?: ";
        questoes[9].opcaoA = "a - Poeira cósmica, enxofre, calcário, cálcio e metais sedimentar.";
        questoes[9].opcaoB = "b - Hidrogênio, hélio, metais sólidos e ozônio.";
        questoes[9].opcaoC = "c - Rochas, ouro, silício e gelo.";
        questoes[9].opcaoD = "d - Gelo, poeira cósmica, fragmentos rochosos e compostos orgânicos.";
        questoes[9].opcaoE = "e - Poeira cósmica, enxofre e metais líquidos.";
        questoes[9].correta = "d";

        questoes[10] = new Questao();
        questoes[10].pergunta = "11 - Quais destes planetas do sistema solar podem ter chuvas de diamantes?: ";
        questoes[10].opcaoA = "a - Vênus, Marte, Júpiter e Urano.";
        questoes[10].opcaoB = "b - Júpiter, Saturno, Urano e Netuno.";
        questoes[10].opcaoC = "c - Mercúrio e Vênus.";
        questoes[10].opcaoD = "d - Netuno e Marte.";
        questoes[10].opcaoE = "e - Urano, Netuno, Júpiter.";
        questoes[10].correta = "b";

        questoes[11] = new Questao();
        questoes[11].pergunta = "12 - Quais os fatores que influenciam para que os planetas sejam redondos?: ";
        questoes[11].opcaoA = "a - Composição do planeta e a força da gravidade";
        questoes[11].opcaoB = "b - Velha, Decrescente, Vazia e Minguante.";
        questoes[11].opcaoC = "c - Período de rotação do planeta e vácuo.";
        questoes[11].opcaoD = "d - Órbita de translação e sedimentar do planeta";
        questoes[11].opcaoE = "e - Força da atração da gravidade e massa do planeta";
        questoes[11].correta = "e";

        questoes[12] = new Questao();
        questoes[12].pergunta = "13 - O Sol é?: ";
        questoes[12].opcaoA = "a - Estrela velha.";
        questoes[12].opcaoB = "b - Estrela de meia idade.";
        questoes[12].opcaoC = "c - Estrela Nova.";
        questoes[12].opcaoD = "d - Foto Estrela.";
        questoes[12].opcaoE = "e - HiperNova.";
        questoes[12].correta = "b";

        questoes[13] = new Questao();
        questoes[13].pergunta = "14 - Qual é a velocidade da luz, aproximadamente?: ";
        questoes[13].opcaoA = "a - 500.000 km/s.";
        questoes[13].opcaoB = "b - 300.000 km/s.";
        questoes[13].opcaoC = "c - 500.000 km/h.";
        questoes[13].opcaoD = "d - 1.000.000 km/h.";
        questoes[13].opcaoE = "e - N/D.";
        questoes[13].correta = "b";

        questoes[14] = new Questao();
        questoes[14].pergunta = "15 - Qual é a maior estrela já encontrada, em tamanho?: ";
        questoes[14].opcaoA = "a - LBV 1806-20 (Sagitário).";
        questoes[14].opcaoB = "b - R136a1 (Nebulosa da Tarântula).";
        questoes[14].opcaoC = "c - VY Canis Majoris (Cão Maior).";
        questoes[14].opcaoD = "d - Antares (Escorpião).";
        questoes[14].opcaoE = "e - Sol.";
        questoes[14].correta = "c";

        for (Questao questao : questoes) {
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta();
            if (questao.isCorreta(resposta)) {
                acertos++;
            } else {
                erros++;
            }
        }

        double porcentagem = (acertos / 15.0) * 100;


        System.out.println("||===========================================================||");

        System.out.println("Você acertou " + acertos + " perguntas.");
        System.out.println("Você errou " + erros + " perguntas.");
        System.out.printf("Sua porcentagem de acertos é: %.2f%%\n", porcentagem);

        System.out.println("||===========================================================||");
    }
}