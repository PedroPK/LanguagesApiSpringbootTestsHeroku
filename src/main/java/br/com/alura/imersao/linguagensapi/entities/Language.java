package br.com.alura.imersao.linguagensapi.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "languages")
public class Language {
	
	@Id
	private String _id;
	private String title;
	private String image;
	private int		ranking;
	
	public Language() {
	}

	public Language(String title, String image, int ranking) {
		super();
		this.title = title;
		this.image = image;
		this.ranking = ranking;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return _id;
	}

	public void setId(String id) {
		this._id = id;
	}

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
}
