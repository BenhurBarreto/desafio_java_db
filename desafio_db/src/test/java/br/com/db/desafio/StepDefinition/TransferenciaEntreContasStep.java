package br.com.db.desafio.StepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.ArrayList;

import static br.com.db.desafio.pages.LoginPage.*;
import static br.com.db.desafio.pages.RegistrationPage.*;
import static br.com.db.desafio.pages.HomePage.*;
import static br.com.db.desafio.pages.TransferPage.*;
import static br.com.db.desafio.pages.BankStatementPage.*;

public class TransferenciaEntreContasStep {

    ArrayList<String> conta_1 = null, conta_2 = null;
    String email_1, email_2, std_password = "123";
//    Double valor_transferencia = 10.00;
    String valor_transferencia = "10";

    @Dado("que acesso o BugBank")
    public void user_accesses_login_page() throws Throwable{
        System.out.println("Teste iniciou");
        click_registrar();
    }

    @E("crio a primeira conta com saldo de nome {string} e email {string}")
    public void user_creates_first_account(String nome, String email) throws Throwable{
        email_1 = email;
        sendkeys_email_registration(email);
        sendkeys_nome_registration(nome);
        sendkeys_password_registration(std_password);
        sendkeys_password_confirmation(std_password);
        Thread.sleep(500);
        click_saldo();
        click_cadastrar();
        Thread.sleep(500);
        conta_1 = get_conta_modal();
        click_modal_botao_fechar();
    }

    @E("crio a segunda conta com saldo de nome {string} e email {string}")
    public void user_creates_second_account(String nome, String email) throws Throwable{
        email_2 = email;
        click_registrar();
        sendkeys_email_registration(email);
        sendkeys_nome_registration(nome);
        sendkeys_password_registration(std_password);
        sendkeys_password_confirmation(std_password);
        Thread.sleep(500);
        // TODO: identificar se botão do saldo está acionado ou não
        click_cadastrar();
        Thread.sleep(500);
        conta_2 = get_conta_modal();
        click_modal_botao_fechar();
    }

    @Quando("eu acesso a primeira para realizar a transferencia para a segunda")
    public void user_makes_the_transfer() throws Throwable{
        sendkeys_email(email_1);
        sendkeys_password(std_password);
        click_acessar();
        Thread.sleep(500);
        click_transferencia();
        Thread.sleep(500);
        sendkeys_num_conta(conta_2.get(0));
        sendkeys_digito_conta(conta_2.get(1));
        sendkeys_valor(valor_transferencia);
        click_transferir_agora();
        Thread.sleep(500);
        Assert.assertEquals("Transferencia realizada com sucesso", get_mensagem());
        click_modal_transferencia_fechar();
        click_transferencia_voltar();
    }

    @Então("eu devo validar a saida e a entrada de valor nas contas envolvidas")
    public void user_asserts_the_transfer_with_bank_statement() throws Throwable{
        Thread.sleep(500);
        click_extrato();
        Thread.sleep(500);
        Assert.assertEquals(verifica_transferencia(valor_transferencia), true);
        click_sair_bank_statement();
        Thread.sleep(500);
        sendkeys_email(email_1);
        sendkeys_password(std_password);
        click_acessar();
        Thread.sleep(500);
        click_extrato();
        Thread.sleep(500);
        Assert.assertEquals(verifica_transferencia(valor_transferencia), true);
    }
}
