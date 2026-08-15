    package heranca_polimorfismo.entities;

    public class FuncionarioTercerizado extends Funcionario{

        private Double cobrancaAdicional;

        public FuncionarioTercerizado(){
            super( );

        }
        public FuncionarioTercerizado(String nome, Integer horas, Double valorPorHora, Double cobrancaAdicional) {
            super(nome, horas, valorPorHora);
            this.cobrancaAdicional = cobrancaAdicional;
        }

        public Double getCobrancaAdicional() {
            return cobrancaAdicional;
        }

        public void setCobrancaAdicional(Double cobrancaAdicional) {
            this.cobrancaAdicional = cobrancaAdicional;
        }
        @Override
        public double pagamento(){
             return super.pagamento()+cobrancaAdicional*1.1;
        }

    }
