public class ExercicioCompletoMetodoseClasses {

    //Classe funcionario


    public class funcionario {


        private String nome;
        private String telefonef;
        private String emailf;
        private int id;


        public String getNome(String wellington) {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTelefonef() {
            return telefonef;
        }

        public void setTelefonef(String telefone) {
            this.telefonef = telefone;
        }

        public String getEmailf() {
            return emailf;
        }

        public void setEmail(String email) {
            this.emailf = email;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public funcionario(String nome, String telefonef, String email, int id) {
            this.nome = nome;
            this.telefonef = telefonef;
            this.emailf = email;
            this.id = id;


        }


        public static void visualizar() {
        }


    }


    //TestaFuncionario

    public class TestaCliente {

        public TestaCliente() {
        }

        public static void main(String[] args) {

            Cliente c1 = new Cliente("Marcos", "1199252343" , "\"marcos.nakasato@mercadolivre.com ", "Faca");
            Cliente c2 = new Cliente("Wellington", "119922303", "\"wellington.nakasato@mercadolivre.com ", "Faca");

            c1.setNome("Wellington");
            c1.setEmail("Wellington.Nakasato@mercadolivre.com");
            c1.setTelefone("11 992567889");
            c1.setProdutosVendidos("furadeira");

            c1.visualizar();
            c2.visualizar();



            System.out.println(c1.getTelefone());
            System.out.println(c1.getNome());




        //Classe Cliente

            public class Cliente {

                private String nome;
                private String telefone;
                private String email;
                private String ProdutosVendidos;
                private String Dados;

                public Cliente(String nome, String telefone, String email, String produtosVendidos) {
                    this.nome = nome;
                    this.telefone = telefone;
                    this.email = email;
                    this.ProdutosVendidos = produtosVendidos;

                }


                public String getNome() {
                    return nome;
                }

                public void setNome(String nome) {
                    this.nome = nome;
                }

                public String getTelefone() {
                    return telefone;
                }

                public void setTelefone(String telefone) {
                    this.telefone = telefone;
                }

                public String getEmail() {
                    return email;
                }

                public void setEmail(String email) {
                    this.email = email;
                }

                public String getProdutosVendidos() {
                    return ProdutosVendidos;
                }

                public void setProdutosVendidos(String produtosVendidos) {
                    ProdutosVendidos = produtosVendidos;
                }

                public String getDados() {
                    return Dados;
                }

                public void setDados(String dados) {
                    Dados = dados;
                }

                public static void visualizar(){
                    System.out.println("String nome, Telefone, email");





                }




            }

            //Testa Cliente

            public class TestaCliente {

                public TestaCliente() {
                }

                public static void main(String[] args) {

                    Cliente c1 = new Cliente("Marcos", "1199252343" , "\"marcos.nakasato@mercadolivre.com ", "Faca");
                    Cliente c2 = new Cliente("Wellington", "119922303", "\"wellington.nakasato@mercadolivre.com ", "Faca");

                    c1.setNome("Wellington");
                    c1.setEmail("Wellington.Nakasato@mercadolivre.com");
                    c1.setTelefone("11 992567889");
                    c1.setProdutosVendidos("furadeira");

                    c1.visualizar();
                    c2.visualizar();



                    System.out.println(c1.getTelefone());
                    System.out.println(c1.getNome());



                    // Classe Produto

                    import java.util.Date;

                    public class Produto {

                        String nome;
                        int id;
                        float valor;
                        int numeronFiscal;
                        String DataChegada;

                        public String getNome() {
                            return nome;
                        }

                        public void setNome(String nome) {
                            this.nome = nome;
                        }

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public float getValor() {
                            return valor;
                        }

                        public void setValor(float valor) {
                            this.valor = valor;
                        }

                        public int getNumeronFiscal() {
                            return numeronFiscal;
                        }

                        public void setNumeronFiscal(int numeronFiscal) {
                            this.numeronFiscal = numeronFiscal;
                        }

                        public String getDataChegada() {
                            return DataChegada;
                        }

                        public void setDataChegada(String dataChegada) {
                            DataChegada = dataChegada;
                        }

                        public Produto(String nome, int id, int valor, int numeronFiscal, String dataChegada) {
                            this.nome = nome;
                            this.id = id;
                            this.valor = valor;
                            this.numeronFiscal = numeronFiscal;
                            this.DataChegada = dataChegada;


                        }

                        public void visualizar() {
                        }
                    }

                    //testa produto

                    public class TestaProduto {

                        public static void main(String[] args) {


                            Produto p1 = new Produto("porta", 30,230, 123498984,"27/.05/2021");
                            Produto p2 = new Produto("janela", 25,245, 12343434,"27/05/2021");

                            p1.getId();
                            p1.getNome();
                            p1.getValor();

                            p2.getId();
                            p2.getNome();
                            p2.getValor();

                            p1.visualizar();
                            p2.visualizar();

                            System.out.println("o ID do produto é " + p1.getId());
                            System.out.println("O produto é " + p1.getNome());
                            System.out.println("O produto custa " + p1.valor + " Reais");

                            System.out.println("o ID do produto é " + p2.getId());
                            System.out.println("O produto é " + p2.getNome());
                            System.out.println("O produto custa " + p2.valor + " Reais");
                        }

                    }







                }
            }





        }
    }



}
