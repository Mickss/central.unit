package org.micks.central.unit.file.musicfile;

import org.micks.central.unit.file.AbstractFile;
import org.micks.central.unit.file.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile {
    protected String bandName;
    protected String title;


    protected AbstractMusicFile(String name, int size, String bandName, String title) {
        super(name, size);
        this.bandName = bandName;
        this.title = title;

    }

    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }
}
