package com.PrimeHotel.TheHotelManagement.service;

import com.PrimeHotel.TheHotelManagement.exception.OurException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class LocalFileStorageService {

    @Value("${file.upload-dir}") // Set this in application.properties
    private String uploadDir;

    public String saveImageToLocal(MultipartFile photo) {
        try {
            // Ensure the directory exists
            File directory = new File(uploadDir);
            if (!directory.exists()) {
                directory.mkdirs();
            }

            // Save the file
            String filename = System.currentTimeMillis() + "_" + photo.getOriginalFilename();
            Path filePath = Paths.get(uploadDir, filename);
            Files.write(filePath, photo.getBytes());

            return filePath.toString(); // Return local file path

        } catch (IOException e) {
            e.printStackTrace();
            throw new OurException("Unable to save image locally: " + e.getMessage());
        }
    }
}
