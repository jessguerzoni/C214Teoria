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

        assertFalse(resultado, "O saque deveria falhar pois não há saldo suficiente");
        assertEquals(100.0, conta.getSaldo(), "O saldo não deve mudar quando o saque falha");
    }
}
