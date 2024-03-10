package br.com.db.desafio.StepDefinition;

import br.com.db.desafio.utility.WaitFor;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static br.com.db.desafio.pages.LoginPage.*;
import static br.com.db.desafio.pages.RegistrationPage.*;
import static br.com.db.desafio.pages.HomePage.*;
import static br.com.db.desafio.pages.TransferPage.*;
import static br.com.db.desafio.pages.BankStatementPage.*;

public class TransferenciaEntreContasStep {

    ArrayList<String> conta_1 = null, conta_2 = null;
    String email_1, email_2, std_password = "123";
//    Double valor_transferencia = 10.00; TODO: usar double aleatório para gerar o valor
    String valor_transferencia = "10";
    @Dado("que acesso o BugBank")
    public void user_accesses_login_page() throws Throwable{
        System.out.println("Teste iniciou");
        click_registrar();
    }

    @E("crio a primeira conta com saldo de nome {string} e email {string}")
    public void user_creates_first_account(String nome, String email) throws Throwable{
        email_1 = email;
        conta_1 = realiza_registro(nome, email, std_password);
    }

    @E("crio a segunda conta com saldo de nome {string} e email {string}")
    public void user_creates_second_account(String nome, String email) throws Throwable{
        click_registrar();
        email_2 = email;
        conta_2 = realiza_registro(nome, email, std_password);
    }

    @Quando("eu acesso a primeira para realizar a transferencia para a segunda")
    public void user_makes_the_transfer() throws Throwable{
        realiza_login(email_1, std_password);
        click_transferencia();
        realiza_transferencia(conta_2, valor_transferencia);
        click_transferencia_voltar();
    }

    @Então("eu devo validar a saida e a entrada de valor nas contas envolvidas")
    public void user_asserts_the_transfer_with_bank_statement() throws Throwable{
        verifica_extrato(valor_transferencia);
        click_sair_bank_statement();
        WaitFor.visibilityOfElementLocated(By.xpath(acessar_xpath));
        realiza_login(email_1, std_password);
        verifica_extrato(valor_transferencia);
    }
}
