package ibgecode;

import javax.swing.JOptionPane;

public class JavaApplication3 {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas que serão entrevistadas: "));
            String[] nome = new String[N];
            String[] sexo = new String[N];
            int[] idade = new int[N];
            
            int opcao = 0, contMasc=0, contFem=0;
            
            while (opcao != 3){
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Inserir dados \n2 - Ver o resultado \n3 - Para sair"));

                switch (opcao) {
                    case 1:
                        for (int i = 0; i<N; i++){
                            nome[i]=JOptionPane.showInputDialog("Digite o nome: ");
                            sexo[i]=JOptionPane.showInputDialog("Digite o sexo: ");
                            idade[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
                            if ((sexo[i].equals("Masculino")) && (idade[i]>=18)){
                                contMasc++;
                            }
                            if ((sexo[i].equals("Feminino")) && (idade[i]>=20) && (idade[i]<=30)){
                                contFem++;
                            }
                        }
                    break;
                    case 2:
                        double percentualMasc = (double) contMasc / N * 100;
                        double percentualFem = (double) contFem / N * 100;
                        JOptionPane.showMessageDialog(null, "Percentual masculino com idade maior que 18 anos é: "
                            + percentualMasc + "%\n" + "Percentual feminino com idade entre 20 e 30 anos é: "
                            + percentualFem + "%");
                    break;
                    case 3:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                }
            }
    }
}
