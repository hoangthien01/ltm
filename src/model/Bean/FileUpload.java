package model.Bean;

public class FileUpload {
	private String path;
	private String name;
	private String uploader;
	private String status;

	public FileUpload() {
	}

	public FileUpload(String path, String name, String uploader, String status) {
		this.path = path;
		this.name = name;
		this.uploader = uploader;
		this.status = status;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUploader() {
		return uploader;
	}

	public void setUploader(String uploader) {
		this.uploader = uploader;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
