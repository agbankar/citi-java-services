package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;

public interface FileOperation {
	  void perform(File file) throws FileNotFoundException;
	}