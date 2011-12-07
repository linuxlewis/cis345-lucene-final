package edu.uwsp.lucene;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

public class FileTraversal {
    public final Vector<File> traverse( final File f, final String extention ) throws IOException {
    		Vector<File> files = new Vector<File>();
            if (f.isDirectory()) {
                    onDirectory(f);
                    final File[] childs = f.listFiles();
                    for( File child : childs ) {
                            files.addAll(traverse(child, extention));
                    }
            }
            else if(f.getName().endsWith(extention))
            	files.add(f);
            return files;
    }

    public void onDirectory( final File d ) {
    }

    public void onFile( final File f ) {
    }
}