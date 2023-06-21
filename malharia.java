package malharia;

import javax.swing.JOptionPane;

public class Malharia {
    public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas produzidas: "));
            String[] tamanho = new String[N];
            String[] cor = new String[N];
            
            int opcao = 0, contAP = 0, contAM = 0, contAG = 0; 
            int contBP = 0, contBM = 0, contBG = 0; 
            int contVP = 0, contVM = 0, contVG = 0; 
            
            while (opcao != 3) {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1 - Cadastrar\n2 - Resultado\n3 - Sair"));
                
                switch (opcao) {
                    case 1:
                        for (int i=0;i<N; i++){
                            cor[i]=JOptionPane.showInputDialog("Informe a cor: ");
                            while (!(cor[i].equalsIgnoreCase("Amarelo"))&&
                                   !(cor[i].equalsIgnoreCase("Branco"))&&
                                   !(cor[i].equalsIgnoreCase("Vermelho")) ){
                                cor[i]=JOptionPane.showInputDialog("Digite novamente a cor");
                            }
                            tamanho[i]=JOptionPane.showInputDialog("Digite o tamanho da "+(i+1)+"° camiseta");
                            while (!(tamanho[i].equalsIgnoreCase("P"))&&
                                   !(tamanho[i].equalsIgnoreCase("M"))&&
                                   !(tamanho[i].equalsIgnoreCase("G")) ){
                                cor[i]=JOptionPane.showInputDialog("Digite novamente o tamanho");
                            }
                            if(cor[i].equalsIgnoreCase("Amarelo")){
                                if(tamanho[i].equalsIgnoreCase("P")){
                                    contAP++;
                                } else if((tamanho[i].equalsIgnoreCase("M"))){
                                    contAM++;
                                } else{
                                    contAG++;
                                }
                            } else if(cor[i].equalsIgnoreCase("Branco")){
                                if(tamanho[i].equalsIgnoreCase("P")){
                                    contBP++;
                                } else if((tamanho[i].equalsIgnoreCase("M"))){
                                    contBM++;
                                } else{
                                    contBG++;
                                }
                            } else{
                                if(tamanho[i].equalsIgnoreCase("P")){
                                    contVP++;
                                } else if((tamanho[i].equalsIgnoreCase("M"))){
                                    contVM++;
                                } else{
                                    contVG++;
                                }
                            }
                        }
                    break;
                    
                    case 2:
                        JOptionPane.showMessageDialog(null, "Amarelo P: "+contAP+"\nAmarelo M: "+contAM+"\nAmarelo G: "+contAG+"\n"+
                                "Vermelho P: "+contVP+"\nVermelho M: "+contVM+"\nVermelho G: "+contVG+"\n"+
                                "Branco P: "+contBP+"\nBranco M: "+contBM+"\nBranco G: "+contBG);
                    break;
                    
                    case 3:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                }
            }
    }
}
