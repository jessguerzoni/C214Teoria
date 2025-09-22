package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void saldoZero() {
        Conta conta = new Conta("TESTE");
        assertEquals(0.0, conta.getSaldo());
    }

    @Test
    void sacarComSaldoInsuficiente() {
        Conta conta = new Conta("TESTE");
        conta.depositar(100.0);

        boolean resultado = conta.sacar(200.0);

        assertFalse(resultado, "Saldo Insuficiente");
        assertEquals(100.0, conta.getSaldo(), "Sem alteração de saldo");
    }

        @Test
        void testNomeValido() {
            assertTrue(Validador.validarNome("Maria"));
            assertTrue(Validador.validarNome("João"));
            assertTrue(Validador.validarNome("Anna"));
        }


        @Test
        void testNomeVazio() {
            assertFalse(Validador.validarNome(""));
            }

    @Test
    void sacarValorExato() {
        Conta conta = new Conta("TESTAR");
        conta.depositar(100.0);
        boolean resultado = conta.sacar(100.0);
        assertTrue(resultado);
        assertEquals(0.0, conta.getSaldo());
    }


    @Test
    void depositarValorPositivo() {
        Conta conta = new Conta("Positivo");
        conta.depositar(150.0);
        assertEquals(150.0, conta.getSaldo());
    }


}




