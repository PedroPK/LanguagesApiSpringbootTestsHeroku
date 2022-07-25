package br.com.alura.imersao.linguagensapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.alura.imersao.linguagensapi.entities.Language;

public interface LanguageRepository extends MongoRepository<Language, String> {

}