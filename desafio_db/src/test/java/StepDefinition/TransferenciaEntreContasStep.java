package StepDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import static pages.LoginPage.*;
import static pages.RegistrationPage.*;
import static pages.HomePage.*;
import static pages.TransferPage.*;
import static pages.BankStatementPage.*;

public class TransferenciaEntreContasStep {
    @Dado("que acesso o BugBank")
    public void user_accesses_login_page() throws Throwable{

    }

    @E("crio a primeira conta com saldo")
    public void user_creates_first_account() throws Throwable{

    }

    @E("crio a segunda conta com saldo")
    public void user_creates_second_account() throws Throwable{

    }

    @Quando("eu acesso a primeira para realizar a transferencia para a segunda")
    public void user_makes_the_transfer() throws Throwable{

    }

    @Então("eu devo validar a saida e a entrada de valor nas contas envolvidas")
    public void user_asserts_the_transfer_with_bank_statement() throws Throwable{

    }
}
