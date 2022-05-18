package org.micks.central.unit;

import org.micks.central.unit.drive.Drive;
import org.micks.central.unit.drive.HDDDrive;
import org.micks.central.unit.file.File;
import org.micks.central.unit.file.imagefile.GIFImageFile;
import org.micks.central.unit.file.imagefile.JPGImageFIle;
import org.micks.central.unit.file.musicfile.MP3MusicFile;

public class Main {
    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFIle jpg1 = new JPGImageFIle("nazwa1.jpg", 200, 80);

        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3", 4000, "Linkin Park", "Numb", 90);

        Drive drive = new HDDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3file);

        drive.listFiles();
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());
    }
}
