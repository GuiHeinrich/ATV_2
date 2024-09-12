package atv_2;

import javax.swing.*;

public class Livraria {
    String editora;
    String autor;
    String livro;
    int quant;
    double preco;

    public void Informa_Livro(int codigo){
        switch (codigo){
            case 1:
                JOptionPane.showMessageDialog(null,"Categoria Romance"
                        + "\n Livro: "+ livro
                        + "\n Editora: " + editora
                        + "\n Autor: "+ autor
                        + "\n Quantidade: " + quant
                        + "\n Preço: R$" + preco, "", JOptionPane.PLAIN_MESSAGE);
                break;

                case 2:
                JOptionPane.showMessageDialog(null,"Categoria Esportes"
                        + "\n Livro: "+ livro
                        + "\n Editora: " + editora
                        + "\n Autor: "+ autor
                        + "\n Quantidade: " + quant
                        + "\n Preço: R$" + preco, "", JOptionPane.PLAIN_MESSAGE);
                break;

                case 3:
                JOptionPane.showMessageDialog(null,"Categoria Aventura"
                        + "\n Livro: "+ livro
                        + "\n Editora: " + editora
                        + "\n Autor: "+ autor
                        + "\n Quantidade: " + quant
                        + "\n Preço: R$" + preco, "", JOptionPane.PLAIN_MESSAGE);
                break;

        }
    }
}
