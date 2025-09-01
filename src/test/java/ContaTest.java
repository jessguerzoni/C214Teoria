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
        assertEquals(100.0, conta.getSaldo(), "O saldo não deve mudar quando o saque falha");
    }

        @Test
        void testNomeValido() {
            assertTrue(Validador.validarNome("Maria"));
            assertTrue(Validador.validarNome("João Silva"));
            assertTrue(Validador.validarNome("Érica"));
        }

        @Test
        void testNomeComNumero() {
            assertFalse(Validador.validarNome("Joao"));
        }

        @Test
        void testNomeComCaracterEspecial() {
            assertFalse(Validador.validarNome("Maria"));
            assertFalse(Validador.validarNome("Carlos"));
        }

        // Deve falhar porque contém caractere especial
        @Test
        void testNomeComCaracter() {
            assertFalse(Validador.validarNome("Maria"));
        }

        @Test
        void testNomeVazio() {
            assertFalse(Validador.validarNome(""));
            }

    @Test
    void sacarValorExato() {
        Conta conta = new Conta("TESTE");
        conta.depositar(100.0);
        boolean resultado = conta.sacar(100.0);
        assertTrue(resultado);
        assertEquals(0.0, conta.getSaldo());
    }

    @Test
    void sacarValorNegativo() {
        Conta conta = new Conta("TESTE");
        conta.depositar(100.0);
        boolean resultado = conta.sacar(-120.0);
        assertFalse(resultado, "Saque negativo não deve ser permitido");
        assertEquals(100.0, conta.getSaldo());
    }

    @Test
    void depositarValorPositivo() {
        Conta conta = new Conta("TESTE");
        conta.depositar(150.0);
        assertEquals(150.0, conta.getSaldo());
    }


}




