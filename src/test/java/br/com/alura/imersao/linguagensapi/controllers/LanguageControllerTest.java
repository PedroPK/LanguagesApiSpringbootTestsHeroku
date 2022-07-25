package br.com.alura.imersao.linguagensapi.controllers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.alura.imersao.linguagensapi.entities.Language;

@SpringBootTest
class LanguageControllerTest {
	
	@Autowired
	private LanguageController aController;

	@Test
	public void testGetLanguagesNotNull() {
		// Arrange
		
		// Act
		List<Language> languages = this.aController.getLanguages();
		
		// Assert
		assertNotNull(languages);
		//fail("Not yet implemented");
	}
	
	@Test
	void testGetLanguagesNotEmpy() {
		// Arrange
		
		
		// Act
		List<Language> languages = this.aController.getLanguages();
		
		// Assert
		assertFalse(languages.isEmpty());
		//fail("Not yet implemented");
	}

	@Test
	void testInsertLanguage() {
		// Arrange
		Language languageDotWhitespace = 
			new Language(
				"DotWhiteSpace", 
				"https://raw.githubusercontent.com/BaseMax/DotWhitespace/master/logo.png", 
				99);
		
		// Act
		int quantityBefore = this.aController.getLanguages().size();
		languageDotWhitespace = this.aController.insertLanguage(languageDotWhitespace);
		int quantityAfter = this.aController.getLanguages().size();
		
		
		// Assert
		assertTrue(
			quantityAfter 
			- 
			quantityBefore 
			== 1);
		this.aController.deleteLanguages(languageDotWhitespace);
		//fail("Not yet implemented");
	}
	
	@Test
	void testDeleteLanguage() {
		// Arrange
		Language languageDotWhitespace = 
				new Language(
						"DotWhiteSpace", 
						"https://raw.githubusercontent.com/BaseMax/DotWhitespace/master/logo.png", 
						99);
		
		// Act
		languageDotWhitespace = this.aController.insertLanguage(languageDotWhitespace);
		int quantityBefore = this.aController.getLanguages().size();
		this.aController.deleteLanguages(languageDotWhitespace);
		int quantityAfter = this.aController.getLanguages().size();
		
		
		// Assert
		assertTrue(
			quantityBefore 
			- 
			quantityAfter 
			== 1);
		//fail("Not yet implemented");
	}

}
