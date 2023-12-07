package com.haceb.stepdefinitions;

import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;
import steps.PaginaInicialSteps;
import steps.PaginaPerfilSteps;
import steps.RegistroFinalSteps;
import steps.PaginaRegistroSteps;

public class LoginHacebStepdefinitions {

    @Steps
    PaginaInicialSteps paginaInicialSteps;
    @Steps
    PaginaRegistroSteps paginaRegistroSteps;

    @Steps
    RegistroFinalSteps registroFinalSteps;
    @Steps
    PaginaPerfilSteps paginaPerfilSteps;
    @Dado("que el Usuario abre el navegador e ingresa a la página Haceb.com")
    public void queElUsuarioAbreElNavegadorEIngresaALaPáginaHacebCom() {
    paginaInicialSteps.abrirNavegador();
    paginaInicialSteps.cerrarPop();
    paginaInicialSteps.registroPagina();
    paginaInicialSteps.pasoVentanas();
    }
    @Cuando("el usuario debe ingresar sus datos en el formulario de registro")
    public void elUsuarioDebeIngresarSusDatosEnElFormularioDeRegistro() {
        paginaRegistroSteps.registroFormulario();
        registroFinalSteps.registroFinal();
        registroFinalSteps.pasoVentanas();
    }
    @Entonces("el usuario podrá ver su perfil")
    public void elUsuarioPodráVerSuPerfil() {
        paginaPerfilSteps.paginaPerfil();
    }
}
