/*Construa um programa que solicite o código e o telefone de um funcionário.
Deve ser construído um método para mostrar na tela o código e o telefone desse
funcionário. Deve ser utilizado o controle de exceção e padrão MVC.*/

package Funcionario;

import javax.swing.JOptionPane;
public class Main {
    public static void main(String [] args){
        try{
            Func03 func03 = new Func03();
            Func01 func01 = new Func01();
            
            func03.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código")));
            func03.setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Informe o telefone")));
        
            JOptionPane.showMessageDialog(null, func01.mostrarCodigoTel(func03));
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erro no sistema: "+ e.getMessage());
        }
    }
}
