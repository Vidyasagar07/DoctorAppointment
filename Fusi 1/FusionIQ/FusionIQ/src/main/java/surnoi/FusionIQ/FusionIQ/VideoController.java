package surnoi.FusionIQ.FusionIQ;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import surnoi.FusionIQ.FusionIQ.data.Video;
import surnoi.FusionIQ.FusionIQ.service.VideoService;

import java.io.IOException;

@RestController
@RequestMapping("/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadVideo(@RequestParam("file") MultipartFile file) {
        try {
            Video savedVideo = videoService.saveVideo(file);
            return ResponseEntity.ok("Video uploaded successfully with ID: " + savedVideo.getId());
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload video");
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<byte[]> downloadVideo(@PathVariable Long id) {
        Video video = videoService.getVideoById(id);
        if (video != null) {
            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + video.getName() + "\"")
                    .body(video.getData());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}