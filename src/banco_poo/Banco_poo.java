
package banco_poo;

import javax.swing.JOptionPane;

public class Banco_poo {

    public static void main(String[] args) {
        
        Banquinho dados = new Banquinho();
        
        dados.setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua agência: ")));
        dados.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua conta: ")));
        dados.setSenha(JOptionPane.showInputDialog("Digite sua senha: "));
        
        dados.logar(dados.getAgencia(), dados.getNumConta(), dados.getSenha());
        
    }
    
}
