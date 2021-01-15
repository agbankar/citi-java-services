package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class OpenOnly {
	
	void perform(File file) throws FileNotFoundException {
	    FileReader r = new FileReader(file);

}
}
