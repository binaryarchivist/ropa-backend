package utm.pbl.ropa.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public interface DocumentService {
    void addDocuments(MultipartFile[] multipartFiles) throws NoSuchAlgorithmException, IOException;
}
