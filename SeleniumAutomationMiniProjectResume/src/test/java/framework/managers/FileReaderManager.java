package framework.managers;

import java.io.IOException;

import framework.filereaders.ConfigFileReader;
import framework.filereaders.JSONFileReader;

public class FileReaderManager {

	public static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	private static JSONFileReader jsonFileReader;

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}

	public ConfigFileReader getConfigFileReader() throws IOException {
		return (configFileReader == null) ? new ConfigFileReader() : configFileReader;

	}

	public JSONFileReader getJSONFileReader() {
		return (jsonFileReader == null) ? new JSONFileReader() : jsonFileReader;
	}
}