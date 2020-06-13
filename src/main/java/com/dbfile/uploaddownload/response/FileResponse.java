package com.dbfile.uploaddownload.response;

public class FileResponse {

    String fileName;
    String fileType;
    String fileUri;

    public FileResponse(String fileName, String fileType, String fileUri) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileUri = fileUri;
    }

    public String getFileUri() {
        return fileUri;
    }

    public void setFileUri(String fileUri) {
        this.fileUri = fileUri;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

}
