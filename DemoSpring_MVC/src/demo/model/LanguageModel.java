package demo.model;

import java.util.ArrayList;
import java.util.List;

import demo.entities.Language;
import demo.entities.Product;

public class LanguageModel {
	public List<Language> findAll() {
		List<Language> Languages = new ArrayList<Language>();
		Languages.add(new Language("l1" , "LANGUAGE1" ));
		Languages.add(new Language("l2" , "LANGUAGE2" ));
		Languages.add(new Language("l3" , "LANGUAGES" ));
		Languages.add(new Language("l4" , "LANGUAGE4" ));
		return Languages;
	}
}
