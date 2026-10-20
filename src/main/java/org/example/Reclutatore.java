package org.example;

import net.datafaker.Faker;

public class Reclutatore {
    private Faker faker = new Faker();

    public void reclutaCandidato(int difficoltaMissione) throws EroeNonIdoneoException {
        // Genera un nome da supereroe usando Datafaker
        String nome = faker.superhero().name();

        // Genera un potere casuale tra 1 e 100
        int potere = faker.number().numberBetween(1, 101);

        System.out.println("Candidato trovato: " + nome + " con potere " + potere);

        if (potere < difficoltaMissione) {
            throw new EroeNonIdoneoException(nome, potere);
        }

        System.out.println("-> RECLUTATO! " + nome + " è pronto per la missione!");
    }
}
