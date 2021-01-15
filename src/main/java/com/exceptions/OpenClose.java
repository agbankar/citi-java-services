package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class OpenClose implements FileOperation {
	 public void perform(File file) throws FileNotFoundException {
		    FileReader r = new FileReader(file);
		    //r.close();

}

}