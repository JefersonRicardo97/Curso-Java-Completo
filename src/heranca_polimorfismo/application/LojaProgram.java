    package heranca_polimorfismo.application;

    import heranca_polimorfismo.entities.Produto;
    import heranca_polimorfismo.entities.ProdutoImportado;
    import heranca_polimorfismo.entities.ProdutoUsado;

    import java.text.ParseException;
    import java.util.*;

    import static heranca_polimorfismo.entities.ProdutoUsado.sdf;

    public class LojaProgram {
        public static void main(String[] args) throws ParseException {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            List<Produto> list = new ArrayList<>();
            System.out.print("Digite o números de produtos: ");
            Integer n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("Dados do Produto" + (i + 1));
                System.out.println("Comum,Usado ou Importado (c/u/i)");
                char ch = sc.nextLine().charAt(0);
                System.out.print("Nome :");
                String nome = sc.nextLine();
                System.out.print("Preço :");
                Double preco = Double.parseDouble(sc.nextLine());
                if (ch == 'i') {
                    System.out.print("Taxa de Alfandega : ");
                    Double taxaAlfandega = Double.parseDouble(sc.nextLine());
                    list.add(new ProdutoImportado(nome, preco, taxaAlfandega));
                } else if (ch == 'u') {
                    System.out.println("Data de Fabricação (dd/mm/aaaa) :");
                    String dataTexto = sc.nextLine();
                    Date dataDeFabricacao = sdf.parse(dataTexto);
                    list.add(new ProdutoUsado(nome, preco, dataDeFabricacao));
                } else {
                    list.add(new Produto(nome, preco));
                }

            }
            for (Produto produto : list) {
                System.out.println(produto.etiquetaDePreco());
            }


            sc.close();
        }
    }
