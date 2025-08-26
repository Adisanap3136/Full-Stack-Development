package collection;

import java.util.Arrays;

class Song
{
	private String name;
	private String singer;
	private String duration;
	private String writter;
	private String movie;
	
	private Song() {}
	
	public Song(String name,String singer,String duration,String writter,String movie)
	{
		this.name=name;
		this.singer=singer;
		this.duration=duration;
		this.writter=writter;
		this.movie= movie;
	}
	
	public String getName()
	{
		return name;
	}
	public String getSinger()
	{
		return singer;
	}
	public String getDuration()
	{
		return duration;
	}
	public String getWritter()
	{
		return writter;
	}
	public String getMovie()
	{
		return movie;
	}
	
	public String toString()
	{
		return " [name:"+name+",Singer:"+singer+",Duration: "+duration+",Writter:"+writter+",Movie:"+movie+"] ";
	}
	public int hashCode()
	{
		return name.hashCode()+singer.hashCode()+duration.hashCode()+writter.hashCode()+movie.hashCode();
	}
	public boolean equals(Object o)
	{
		Song s = (Song) o;
		return this.name.equalsIgnoreCase(s.name) && this.singer.equalsIgnoreCase(s.singer) && this.duration.equals(s.duration) && this.writter.equalsIgnoreCase(s.writter) && this.movie.equalsIgnoreCase(s.movie);
	}
}

class Playlist
{
	private String name;
	private int cap;
	private int count;
	
	private Song []songs;
	
	private Playlist() {}
	
	public Playlist(String name,int cap)
	{
		this.name=name;
		songs= new Song[cap];
	}
	public void setName()
	{
		this.name=name;
	}
	public int getCap()
	{
		return cap;
	}
	public void showPlaylist()
	{
		if(count>0)
		{
			for(int i=0;i<count;i++)
			{
				System.out.print(songs[i]+" ");
			}
			System.out.println();
		}
		else
		{
			System.out.println("No songs in the playlist!");
		}
	}
	public boolean addSong(String name,String singer,String duration,String writter,String movie)
	{
		if(count<songs.length)
		{
			int i;
			Song toBeAdded = new Song(name, singer, duration, writter, movie);
			for(i=0;i<count;i++)
			{
				if(songs[i].equals(toBeAdded))
				{
					break;
				}
			}
			if(i==count)
			{
				songs[count]= toBeAdded;
				count++;
				return true;
			}
			else
			{
				System.out.println(name+": Songs already present");
			}
		}
		else
		{
			System.out.println("Playlist is full");
		}
		return false;
	}
	public boolean removeSong(String name,String movie)
	{
		if(count!=0)
		{
			boolean found =false;
			int i;
			for(i=0;i<songs.length ;i++)
			{
				System.out.println(i);
				if(!found)
				{
					if(songs[i].getName().equalsIgnoreCase(name)&&songs[i].getMovie().equalsIgnoreCase(movie))
					{
						songs[i]= null;
						found = true;
					}
					else
					{
						songs[i-1] = songs[i];
					}
				}
				if(found)
				{
					System.out.println(name+": "+"song removed");
					songs[count] =null;
					count --;
				}
				else
				{
					System.out.println(name+" songs not found");
				}
			}
			return found;
		}
		{
			System.out.println("no songs in the playlist");
			return false;
		}
	}
	public void shuffle()
	{
		for(int i=count-1;i>0;)
		{
			int j=(int)(Math.random()*10);
			if(j>=0 && j< count)
			{
				Song temp = songs[i];
				songs[i] = songs[j];
				songs[j] = temp;
				i--;
			}
		}
	}
	public int searchSong(String name,String movie)
	{
		for(int i=0;i<count;i++)
		{
			if(songs[i].getName().equals(name)&&songs[i].getMovie().equals(movie))
			{
				return i+1;
			}
		}
		return -1;
	}
	public void playNext(String name,String movie)
	{
		int index = searchSong(name, movie);
		if(index==0)
		{
			System.out.println("songs already playing");
		}
		else if( index==1)
		{
			System.out.println(name+" song will be played next");
		}
		else if(index>1)
		{
			Song temp  = songs[index];
			for(int i=index;i>1;i--)
			{
				songs[i]=songs[i-1];
			}
			songs[1]=temp;
			System.out.println(name+" song will be played next");
		}
		else
		{
			System.out.println("song not in playlist");
		}
	}
}

public class PlayListDriver 
{
	public static void main(String []args)
	{
		Playlist p = new Playlist("jolly song", 12);
		p.addSong("ishq tera", "guru randhava", "4.25", "elon musk", "www.www");
		p.addSong("joy", "yo yo honey singh", "3.10", "kabhi khushi", "zzz");
		p.addSong("tata thaiya", "arjit sigh", "6.25", "john abram", "xxx");
		p.addSong("chayya chayya", "jubin nautiyal", "7.25", "salman khan", "aaa");
		p.addSong("bulleya", "suniti chauhan", "5.25", "rochy bhai", "bbb");

		p.playNext("bulleya", "bbb");		
		p.showPlaylist();
	}
}
