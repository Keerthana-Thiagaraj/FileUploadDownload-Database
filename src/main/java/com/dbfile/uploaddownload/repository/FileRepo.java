package com.dbfile.uploaddownload.repository;

import com.dbfile.uploaddownload.model.FileModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepo extends JpaRepository<FileModel, String> {


}
