
public class SongInfo {

	String songName;
	String bandName;
	int yearRealeased;

	public SongInfo(String newSongName, String newBandName, int newYearRealeased){
		
		songName = newSongName;
		bandName = newBandName;
		yearRealeased = newYearRealeased;
	}
	
	public String getSongName() { return songName; }
	public String getBandName() { return bandName; }
	public int getYearRealeased() { return yearRealeased; }
}
