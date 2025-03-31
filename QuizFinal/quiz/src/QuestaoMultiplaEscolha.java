public class QuestaoMultiplaEscolha extends Questao {
    private String[] opcoes;

    public QuestaoMultiplaEscolha(String pergunta, String respostaCorreta, String[] opcoes) {
        super(pergunta, respostaCorreta);
        this.opcoes = opcoes;
    }

    @Override
    public void exibirQuestao() {
        super.exibirQuestao();
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }
    }
}