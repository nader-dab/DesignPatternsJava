import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;


public class DiscJockey {

	SongsOfThe70s songs70s;
	SongsOfThe80s songs80s;
	SongsOfThe90s songs90s;
	
	SongIterator iterate70sSongs;
	SongIterator iterate80sSongs;
	SongIterator iterate90sSongs;
	
	public DiscJockey(SongIterator songs70s, SongIterator songs80s, SongIterator songs90s){
		this.iterate70sSongs = songs70s;
		this.iterate80sSongs = songs80s;
		this.iterate90sSongs = songs90s;
	}
	
	public void showTheSongs(){
		Iterator songs70s = iterate70sSongs.createIterator();
		Iterator songs80s = iterate80sSongs.createIterator();
		Iterator songs90s = iterate90sSongs.createIterator();
		
		System.out.println("Songs of the 70s\n");
		printTheSongs(songs70s);
		
		System.out.println("Songs of the 80s\n");
		printTheSongs(songs80s);
		
		System.out.println("Songs of the 90s\n");
		printTheSongs(songs90s);
		
	}
	
	private void printTheSongs(Iterator iterator) {

		while (iterator.hasNext()) {
			
			SongInfo bestSong = (SongInfo) iterator.next();
			
			System.out.println(bestSong.getSongName());
			System.out.println(bestSong.getBandName());
			System.out.println(bestSong.getYearRealeased());
		}
		
	}
}
