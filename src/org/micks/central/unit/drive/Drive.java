package org.micks.central.unit.drive;

import org.micks.central.unit.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
