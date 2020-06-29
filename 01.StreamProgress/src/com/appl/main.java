package com.appl;

import com.appl.Model.File;
import com.appl.Model.Music;
import com.appl.Model.StreamProgressInfo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("Test", 12, 12);
		Music music = new Music("Some name", "Cool", 15, 2222);
		
		StreamProgressInfo streamFileInfo = new StreamProgressInfo(file);
		StreamProgressInfo streamMusicInfo = new StreamProgressInfo(music);
		
		System.out.println(streamFileInfo.CalculateCurrentPercent());
		System.out.println(streamMusicInfo.CalculateCurrentPercent());
	}

}
