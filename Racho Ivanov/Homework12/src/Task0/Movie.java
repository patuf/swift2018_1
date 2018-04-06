package Task0;

import java.io.Serializable;

public class Movie implements Serializable
{
	private final String director;
	private final String title;
	private final String[] actors;
	//За сега искам да е стринг полсе ще си помисля как да стане на LocalDate
	private final String date;

	public Movie(String director, String title, String date, String... actors)
	{
		this.director = director;
		this.title = title;
		this.actors = actors;
		this.date = date;
	}

	public String getDirector()
	{
		return director;
	}

	public String getTitle()
	{
		return title;
	}

	public String[] getActors()
	{
		return actors;
	}

	public String getDate()
	{
		return date;
	}

	public String toString()
	{
		return getDirector() + ' ' + getTitle() + ' ' + getDate();
	}

	public boolean equals(Movie m)
	{
		if (this.getTitle().equals(m.getTitle()) && this.getDirector().equals(m.getDirector())
						&& this.getDate().equals(m.getDate()))
			return true;
		else
			return false;
	}
}
