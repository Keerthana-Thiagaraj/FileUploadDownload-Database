package com.dbfile.uploaddownload.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "fileuploadDownload")
public class FileModel {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")

    private String fileId;

    private String fileName;

    private String fileType;

    @Lob
    private byte[] fileData;

    public FileModel() {

    }

    public FileModel(String fileName, String fileType) {

        this.fileName = fileName;
        this.fileType = fileType;

    }

    public FileModel(String fileName, String fileType, byte[] fileData) {

        this.fileName = fileName;
        this.fileType = fileType;
        this.fileData = fileData;
    }

/**Getters and Setters**/
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
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

    public byte[] getFileData() {
        return fileData;
    }

    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }
}
