package org.micks.central.unit.file.imagefile;

import org.micks.central.unit.file.AbstractFile;
import org.micks.central.unit.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
