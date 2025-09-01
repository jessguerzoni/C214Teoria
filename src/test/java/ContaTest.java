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
        conta.depositar(100.0); // saldo inicial

        boolean resultado = conta.sacar(150.0); // tenta sacar mais do que tem

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
        }



