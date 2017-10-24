package filter;

import java.io.File;
import java.io.FileFilter;

/**
 * FileFilter过滤器
 */

public class DirectoryDome implements FileFilter {

    public boolean accept(File pathname) {
        if (pathname.isDirectory())
            return true;
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
