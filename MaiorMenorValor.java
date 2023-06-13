import javax.swing.JOptionPane;

public class maiomenorvetor {

    public static void main(String[] args) {
        double[] numeros = new double[10];
        double MaiorValor = Double.MIN_VALUE, MenorValor = Double.MAX_VALUE;
        int IncidenciaMaior = 0, IncidenciaMenor = 0, opcao = 0;

        while (opcao != 3) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1 - Inserir dados \n2 - Ver o resultado \n3 - Para sair"));

            switch (opcao) {
                case 1:
                    for (int i = 0; i < 10; i++) {
                        numeros[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
                        if (numeros[i] >= MaiorValor) {
                            MaiorValor = numeros[i];
                        }
                        if (numeros[i] <= MenorValor) {
                            MenorValor = numeros[i];
                        }
                    }
                    for (int i = 0; i < 10; i++) {
                        if (MaiorValor == numeros[i]) {
                            IncidenciaMaior++;
                        }
                        if (MenorValor == numeros[i]) {
                            IncidenciaMenor++;
                        }
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "O maior valor é: " + MaiorValor + " e a incidência foi :" + IncidenciaMaior + "\n"
                            + "O menor valor é: " + MenorValor + " e a incidência foi: " + IncidenciaMenor);
                    break;
                case 3:
                    break;
            }
        }
    }
}
