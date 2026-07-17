    package enumercao_composicao.application;


    import enumercao_composicao.entities.Cliente;
    import enumercao_composicao.entities.ItemPedido;
    import enumercao_composicao.entities.Pedido;
    import enumercao_composicao.entities.ProdutoEx;
    import enumercao_composicao.entities.enums.StatusPedido;

    import java.text.ParseException;
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import java.util.Locale;
    import java.util.Scanner;

    public class ExFixacaoProgram {
        public static void main(String[] args) throws ParseException {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Dados do Cliente :");
            System.out.print("Nome : ");
            String nome = sc.nextLine();
            System.out.print("Email : ");
            String email = sc.nextLine();
            System.out.print("Data de Nascimento : ");
            Date dataNascimento =sdf.parse(sc.nextLine());

            Cliente cliente = new Cliente(nome,email,dataNascimento);
            System.out.println("Dados do Pedido:");
            System.out.print("Status: ");
            StatusPedido status = StatusPedido.valueOf(sc.nextLine());
            Pedido pedido = new Pedido(new Date(), status, cliente);



            System.out.print("Quantos itens para esse pedido : ");
            Integer n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                System.out.println("Digite  o "+(i+1)+" item: " );
                System.out.print("Nome do Produto : ");
                String nomeProduto = sc.nextLine();
                System.out.print("Preço do Produto : ");
                Double precoProduto = Double.parseDouble(sc.nextLine());
                System.out.print("Quantidade do Produto : ");
                Integer qntProduto = Integer.parseInt(sc.nextLine());

                ProdutoEx produto = new ProdutoEx (nomeProduto,precoProduto);
                ItemPedido item = new ItemPedido(produto,precoProduto,qntProduto);
                pedido.addItem(item);
            }
            System.out.println("-----------------------------------------");
            System.out.println("Pedidos : ");
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            System.out.println("momento do pedido: "+sdf2.format(pedido.getMomento()));
            System.out.println("Status do pedido "+ pedido.getStatusPedido());
            System.out.println("Cliente : "+ pedido.getCliente().getNome()+
                    " ( "+sdf.format(pedido.getCliente().getDataNascimento() )+
                    ") - "+pedido.getCliente().getEmail());
        System.out.println("Itens do Pedido");
        for (ItemPedido item : pedido.getItens()){
            System.out.println(item.getProdutoEx().getNome()+
                    " - Quantidade : "+ item.getQuantidade()+
            " - SubTotal : "+ item.subTotal());
        }
            System.out.println("Preço Total : "+ String.format("%.2f",pedido.total()));





            sc.close();
        }
    }