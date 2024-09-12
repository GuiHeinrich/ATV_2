package atv_2;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Atendente_Livraria {
    public static void main(String[] args) {

        Livraria cultura = new Livraria();

        String a, b, c, d, e, i;
        int f, g;
        double h;

        boolean codigoValido = false;
        while (!codigoValido) {
            JOptionPane.showMessageDialog(null, "Categorias: \n    Digite 1 para Romance. \n    Digite 2 para Esportes. \n    Digite 3 para Aventuras");
            a = JOptionPane.showInputDialog(null, "Código");

            if (a.equals("1") || a.equals("2") || a.equals("3")) {
                codigoValido = true;
                codigoValido = true;

                b = JOptionPane.showInputDialog(null, "Editora");
                c = JOptionPane.showInputDialog(null, "Autor");
                d = JOptionPane.showInputDialog(null, "Livro");
                e = JOptionPane.showInputDialog(null, "Quantidade");
                i = JOptionPane.showInputDialog(null, "Preço");

                f = Integer.parseInt(a);
                g = Integer.parseInt(e);
                h = Double.parseDouble(i);

                cultura.editora = b;
                cultura.autor = c;
                cultura.livro = d;
                cultura.quant = g;
                cultura.preco = h;

                cultura.Informa_Livro(f);

            } else {
                JOptionPane.showMessageDialog(null, "Código não corresponde a nenhuma das categorias de livros");
            }
        }
    }
}