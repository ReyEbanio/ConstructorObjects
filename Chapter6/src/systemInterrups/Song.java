package systemInterrups;

public class Song {
	public static void main(String[] args) 
			throws InterruptedException {
		//lyrics of song inside the array
		String [] lyrics = {
				"Trust in His(God) love it never fades",
				"The shield of light through darkest shades",
				"No matter where the shadows fall",
				"His love will hold you through it all"
		};
		
		//Delay per line of lyrics
		long[] timeDelays = {0, 1200, 1000, 1100};
		long[] charDelay = {75, 75, 100, 90};
		
		//first loop to get lyrics and delay time
		for(int ctr = 0;ctr < lyrics.length;ctr++) {
			String lineLyrics = lyrics[ctr];
			long lineLyricDelay = timeDelays[ctr];
			long delayChar = charDelay[ctr];
			
			//execute delay per line
			Thread.sleep(lineLyricDelay);
			
			//Second loop to write lyrics per character
			for(int i = 0; i < lineLyrics.length();i++) {
				System.out.print(lineLyrics.charAt(i));
				Thread.sleep(delayChar);
			}
			
			//Create a line break for the next lyrics
			System.out.println();
		}
	}
}
