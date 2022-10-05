package desafio_metodo;

import java.util.Scanner;

public class ControleRemoto {
    static SmartTv smartTv = new SmartTv();
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {


        boolean saida = false;
        while (!saida) {

            if (!smartTv.ligado) {
                System.out.println("\nA Tv está desligada!");

            } else {
                System.out.println("\nA Tv está ligada.");
                System.out.println("Canal atual: " + smartTv.canal);
                System.out.println("Volume atual: " + smartTv.volume);

            }

            System.out.println("\nO que deseja fazer?");
            System.out.println("""
                    [ 1 ] Ligar Tv
                    [ 2 ] Mudar canal
                    [ 3 ] mudar volume
                    [ 0 ] Sair""");
            int botao = teclado.nextInt();
            if (!smartTv.ligado && botao > 1) {
                System.out.println("Erro, Ligue a Televisão Primeiro!!!");
            } else {
                switch (botao) {
                    case 0:
                        System.out.println("Até a proxima!");
                        saida = true;
                        break;
                    case 1:
                        if (!smartTv.ligado) {
                            smartTv.ligar();
                        } else {
                            smartTv.desligar();
                        }
                        break;
                    case 2:
                        mudarCanal();
                        break;
                    case 3:
                        mudarVolume();
                        break;
                    default:
                        System.out.println("Erro, digite um botão valido!");
                        break;
                }
            }

        }

        teclado.close();

    }

    private static void mudarVolume() {
        int botao;
        do {
            System.out.println("Volume Atual: " + smartTv.volume);
            System.out.println("""
                                Você quer aumentar ou diminuir o volume?
                                [ 1 ] Aumentar
                                [ 2 ] Diminuir
                                [ 0 ] Voltar""");
            botao = teclado.nextInt();
            if (botao == 1) {
                smartTv.aumentarVolume();
            } else if (botao == 2) {
                smartTv.diminuirVolume();
            } else {
                System.out.println("erro, botão invalido");
            }
        } while (botao != 0);
    }

    public static void mudarCanal(){
        int botao;
        do {
            System.out.println("Canal Atual: " + smartTv.canal);
            System.out.println("""
                    Você quer subir, descer ou escolher o canal?
                    [ 1 ] Subir
                    [ 2 ] Descer
                    [ 3 ] Escolher Canal
                    [ 0 ] Voltar""");
            botao = teclado.nextInt();
            if (botao == 1) {
                smartTv.subirCanal();
            } else if (botao == 2) {
                smartTv.descerCanal();
            } else if (botao == 3) {
                System.out.println("Para qual canal? ");
                int canal = teclado.nextInt();
                smartTv.pularCanal(canal);
            } else System.out.println("Botão Invalido");
        } while (botao != 0);
    }


}
