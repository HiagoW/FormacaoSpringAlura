package br.com.alura.spring.data;

import br.com.alura.spring.data.service.CrudCargoService;
import br.com.alura.spring.data.service.CrudFuncionarioService;
import br.com.alura.spring.data.service.CrudUnidadeTrabalhoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

    private final CrudCargoService cargoService;
    private final CrudUnidadeTrabalhoService unidadeTrabalhoService;
    private final CrudFuncionarioService funcionarioService;

    private Boolean system = true;

    public SpringDataApplication(CrudCargoService cargoService, CrudUnidadeTrabalhoService unidadeTrabalhoService, CrudFuncionarioService funcionarioService) {
        this.cargoService = cargoService;
        this.unidadeTrabalhoService = unidadeTrabalhoService;
        this.funcionarioService = funcionarioService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (system) {
            System.out.println("Qual ação você quer executar?");
            System.out.println("0 - Sair");
            System.out.println("1 - Cargo");
            System.out.println("2 - Unidade");
            System.out.println("3 - Funcionario");

            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    cargoService.inicial(scanner);
                    break;
                case 2:
                    unidadeTrabalhoService.inicial(scanner);
                    break;
                case 3:
                    funcionarioService.inicial(scanner);
                    break;
                default:
                    system = false;
            }
        }
    }
}
