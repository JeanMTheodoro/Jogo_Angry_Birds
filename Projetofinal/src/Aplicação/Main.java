package Aplicação;

import Entidades.Personagens;
import Interfaces.CarregarPersonagens;
import Interfaces.RemocaoPersonagensFilas;
import utils.CriarPersonagens;

import java.util.LinkedList;
import java.util.Queue;

public class Main implements CarregarPersonagens {


    public static void main(String[] args) {
        System.out.println("Hello, final project!");

        boolean lifeGame = false;

        int scoreForca = 0;
        Queue<Personagens> filaAlvo = new LinkedList<>();
        filaAlvo.addAll(recuperarDadosAlvo());

        Queue<Personagens> filaBird = new LinkedList<>();
        filaBird.addAll(recuperarDadosBird());

        System.out.println("Iniciando jogo: " + filaBird.size() +
                " Passaros e " + filaAlvo.size() +
                "  Alvo");


        do {

            scoreForca = filaAlvo.peek().getScore() - filaBird.peek().getScore();


            if (scoreForca <= 0) {

                switch (filaAlvo.peek().getName()){
                    case "Porco bigode":
                        System.out.println(filaBird.peek().getName() +
                                " atinge " +
                                filaAlvo.peek().getName() +
                                "- Queda de Força = " +
                                filaAlvo.peek().getScore() + " -> " + "0, porco morto");
                        break;

                    case "Pau":
                        System.out.println(filaBird.peek().getName() +
                                " atinge " +
                                filaAlvo.peek().getName() + "-" + filaAlvo.peek().getName()
                                +" destruída");
                        break;

                    case "Porco Comum":
                        System.out.println(filaBird.peek().getName() +
                                " atinge " +
                                filaAlvo.peek().getName() +
                                "- Queda de Força = " +
                                filaAlvo.peek().getScore() + " -> " + "0, porco morto");
                        break;
                }


                filaBird.remove();
                filaAlvo.remove();

                if (filaAlvo.size() == 0 && filaBird.size() > 0 || filaAlvo.isEmpty() && filaBird.size() > 0 || filaAlvo.size() == 0 && filaBird.size() == 0) {
                    lifeGame = true;
                    System.out.println("passaro ganhou");
                } else if (filaBird.size() == 0 && filaAlvo.size() > 0 || filaBird.isEmpty() && filaAlvo.size() > 0) {
                    lifeGame = true;
                    System.out.println("passaro perdeu");
                }

                continue;

            } else {

                System.out.println(filaBird.peek().getName() +
                        " atinge " +
                        filaAlvo.peek().getName() +
                        "- Queda de Força = " +
                        filaAlvo.peek().getScore() + "->" + scoreForca);

                filaAlvo.peek().setScore(scoreForca);
                filaAlvo.peek().setName("Porco Comum");
                filaBird.remove();

                if (filaAlvo.size() == 0 && filaBird.size() > 0 || filaAlvo.isEmpty() && filaBird.size() > 0 || filaAlvo.size() == 0 && filaBird.size() == 0) {
                    lifeGame = true;
                    System.out.println("passaro ganhou");
                } else if (filaBird.size() == 0 && filaAlvo.size() > 0 || filaBird.isEmpty() && filaAlvo.size() > 0) {
                    lifeGame = true;
                    System.out.println("passaro perdeu");
                }
            }


        } while (lifeGame != true);


    }


    private static Queue<Personagens> recuperarDadosBird() {
        return CriarPersonagens.embaralhaBird();
    }


    private static Queue<Personagens> recuperarDadosAlvo() {
        return (CriarPersonagens.embaralhar());
    }


    @Override
    public void CarregarPersonagens(String menssage) {
        System.out.println(menssage);
    }


}
