public class ExercicioCompleto {

    public class Cliente {


        private String nome;


        public Cliente(String nome) {
            this.nome = nome;

        }

        public Cliente() {

        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }


        public void visualizar() {
            System.out.println("Listagem de Clientes");

        }

    }

    //pessoaFisica

    public class PessoaFisica extends Cliente {


        private String cpf;
        private String profissao;

        public PessoaFisica(String nome, String cpf, String profissao) {
            super(nome);
            this.cpf = cpf;
            this.profissao = profissao;
        }


        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getProfissao() {
            return profissao;
        }

        public void setProfissao(String profissao) {
            this.profissao = profissao;
        }

        @Override
        public void visualizar() {
            super.visualizar();
            System.out.println("O CPF do cliente é " + cpf + "a profissao é " + profissao);

        }


 //PessoaJuridica

    }

    public class PessoaJuridica extends Cliente {


        private String cnpj;
        private String segmento;

        public PessoaJuridica(String cnpj, String segmento) {
            super();

            this.cnpj = cnpj;
            this.segmento = segmento;
        }


        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }

        public String getSegmento() {
            return segmento;
        }

        public void setSegmento(String segmento) {
            this.segmento = segmento;
        }

        @Override
        public void visualizar() {
            super.visualizar();
            System.out.println("O CNPJ do cliente é " + cnpj + "o segmento é " + segmento);


        }
    }







}
