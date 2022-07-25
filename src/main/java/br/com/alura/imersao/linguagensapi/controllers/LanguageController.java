package br.com.alura.imersao.linguagensapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.imersao.linguagensapi.entities.Language;
import br.com.alura.imersao.linguagensapi.repositories.LanguageRepository;

@RestController
public class LanguageController {
	
	@Autowired
	private LanguageRepository languageRepository;
	
	@GetMapping("/")
	public String getHelloWorld() {
		return "Hello, this is a Languages API from Alura Imersion!";
	}
	
	@GetMapping("/languages")
	public List<Language> getLanguages() {
		List<Language> languages = languageRepository.findAll();
		return languages;
	}
	
	@PostMapping("/languages")
	public Language insertLanguage(@RequestBody Language pLanguage) {
		Language language = languageRepository.save(pLanguage);
		return language;
	}
	
	@DeleteMapping("/languages")
	public void deleteLanguages(@RequestBody Language pLanguage) {
		languageRepository.delete(pLanguage);
	}
}
