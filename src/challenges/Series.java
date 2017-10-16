package challenges;

import java.util.List;

public class Series extends Rating {
	String genres;
	String name;
	List<Season> seasons;
	
	
	public String getGenres() {
		return genres;
	}


	public void setGenres(String genres) {
		this.genres = genres;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Season> getSeasons() {
		return seasons;
	}


	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}

	

	public Series(String genres, String name, List<Season> seasons) {
		super();
		this.genres = genres;
		this.name = name;
		this.seasons = seasons;
	}


	public void printEpisodes(int season){
		Season s = seasons.get(season);
		System.out.println(s);
	}
}
