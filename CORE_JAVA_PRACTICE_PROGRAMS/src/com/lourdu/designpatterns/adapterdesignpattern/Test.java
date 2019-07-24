package com.lourdu.designpatterns.adapterdesignpattern;


public class Test {

    public static void main(String[] args) {

        MP3Player audioPlayer = new MP3Player();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        //audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

    }

}
