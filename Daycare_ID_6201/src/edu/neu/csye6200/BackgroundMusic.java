package edu.neu.csye6200;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BackgroundMusic {
	public static void playMusic() {// 背景音乐播放
		try {
			URL cb;
			File f = new File("./cccc.wav");
			cb = f.toURL();
			AudioClip aau;
			aau = Applet.newAudioClip(cb);

			aau.play();
			aau.loop();// 循环播放
			// 单曲 aau.stop()停止播放

		} catch (MalformedURLException e) {

			e.printStackTrace();
		}
	}
}
